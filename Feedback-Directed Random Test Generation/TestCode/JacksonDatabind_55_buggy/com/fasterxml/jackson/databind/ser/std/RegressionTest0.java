package com.fasterxml.jackson.databind.ser.std;

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
        int int0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default.TYPE_CALENDAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default.TYPE_DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        java.lang.Class<?> wildcardClass1 = objJsonSerializer0.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = objJsonSerializer0.isEmpty(serializerProvider1, (java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = objJsonSerializer4.properties();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer0.replaceDelegatee(objJsonSerializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = objJsonSerializer0.isEmpty(serializerProvider1, (java.lang.Object) 1.0d);
        boolean boolean4 = objJsonSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default.TYPE_ENUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default.TYPE_TO_STRING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) (short) 10, jsonGenerator3, serializerProvider4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) 1.0f, jsonGenerator3, serializerProvider4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default.TYPE_CLASS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Class<?> wildcardClass3 = dynamic0.getClass();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = wildcardJsonSerializer1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) 4, jsonGenerator4, serializerProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(propertySerializerMap2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) (short) 100, jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.String (java.lang.Short and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = objJsonSerializer0.isEmpty(serializerProvider1, (java.lang.Object) 1.0d);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = objJsonSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        boolean boolean6 = objJsonSerializer5.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer5);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = dynamic8.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = objJsonSerializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) dynamic8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        boolean boolean3 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic3._dynamicSerializers;
        boolean boolean5 = dynamic3.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic3._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap6;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic0._dynamicSerializers;
        java.lang.Object obj9 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) (-1L), jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.String (java.lang.Long and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic5.getDelegatee();
        java.lang.Class<java.lang.Object> objClass7 = dynamic5.handledType();
        boolean boolean8 = dynamic0.isEmpty(serializerProvider4, (java.lang.Object) objClass7);
        java.lang.Class<java.lang.Object> objClass9 = dynamic0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.Throwable throwable11 = null;
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider10, throwable11, obj12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Object obj1 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj1, jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic5.getDelegatee();
        java.lang.Class<java.lang.Object> objClass7 = dynamic5.handledType();
        boolean boolean8 = dynamic0.isEmpty(serializerProvider4, (java.lang.Object) objClass7);
        java.lang.Class<java.lang.Object> objClass9 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = objJsonSerializer0.isEmpty(serializerProvider1, (java.lang.Object) 1.0d);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = objJsonSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        boolean boolean6 = objJsonSerializer5.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer5);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = objJsonSerializer0.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic3._dynamicSerializers;
        boolean boolean5 = dynamic3.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic3._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap6;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        java.lang.Object obj4 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = dynamic0.getDelegatee();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = dynamic0.properties();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic5.getDelegatee();
        java.lang.Object obj7 = dynamic5.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic8._dynamicSerializers;
        boolean boolean10 = dynamic8.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic8._dynamicSerializers;
        dynamic5._dynamicSerializers = propertySerializerMap11;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap13 = dynamic5._dynamicSerializers;
        java.lang.Object obj14 = dynamic5.readResolve();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = dynamic0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) dynamic5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
        org.junit.Assert.assertNotNull(propertySerializerMap13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer1 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = objJsonSerializer1.properties();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) propertyWriterItor2, jsonGenerator3, serializerProvider4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = dynamic3.getDelegatee();
        java.lang.Object obj5 = dynamic3.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = dynamic3.properties();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = dynamic0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) dynamic3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        boolean boolean3 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider4, throwable5, (java.lang.Object) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        boolean boolean1 = objJsonSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = objJsonSerializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = wildcardJsonSerializer2.isUnwrappingSerializer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) 0.0d, jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.String (java.lang.Double and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_KEY_SERIALIZER;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic1._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass3 = dynamic1.handledType();
        boolean boolean4 = objJsonSerializer0.isEmpty((java.lang.Object) objClass3);
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = objJsonSerializer0.isEmpty(serializerProvider1, (java.lang.Object) 1.0d);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = objJsonSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        boolean boolean6 = objJsonSerializer5.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer5);
        java.lang.Class<?> wildcardClass8 = objJsonSerializer5.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = dynamic0.replaceDelegatee(objJsonSerializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = dynamic1.getDelegatee();
        java.lang.Object obj3 = dynamic1.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic4._dynamicSerializers;
        boolean boolean6 = dynamic4.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic4._dynamicSerializers;
        dynamic1._dynamicSerializers = propertySerializerMap7;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) propertySerializerMap7, jsonGenerator9, serializerProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic1._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = dynamic1.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic6.getDelegatee();
        java.lang.Class<java.lang.Object> objClass8 = dynamic6.handledType();
        boolean boolean9 = dynamic1.isEmpty(serializerProvider5, (java.lang.Object) objClass8);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) objClass8, jsonGenerator10, serializerProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class java.lang.String (java.lang.Class and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) ' ', jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.String (java.lang.Character and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        boolean boolean5 = dynamic0.usesObjectId();
        java.lang.Object obj6 = dynamic0.readResolve();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic5.getDelegatee();
        java.lang.Class<java.lang.Object> objClass7 = dynamic5.handledType();
        boolean boolean8 = dynamic0.isEmpty(serializerProvider4, (java.lang.Object) objClass7);
        boolean boolean9 = dynamic0.usesObjectId();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Object obj3 = dynamic0.readResolve();
        boolean boolean4 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = objJsonSerializer0.isEmpty(serializerProvider1, (java.lang.Object) 1.0d);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = objJsonSerializer0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = objJsonSerializer0.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic3._dynamicSerializers;
        boolean boolean5 = dynamic3.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic3._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap6;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic0._dynamicSerializers;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = dynamic0.properties();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        boolean boolean4 = wildcardJsonSerializer3.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic5.getDelegatee();
        java.lang.Class<java.lang.Object> objClass7 = dynamic5.handledType();
        boolean boolean8 = dynamic0.isEmpty(serializerProvider4, (java.lang.Object) objClass7);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = dynamic0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(objClass11);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic7._dynamicSerializers;
        boolean boolean9 = dynamic7.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = dynamic7._dynamicSerializers;
        java.lang.Object obj11 = dynamic7.readResolve();
        java.lang.Object obj12 = dynamic7.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = dynamic7.properties();
        boolean boolean14 = dynamic0.isEmpty(serializerProvider6, (java.lang.Object) dynamic7);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap16 = dynamic15._dynamicSerializers;
        boolean boolean17 = dynamic15.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap18 = dynamic15._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap19 = dynamic15._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap19;
        java.lang.Object obj21 = dynamic0.readResolve();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap18);
        org.junit.Assert.assertNotNull(propertySerializerMap19);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.Throwable throwable3 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic4._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic4.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = dynamic4.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider2, throwable3, (java.lang.Object) dynamic4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        java.lang.Object obj5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj5, jsonGenerator6, serializerProvider7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = dynamic1.getDelegatee();
        java.lang.Class<java.lang.Object> objClass3 = dynamic1.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) dynamic1, jsonGenerator4, serializerProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(objClass3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = objJsonSerializer0.isEmpty(serializerProvider1, (java.lang.Object) (byte) 1);
        boolean boolean4 = objJsonSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = objJsonSerializer0.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        boolean boolean4 = dynamic0.usesObjectId();
        java.lang.Object obj5 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = dynamic0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = wildcardJsonSerializer4.usesObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Object obj3 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objClass4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic1._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = dynamic1.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = dynamic1.getDelegatee();
        java.lang.Object obj6 = dynamic1.readResolve();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) dynamic1, jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(objClass4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = objJsonSerializer0.isEmpty(serializerProvider1, (java.lang.Object) 1.0d);
        boolean boolean4 = objJsonSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic1._dynamicSerializers;
        boolean boolean3 = dynamic1.usesObjectId();
        java.lang.Object obj4 = dynamic1.readResolve();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) dynamic1, jsonGenerator5, serializerProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) (-1.0f), jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.String (java.lang.Float and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic4._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic4.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = dynamic9.getDelegatee();
        java.lang.Class<java.lang.Object> objClass11 = dynamic9.handledType();
        boolean boolean12 = dynamic4.isEmpty(serializerProvider8, (java.lang.Object) objClass11);
        java.lang.Object obj13 = dynamic4.readResolve();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serializeWithType(obj13, jsonGenerator14, serializerProvider15, typeSerializer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        java.lang.Object obj6 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass7 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = dynamic1.getDelegatee();
        java.lang.Object obj3 = dynamic1.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = dynamic1.properties();
        boolean boolean5 = dynamic1.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = dynamic1.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) dynamic1, jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = dynamic1.getDelegatee();
        java.lang.Object obj3 = dynamic1.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = dynamic1.properties();
        boolean boolean5 = dynamic1.isUnwrappingSerializer();
        boolean boolean6 = dynamic1.usesObjectId();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) dynamic1, jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_KEY_SERIALIZER;
        boolean boolean1 = objJsonSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        boolean boolean5 = dynamic0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = dynamic0.properties();
        boolean boolean7 = dynamic0.usesObjectId();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = dynamic0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = dynamic0.getClass();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        java.lang.Object obj7 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic7._dynamicSerializers;
        boolean boolean9 = dynamic7.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = dynamic7._dynamicSerializers;
        java.lang.Object obj11 = dynamic7.readResolve();
        java.lang.Object obj12 = dynamic7.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = dynamic7.properties();
        boolean boolean14 = dynamic0.isEmpty(serializerProvider6, (java.lang.Object) dynamic7);
        java.lang.Class<java.lang.Object> objClass15 = dynamic7.handledType();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objClass15);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Object obj3 = dynamic0.readResolve();
        java.lang.Object obj4 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = dynamic0.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic5.getDelegatee();
        java.lang.Class<java.lang.Object> objClass7 = dynamic5.handledType();
        boolean boolean8 = dynamic0.isEmpty(serializerProvider4, (java.lang.Object) objClass7);
        java.lang.Object obj9 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = dynamic0.properties();
        java.lang.Class<?> wildcardClass11 = propertyWriterItor10.getClass();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) 97, jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = dynamic0.unwrappingSerializer(nameTransformer6);
        boolean boolean8 = objJsonSerializer7.isUnwrappingSerializer();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        java.lang.Object obj6 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        java.lang.Throwable throwable8 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = dynamic9.getDelegatee();
        java.lang.Class<java.lang.Object> objClass11 = dynamic9.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = dynamic12.getDelegatee();
        java.lang.Object obj14 = dynamic12.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap16 = dynamic15._dynamicSerializers;
        boolean boolean17 = dynamic15.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap18 = dynamic15._dynamicSerializers;
        dynamic12._dynamicSerializers = propertySerializerMap18;
        dynamic9._dynamicSerializers = propertySerializerMap18;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider7, throwable8, (java.lang.Object) propertySerializerMap18, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(propertySerializerMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap18);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic7._dynamicSerializers;
        boolean boolean9 = dynamic7.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = dynamic7._dynamicSerializers;
        java.lang.Object obj11 = dynamic7.readResolve();
        java.lang.Object obj12 = dynamic7.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = dynamic7.properties();
        boolean boolean14 = dynamic0.isEmpty(serializerProvider6, (java.lang.Object) dynamic7);
        java.lang.Object obj15 = dynamic0.readResolve();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = dynamic1.getDelegatee();
        java.lang.Object obj3 = dynamic1.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = dynamic1.properties();
        java.lang.Class<java.lang.Object> objClass5 = dynamic1.handledType();
        java.lang.Class<java.lang.Object> objClass6 = dynamic1.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic8._dynamicSerializers;
        boolean boolean10 = dynamic8.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic8._dynamicSerializers;
        java.lang.Object obj12 = dynamic8.readResolve();
        java.lang.Object obj13 = dynamic8.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = dynamic8.properties();
        boolean boolean15 = dynamic1.isEmpty(serializerProvider7, (java.lang.Object) dynamic8);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) boolean15, jsonGenerator16, serializerProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class java.lang.String (java.lang.Boolean and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        boolean boolean5 = dynamic0.usesObjectId();
        boolean boolean6 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic0.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = objJsonSerializer0.isEmpty(serializerProvider1, (java.lang.Object) (byte) 1);
        boolean boolean4 = objJsonSerializer0.usesObjectId();
        boolean boolean5 = objJsonSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = objJsonSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        boolean boolean1 = objJsonSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = objJsonSerializer0.unwrappingSerializer(nameTransformer2);
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        boolean boolean3 = objJsonSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic7._dynamicSerializers;
        boolean boolean9 = dynamic7.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = dynamic7._dynamicSerializers;
        java.lang.Object obj11 = dynamic7.readResolve();
        java.lang.Object obj12 = dynamic7.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = dynamic7.properties();
        boolean boolean14 = dynamic0.isEmpty(serializerProvider6, (java.lang.Object) dynamic7);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap16 = dynamic15._dynamicSerializers;
        boolean boolean17 = dynamic15.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap18 = dynamic15._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap19 = dynamic15._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap19;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap21 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper22, javaType23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap18);
        org.junit.Assert.assertNotNull(propertySerializerMap19);
        org.junit.Assert.assertNotNull(propertySerializerMap21);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        boolean boolean4 = dynamic0.usesObjectId();
        boolean boolean5 = dynamic0.usesObjectId();
        java.lang.Class<java.lang.Object> objClass6 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objClass6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        boolean boolean5 = dynamic0.usesObjectId();
        java.lang.Object obj6 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj6, jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) 100.0d, jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.String (java.lang.Double and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic5.getDelegatee();
        java.lang.Class<java.lang.Object> objClass7 = dynamic5.handledType();
        boolean boolean8 = dynamic0.isEmpty(serializerProvider4, (java.lang.Object) objClass7);
        java.lang.Class<java.lang.Object> objClass9 = dynamic0.handledType();
        boolean boolean10 = dynamic0.isUnwrappingSerializer();
        boolean boolean11 = dynamic0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj5 = dynamic0.readResolve();
        boolean boolean6 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic8._dynamicSerializers;
        boolean boolean10 = dynamic8.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic8._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap12 = dynamic8._dynamicSerializers;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serializeWithType((java.lang.Object) propertySerializerMap12, jsonGenerator13, serializerProvider14, typeSerializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
        org.junit.Assert.assertNotNull(propertySerializerMap12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj5 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = dynamic8.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = dynamic8._dynamicSerializers;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = dynamic8.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = objJsonSerializer12.unwrappingSerializer(nameTransformer13);
        boolean boolean15 = dynamic0.isEmpty(serializerProvider7, (java.lang.Object) nameTransformer13);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(propertySerializerMap10);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = dynamic0.unwrappingSerializer(nameTransformer7);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic5.getDelegatee();
        java.lang.Class<java.lang.Object> objClass7 = dynamic5.handledType();
        boolean boolean8 = dynamic0.isEmpty(serializerProvider4, (java.lang.Object) objClass7);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic1._dynamicSerializers;
        boolean boolean3 = dynamic1.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic1._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic1._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass6 = dynamic1.handledType();
        java.lang.Class<java.lang.Object> objClass7 = dynamic1.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic1._dynamicSerializers;
        boolean boolean9 = dynamic1.isUnwrappingSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) dynamic1, jsonGenerator10, serializerProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic7._dynamicSerializers;
        boolean boolean9 = dynamic7.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = dynamic7._dynamicSerializers;
        java.lang.Object obj11 = dynamic7.readResolve();
        java.lang.Object obj12 = dynamic7.readResolve();
        boolean boolean13 = dynamic0.isEmpty(serializerProvider6, (java.lang.Object) dynamic7);
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        java.lang.Object obj3 = dynamic0.readResolve();
        java.lang.Object obj4 = dynamic0.readResolve();
        java.lang.Class<?> wildcardClass5 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer1 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        boolean boolean2 = objJsonSerializer1.isUnwrappingSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) objJsonSerializer1, jsonGenerator3, serializerProvider4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializer cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializer is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        java.lang.Object obj4 = dynamic0.readResolve();
        java.lang.Object obj5 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = dynamic0.properties();
        java.lang.Object obj7 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = dynamic0.getDelegatee();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = wildcardJsonSerializer3.usesObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = objJsonSerializer0.isEmpty(serializerProvider1, (java.lang.Object) 1.0d);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = objJsonSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        boolean boolean6 = objJsonSerializer5.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer0.unwrappingSerializer(nameTransformer8);
        boolean boolean10 = objJsonSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = dynamic0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = wildcardJsonSerializer4.properties();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic0._dynamicSerializers;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = dynamic0.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass6 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic0._dynamicSerializers;
        boolean boolean8 = dynamic0.isUnwrappingSerializer();
        boolean boolean9 = dynamic0.usesObjectId();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = wildcardJsonSerializer3.properties();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic7._dynamicSerializers;
        boolean boolean9 = dynamic7.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = dynamic7._dynamicSerializers;
        java.lang.Object obj11 = dynamic7.readResolve();
        java.lang.Object obj12 = dynamic7.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = dynamic7.properties();
        boolean boolean14 = dynamic0.isEmpty(serializerProvider6, (java.lang.Object) dynamic7);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap16 = dynamic15._dynamicSerializers;
        boolean boolean17 = dynamic15.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap18 = dynamic15._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap19 = dynamic15._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap19;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap21 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = dynamic0.getSchema(serializerProvider22, (java.lang.reflect.Type) wildcardClass24);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap18);
        org.junit.Assert.assertNotNull(propertySerializerMap19);
        org.junit.Assert.assertNotNull(propertySerializerMap21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(jsonNode25);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic1._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass3 = dynamic1.handledType();
        java.lang.Object obj4 = dynamic1.readResolve();
        boolean boolean5 = dynamic1.usesObjectId();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) dynamic1, jsonGenerator6, serializerProvider7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        java.lang.Object obj5 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = null;
        dynamic0._dynamicSerializers = propertySerializerMap6;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(propertySerializerMap8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj5 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = dynamic0.unwrappingSerializer(nameTransformer7);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic7._dynamicSerializers;
        boolean boolean9 = dynamic7.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = dynamic7._dynamicSerializers;
        java.lang.Object obj11 = dynamic7.readResolve();
        java.lang.Object obj12 = dynamic7.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = dynamic7.properties();
        boolean boolean14 = dynamic0.isEmpty(serializerProvider6, (java.lang.Object) dynamic7);
        boolean boolean15 = dynamic7.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap16 = dynamic7._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass17 = dynamic7.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic7.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap16);
        org.junit.Assert.assertNotNull(objClass17);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        boolean boolean3 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        boolean boolean5 = dynamic0.usesObjectId();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = dynamic1.getDelegatee();
        java.lang.Object obj3 = dynamic1.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = dynamic1.properties();
        java.lang.Class<java.lang.Object> objClass5 = dynamic1.handledType();
        java.lang.Class<java.lang.Object> objClass6 = dynamic1.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic8._dynamicSerializers;
        boolean boolean10 = dynamic8.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic8._dynamicSerializers;
        java.lang.Object obj12 = dynamic8.readResolve();
        java.lang.Object obj13 = dynamic8.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = dynamic8.properties();
        boolean boolean15 = dynamic1.isEmpty(serializerProvider7, (java.lang.Object) dynamic8);
        boolean boolean16 = dynamic8.isUnwrappingSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) boolean16, jsonGenerator17, serializerProvider18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class java.lang.String (java.lang.Boolean and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Object obj3 = dynamic0.readResolve();
        boolean boolean4 = dynamic0.usesObjectId();
        boolean boolean5 = dynamic0.usesObjectId();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        java.lang.Object obj4 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        java.lang.Object obj6 = dynamic0.readResolve();
        java.lang.Class<?> wildcardClass7 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = dynamic1.getDelegatee();
        java.lang.Object obj3 = dynamic1.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = dynamic1.properties();
        boolean boolean5 = dynamic1.isUnwrappingSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) dynamic1, jsonGenerator6, serializerProvider7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = dynamic1.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic1._dynamicSerializers;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = dynamic1.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = objJsonSerializer5.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) nameTransformer6, jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass6 = dynamic0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = dynamic0.unwrappingSerializer(nameTransformer7);
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic5.getDelegatee();
        java.lang.Class<java.lang.Object> objClass7 = dynamic5.handledType();
        boolean boolean8 = dynamic0.isEmpty(serializerProvider4, (java.lang.Object) objClass7);
        java.lang.Class<java.lang.Object> objClass9 = dynamic0.handledType();
        boolean boolean10 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = dynamic0.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = dynamic0.getSchema(serializerProvider13, (java.lang.reflect.Type) wildcardClass15);
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj5 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic0.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        java.lang.Object obj4 = dynamic0.readResolve();
        java.lang.Object obj5 = dynamic0.readResolve();
        java.lang.Object obj6 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic1._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = dynamic1.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic6.getDelegatee();
        java.lang.Class<java.lang.Object> objClass8 = dynamic6.handledType();
        boolean boolean9 = dynamic1.isEmpty(serializerProvider5, (java.lang.Object) objClass8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic1.handledType();
        boolean boolean11 = dynamic1.isUnwrappingSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) boolean11, jsonGenerator12, serializerProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class java.lang.String (java.lang.Boolean and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        java.lang.Object obj5 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic0._dynamicSerializers;
        java.lang.Object obj3 = dynamic0.readResolve();
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = dynamic0.unwrappingSerializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = dynamic0.getClass();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = objJsonSerializer4.getDelegatee();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        boolean boolean1 = objJsonSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = objJsonSerializer0.unwrappingSerializer(nameTransformer2);
        boolean boolean4 = objJsonSerializer3.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic3._dynamicSerializers;
        boolean boolean5 = dynamic3.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic3._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap6;
        java.lang.Class<java.lang.Object> objClass8 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic0._dynamicSerializers;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        boolean boolean4 = dynamic0.usesObjectId();
        boolean boolean5 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic0._dynamicSerializers;
        java.lang.Class<?> wildcardClass7 = propertySerializerMap6.getClass();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj5 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic0._dynamicSerializers;
        java.lang.Object obj7 = dynamic0.readResolve();
        java.lang.Object obj8 = dynamic0.readResolve();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic3._dynamicSerializers;
        boolean boolean5 = dynamic3.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic3._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap6;
        java.lang.Object obj8 = dynamic0.readResolve();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        boolean boolean3 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        java.lang.Object obj5 = dynamic0.readResolve();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        boolean boolean4 = dynamic0.usesObjectId();
        boolean boolean5 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = dynamic0.unwrappingSerializer(nameTransformer6);
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = dynamic0.unwrappingSerializer(nameTransformer6);
        java.lang.Object obj8 = dynamic0.readResolve();
        java.lang.Object obj9 = dynamic0.readResolve();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        boolean boolean4 = dynamic0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = dynamic0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = dynamic0.properties();
        java.lang.Object obj7 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        java.lang.Object obj5 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic0._dynamicSerializers;
        java.lang.Object obj7 = dynamic0.readResolve();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        java.lang.Object obj4 = null;
        boolean boolean5 = dynamic0.isEmpty(obj4);
        java.lang.Object obj6 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj6, jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = dynamic0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic5.getDelegatee();
        java.lang.Class<java.lang.Object> objClass7 = dynamic5.handledType();
        boolean boolean8 = dynamic0.isEmpty(serializerProvider4, (java.lang.Object) objClass7);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = dynamic0.getDelegatee();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = dynamic0.getDelegatee();
        java.lang.Object obj5 = dynamic0.readResolve();
        boolean boolean6 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj7 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic3._dynamicSerializers;
        boolean boolean5 = dynamic3.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic3._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap6;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic0._dynamicSerializers;
        java.lang.Class<?> wildcardClass9 = propertySerializerMap8.getClass();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic1._dynamicSerializers;
        boolean boolean3 = dynamic1.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic1._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic1._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass6 = dynamic1.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) objClass6, jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class java.lang.String (java.lang.Class and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertNotNull(objClass6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        java.lang.Class<?> wildcardClass2 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic3._dynamicSerializers;
        boolean boolean5 = dynamic3.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic3._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap6;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        java.lang.reflect.Type type10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = dynamic0.getSchema(serializerProvider9, type10, true);
        java.lang.Object obj13 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = dynamic0.unwrappingSerializer(nameTransformer14);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap16 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(objJsonSerializer15);
        org.junit.Assert.assertNotNull(propertySerializerMap16);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        boolean boolean7 = objJsonSerializer6.isUnwrappingSerializer();
        java.lang.Class<?> wildcardClass8 = objJsonSerializer6.getClass();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        java.lang.Object obj4 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic0.getDelegatee();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        java.lang.Object obj4 = null;
        boolean boolean5 = dynamic0.isEmpty(obj4);
        java.lang.Class<?> wildcardClass6 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        java.lang.Object obj4 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        java.lang.Object obj6 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        boolean boolean5 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = stringKeySerializer0.unwrappingSerializer(nameTransformer1);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic5.getDelegatee();
        java.lang.Class<java.lang.Object> objClass7 = dynamic5.handledType();
        boolean boolean8 = dynamic0.isEmpty(serializerProvider4, (java.lang.Object) objClass7);
        java.lang.Object obj9 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(objClass11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        boolean boolean5 = objJsonSerializer4.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        boolean boolean3 = objJsonSerializer2.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        java.lang.Throwable throwable10 = null;
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider9, throwable10, obj11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.withFilterId((java.lang.Object) 2);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = dynamic0.getDelegatee();
        java.lang.Object obj5 = dynamic0.readResolve();
        boolean boolean6 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic3._dynamicSerializers;
        boolean boolean5 = dynamic3.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic3._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap6;
        java.lang.Class<java.lang.Object> objClass8 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass9 = dynamic0.handledType();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(objClass9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        boolean boolean2 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic0.getDelegatee();
        java.lang.Object obj8 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        java.lang.Object obj5 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic0.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = dynamic0.getDelegatee();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        java.lang.reflect.Type type7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider6, type7);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = dynamic0.getDelegatee();
        java.lang.Object obj10 = dynamic0.readResolve();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = dynamic1.getDelegatee();
        java.lang.Object obj3 = dynamic1.readResolve();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) dynamic1, jsonGenerator4, serializerProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap1 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.getDelegatee();
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(propertySerializerMap1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }
}

