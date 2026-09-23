package com.fasterxml.jackson.databind.ser.std;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer11 = numberSerializer0.unwrappingSerializer(nameTransformer10);
        boolean boolean12 = numberSerializer0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Number> numberClass13 = numberSerializer0.handledType();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertNotNull(numberJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(numberClass13);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        boolean boolean3 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Throwable throwable6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer7.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer7.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer13 = numberSerializer7.unwrappingSerializer(nameTransformer12);
        boolean boolean14 = numberSerializer7.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer15.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberSerializer19.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = numberSerializer19.withFilterId((java.lang.Object) '#');
        boolean boolean25 = numberSerializer19.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor26 = numberSerializer19.properties();
        java.lang.Class<java.lang.Number> numberClass27 = numberSerializer19.handledType();
        java.lang.Class<java.lang.Number> numberClass28 = numberSerializer19.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        boolean boolean31 = numberSerializer19.isEmpty(serializerProvider29, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass32 = numberSerializer19.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = numberSerializer15.getSchema(serializerProvider18, (java.lang.reflect.Type) numberClass32);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer37 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer39 = numberSerializer37.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer41 = numberSerializer37.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer42 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer43 = numberSerializer37.unwrappingSerializer(nameTransformer42);
        boolean boolean44 = numberSerializer37.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer46 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        java.lang.reflect.Type type48 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = intLikeSerializer46.getSchema(serializerProvider47, type48);
        java.lang.String str50 = intLikeSerializer46._schemaType;
        java.lang.Class<java.lang.Object> objClass51 = intLikeSerializer46.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = numberSerializer37.getSchema(serializerProvider45, (java.lang.reflect.Type) objClass51);
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = intLikeSerializer35.getSchema(serializerProvider36, (java.lang.reflect.Type) objClass51, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider55 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer56 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider57 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer58 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer60 = numberSerializer58.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer62 = numberSerializer58.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer63 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer64 = numberSerializer58.unwrappingSerializer(nameTransformer63);
        boolean boolean65 = numberSerializer58.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider66 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer67 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider68 = null;
        java.lang.reflect.Type type69 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = intLikeSerializer67.getSchema(serializerProvider68, type69);
        java.lang.String str71 = intLikeSerializer67._schemaType;
        java.lang.Class<java.lang.Object> objClass72 = intLikeSerializer67.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode73 = numberSerializer58.getSchema(serializerProvider66, (java.lang.reflect.Type) objClass72);
        com.fasterxml.jackson.databind.JsonNode jsonNode75 = intLikeSerializer56.getSchema(serializerProvider57, (java.lang.reflect.Type) objClass72, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode77 = intLikeSerializer35.getSchema(serializerProvider55, (java.lang.reflect.Type) objClass72, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode79 = numberSerializer15.getSchema(serializerProvider34, (java.lang.reflect.Type) objClass72, false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer80 = numberSerializer7.withFilterId((java.lang.Object) objClass72);
        java.lang.Class<java.lang.Number> numberClass81 = numberSerializer7.handledType();
        java.lang.Class<java.lang.Number> numberClass82 = numberSerializer7.handledType();
        boolean boolean83 = numberSerializer7.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor84 = numberSerializer7.properties();
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.wrapAndThrow(serializerProvider5, throwable6, (java.lang.Object) propertyWriterItor84, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(numberSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(numberJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(numberSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(numberSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor26);
        org.junit.Assert.assertNotNull(numberClass27);
        org.junit.Assert.assertNotNull(numberClass28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(numberClass32);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(intLikeSerializer35);
        org.junit.Assert.assertNotNull(numberSerializer37);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer39);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer41);
        org.junit.Assert.assertNotNull(numberJsonSerializer43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer46);
        org.junit.Assert.assertNotNull(jsonNode49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "integer" + "'", str50, "integer");
        org.junit.Assert.assertNotNull(objClass51);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertNotNull(intLikeSerializer56);
        org.junit.Assert.assertNotNull(numberSerializer58);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer60);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer62);
        org.junit.Assert.assertNotNull(numberJsonSerializer64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer67);
        org.junit.Assert.assertNotNull(jsonNode70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "integer" + "'", str71, "integer");
        org.junit.Assert.assertNotNull(objClass72);
        org.junit.Assert.assertNotNull(jsonNode73);
        org.junit.Assert.assertNotNull(jsonNode75);
        org.junit.Assert.assertNotNull(jsonNode77);
        org.junit.Assert.assertNotNull(jsonNode79);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer80);
        org.junit.Assert.assertNotNull(numberClass81);
        org.junit.Assert.assertNotNull(numberClass82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor84);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer9 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = numberSerializer11.properties();
        java.lang.Class<java.lang.Number> numberClass19 = numberSerializer11.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer20 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass19);
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = numberSerializer9.getSchema(serializerProvider10, (java.lang.reflect.Type) numberClass19, true);
        boolean boolean23 = numberSerializer9.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer9.acceptJsonFormatVisitor(jsonFormatVisitorWrapper24, javaType25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertNotNull(numberClass19);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        boolean boolean11 = numberSerializer0.isEmpty(serializerProvider9, (java.lang.Number) (-1.0d));
        boolean boolean12 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer13.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer13.withFilterId((java.lang.Object) '#');
        boolean boolean19 = numberSerializer13.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor20 = numberSerializer13.properties();
        java.lang.Class<java.lang.Number> numberClass21 = numberSerializer13.handledType();
        java.lang.Class<java.lang.Number> numberClass22 = numberSerializer13.handledType();
        java.lang.Class<java.lang.Number> numberClass23 = numberSerializer13.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor24 = numberSerializer13.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor25 = numberSerializer13.properties();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer26.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = numberSerializer26.withFilterId((java.lang.Object) '#');
        boolean boolean32 = numberSerializer26.isEmpty((java.lang.Number) (-1));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer33 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer34 = numberSerializer26.unwrappingSerializer(nameTransformer33);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor35 = numberJsonSerializer34.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor36 = numberJsonSerializer34.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer37 = numberSerializer13.withFilterId((java.lang.Object) numberJsonSerializer34);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor38 = numberSerializer13.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        boolean boolean41 = numberSerializer13.isEmpty(serializerProvider39, (java.lang.Number) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer42 = numberSerializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number>) numberSerializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(numberSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor20);
        org.junit.Assert.assertNotNull(numberClass21);
        org.junit.Assert.assertNotNull(numberClass22);
        org.junit.Assert.assertNotNull(numberClass23);
        org.junit.Assert.assertNotNull(propertyWriterItor24);
        org.junit.Assert.assertNotNull(propertyWriterItor25);
        org.junit.Assert.assertNotNull(numberSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer34);
        org.junit.Assert.assertNotNull(propertyWriterItor35);
        org.junit.Assert.assertNotNull(propertyWriterItor36);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer37);
        org.junit.Assert.assertNotNull(propertyWriterItor38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        boolean boolean7 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = intLikeSerializer9.getSchema(serializerProvider10, type11);
        java.lang.String str13 = intLikeSerializer9._schemaType;
        java.lang.Class<java.lang.Object> objClass14 = intLikeSerializer9.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = numberSerializer0.getSchema(serializerProvider8, (java.lang.reflect.Type) objClass14);
        java.lang.Class<java.lang.Number> numberClass16 = numberSerializer0.handledType();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "integer" + "'", str13, "integer");
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(numberClass16);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        boolean boolean1 = floatSerializer0._isInt;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer4.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer4.withFilterId((java.lang.Object) '#');
        boolean boolean10 = numberSerializer4.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer4.properties();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer4.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass12);
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = numberSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) numberClass12);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass12);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass12);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer17 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass12);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = floatSerializer0.withFilterId((java.lang.Object) numberClass12);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberSerializer19.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = numberSerializer19.withFilterId((java.lang.Object) '#');
        boolean boolean25 = numberSerializer19.isEmpty((java.lang.Number) (-1));
        boolean boolean27 = numberSerializer19.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        boolean boolean30 = numberSerializer19.isEmpty(serializerProvider28, (java.lang.Number) (-1.0d));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor31 = numberSerializer19.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer19.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer36 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = numberSerializer36.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer40 = numberSerializer36.withFilterId((java.lang.Object) '#');
        boolean boolean42 = numberSerializer36.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor43 = numberSerializer36.properties();
        java.lang.Class<java.lang.Number> numberClass44 = numberSerializer36.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = numberSerializer34.getSchema(serializerProvider35, (java.lang.reflect.Type) numberClass44, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer48 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer50 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer52 = numberSerializer50.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer54 = numberSerializer50.withFilterId((java.lang.Object) '#');
        boolean boolean56 = numberSerializer50.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor57 = numberSerializer50.properties();
        java.lang.Class<java.lang.Number> numberClass58 = numberSerializer50.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode60 = numberSerializer48.getSchema(serializerProvider49, (java.lang.reflect.Type) numberClass58, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = numberSerializer34.getSchema(serializerProvider47, (java.lang.reflect.Type) numberClass58, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer63 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass58);
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = numberSerializer19.getSchema(serializerProvider33, (java.lang.reflect.Type) numberClass58, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer66 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass58);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer67 = floatSerializer0.withFilterId((java.lang.Object) numberClass58);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer68 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer70 = numberSerializer68.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider71 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer72 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer74 = numberSerializer72.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer76 = numberSerializer72.withFilterId((java.lang.Object) '#');
        boolean boolean78 = numberSerializer72.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor79 = numberSerializer72.properties();
        java.lang.Class<java.lang.Number> numberClass80 = numberSerializer72.handledType();
        java.lang.Class<java.lang.Number> numberClass81 = numberSerializer72.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider82 = null;
        boolean boolean84 = numberSerializer72.isEmpty(serializerProvider82, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass85 = numberSerializer72.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode86 = numberSerializer68.getSchema(serializerProvider71, (java.lang.reflect.Type) numberClass85);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider87 = null;
        boolean boolean89 = numberSerializer68.isEmpty(serializerProvider87, (java.lang.Number) (short) 100);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer90 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer91 = numberSerializer68.withFilterId((java.lang.Object) numberSerializer90);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator92 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider93 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.serialize((java.lang.Object) numberSerializer68, jsonGenerator92, serializerProvider93);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.NumberSerializer cannot be cast to class java.lang.Float (com.fasterxml.jackson.databind.ser.std.NumberSerializer is in unnamed module of loader 'app'; java.lang.Float is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(numberSerializer2);
        org.junit.Assert.assertNotNull(numberSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(numberSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor31);
        org.junit.Assert.assertNull(wildcardJsonSerializer32);
        org.junit.Assert.assertNotNull(numberSerializer34);
        org.junit.Assert.assertNotNull(numberSerializer36);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer38);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor43);
        org.junit.Assert.assertNotNull(numberClass44);
        org.junit.Assert.assertNotNull(jsonNode46);
        org.junit.Assert.assertNotNull(numberSerializer48);
        org.junit.Assert.assertNotNull(numberSerializer50);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer52);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor57);
        org.junit.Assert.assertNotNull(numberClass58);
        org.junit.Assert.assertNotNull(jsonNode60);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertNotNull(jsonNode65);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer67);
        org.junit.Assert.assertNotNull(numberSerializer68);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer70);
        org.junit.Assert.assertNotNull(numberSerializer72);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer74);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor79);
        org.junit.Assert.assertNotNull(numberClass80);
        org.junit.Assert.assertNotNull(numberClass81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(numberClass85);
        org.junit.Assert.assertNotNull(jsonNode86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(numberSerializer90);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer91);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = shortSerializer0.withFilterId((java.lang.Object) 10.0d);
        boolean boolean3 = shortSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = shortSerializer0.getDelegatee();
        boolean boolean5 = shortSerializer0._isInt;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer6.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = numberSerializer6.withFilterId((java.lang.Object) '#');
        boolean boolean12 = numberSerializer6.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = numberSerializer6.properties();
        java.lang.Class<java.lang.Number> numberClass14 = numberSerializer6.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass14);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = doubleSerializer15.getDelegatee();
        java.lang.String str17 = doubleSerializer15._schemaType;
        java.lang.String str18 = doubleSerializer15._schemaType;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = doubleSerializer15.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = numberSerializer23.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer23.withFilterId((java.lang.Object) '#');
        boolean boolean29 = numberSerializer23.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor30 = numberSerializer23.properties();
        java.lang.Class<java.lang.Number> numberClass31 = numberSerializer23.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer32 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass31);
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = numberSerializer21.getSchema(serializerProvider22, (java.lang.reflect.Type) numberClass31);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer34 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass31);
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = doubleSerializer15.getSchema(serializerProvider20, (java.lang.reflect.Type) numberClass31);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.serialize((java.lang.Object) jsonNode35, jsonGenerator36, serializerProvider37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.node.ObjectNode cannot be cast to class java.lang.Short (com.fasterxml.jackson.databind.node.ObjectNode is in unnamed module of loader 'app'; java.lang.Short is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(numberSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertNotNull(numberClass14);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "number" + "'", str17, "number");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "number" + "'", str18, "number");
        org.junit.Assert.assertNull(wildcardJsonSerializer19);
        org.junit.Assert.assertNotNull(numberSerializer21);
        org.junit.Assert.assertNotNull(numberSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor30);
        org.junit.Assert.assertNotNull(numberClass31);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(jsonNode35);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer4.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer4.withFilterId((java.lang.Object) '#');
        boolean boolean10 = numberSerializer4.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer4.properties();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer4.handledType();
        java.lang.Class<java.lang.Number> numberClass13 = numberSerializer4.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        boolean boolean16 = numberSerializer4.isEmpty(serializerProvider14, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass17 = numberSerializer4.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = numberSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) numberClass17);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer22.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer22.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer28 = numberSerializer22.unwrappingSerializer(nameTransformer27);
        boolean boolean29 = numberSerializer22.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer31 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        java.lang.reflect.Type type33 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = intLikeSerializer31.getSchema(serializerProvider32, type33);
        java.lang.String str35 = intLikeSerializer31._schemaType;
        java.lang.Class<java.lang.Object> objClass36 = intLikeSerializer31.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = numberSerializer22.getSchema(serializerProvider30, (java.lang.reflect.Type) objClass36);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = intLikeSerializer20.getSchema(serializerProvider21, (java.lang.reflect.Type) objClass36, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer41 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = numberSerializer43.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = numberSerializer43.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer48 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer49 = numberSerializer43.unwrappingSerializer(nameTransformer48);
        boolean boolean50 = numberSerializer43.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider53 = null;
        java.lang.reflect.Type type54 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = intLikeSerializer52.getSchema(serializerProvider53, type54);
        java.lang.String str56 = intLikeSerializer52._schemaType;
        java.lang.Class<java.lang.Object> objClass57 = intLikeSerializer52.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = numberSerializer43.getSchema(serializerProvider51, (java.lang.reflect.Type) objClass57);
        com.fasterxml.jackson.databind.JsonNode jsonNode60 = intLikeSerializer41.getSchema(serializerProvider42, (java.lang.reflect.Type) objClass57, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = intLikeSerializer20.getSchema(serializerProvider40, (java.lang.reflect.Type) objClass57, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = numberSerializer0.getSchema(serializerProvider19, (java.lang.reflect.Type) objClass57, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider65 = null;
        boolean boolean67 = numberSerializer0.isEmpty(serializerProvider65, (java.lang.Number) (byte) 100);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer68 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer69 = numberSerializer0.unwrappingSerializer(nameTransformer68);
        java.lang.Class<?> wildcardClass70 = numberSerializer0.getClass();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(numberSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(numberClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(numberClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(numberSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(numberJsonSerializer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer31);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "integer" + "'", str35, "integer");
        org.junit.Assert.assertNotNull(objClass36);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(intLikeSerializer41);
        org.junit.Assert.assertNotNull(numberSerializer43);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer45);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNotNull(numberJsonSerializer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer52);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "integer" + "'", str56, "integer");
        org.junit.Assert.assertNotNull(objClass57);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(jsonNode60);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertNotNull(jsonNode64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer69);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = intLikeSerializer2.getSchema(serializerProvider3, type4);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer9.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer9.withFilterId((java.lang.Object) '#');
        boolean boolean15 = numberSerializer9.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = numberSerializer9.properties();
        java.lang.Class<java.lang.Number> numberClass17 = numberSerializer9.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = numberSerializer7.getSchema(serializerProvider8, (java.lang.reflect.Type) numberClass17, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = intLikeSerializer2.getSchema(serializerProvider6, (java.lang.reflect.Type) numberClass17);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor21 = intLikeSerializer2.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = numberSerializer23.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer23.withFilterId((java.lang.Object) '#');
        boolean boolean29 = numberSerializer23.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor30 = numberSerializer23.properties();
        java.lang.Class<java.lang.Number> numberClass31 = numberSerializer23.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer32 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass31);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = numberSerializer34.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = numberSerializer34.withFilterId((java.lang.Object) '#');
        boolean boolean40 = numberSerializer34.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor41 = numberSerializer34.properties();
        java.lang.Class<java.lang.Number> numberClass42 = numberSerializer34.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer43 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass42);
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = numberSerializer32.getSchema(serializerProvider33, (java.lang.reflect.Type) numberClass42, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer46 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass42);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer47 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass42);
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = intLikeSerializer2.getSchema(serializerProvider22, (java.lang.reflect.Type) numberClass42);
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) numberClass42);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer50 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer54 = numberSerializer52.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer56 = numberSerializer52.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer57 = numberSerializer52.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass58 = numberSerializer52.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer59 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass58);
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = shortSerializer0.getSchema(serializerProvider51, (java.lang.reflect.Type) numberClass58, false);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer62 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType63 = intLikeSerializer62._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider64 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer65 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider66 = null;
        java.lang.reflect.Type type67 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = intLikeSerializer65.getSchema(serializerProvider66, type67);
        java.lang.String str69 = intLikeSerializer65._schemaType;
        java.lang.Class<java.lang.Object> objClass70 = intLikeSerializer65.handledType();
        java.lang.Class<?> wildcardClass71 = intLikeSerializer65.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = intLikeSerializer62.getSchema(serializerProvider64, (java.lang.reflect.Type) wildcardClass71);
        java.lang.String str73 = intLikeSerializer62._schemaType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider74 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer75 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType76 = intLikeSerializer75._numberType;
        java.lang.Class<java.lang.Object> objClass77 = intLikeSerializer75.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode78 = intLikeSerializer62.getSchema(serializerProvider74, (java.lang.reflect.Type) objClass77);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider79 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer80 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType81 = intLikeSerializer80._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider82 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer83 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider84 = null;
        java.lang.reflect.Type type85 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode86 = intLikeSerializer83.getSchema(serializerProvider84, type85);
        java.lang.String str87 = intLikeSerializer83._schemaType;
        java.lang.Class<java.lang.Object> objClass88 = intLikeSerializer83.handledType();
        java.lang.Class<?> wildcardClass89 = intLikeSerializer83.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode90 = intLikeSerializer80.getSchema(serializerProvider82, (java.lang.reflect.Type) wildcardClass89);
        com.fasterxml.jackson.databind.JsonNode jsonNode92 = intLikeSerializer62.getSchema(serializerProvider79, (java.lang.reflect.Type) wildcardClass89, true);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator93 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider94 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.serialize((java.lang.Object) serializerProvider79, jsonGenerator93, serializerProvider94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(numberSerializer7);
        org.junit.Assert.assertNotNull(numberSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
        org.junit.Assert.assertNotNull(numberClass17);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(propertyWriterItor21);
        org.junit.Assert.assertNotNull(numberSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor30);
        org.junit.Assert.assertNotNull(numberClass31);
        org.junit.Assert.assertNotNull(numberSerializer34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor41);
        org.junit.Assert.assertNotNull(numberClass42);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertNotNull(jsonNode49);
        org.junit.Assert.assertNull(wildcardJsonSerializer50);
        org.junit.Assert.assertNotNull(numberSerializer52);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer54);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer56);
        org.junit.Assert.assertNull(wildcardJsonSerializer57);
        org.junit.Assert.assertNotNull(numberClass58);
        org.junit.Assert.assertNotNull(jsonNode61);
        org.junit.Assert.assertNotNull(intLikeSerializer62);
        org.junit.Assert.assertTrue("'" + numberType63 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType63.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(intLikeSerializer65);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "integer" + "'", str69, "integer");
        org.junit.Assert.assertNotNull(objClass70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(jsonNode72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "integer" + "'", str73, "integer");
        org.junit.Assert.assertNotNull(intLikeSerializer75);
        org.junit.Assert.assertTrue("'" + numberType76 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType76.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objClass77);
        org.junit.Assert.assertNotNull(jsonNode78);
        org.junit.Assert.assertNotNull(intLikeSerializer80);
        org.junit.Assert.assertTrue("'" + numberType81 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType81.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(intLikeSerializer83);
        org.junit.Assert.assertNotNull(jsonNode86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "integer" + "'", str87, "integer");
        org.junit.Assert.assertNotNull(objClass88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(jsonNode90);
        org.junit.Assert.assertNotNull(jsonNode92);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer13.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer13.withFilterId((java.lang.Object) '#');
        boolean boolean19 = numberSerializer13.isEmpty((java.lang.Number) (-1));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer21 = numberSerializer13.unwrappingSerializer(nameTransformer20);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor22 = numberJsonSerializer21.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = numberJsonSerializer21.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer0.withFilterId((java.lang.Object) numberJsonSerializer21);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serializeWithType((java.lang.Number) 10.0d, jsonGenerator26, serializerProvider27, typeSerializer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertNotNull(numberSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer21);
        org.junit.Assert.assertNotNull(propertyWriterItor22);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberJsonSerializer6.properties();
        boolean boolean9 = numberJsonSerializer6.isEmpty((java.lang.Number) (byte) 10);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberJsonSerializer6.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer12 = numberJsonSerializer6.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer14 = numberJsonSerializer12.unwrappingSerializer(nameTransformer13);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(numberJsonSerializer12);
        org.junit.Assert.assertNotNull(numberJsonSerializer14);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType2 = intLikeSerializer1._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.Object obj4 = null;
        boolean boolean5 = intLikeSerializer1.isEmpty(serializerProvider3, obj4);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = intLikeSerializer1._numberType;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer9.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer9.withFilterId((java.lang.Object) '#');
        boolean boolean15 = numberSerializer9.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = numberSerializer9.properties();
        java.lang.Class<java.lang.Number> numberClass17 = numberSerializer9.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer18 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass17);
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = numberSerializer7.getSchema(serializerProvider8, (java.lang.reflect.Type) numberClass17);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer21 = numberSerializer7.unwrappingSerializer(nameTransformer20);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer22.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer26.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = numberSerializer26.withFilterId((java.lang.Object) '#');
        boolean boolean32 = numberSerializer26.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor33 = numberSerializer26.properties();
        java.lang.Class<java.lang.Number> numberClass34 = numberSerializer26.handledType();
        java.lang.Class<java.lang.Number> numberClass35 = numberSerializer26.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        boolean boolean38 = numberSerializer26.isEmpty(serializerProvider36, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass39 = numberSerializer26.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = numberSerializer22.getSchema(serializerProvider25, (java.lang.reflect.Type) numberClass39);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer41 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass39);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer42 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer43 = doubleSerializer41.unwrappingSerializer(nameTransformer42);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer44 = numberSerializer7.withFilterId((java.lang.Object) doubleSerializer41);
        boolean boolean45 = intLikeSerializer1.isEmpty((java.lang.Object) numberSerializer7);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator46 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.serialize((java.lang.Object) numberSerializer7, jsonGenerator46, serializerProvider47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.NumberSerializer cannot be cast to class java.lang.Float (com.fasterxml.jackson.databind.ser.std.NumberSerializer is in unnamed module of loader 'app'; java.lang.Float is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertTrue("'" + numberType2 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType2.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + numberType6 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType6.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer7);
        org.junit.Assert.assertNotNull(numberSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
        org.junit.Assert.assertNotNull(numberClass17);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(numberJsonSerializer21);
        org.junit.Assert.assertNotNull(numberSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(numberSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor33);
        org.junit.Assert.assertNotNull(numberClass34);
        org.junit.Assert.assertNotNull(numberClass35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(numberClass39);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertNotNull(objJsonSerializer43);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType1 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = intLikeSerializer0.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer6.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = numberSerializer6.withFilterId((java.lang.Object) '#');
        boolean boolean12 = numberSerializer6.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = numberSerializer6.properties();
        java.lang.Class<java.lang.Number> numberClass14 = numberSerializer6.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = intLikeSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) numberClass14, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer17 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass14);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.Object obj19 = null;
        boolean boolean20 = integerSerializer17.isEmpty(serializerProvider18, obj19);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = numberSerializer21.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = numberSerializer21.withFilterId((java.lang.Object) '#');
        boolean boolean27 = numberSerializer21.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor28 = numberSerializer21.properties();
        java.lang.Class<java.lang.Number> numberClass29 = numberSerializer21.handledType();
        java.lang.Class<java.lang.Number> numberClass30 = numberSerializer21.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        boolean boolean33 = numberSerializer21.isEmpty(serializerProvider31, (java.lang.Number) (short) 0);
        boolean boolean34 = numberSerializer21.usesObjectId();
        boolean boolean35 = numberSerializer21.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer36 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = numberSerializer36.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer40 = numberSerializer36.withFilterId((java.lang.Object) '#');
        boolean boolean42 = numberSerializer36.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor43 = numberSerializer36.properties();
        java.lang.Class<java.lang.Number> numberClass44 = numberSerializer36.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer45 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass44);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer46 = doubleSerializer45.getDelegatee();
        boolean boolean47 = doubleSerializer45._isInt;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer48 = numberSerializer21.withFilterId((java.lang.Object) boolean47);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer49 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer50 = numberSerializer21.unwrappingSerializer(nameTransformer49);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator51 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider52 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer53 = null;
        // The following exception was thrown during execution in test generation
        try {
            integerSerializer17.serializeWithType((java.lang.Object) nameTransformer49, jsonGenerator51, serializerProvider52, typeSerializer53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + numberType1 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType1.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(numberSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertNotNull(numberClass14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(numberSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor28);
        org.junit.Assert.assertNotNull(numberClass29);
        org.junit.Assert.assertNotNull(numberClass30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(numberSerializer36);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer38);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor43);
        org.junit.Assert.assertNotNull(numberClass44);
        org.junit.Assert.assertNull(wildcardJsonSerializer46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer48);
        org.junit.Assert.assertNotNull(numberJsonSerializer50);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        boolean boolean11 = numberSerializer0.isEmpty(serializerProvider9, (java.lang.Number) (-1.0d));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer15.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = numberSerializer15.withFilterId((java.lang.Object) '#');
        boolean boolean21 = numberSerializer15.isEmpty((java.lang.Number) (-1));
        boolean boolean23 = numberSerializer15.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer25 = numberSerializer15.unwrappingSerializer(nameTransformer24);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer26.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = numberSerializer26.withFilterId((java.lang.Object) '#');
        boolean boolean32 = numberSerializer26.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor33 = numberSerializer26.properties();
        java.lang.Class<java.lang.Number> numberClass34 = numberSerializer26.handledType();
        java.lang.Class<java.lang.Number> numberClass35 = numberSerializer26.handledType();
        boolean boolean36 = numberSerializer26.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer37 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer38 = numberSerializer26.unwrappingSerializer(nameTransformer37);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer39 = numberSerializer15.withFilterId((java.lang.Object) numberJsonSerializer38);
        java.lang.Class<java.lang.Number> numberClass40 = numberSerializer15.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = numberSerializer0.getSchema(serializerProvider14, (java.lang.reflect.Type) numberClass40, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        boolean boolean45 = numberSerializer0.isEmpty(serializerProvider43, (java.lang.Number) (short) -1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer46 = numberSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(numberSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer25);
        org.junit.Assert.assertNotNull(numberSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor33);
        org.junit.Assert.assertNotNull(numberClass34);
        org.junit.Assert.assertNotNull(numberClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer38);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer39);
        org.junit.Assert.assertNotNull(numberClass40);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer46);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType1 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        boolean boolean9 = numberSerializer3.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer3.properties();
        java.lang.Class<java.lang.Number> numberClass11 = numberSerializer3.handledType();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = intLikeSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) numberClass12, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType15 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer22 = numberSerializer16.unwrappingSerializer(nameTransformer21);
        boolean boolean23 = intLikeSerializer0.isEmpty((java.lang.Object) numberSerializer16);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        boolean boolean26 = numberSerializer16.isEmpty(serializerProvider24, (java.lang.Number) (byte) -1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer16.getDelegatee();
        boolean boolean28 = numberSerializer16.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer30 = numberSerializer16.unwrappingSerializer(nameTransformer29);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper31 = null;
        com.fasterxml.jackson.databind.JavaType javaType32 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer16.acceptJsonFormatVisitor(jsonFormatVisitorWrapper31, javaType32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + numberType1 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType1.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(numberClass11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + numberType15 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType15.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(numberJsonSerializer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer30);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        boolean boolean12 = numberSerializer0.isEmpty(serializerProvider10, (java.lang.Number) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        boolean boolean16 = numberSerializer0.isEmpty(serializerProvider14, (java.lang.Number) (-1.0f));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        boolean boolean19 = numberSerializer0.isEmpty(serializerProvider17, (java.lang.Number) 1);
        boolean boolean20 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer24.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer24.withFilterId((java.lang.Object) '#');
        boolean boolean30 = numberSerializer24.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor31 = numberSerializer24.properties();
        java.lang.Class<java.lang.Number> numberClass32 = numberSerializer24.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = numberSerializer22.getSchema(serializerProvider23, (java.lang.reflect.Type) numberClass32, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = numberSerializer0.getSchema(serializerProvider21, (java.lang.reflect.Type) numberClass32, true);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer37 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer38 = numberSerializer0.unwrappingSerializer(nameTransformer37);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer39 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer40 = numberJsonSerializer38.unwrappingSerializer(nameTransformer39);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(numberSerializer22);
        org.junit.Assert.assertNotNull(numberSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor31);
        org.junit.Assert.assertNotNull(numberClass32);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertNotNull(numberJsonSerializer38);
        org.junit.Assert.assertNotNull(numberJsonSerializer40);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = intLikeSerializer0.getSchema(serializerProvider1, type2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer7.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer7.withFilterId((java.lang.Object) '#');
        boolean boolean13 = numberSerializer7.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = numberSerializer7.properties();
        java.lang.Class<java.lang.Number> numberClass15 = numberSerializer7.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = numberSerializer5.getSchema(serializerProvider6, (java.lang.reflect.Type) numberClass15, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) numberClass15);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = numberSerializer20.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer24.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer24.withFilterId((java.lang.Object) '#');
        boolean boolean30 = numberSerializer24.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor31 = numberSerializer24.properties();
        java.lang.Class<java.lang.Number> numberClass32 = numberSerializer24.handledType();
        java.lang.Class<java.lang.Number> numberClass33 = numberSerializer24.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        boolean boolean36 = numberSerializer24.isEmpty(serializerProvider34, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass37 = numberSerializer24.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = numberSerializer20.getSchema(serializerProvider23, (java.lang.reflect.Type) numberClass37);
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = intLikeSerializer0.getSchema(serializerProvider19, (java.lang.reflect.Type) numberClass37, false);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer41 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass37);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer45 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = numberSerializer45.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = numberSerializer45.withFilterId((java.lang.Object) '#');
        boolean boolean51 = numberSerializer45.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor52 = numberSerializer45.properties();
        java.lang.Class<java.lang.Number> numberClass53 = numberSerializer45.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer54 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass53);
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = numberSerializer43.getSchema(serializerProvider44, (java.lang.reflect.Type) numberClass53);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer56 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass53);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider57 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer58 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer60 = numberSerializer58.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer62 = numberSerializer58.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer63 = numberSerializer58.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass64 = numberSerializer58.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer65 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass64);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer66 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass64);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = doubleSerializer56.getSchema(serializerProvider57, (java.lang.reflect.Type) numberClass64);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer68 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass64);
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = doubleSerializer41.getSchema(serializerProvider42, (java.lang.reflect.Type) numberClass64);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor70 = doubleSerializer41.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper71 = null;
        com.fasterxml.jackson.databind.JavaType javaType72 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleSerializer41.acceptJsonFormatVisitor(jsonFormatVisitorWrapper71, javaType72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(numberSerializer5);
        org.junit.Assert.assertNotNull(numberSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
        org.junit.Assert.assertNotNull(numberClass15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(numberSerializer20);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer22);
        org.junit.Assert.assertNotNull(numberSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor31);
        org.junit.Assert.assertNotNull(numberClass32);
        org.junit.Assert.assertNotNull(numberClass33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(numberClass37);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertNotNull(numberSerializer43);
        org.junit.Assert.assertNotNull(numberSerializer45);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor52);
        org.junit.Assert.assertNotNull(numberClass53);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertNotNull(numberSerializer58);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer60);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer62);
        org.junit.Assert.assertNull(wildcardJsonSerializer63);
        org.junit.Assert.assertNotNull(numberClass64);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertNotNull(jsonNode69);
        org.junit.Assert.assertNotNull(propertyWriterItor70);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        boolean boolean1 = intLikeSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = intLikeSerializer0.properties();
        boolean boolean3 = intLikeSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = intLikeSerializer5._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = numberSerializer10.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = numberSerializer10.withFilterId((java.lang.Object) '#');
        boolean boolean16 = numberSerializer10.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = numberSerializer10.properties();
        java.lang.Class<java.lang.Number> numberClass18 = numberSerializer10.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer19 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass18);
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = numberSerializer8.getSchema(serializerProvider9, (java.lang.reflect.Type) numberClass18);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer21 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass18);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer22 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass18);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer24.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer24.withFilterId((java.lang.Object) '#');
        boolean boolean30 = numberSerializer24.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor31 = numberSerializer24.properties();
        java.lang.Class<java.lang.Number> numberClass32 = numberSerializer24.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer33 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass32);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer37 = numberSerializer35.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer39 = numberSerializer35.withFilterId((java.lang.Object) '#');
        boolean boolean41 = numberSerializer35.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor42 = numberSerializer35.properties();
        java.lang.Class<java.lang.Number> numberClass43 = numberSerializer35.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer44 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass43);
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = numberSerializer33.getSchema(serializerProvider34, (java.lang.reflect.Type) numberClass43, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = longSerializer22.getSchema(serializerProvider23, (java.lang.reflect.Type) numberClass43);
        java.lang.Class<java.lang.Object> objClass48 = longSerializer22.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = intLikeSerializer5.getSchema(serializerProvider7, (java.lang.reflect.Type) objClass48, false);
        boolean boolean51 = intLikeSerializer5.usesObjectId();
        boolean boolean52 = intLikeSerializer0.isEmpty(serializerProvider4, (java.lang.Object) boolean51);
        java.lang.Class<java.lang.Object> objClass53 = intLikeSerializer0.handledType();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertTrue("'" + numberType6 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType6.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer8);
        org.junit.Assert.assertNotNull(numberSerializer10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
        org.junit.Assert.assertNotNull(numberClass18);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(numberSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor31);
        org.junit.Assert.assertNotNull(numberClass32);
        org.junit.Assert.assertNotNull(numberSerializer35);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer37);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor42);
        org.junit.Assert.assertNotNull(numberClass43);
        org.junit.Assert.assertNotNull(jsonNode46);
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertNotNull(objClass48);
        org.junit.Assert.assertNotNull(jsonNode50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objClass53);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer10 = numberSerializer0.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = numberSerializer11.properties();
        java.lang.Class<java.lang.Number> numberClass19 = numberSerializer11.handledType();
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer11.handledType();
        boolean boolean21 = numberSerializer11.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer23 = numberSerializer11.unwrappingSerializer(nameTransformer22);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer0.withFilterId((java.lang.Object) numberJsonSerializer23);
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer26 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass25);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer30 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer30.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberSerializer30.withFilterId((java.lang.Object) '#');
        boolean boolean36 = numberSerializer30.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor37 = numberSerializer30.properties();
        java.lang.Class<java.lang.Number> numberClass38 = numberSerializer30.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer39 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass38);
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = numberSerializer28.getSchema(serializerProvider29, (java.lang.reflect.Type) numberClass38);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer41 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass38);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = numberSerializer43.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = numberSerializer43.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer48 = numberSerializer43.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass49 = numberSerializer43.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer50 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass49);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer51 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass49);
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = doubleSerializer41.getSchema(serializerProvider42, (java.lang.reflect.Type) numberClass49);
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = numberSerializer26.getSchema(serializerProvider27, (java.lang.reflect.Type) numberClass49);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer54 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass49);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer55 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass49);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer56 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass49);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer10);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertNotNull(numberClass19);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertNotNull(numberSerializer28);
        org.junit.Assert.assertNotNull(numberSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer32);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor37);
        org.junit.Assert.assertNotNull(numberClass38);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertNotNull(numberSerializer43);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer45);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNull(wildcardJsonSerializer48);
        org.junit.Assert.assertNotNull(numberClass49);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(jsonNode53);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        boolean boolean10 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer12 = numberSerializer0.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer13.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer13.withFilterId((java.lang.Object) '#');
        boolean boolean19 = numberSerializer13.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor20 = numberSerializer13.properties();
        java.lang.Class<java.lang.Number> numberClass21 = numberSerializer13.handledType();
        java.lang.Class<java.lang.Number> numberClass22 = numberSerializer13.handledType();
        java.lang.Class<java.lang.Number> numberClass23 = numberSerializer13.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer24 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass23);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = numberJsonSerializer12.withFilterId((java.lang.Object) doubleSerializer24);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer12);
        org.junit.Assert.assertNotNull(numberSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor20);
        org.junit.Assert.assertNotNull(numberClass21);
        org.junit.Assert.assertNotNull(numberClass22);
        org.junit.Assert.assertNotNull(numberClass23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer0.withFilterId((java.lang.Object) (short) 0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer10 = numberSerializer0.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer14.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer14.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer20 = numberSerializer14.unwrappingSerializer(nameTransformer19);
        boolean boolean21 = numberSerializer14.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        java.lang.reflect.Type type25 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = intLikeSerializer23.getSchema(serializerProvider24, type25);
        java.lang.String str27 = intLikeSerializer23._schemaType;
        java.lang.Class<java.lang.Object> objClass28 = intLikeSerializer23.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = numberSerializer14.getSchema(serializerProvider22, (java.lang.reflect.Type) objClass28);
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = intLikeSerializer12.getSchema(serializerProvider13, (java.lang.reflect.Type) objClass28, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = numberSerializer0.getSchema(serializerProvider11, (java.lang.reflect.Type) objClass28, true);
        boolean boolean35 = numberSerializer0.isEmpty((java.lang.Number) 100);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNotNull(numberJsonSerializer10);
        org.junit.Assert.assertNotNull(intLikeSerializer12);
        org.junit.Assert.assertNotNull(numberSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(numberJsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer23);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "integer" + "'", str27, "integer");
        org.junit.Assert.assertNotNull(objClass28);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = numberSerializer0.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass4 = numberSerializer0.handledType();
        boolean boolean5 = numberSerializer0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Number> numberClass6 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        java.lang.Throwable throwable8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = intLikeSerializer9.getSchema(serializerProvider10, type11);
        java.lang.String str13 = intLikeSerializer9._schemaType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        java.lang.reflect.Type type15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = intLikeSerializer9.getSchema(serializerProvider14, type15);
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.wrapAndThrow(serializerProvider7, throwable8, (java.lang.Object) type15, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(numberClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(numberClass6);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "integer" + "'", str13, "integer");
        org.junit.Assert.assertNotNull(jsonNode16);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer10 = numberSerializer0.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = numberSerializer11.properties();
        java.lang.Class<java.lang.Number> numberClass19 = numberSerializer11.handledType();
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer11.handledType();
        boolean boolean21 = numberSerializer11.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer23 = numberSerializer11.unwrappingSerializer(nameTransformer22);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer0.withFilterId((java.lang.Object) numberJsonSerializer23);
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer26 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass25);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer28 = integerSerializer26.unwrappingSerializer(nameTransformer27);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = integerSerializer26.createContextual(serializerProvider29, beanProperty30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer10);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertNotNull(numberClass19);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertNotNull(objJsonSerializer28);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        boolean boolean7 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer9 = numberSerializer0.unwrappingSerializer(nameTransformer8);
        boolean boolean11 = numberSerializer0.isEmpty((java.lang.Number) 1.0d);
        boolean boolean12 = numberSerializer0.isUnwrappingSerializer();
        boolean boolean13 = numberSerializer0._isInt;
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer9 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = numberSerializer11.properties();
        java.lang.Class<java.lang.Number> numberClass19 = numberSerializer11.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer20 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass19);
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = numberSerializer9.getSchema(serializerProvider10, (java.lang.reflect.Type) numberClass19, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer23 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass19);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer24 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass19);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        java.lang.Throwable throwable26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer27 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = numberSerializer27.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer30 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer30.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberSerializer30.withFilterId((java.lang.Object) '#');
        boolean boolean36 = numberSerializer30.isEmpty((java.lang.Number) (-1));
        boolean boolean38 = numberSerializer30.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer39 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer40 = numberSerializer30.unwrappingSerializer(nameTransformer39);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer41 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer43 = numberSerializer41.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = numberSerializer41.withFilterId((java.lang.Object) '#');
        boolean boolean47 = numberSerializer41.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor48 = numberSerializer41.properties();
        java.lang.Class<java.lang.Number> numberClass49 = numberSerializer41.handledType();
        java.lang.Class<java.lang.Number> numberClass50 = numberSerializer41.handledType();
        boolean boolean51 = numberSerializer41.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer52 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer53 = numberSerializer41.unwrappingSerializer(nameTransformer52);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer54 = numberSerializer30.withFilterId((java.lang.Object) numberJsonSerializer53);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer55 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        boolean boolean56 = intLikeSerializer55.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer57 = wildcardJsonSerializer54.withFilterId((java.lang.Object) boolean56);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer58 = numberSerializer27.withFilterId((java.lang.Object) wildcardJsonSerializer57);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer59 = numberSerializer27.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider60 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer61 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer63 = numberSerializer61.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer65 = numberSerializer61.withFilterId((java.lang.Object) '#');
        boolean boolean67 = numberSerializer61.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor68 = numberSerializer61.properties();
        java.lang.Class<java.lang.Number> numberClass69 = numberSerializer61.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer70 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass69);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider71 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer72 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer74 = numberSerializer72.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer76 = numberSerializer72.withFilterId((java.lang.Object) '#');
        boolean boolean78 = numberSerializer72.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor79 = numberSerializer72.properties();
        java.lang.Class<java.lang.Number> numberClass80 = numberSerializer72.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer81 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass80);
        com.fasterxml.jackson.databind.JsonNode jsonNode83 = numberSerializer70.getSchema(serializerProvider71, (java.lang.reflect.Type) numberClass80, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer84 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass80);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer85 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass80);
        com.fasterxml.jackson.databind.JsonNode jsonNode87 = numberSerializer27.getSchema(serializerProvider60, (java.lang.reflect.Type) numberClass80, false);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer88 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass80);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer89 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass80);
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer24.wrapAndThrow(serializerProvider25, throwable26, (java.lang.Object) numberClass80, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertNotNull(numberClass19);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(numberSerializer27);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer29);
        org.junit.Assert.assertNotNull(numberSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer32);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer40);
        org.junit.Assert.assertNotNull(numberSerializer41);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer43);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor48);
        org.junit.Assert.assertNotNull(numberClass49);
        org.junit.Assert.assertNotNull(numberClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer53);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer54);
        org.junit.Assert.assertNotNull(intLikeSerializer55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer57);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer58);
        org.junit.Assert.assertNull(wildcardJsonSerializer59);
        org.junit.Assert.assertNotNull(numberSerializer61);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer63);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor68);
        org.junit.Assert.assertNotNull(numberClass69);
        org.junit.Assert.assertNotNull(numberSerializer72);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer74);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor79);
        org.junit.Assert.assertNotNull(numberClass80);
        org.junit.Assert.assertNotNull(jsonNode83);
        org.junit.Assert.assertNotNull(jsonNode87);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType1 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = intLikeSerializer0.getSchema(serializerProvider2, type3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer6.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = numberSerializer6.withFilterId((java.lang.Object) '#');
        boolean boolean12 = numberSerializer6.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = numberSerializer6.properties();
        java.lang.Class<java.lang.Number> numberClass14 = numberSerializer6.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = intLikeSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) numberClass14, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer17 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass14);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer18 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass14);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = numberSerializer20.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer20.withFilterId((java.lang.Object) '#');
        boolean boolean26 = numberSerializer20.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor27 = numberSerializer20.properties();
        java.lang.Class<java.lang.Number> numberClass28 = numberSerializer20.handledType();
        java.lang.Class<java.lang.Number> numberClass29 = numberSerializer20.handledType();
        boolean boolean30 = numberSerializer20.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer31 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer32 = numberSerializer20.unwrappingSerializer(nameTransformer31);
        boolean boolean33 = numberJsonSerializer32.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        boolean boolean36 = numberJsonSerializer32.isEmpty(serializerProvider34, (java.lang.Number) 100.0f);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor37 = numberJsonSerializer32.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        boolean boolean40 = numberJsonSerializer32.isEmpty(serializerProvider38, (java.lang.Number) (byte) 10);
        java.lang.Class<?> wildcardClass41 = numberJsonSerializer32.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = numberSerializer18.getSchema(serializerProvider19, (java.lang.reflect.Type) wildcardClass41);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + numberType1 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType1.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(numberSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertNotNull(numberClass14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(numberSerializer20);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor27);
        org.junit.Assert.assertNotNull(numberClass28);
        org.junit.Assert.assertNotNull(numberClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(jsonNode42);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType1 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer5.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer5.withFilterId((java.lang.Object) '#');
        boolean boolean11 = numberSerializer5.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberSerializer5.properties();
        java.lang.Class<java.lang.Number> numberClass13 = numberSerializer5.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass13);
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = numberSerializer3.getSchema(serializerProvider4, (java.lang.reflect.Type) numberClass13);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass13);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer18 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        java.lang.reflect.Type type20 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = intLikeSerializer18.getSchema(serializerProvider19, type20);
        java.lang.String str22 = intLikeSerializer18._schemaType;
        java.lang.Class<java.lang.Object> objClass23 = intLikeSerializer18.handledType();
        java.lang.Class<?> wildcardClass24 = intLikeSerializer18.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = longSerializer16.getSchema(serializerProvider17, (java.lang.reflect.Type) wildcardClass24, false);
        java.lang.String str27 = longSerializer16._schemaType;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = intLikeSerializer0.withFilterId((java.lang.Object) str27);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = null;
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper29, javaType30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + numberType1 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType1.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(numberSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertNotNull(numberClass13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(intLikeSerializer18);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "integer" + "'", str22, "integer");
        org.junit.Assert.assertNotNull(objClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "number" + "'", str27, "number");
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        boolean boolean12 = numberSerializer0.isEmpty(serializerProvider10, (java.lang.Number) (short) 0);
        boolean boolean13 = numberSerializer0.usesObjectId();
        boolean boolean14 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer15.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = numberSerializer15.withFilterId((java.lang.Object) '#');
        boolean boolean21 = numberSerializer15.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor22 = numberSerializer15.properties();
        java.lang.Class<java.lang.Number> numberClass23 = numberSerializer15.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer24 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass23);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = doubleSerializer24.getDelegatee();
        boolean boolean26 = doubleSerializer24._isInt;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer0.withFilterId((java.lang.Object) boolean26);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = numberSerializer28.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer28.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer33 = numberSerializer28.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass34 = numberSerializer28.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer35 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass34);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer36 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass34);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer37 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass34);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = wildcardJsonSerializer27.withFilterId((java.lang.Object) numberClass34);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer39 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass34);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer41 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType42 = intLikeSerializer41._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        java.lang.reflect.Type type44 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = intLikeSerializer41.getSchema(serializerProvider43, type44);
        boolean boolean46 = intLikeSerializer41._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer48 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer50 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer54 = numberSerializer52.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer56 = numberSerializer52.withFilterId((java.lang.Object) '#');
        boolean boolean58 = numberSerializer52.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor59 = numberSerializer52.properties();
        java.lang.Class<java.lang.Number> numberClass60 = numberSerializer52.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer61 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass60);
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = numberSerializer50.getSchema(serializerProvider51, (java.lang.reflect.Type) numberClass60);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer63 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass60);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer64 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass60);
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = intLikeSerializer48.getSchema(serializerProvider49, (java.lang.reflect.Type) numberClass60);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = intLikeSerializer41.getSchema(serializerProvider47, (java.lang.reflect.Type) numberClass60, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = doubleSerializer39.getSchema(serializerProvider40, (java.lang.reflect.Type) numberClass60);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider69 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer70 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer72 = numberSerializer70.withFilterId((java.lang.Object) 100.0d);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor73 = numberSerializer70.properties();
        java.lang.Class<java.lang.Number> numberClass74 = numberSerializer70.handledType();
        boolean boolean76 = numberSerializer70.isEmpty((java.lang.Number) (-1));
        java.lang.Class<java.lang.Number> numberClass77 = numberSerializer70.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode78 = doubleSerializer39.getSchema(serializerProvider69, (java.lang.reflect.Type) numberClass77);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider79 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty80 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer81 = doubleSerializer39.createContextual(serializerProvider79, beanProperty80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(numberSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor22);
        org.junit.Assert.assertNotNull(numberClass23);
        org.junit.Assert.assertNull(wildcardJsonSerializer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(numberSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer32);
        org.junit.Assert.assertNull(wildcardJsonSerializer33);
        org.junit.Assert.assertNotNull(numberClass34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer38);
        org.junit.Assert.assertNotNull(intLikeSerializer41);
        org.junit.Assert.assertTrue("'" + numberType42 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType42.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intLikeSerializer48);
        org.junit.Assert.assertNotNull(numberSerializer50);
        org.junit.Assert.assertNotNull(numberSerializer52);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer54);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor59);
        org.junit.Assert.assertNotNull(numberClass60);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertNotNull(jsonNode65);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertNotNull(numberSerializer70);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer72);
        org.junit.Assert.assertNotNull(propertyWriterItor73);
        org.junit.Assert.assertNotNull(numberClass74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(numberClass77);
        org.junit.Assert.assertNotNull(jsonNode78);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serializeWithType((java.lang.Number) 1.0d, jsonGenerator9, serializerProvider10, typeSerializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer9 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = numberSerializer11.properties();
        java.lang.Class<java.lang.Number> numberClass19 = numberSerializer11.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer20 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass19);
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = numberSerializer9.getSchema(serializerProvider10, (java.lang.reflect.Type) numberClass19, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer23 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass19);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType26 = intLikeSerializer25._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = numberSerializer28.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer28.withFilterId((java.lang.Object) '#');
        boolean boolean34 = numberSerializer28.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor35 = numberSerializer28.properties();
        java.lang.Class<java.lang.Number> numberClass36 = numberSerializer28.handledType();
        java.lang.Class<java.lang.Number> numberClass37 = numberSerializer28.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = intLikeSerializer25.getSchema(serializerProvider27, (java.lang.reflect.Type) numberClass37, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType40 = intLikeSerializer25._numberType;
        java.lang.Class<java.lang.Object> objClass41 = intLikeSerializer25.handledType();
        boolean boolean42 = intLikeSerializer25._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer44 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType45 = intLikeSerializer44._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer47 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = numberSerializer47.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer51 = numberSerializer47.withFilterId((java.lang.Object) '#');
        boolean boolean53 = numberSerializer47.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor54 = numberSerializer47.properties();
        java.lang.Class<java.lang.Number> numberClass55 = numberSerializer47.handledType();
        java.lang.Class<java.lang.Number> numberClass56 = numberSerializer47.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = intLikeSerializer44.getSchema(serializerProvider46, (java.lang.reflect.Type) numberClass56, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer59 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer61 = numberSerializer59.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer63 = numberSerializer59.withFilterId((java.lang.Object) '#');
        boolean boolean65 = numberSerializer59.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor66 = numberSerializer59.properties();
        java.lang.Class<java.lang.Number> numberClass67 = numberSerializer59.handledType();
        java.lang.Class<java.lang.Number> numberClass68 = numberSerializer59.handledType();
        boolean boolean69 = numberSerializer59.usesObjectId();
        boolean boolean70 = intLikeSerializer44.isEmpty((java.lang.Object) boolean69);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider71 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer72 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType73 = intLikeSerializer72._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider74 = null;
        java.lang.reflect.Type type75 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode76 = intLikeSerializer72.getSchema(serializerProvider74, type75);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider77 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer78 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer80 = numberSerializer78.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer82 = numberSerializer78.withFilterId((java.lang.Object) '#');
        boolean boolean84 = numberSerializer78.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor85 = numberSerializer78.properties();
        java.lang.Class<java.lang.Number> numberClass86 = numberSerializer78.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode88 = intLikeSerializer72.getSchema(serializerProvider77, (java.lang.reflect.Type) numberClass86, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode89 = intLikeSerializer44.getSchema(serializerProvider71, (java.lang.reflect.Type) numberClass86);
        com.fasterxml.jackson.databind.JsonNode jsonNode90 = intLikeSerializer25.getSchema(serializerProvider43, (java.lang.reflect.Type) numberClass86);
        com.fasterxml.jackson.databind.JsonNode jsonNode91 = longSerializer23.getSchema(serializerProvider24, (java.lang.reflect.Type) numberClass86);
        boolean boolean92 = longSerializer23._isInt;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor93 = longSerializer23.properties();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertNotNull(numberClass19);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(intLikeSerializer25);
        org.junit.Assert.assertTrue("'" + numberType26 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType26.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor35);
        org.junit.Assert.assertNotNull(numberClass36);
        org.junit.Assert.assertNotNull(numberClass37);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertTrue("'" + numberType40 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType40.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intLikeSerializer44);
        org.junit.Assert.assertTrue("'" + numberType45 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType45.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer49);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor54);
        org.junit.Assert.assertNotNull(numberClass55);
        org.junit.Assert.assertNotNull(numberClass56);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(numberSerializer59);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer61);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor66);
        org.junit.Assert.assertNotNull(numberClass67);
        org.junit.Assert.assertNotNull(numberClass68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer72);
        org.junit.Assert.assertTrue("'" + numberType73 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType73.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonNode76);
        org.junit.Assert.assertNotNull(numberSerializer78);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer80);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor85);
        org.junit.Assert.assertNotNull(numberClass86);
        org.junit.Assert.assertNotNull(jsonNode88);
        org.junit.Assert.assertNotNull(jsonNode89);
        org.junit.Assert.assertNotNull(jsonNode90);
        org.junit.Assert.assertNotNull(jsonNode91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(propertyWriterItor93);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        boolean boolean10 = numberSerializer0._isInt;
        java.lang.Number number11 = null;
        boolean boolean12 = numberSerializer0.isEmpty(number11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer14 = numberSerializer0.unwrappingSerializer(nameTransformer13);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor15 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType18 = intLikeSerializer17._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        java.lang.reflect.Type type20 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = intLikeSerializer17.getSchema(serializerProvider19, type20);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = numberSerializer23.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer23.withFilterId((java.lang.Object) '#');
        boolean boolean29 = numberSerializer23.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor30 = numberSerializer23.properties();
        java.lang.Class<java.lang.Number> numberClass31 = numberSerializer23.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = intLikeSerializer17.getSchema(serializerProvider22, (java.lang.reflect.Type) numberClass31, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer34 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass31);
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = numberSerializer0.getSchema(serializerProvider16, (java.lang.reflect.Type) numberClass31);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(numberJsonSerializer14);
        org.junit.Assert.assertNotNull(propertyWriterItor15);
        org.junit.Assert.assertNotNull(intLikeSerializer17);
        org.junit.Assert.assertTrue("'" + numberType18 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType18.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(numberSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor30);
        org.junit.Assert.assertNotNull(numberClass31);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(jsonNode35);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        boolean boolean1 = intLikeSerializer0.usesObjectId();
        java.lang.Class<java.lang.Object> objClass2 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = intLikeSerializer0.createContextual(serializerProvider3, beanProperty4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = intLikeSerializer0.getSchema(serializerProvider1, type2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer7.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer7.withFilterId((java.lang.Object) '#');
        boolean boolean13 = numberSerializer7.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = numberSerializer7.properties();
        java.lang.Class<java.lang.Number> numberClass15 = numberSerializer7.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = numberSerializer5.getSchema(serializerProvider6, (java.lang.reflect.Type) numberClass15, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) numberClass15);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = numberSerializer20.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer24.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer24.withFilterId((java.lang.Object) '#');
        boolean boolean30 = numberSerializer24.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor31 = numberSerializer24.properties();
        java.lang.Class<java.lang.Number> numberClass32 = numberSerializer24.handledType();
        java.lang.Class<java.lang.Number> numberClass33 = numberSerializer24.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        boolean boolean36 = numberSerializer24.isEmpty(serializerProvider34, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass37 = numberSerializer24.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = numberSerializer20.getSchema(serializerProvider23, (java.lang.reflect.Type) numberClass37);
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = intLikeSerializer0.getSchema(serializerProvider19, (java.lang.reflect.Type) numberClass37, false);
        boolean boolean41 = intLikeSerializer0.usesObjectId();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType42 = intLikeSerializer0._numberType;
        java.lang.String str43 = intLikeSerializer0._schemaType;
        java.lang.Class<java.lang.Object> objClass44 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty46 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = intLikeSerializer0.createContextual(serializerProvider45, beanProperty46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(numberSerializer5);
        org.junit.Assert.assertNotNull(numberSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
        org.junit.Assert.assertNotNull(numberClass15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(numberSerializer20);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer22);
        org.junit.Assert.assertNotNull(numberSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor31);
        org.junit.Assert.assertNotNull(numberClass32);
        org.junit.Assert.assertNotNull(numberClass33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(numberClass37);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + numberType42 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType42.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "integer" + "'", str43, "integer");
        org.junit.Assert.assertNotNull(objClass44);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer2.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer2.withFilterId((java.lang.Object) '#');
        boolean boolean8 = numberSerializer2.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberSerializer2.properties();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) numberClass10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberSerializer16.getDelegatee();
        boolean boolean22 = longSerializer14.isEmpty(serializerProvider15, (java.lang.Object) numberSerializer16);
        java.lang.Class<java.lang.Object> objClass23 = longSerializer14.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer24.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer24.withFilterId((java.lang.Object) '#');
        boolean boolean30 = numberSerializer24.isEmpty((java.lang.Number) (-1));
        boolean boolean32 = numberSerializer24.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        boolean boolean35 = numberSerializer24.isEmpty(serializerProvider33, (java.lang.Number) (-1.0d));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor36 = numberSerializer24.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer37 = numberSerializer24.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer39 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer41 = numberSerializer39.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer43 = numberSerializer39.withFilterId((java.lang.Object) '#');
        boolean boolean45 = numberSerializer39.isEmpty((java.lang.Number) (-1));
        boolean boolean47 = numberSerializer39.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer48 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer49 = numberSerializer39.unwrappingSerializer(nameTransformer48);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer50 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer52 = numberSerializer50.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer54 = numberSerializer50.withFilterId((java.lang.Object) '#');
        boolean boolean56 = numberSerializer50.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor57 = numberSerializer50.properties();
        java.lang.Class<java.lang.Number> numberClass58 = numberSerializer50.handledType();
        java.lang.Class<java.lang.Number> numberClass59 = numberSerializer50.handledType();
        boolean boolean60 = numberSerializer50.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer61 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer62 = numberSerializer50.unwrappingSerializer(nameTransformer61);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer63 = numberSerializer39.withFilterId((java.lang.Object) numberJsonSerializer62);
        java.lang.Class<java.lang.Number> numberClass64 = numberSerializer39.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = numberSerializer24.getSchema(serializerProvider38, (java.lang.reflect.Type) numberClass64, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider67 = null;
        boolean boolean69 = numberSerializer24.isEmpty(serializerProvider67, (java.lang.Number) (short) -1);
        java.lang.Class<java.lang.Number> numberClass70 = numberSerializer24.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer71 = longSerializer14.withFilterId((java.lang.Object) numberSerializer24);
        java.lang.Class<java.lang.Number> numberClass72 = numberSerializer24.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor73 = numberSerializer24.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider74 = null;
        boolean boolean76 = numberSerializer24.isEmpty(serializerProvider74, (java.lang.Number) (short) 100);
        boolean boolean77 = numberSerializer24.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider78 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty79 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer80 = numberSerializer24.createContextual(serializerProvider78, beanProperty79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNull(wildcardJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objClass23);
        org.junit.Assert.assertNotNull(numberSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor36);
        org.junit.Assert.assertNull(wildcardJsonSerializer37);
        org.junit.Assert.assertNotNull(numberSerializer39);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer41);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer49);
        org.junit.Assert.assertNotNull(numberSerializer50);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer52);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor57);
        org.junit.Assert.assertNotNull(numberClass58);
        org.junit.Assert.assertNotNull(numberClass59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer62);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer63);
        org.junit.Assert.assertNotNull(numberClass64);
        org.junit.Assert.assertNotNull(jsonNode66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(numberClass70);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer71);
        org.junit.Assert.assertNotNull(numberClass72);
        org.junit.Assert.assertNotNull(propertyWriterItor73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType1 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        boolean boolean9 = numberSerializer3.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer3.properties();
        java.lang.Class<java.lang.Number> numberClass11 = numberSerializer3.handledType();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = intLikeSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) numberClass12, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        boolean boolean22 = numberSerializer16.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = numberSerializer16.properties();
        java.lang.Class<java.lang.Number> numberClass24 = numberSerializer16.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer25 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass24);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer26 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = shortSerializer26.withFilterId((java.lang.Object) 10.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer30 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer30.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberSerializer30.withFilterId((java.lang.Object) '#');
        boolean boolean36 = numberSerializer30.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor37 = numberSerializer30.properties();
        java.lang.Class<java.lang.Number> numberClass38 = numberSerializer30.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer39 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass38);
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = shortSerializer26.getSchema(serializerProvider29, (java.lang.reflect.Type) numberClass38);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer41 = doubleSerializer25.withFilterId((java.lang.Object) numberClass38);
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = intLikeSerializer0.getSchema(serializerProvider15, (java.lang.reflect.Type) numberClass38);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer43 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass38);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor44 = doubleSerializer43.properties();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer45 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = numberSerializer45.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = numberSerializer45.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer50 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer51 = numberSerializer45.unwrappingSerializer(nameTransformer50);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor52 = numberJsonSerializer51.properties();
        boolean boolean54 = numberJsonSerializer51.isEmpty((java.lang.Number) (byte) 10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer55 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer56 = numberJsonSerializer51.unwrappingSerializer(nameTransformer55);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator57 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider58 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer59 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleSerializer43.serializeWithType((java.lang.Object) nameTransformer55, jsonGenerator57, serializerProvider58, typeSerializer59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + numberType1 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType1.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(numberClass11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertNotNull(numberClass24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(numberSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer32);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor37);
        org.junit.Assert.assertNotNull(numberClass38);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer41);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertNotNull(propertyWriterItor44);
        org.junit.Assert.assertNotNull(numberSerializer45);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer49);
        org.junit.Assert.assertNotNull(numberJsonSerializer51);
        org.junit.Assert.assertNotNull(propertyWriterItor52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer56);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean1 = shortSerializer0._isInt;
        boolean boolean2 = shortSerializer0._isInt;
        java.lang.String str3 = shortSerializer0._schemaType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer5 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = shortSerializer5.withFilterId((java.lang.Object) 10.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer9.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer9.withFilterId((java.lang.Object) '#');
        boolean boolean15 = numberSerializer9.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = numberSerializer9.properties();
        java.lang.Class<java.lang.Number> numberClass17 = numberSerializer9.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer18 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass17);
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = shortSerializer5.getSchema(serializerProvider8, (java.lang.reflect.Type) numberClass17);
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = shortSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) numberClass17, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType24 = intLikeSerializer23._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        java.lang.reflect.Type type26 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = intLikeSerializer23.getSchema(serializerProvider25, type26);
        boolean boolean28 = intLikeSerializer23._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer30 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer32 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = numberSerializer34.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = numberSerializer34.withFilterId((java.lang.Object) '#');
        boolean boolean40 = numberSerializer34.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor41 = numberSerializer34.properties();
        java.lang.Class<java.lang.Number> numberClass42 = numberSerializer34.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer43 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass42);
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = numberSerializer32.getSchema(serializerProvider33, (java.lang.reflect.Type) numberClass42);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer45 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass42);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer46 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass42);
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = intLikeSerializer30.getSchema(serializerProvider31, (java.lang.reflect.Type) numberClass42);
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = intLikeSerializer23.getSchema(serializerProvider29, (java.lang.reflect.Type) numberClass42, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer50 = numberSerializer22.withFilterId((java.lang.Object) true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType53 = intLikeSerializer52._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider54 = null;
        java.lang.reflect.Type type55 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = intLikeSerializer52.getSchema(serializerProvider54, type55);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider57 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer58 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer60 = numberSerializer58.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer62 = numberSerializer58.withFilterId((java.lang.Object) '#');
        boolean boolean64 = numberSerializer58.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor65 = numberSerializer58.properties();
        java.lang.Class<java.lang.Number> numberClass66 = numberSerializer58.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = intLikeSerializer52.getSchema(serializerProvider57, (java.lang.reflect.Type) numberClass66, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer69 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass66);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer70 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass66);
        java.lang.Class<java.lang.Object> objClass71 = integerSerializer70.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode73 = numberSerializer22.getSchema(serializerProvider51, (java.lang.reflect.Type) objClass71, false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator74 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider75 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.serialize((java.lang.Object) objClass71, jsonGenerator74, serializerProvider75);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class java.lang.Short (java.lang.Class and java.lang.Short are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "number" + "'", str3, "number");
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(numberSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
        org.junit.Assert.assertNotNull(numberClass17);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(numberSerializer22);
        org.junit.Assert.assertNotNull(intLikeSerializer23);
        org.junit.Assert.assertTrue("'" + numberType24 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType24.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intLikeSerializer30);
        org.junit.Assert.assertNotNull(numberSerializer32);
        org.junit.Assert.assertNotNull(numberSerializer34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor41);
        org.junit.Assert.assertNotNull(numberClass42);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertNotNull(jsonNode49);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer50);
        org.junit.Assert.assertNotNull(intLikeSerializer52);
        org.junit.Assert.assertTrue("'" + numberType53 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType53.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonNode56);
        org.junit.Assert.assertNotNull(numberSerializer58);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer60);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor65);
        org.junit.Assert.assertNotNull(numberClass66);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertNotNull(objClass71);
        org.junit.Assert.assertNotNull(jsonNode73);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer4.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer4.withFilterId((java.lang.Object) '#');
        boolean boolean10 = numberSerializer4.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer4.properties();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer4.handledType();
        java.lang.Class<java.lang.Number> numberClass13 = numberSerializer4.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        boolean boolean16 = numberSerializer4.isEmpty(serializerProvider14, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass17 = numberSerializer4.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = numberSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) numberClass17);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer22.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer22.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer28 = numberSerializer22.unwrappingSerializer(nameTransformer27);
        boolean boolean29 = numberSerializer22.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer31 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        java.lang.reflect.Type type33 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = intLikeSerializer31.getSchema(serializerProvider32, type33);
        java.lang.String str35 = intLikeSerializer31._schemaType;
        java.lang.Class<java.lang.Object> objClass36 = intLikeSerializer31.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = numberSerializer22.getSchema(serializerProvider30, (java.lang.reflect.Type) objClass36);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = intLikeSerializer20.getSchema(serializerProvider21, (java.lang.reflect.Type) objClass36, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer41 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = numberSerializer43.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = numberSerializer43.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer48 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer49 = numberSerializer43.unwrappingSerializer(nameTransformer48);
        boolean boolean50 = numberSerializer43.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider53 = null;
        java.lang.reflect.Type type54 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = intLikeSerializer52.getSchema(serializerProvider53, type54);
        java.lang.String str56 = intLikeSerializer52._schemaType;
        java.lang.Class<java.lang.Object> objClass57 = intLikeSerializer52.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = numberSerializer43.getSchema(serializerProvider51, (java.lang.reflect.Type) objClass57);
        com.fasterxml.jackson.databind.JsonNode jsonNode60 = intLikeSerializer41.getSchema(serializerProvider42, (java.lang.reflect.Type) objClass57, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = intLikeSerializer20.getSchema(serializerProvider40, (java.lang.reflect.Type) objClass57, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = numberSerializer0.getSchema(serializerProvider19, (java.lang.reflect.Type) objClass57, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider65 = null;
        boolean boolean67 = numberSerializer0.isEmpty(serializerProvider65, (java.lang.Number) (byte) 100);
        boolean boolean68 = numberSerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor69 = numberSerializer0.properties();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator71 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider72 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer73 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serializeWithType((java.lang.Number) 0.0d, jsonGenerator71, serializerProvider72, typeSerializer73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(numberSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(numberClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(numberClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(numberSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(numberJsonSerializer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer31);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "integer" + "'", str35, "integer");
        org.junit.Assert.assertNotNull(objClass36);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(intLikeSerializer41);
        org.junit.Assert.assertNotNull(numberSerializer43);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer45);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNotNull(numberJsonSerializer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer52);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "integer" + "'", str56, "integer");
        org.junit.Assert.assertNotNull(objClass57);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(jsonNode60);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertNotNull(jsonNode64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor69);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer4 = numberSerializer0.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberJsonSerializer6.properties();
        boolean boolean8 = numberJsonSerializer6.usesObjectId();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(numberJsonSerializer4);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberJsonSerializer6.properties();
        boolean boolean9 = numberJsonSerializer6.isEmpty((java.lang.Number) (byte) 10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer11 = numberJsonSerializer6.unwrappingSerializer(nameTransformer10);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberJsonSerializer11.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer14 = numberJsonSerializer11.unwrappingSerializer(nameTransformer13);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer11);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertNotNull(numberJsonSerializer14);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer2.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer2.withFilterId((java.lang.Object) '#');
        boolean boolean8 = numberSerializer2.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberSerializer2.properties();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) numberClass10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberSerializer16.getDelegatee();
        boolean boolean22 = longSerializer14.isEmpty(serializerProvider15, (java.lang.Object) numberSerializer16);
        java.lang.Class<java.lang.Object> objClass23 = longSerializer14.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer24.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer24.withFilterId((java.lang.Object) '#');
        boolean boolean30 = numberSerializer24.isEmpty((java.lang.Number) (-1));
        boolean boolean32 = numberSerializer24.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        boolean boolean35 = numberSerializer24.isEmpty(serializerProvider33, (java.lang.Number) (-1.0d));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor36 = numberSerializer24.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer37 = numberSerializer24.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer39 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer41 = numberSerializer39.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer43 = numberSerializer39.withFilterId((java.lang.Object) '#');
        boolean boolean45 = numberSerializer39.isEmpty((java.lang.Number) (-1));
        boolean boolean47 = numberSerializer39.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer48 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer49 = numberSerializer39.unwrappingSerializer(nameTransformer48);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer50 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer52 = numberSerializer50.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer54 = numberSerializer50.withFilterId((java.lang.Object) '#');
        boolean boolean56 = numberSerializer50.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor57 = numberSerializer50.properties();
        java.lang.Class<java.lang.Number> numberClass58 = numberSerializer50.handledType();
        java.lang.Class<java.lang.Number> numberClass59 = numberSerializer50.handledType();
        boolean boolean60 = numberSerializer50.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer61 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer62 = numberSerializer50.unwrappingSerializer(nameTransformer61);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer63 = numberSerializer39.withFilterId((java.lang.Object) numberJsonSerializer62);
        java.lang.Class<java.lang.Number> numberClass64 = numberSerializer39.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = numberSerializer24.getSchema(serializerProvider38, (java.lang.reflect.Type) numberClass64, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider67 = null;
        boolean boolean69 = numberSerializer24.isEmpty(serializerProvider67, (java.lang.Number) (short) -1);
        java.lang.Class<java.lang.Number> numberClass70 = numberSerializer24.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer71 = longSerializer14.withFilterId((java.lang.Object) numberSerializer24);
        java.lang.Class<java.lang.Number> numberClass72 = numberSerializer24.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor73 = numberSerializer24.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider74 = null;
        boolean boolean76 = numberSerializer24.isEmpty(serializerProvider74, (java.lang.Number) (short) 100);
        boolean boolean77 = numberSerializer24.usesObjectId();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator79 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider80 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer81 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer24.serializeWithType((java.lang.Number) (byte) -1, jsonGenerator79, serializerProvider80, typeSerializer81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNull(wildcardJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objClass23);
        org.junit.Assert.assertNotNull(numberSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor36);
        org.junit.Assert.assertNull(wildcardJsonSerializer37);
        org.junit.Assert.assertNotNull(numberSerializer39);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer41);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer49);
        org.junit.Assert.assertNotNull(numberSerializer50);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer52);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor57);
        org.junit.Assert.assertNotNull(numberClass58);
        org.junit.Assert.assertNotNull(numberClass59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer62);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer63);
        org.junit.Assert.assertNotNull(numberClass64);
        org.junit.Assert.assertNotNull(jsonNode66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(numberClass70);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer71);
        org.junit.Assert.assertNotNull(numberClass72);
        org.junit.Assert.assertNotNull(propertyWriterItor73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer10 = numberSerializer0.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = numberSerializer11.properties();
        java.lang.Class<java.lang.Number> numberClass19 = numberSerializer11.handledType();
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer11.handledType();
        boolean boolean21 = numberSerializer11.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer23 = numberSerializer11.unwrappingSerializer(nameTransformer22);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer0.withFilterId((java.lang.Object) numberJsonSerializer23);
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer26 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass25);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer26.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer29 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType30 = intLikeSerializer29._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer32 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberSerializer32.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = numberSerializer32.withFilterId((java.lang.Object) '#');
        boolean boolean38 = numberSerializer32.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor39 = numberSerializer32.properties();
        java.lang.Class<java.lang.Number> numberClass40 = numberSerializer32.handledType();
        java.lang.Class<java.lang.Number> numberClass41 = numberSerializer32.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = intLikeSerializer29.getSchema(serializerProvider31, (java.lang.reflect.Type) numberClass41, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer45 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = numberSerializer45.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = numberSerializer45.withFilterId((java.lang.Object) '#');
        boolean boolean51 = numberSerializer45.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor52 = numberSerializer45.properties();
        java.lang.Class<java.lang.Number> numberClass53 = numberSerializer45.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer54 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass53);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer55 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer57 = shortSerializer55.withFilterId((java.lang.Object) 10.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider58 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer59 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer61 = numberSerializer59.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer63 = numberSerializer59.withFilterId((java.lang.Object) '#');
        boolean boolean65 = numberSerializer59.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor66 = numberSerializer59.properties();
        java.lang.Class<java.lang.Number> numberClass67 = numberSerializer59.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer68 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass67);
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = shortSerializer55.getSchema(serializerProvider58, (java.lang.reflect.Type) numberClass67);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer70 = doubleSerializer54.withFilterId((java.lang.Object) numberClass67);
        com.fasterxml.jackson.databind.JsonNode jsonNode71 = intLikeSerializer29.getSchema(serializerProvider44, (java.lang.reflect.Type) numberClass67);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider72 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer73 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        boolean boolean74 = intLikeSerializer73.usesObjectId();
        java.lang.Class<java.lang.Object> objClass75 = intLikeSerializer73.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider76 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer77 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean78 = shortSerializer77._isInt;
        boolean boolean79 = shortSerializer77._isInt;
        boolean boolean80 = intLikeSerializer73.isEmpty(serializerProvider76, (java.lang.Object) boolean79);
        boolean boolean81 = intLikeSerializer29.isEmpty(serializerProvider72, (java.lang.Object) serializerProvider76);
        java.lang.Class<java.lang.Object> objClass82 = intLikeSerializer29.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode84 = numberSerializer26.getSchema(serializerProvider28, (java.lang.reflect.Type) objClass82, true);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer10);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertNotNull(numberClass19);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(intLikeSerializer29);
        org.junit.Assert.assertTrue("'" + numberType30 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType30.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer32);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor39);
        org.junit.Assert.assertNotNull(numberClass40);
        org.junit.Assert.assertNotNull(numberClass41);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertNotNull(numberSerializer45);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor52);
        org.junit.Assert.assertNotNull(numberClass53);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer57);
        org.junit.Assert.assertNotNull(numberSerializer59);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer61);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor66);
        org.junit.Assert.assertNotNull(numberClass67);
        org.junit.Assert.assertNotNull(jsonNode69);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer70);
        org.junit.Assert.assertNotNull(jsonNode71);
        org.junit.Assert.assertNotNull(intLikeSerializer73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objClass75);
        org.junit.Assert.assertNotNull(shortSerializer77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(objClass82);
        org.junit.Assert.assertNotNull(jsonNode84);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer0.withFilterId((java.lang.Object) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = numberSerializer11.properties();
        java.lang.Class<java.lang.Number> numberClass19 = numberSerializer11.handledType();
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer11.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        boolean boolean23 = numberSerializer11.isEmpty(serializerProvider21, (java.lang.Number) (short) 0);
        boolean boolean24 = numberSerializer11.usesObjectId();
        boolean boolean25 = numberSerializer11.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor26 = numberSerializer11.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor27 = numberSerializer11.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        boolean boolean30 = numberSerializer11.isEmpty(serializerProvider28, (java.lang.Number) 1.0d);
        boolean boolean32 = numberSerializer11.isEmpty((java.lang.Number) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType35 = intLikeSerializer34._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer37 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer39 = numberSerializer37.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer41 = numberSerializer37.withFilterId((java.lang.Object) '#');
        boolean boolean43 = numberSerializer37.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor44 = numberSerializer37.properties();
        java.lang.Class<java.lang.Number> numberClass45 = numberSerializer37.handledType();
        java.lang.Class<java.lang.Number> numberClass46 = numberSerializer37.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = intLikeSerializer34.getSchema(serializerProvider36, (java.lang.reflect.Type) numberClass46, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer49 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer51 = numberSerializer49.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer53 = numberSerializer49.withFilterId((java.lang.Object) '#');
        boolean boolean55 = numberSerializer49.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor56 = numberSerializer49.properties();
        java.lang.Class<java.lang.Number> numberClass57 = numberSerializer49.handledType();
        java.lang.Class<java.lang.Number> numberClass58 = numberSerializer49.handledType();
        boolean boolean59 = numberSerializer49.usesObjectId();
        boolean boolean60 = intLikeSerializer34.isEmpty((java.lang.Object) boolean59);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor61 = intLikeSerializer34.properties();
        java.lang.Class<java.lang.Object> objClass62 = intLikeSerializer34.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = numberSerializer11.getSchema(serializerProvider33, (java.lang.reflect.Type) objClass62);
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = numberSerializer0.getSchema(serializerProvider10, (java.lang.reflect.Type) objClass62);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer65 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer66 = numberSerializer0.unwrappingSerializer(nameTransformer65);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertNotNull(numberClass19);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor26);
        org.junit.Assert.assertNotNull(propertyWriterItor27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer34);
        org.junit.Assert.assertTrue("'" + numberType35 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType35.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer37);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer39);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor44);
        org.junit.Assert.assertNotNull(numberClass45);
        org.junit.Assert.assertNotNull(numberClass46);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertNotNull(numberSerializer49);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer51);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor56);
        org.junit.Assert.assertNotNull(numberClass57);
        org.junit.Assert.assertNotNull(numberClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor61);
        org.junit.Assert.assertNotNull(objClass62);
        org.junit.Assert.assertNotNull(jsonNode63);
        org.junit.Assert.assertNotNull(jsonNode64);
        org.junit.Assert.assertNotNull(numberJsonSerializer66);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        boolean boolean12 = numberSerializer0.isEmpty(serializerProvider10, (java.lang.Number) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer0.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass14 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass14);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass14);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = numberSerializer17.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberSerializer17.withFilterId((java.lang.Object) '#');
        boolean boolean23 = numberSerializer17.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor24 = numberSerializer17.properties();
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer17.handledType();
        java.lang.Class<java.lang.Number> numberClass26 = numberSerializer17.handledType();
        boolean boolean27 = numberSerializer17.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer29 = numberSerializer17.unwrappingSerializer(nameTransformer28);
        boolean boolean30 = numberJsonSerializer29.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        boolean boolean33 = numberJsonSerializer29.isEmpty(serializerProvider31, (java.lang.Number) 100.0f);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer34 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer35 = numberJsonSerializer29.unwrappingSerializer(nameTransformer34);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = doubleSerializer16.withFilterId((java.lang.Object) numberJsonSerializer29);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(numberClass14);
        org.junit.Assert.assertNotNull(numberSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor24);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertNotNull(numberClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer35);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        boolean boolean12 = numberSerializer0.isEmpty(serializerProvider10, (java.lang.Number) (short) 0);
        boolean boolean13 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer15 = numberSerializer0.unwrappingSerializer(nameTransformer14);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = numberSerializer17.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberSerializer17.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer23 = numberSerializer17.unwrappingSerializer(nameTransformer22);
        boolean boolean24 = numberSerializer17.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        java.lang.reflect.Type type28 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = intLikeSerializer26.getSchema(serializerProvider27, type28);
        java.lang.String str30 = intLikeSerializer26._schemaType;
        java.lang.Class<java.lang.Object> objClass31 = intLikeSerializer26.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = numberSerializer17.getSchema(serializerProvider25, (java.lang.reflect.Type) objClass31);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer33 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer37 = numberSerializer35.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer39 = numberSerializer35.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer40 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer41 = numberSerializer35.unwrappingSerializer(nameTransformer40);
        boolean boolean42 = numberSerializer35.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer44 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        java.lang.reflect.Type type46 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = intLikeSerializer44.getSchema(serializerProvider45, type46);
        java.lang.String str48 = intLikeSerializer44._schemaType;
        java.lang.Class<java.lang.Object> objClass49 = intLikeSerializer44.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = numberSerializer35.getSchema(serializerProvider43, (java.lang.reflect.Type) objClass49);
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = intLikeSerializer33.getSchema(serializerProvider34, (java.lang.reflect.Type) objClass49, true);
        java.lang.String str53 = intLikeSerializer33._schemaType;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer54 = numberSerializer17.withFilterId((java.lang.Object) str53);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider55 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer56 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider57 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer58 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer60 = numberSerializer58.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer62 = numberSerializer58.withFilterId((java.lang.Object) '#');
        boolean boolean64 = numberSerializer58.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor65 = numberSerializer58.properties();
        java.lang.Class<java.lang.Number> numberClass66 = numberSerializer58.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer67 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass66);
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = numberSerializer56.getSchema(serializerProvider57, (java.lang.reflect.Type) numberClass66);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer69 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass66);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer70 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass66);
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = numberSerializer17.getSchema(serializerProvider55, (java.lang.reflect.Type) numberClass66, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode74 = numberSerializer0.getSchema(serializerProvider16, (java.lang.reflect.Type) numberClass66, false);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor75 = numberSerializer0.properties();
        boolean boolean76 = numberSerializer0.usesObjectId();
        java.lang.Class<java.lang.Number> numberClass77 = numberSerializer0.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator79 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider80 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer81 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serializeWithType((java.lang.Number) 10.0d, jsonGenerator79, serializerProvider80, typeSerializer81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer15);
        org.junit.Assert.assertNotNull(numberSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertNotNull(numberJsonSerializer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer26);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "integer" + "'", str30, "integer");
        org.junit.Assert.assertNotNull(objClass31);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(intLikeSerializer33);
        org.junit.Assert.assertNotNull(numberSerializer35);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer37);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer39);
        org.junit.Assert.assertNotNull(numberJsonSerializer41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer44);
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "integer" + "'", str48, "integer");
        org.junit.Assert.assertNotNull(objClass49);
        org.junit.Assert.assertNotNull(jsonNode50);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "integer" + "'", str53, "integer");
        org.junit.Assert.assertNotNull(wildcardJsonSerializer54);
        org.junit.Assert.assertNotNull(numberSerializer56);
        org.junit.Assert.assertNotNull(numberSerializer58);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer60);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor65);
        org.junit.Assert.assertNotNull(numberClass66);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertNotNull(jsonNode72);
        org.junit.Assert.assertNotNull(jsonNode74);
        org.junit.Assert.assertNotNull(propertyWriterItor75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(numberClass77);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        boolean boolean12 = numberSerializer0.isEmpty(serializerProvider10, (java.lang.Number) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer0.getDelegatee();
        boolean boolean15 = numberSerializer0.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer17 = numberSerializer0.unwrappingSerializer(nameTransformer16);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberSerializer19.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = numberSerializer19.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer19.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer19.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer26 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass25);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer27 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass25);
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = numberSerializer0.getSchema(serializerProvider18, (java.lang.reflect.Type) numberClass25, true);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer17);
        org.junit.Assert.assertNotNull(numberSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertNotNull(jsonNode29);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType1 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer3.getSchema(serializerProvider4, type5);
        java.lang.String str7 = intLikeSerializer3._schemaType;
        java.lang.Class<java.lang.Object> objClass8 = intLikeSerializer3.handledType();
        java.lang.Class<?> wildcardClass9 = intLikeSerializer3.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = intLikeSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) wildcardClass9);
        java.lang.String str11 = intLikeSerializer0._schemaType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType14 = intLikeSerializer13._numberType;
        java.lang.Class<java.lang.Object> objClass15 = intLikeSerializer13.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = intLikeSerializer0.getSchema(serializerProvider12, (java.lang.reflect.Type) objClass15);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer18 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType19 = intLikeSerializer18._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        java.lang.reflect.Type type23 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = intLikeSerializer21.getSchema(serializerProvider22, type23);
        java.lang.String str25 = intLikeSerializer21._schemaType;
        java.lang.Class<java.lang.Object> objClass26 = intLikeSerializer21.handledType();
        java.lang.Class<?> wildcardClass27 = intLikeSerializer21.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = intLikeSerializer18.getSchema(serializerProvider20, (java.lang.reflect.Type) wildcardClass27);
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = intLikeSerializer0.getSchema(serializerProvider17, (java.lang.reflect.Type) wildcardClass27, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer32 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType33 = intLikeSerializer32._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        java.lang.reflect.Type type35 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = intLikeSerializer32.getSchema(serializerProvider34, type35);
        boolean boolean37 = intLikeSerializer32._isInt;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer38 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        java.lang.reflect.Type type40 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = intLikeSerializer38.getSchema(serializerProvider39, type40);
        java.lang.String str42 = intLikeSerializer38._schemaType;
        java.lang.Class<java.lang.Object> objClass43 = intLikeSerializer38.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer44 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer46 = numberSerializer44.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer48 = numberSerializer44.withFilterId((java.lang.Object) '#');
        boolean boolean50 = numberSerializer44.isEmpty((java.lang.Number) (-1));
        boolean boolean52 = numberSerializer44.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer53 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer54 = numberSerializer44.unwrappingSerializer(nameTransformer53);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer55 = intLikeSerializer38.withFilterId((java.lang.Object) numberJsonSerializer54);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer56 = intLikeSerializer32.withFilterId((java.lang.Object) numberJsonSerializer54);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer57 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer58 = intLikeSerializer32.unwrappingSerializer(nameTransformer57);
        java.lang.Class<java.lang.Object> objClass59 = intLikeSerializer32.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode60 = intLikeSerializer0.getSchema(serializerProvider31, (java.lang.reflect.Type) objClass59);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + numberType1 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType1.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(intLikeSerializer3);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integer" + "'", str7, "integer");
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "integer" + "'", str11, "integer");
        org.junit.Assert.assertNotNull(intLikeSerializer13);
        org.junit.Assert.assertTrue("'" + numberType14 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType14.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(intLikeSerializer18);
        org.junit.Assert.assertTrue("'" + numberType19 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType19.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(intLikeSerializer21);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "integer" + "'", str25, "integer");
        org.junit.Assert.assertNotNull(objClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(intLikeSerializer32);
        org.junit.Assert.assertTrue("'" + numberType33 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType33.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intLikeSerializer38);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "integer" + "'", str42, "integer");
        org.junit.Assert.assertNotNull(objClass43);
        org.junit.Assert.assertNotNull(numberSerializer44);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer46);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer54);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer55);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer56);
        org.junit.Assert.assertNotNull(objJsonSerializer58);
        org.junit.Assert.assertNotNull(objClass59);
        org.junit.Assert.assertNotNull(jsonNode60);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        boolean boolean5 = numberSerializer0.isEmpty(serializerProvider3, (java.lang.Number) (-1.0f));
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serializeWithType((java.lang.Number) (short) 0, jsonGenerator7, serializerProvider8, typeSerializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer2.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer2.withFilterId((java.lang.Object) '#');
        boolean boolean8 = numberSerializer2.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberSerializer2.properties();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) numberClass10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass10);
        boolean boolean15 = longSerializer14.usesObjectId();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType16 = longSerializer14._numberType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            longSerializer14.acceptJsonFormatVisitor(jsonFormatVisitorWrapper17, javaType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + numberType16 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.LONG + "'", numberType16.equals(com.fasterxml.jackson.core.JsonParser.NumberType.LONG));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass4 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean7 = numberSerializer0.isEmpty((java.lang.Number) (byte) 1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer9 = numberSerializer0.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer11 = numberJsonSerializer9.unwrappingSerializer(nameTransformer10);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(numberClass4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer9);
        org.junit.Assert.assertNotNull(numberJsonSerializer11);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = shortSerializer0.withFilterId((java.lang.Object) 10.0d);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer7.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer7.withFilterId((java.lang.Object) '#');
        boolean boolean13 = numberSerializer7.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = numberSerializer7.properties();
        java.lang.Class<java.lang.Number> numberClass15 = numberSerializer7.handledType();
        java.lang.Class<java.lang.Number> numberClass16 = numberSerializer7.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        boolean boolean19 = numberSerializer7.isEmpty(serializerProvider17, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer7.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = numberSerializer3.getSchema(serializerProvider6, (java.lang.reflect.Type) numberClass20);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer25.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = numberSerializer25.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer31 = numberSerializer25.unwrappingSerializer(nameTransformer30);
        boolean boolean32 = numberSerializer25.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        java.lang.reflect.Type type36 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = intLikeSerializer34.getSchema(serializerProvider35, type36);
        java.lang.String str38 = intLikeSerializer34._schemaType;
        java.lang.Class<java.lang.Object> objClass39 = intLikeSerializer34.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = numberSerializer25.getSchema(serializerProvider33, (java.lang.reflect.Type) objClass39);
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = intLikeSerializer23.getSchema(serializerProvider24, (java.lang.reflect.Type) objClass39, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer44 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer46 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer48 = numberSerializer46.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer50 = numberSerializer46.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer51 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer52 = numberSerializer46.unwrappingSerializer(nameTransformer51);
        boolean boolean53 = numberSerializer46.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider54 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer55 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider56 = null;
        java.lang.reflect.Type type57 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = intLikeSerializer55.getSchema(serializerProvider56, type57);
        java.lang.String str59 = intLikeSerializer55._schemaType;
        java.lang.Class<java.lang.Object> objClass60 = intLikeSerializer55.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = numberSerializer46.getSchema(serializerProvider54, (java.lang.reflect.Type) objClass60);
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = intLikeSerializer44.getSchema(serializerProvider45, (java.lang.reflect.Type) objClass60, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = intLikeSerializer23.getSchema(serializerProvider43, (java.lang.reflect.Type) objClass60, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = numberSerializer3.getSchema(serializerProvider22, (java.lang.reflect.Type) objClass60, false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer68 = wildcardJsonSerializer2.withFilterId((java.lang.Object) false);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer69 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType70 = intLikeSerializer69._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider71 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer72 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider73 = null;
        java.lang.reflect.Type type74 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode75 = intLikeSerializer72.getSchema(serializerProvider73, type74);
        java.lang.String str76 = intLikeSerializer72._schemaType;
        java.lang.Class<java.lang.Object> objClass77 = intLikeSerializer72.handledType();
        java.lang.Class<?> wildcardClass78 = intLikeSerializer72.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode79 = intLikeSerializer69.getSchema(serializerProvider71, (java.lang.reflect.Type) wildcardClass78);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer80 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer81 = intLikeSerializer69.unwrappingSerializer(nameTransformer80);
        boolean boolean82 = intLikeSerializer69.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer83 = wildcardJsonSerializer2.withFilterId((java.lang.Object) intLikeSerializer69);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer84 = wildcardJsonSerializer83.getDelegatee();
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(numberSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
        org.junit.Assert.assertNotNull(numberClass15);
        org.junit.Assert.assertNotNull(numberClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(intLikeSerializer23);
        org.junit.Assert.assertNotNull(numberSerializer25);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer29);
        org.junit.Assert.assertNotNull(numberJsonSerializer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer34);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "integer" + "'", str38, "integer");
        org.junit.Assert.assertNotNull(objClass39);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertNotNull(intLikeSerializer44);
        org.junit.Assert.assertNotNull(numberSerializer46);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer48);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer50);
        org.junit.Assert.assertNotNull(numberJsonSerializer52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer55);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "integer" + "'", str59, "integer");
        org.junit.Assert.assertNotNull(objClass60);
        org.junit.Assert.assertNotNull(jsonNode61);
        org.junit.Assert.assertNotNull(jsonNode63);
        org.junit.Assert.assertNotNull(jsonNode65);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer68);
        org.junit.Assert.assertNotNull(intLikeSerializer69);
        org.junit.Assert.assertTrue("'" + numberType70 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType70.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(intLikeSerializer72);
        org.junit.Assert.assertNotNull(jsonNode75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "integer" + "'", str76, "integer");
        org.junit.Assert.assertNotNull(objClass77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(jsonNode79);
        org.junit.Assert.assertNotNull(objJsonSerializer81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer83);
        org.junit.Assert.assertNull(wildcardJsonSerializer84);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        boolean boolean9 = numberSerializer3.isEmpty((java.lang.Number) (-1));
        boolean boolean11 = numberSerializer3.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer13 = numberSerializer3.unwrappingSerializer(nameTransformer12);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer14.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer14.withFilterId((java.lang.Object) '#');
        boolean boolean20 = numberSerializer14.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor21 = numberSerializer14.properties();
        java.lang.Class<java.lang.Number> numberClass22 = numberSerializer14.handledType();
        java.lang.Class<java.lang.Number> numberClass23 = numberSerializer14.handledType();
        boolean boolean24 = numberSerializer14.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer26 = numberSerializer14.unwrappingSerializer(nameTransformer25);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer3.withFilterId((java.lang.Object) numberJsonSerializer26);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        boolean boolean29 = intLikeSerializer28.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = wildcardJsonSerializer27.withFilterId((java.lang.Object) boolean29);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = numberSerializer0.withFilterId((java.lang.Object) wildcardJsonSerializer30);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer33 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType34 = intLikeSerializer33._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer36 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = numberSerializer36.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer40 = numberSerializer36.withFilterId((java.lang.Object) '#');
        boolean boolean42 = numberSerializer36.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor43 = numberSerializer36.properties();
        java.lang.Class<java.lang.Number> numberClass44 = numberSerializer36.handledType();
        java.lang.Class<java.lang.Number> numberClass45 = numberSerializer36.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = intLikeSerializer33.getSchema(serializerProvider35, (java.lang.reflect.Type) numberClass45, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType48 = intLikeSerializer33._numberType;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer49 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer51 = numberSerializer49.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer53 = numberSerializer49.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer54 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer55 = numberSerializer49.unwrappingSerializer(nameTransformer54);
        boolean boolean56 = intLikeSerializer33.isEmpty((java.lang.Object) numberSerializer49);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer57 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer58 = numberSerializer49.unwrappingSerializer(nameTransformer57);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider59 = null;
        boolean boolean61 = numberSerializer49.isEmpty(serializerProvider59, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider62 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer63 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer65 = numberSerializer63.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer67 = numberSerializer63.withFilterId((java.lang.Object) '#');
        boolean boolean69 = numberSerializer63.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor70 = numberSerializer63.properties();
        java.lang.Class<java.lang.Number> numberClass71 = numberSerializer63.handledType();
        java.lang.Class<java.lang.Number> numberClass72 = numberSerializer63.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider73 = null;
        boolean boolean75 = numberSerializer63.isEmpty(serializerProvider73, (java.lang.Number) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer76 = numberSerializer63.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass77 = numberSerializer63.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer78 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass77);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer79 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass77);
        com.fasterxml.jackson.databind.JsonNode jsonNode81 = numberSerializer49.getSchema(serializerProvider62, (java.lang.reflect.Type) numberClass77, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode83 = numberSerializer0.getSchema(serializerProvider32, (java.lang.reflect.Type) numberClass77, false);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer13);
        org.junit.Assert.assertNotNull(numberSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor21);
        org.junit.Assert.assertNotNull(numberClass22);
        org.junit.Assert.assertNotNull(numberClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(intLikeSerializer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer31);
        org.junit.Assert.assertNotNull(intLikeSerializer33);
        org.junit.Assert.assertTrue("'" + numberType34 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType34.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer36);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer38);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor43);
        org.junit.Assert.assertNotNull(numberClass44);
        org.junit.Assert.assertNotNull(numberClass45);
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertTrue("'" + numberType48 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType48.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer49);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer51);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer53);
        org.junit.Assert.assertNotNull(numberJsonSerializer55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(numberSerializer63);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer65);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor70);
        org.junit.Assert.assertNotNull(numberClass71);
        org.junit.Assert.assertNotNull(numberClass72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer76);
        org.junit.Assert.assertNotNull(numberClass77);
        org.junit.Assert.assertNotNull(jsonNode81);
        org.junit.Assert.assertNotNull(jsonNode83);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = shortSerializer0.withFilterId((java.lang.Object) 10.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer4.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer4.withFilterId((java.lang.Object) '#');
        boolean boolean10 = numberSerializer4.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer4.properties();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer4.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass12);
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = shortSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) numberClass12);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        boolean boolean22 = numberSerializer16.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = numberSerializer16.properties();
        java.lang.Class<java.lang.Number> numberClass24 = numberSerializer16.handledType();
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer16.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = shortSerializer0.getSchema(serializerProvider15, (java.lang.reflect.Type) numberClass25);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer27 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass25);
        java.lang.Object obj28 = null;
        boolean boolean29 = longSerializer27.isEmpty(obj28);
        boolean boolean30 = longSerializer27._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer32 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        java.lang.reflect.Type type34 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = intLikeSerializer32.getSchema(serializerProvider33, type34);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer37 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer39 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer41 = numberSerializer39.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer43 = numberSerializer39.withFilterId((java.lang.Object) '#');
        boolean boolean45 = numberSerializer39.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor46 = numberSerializer39.properties();
        java.lang.Class<java.lang.Number> numberClass47 = numberSerializer39.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = numberSerializer37.getSchema(serializerProvider38, (java.lang.reflect.Type) numberClass47, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = intLikeSerializer32.getSchema(serializerProvider36, (java.lang.reflect.Type) numberClass47);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer51 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass47);
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = longSerializer27.getSchema(serializerProvider31, (java.lang.reflect.Type) numberClass47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(numberSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertNotNull(numberClass24);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intLikeSerializer32);
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertNotNull(numberSerializer37);
        org.junit.Assert.assertNotNull(numberSerializer39);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer41);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor46);
        org.junit.Assert.assertNotNull(numberClass47);
        org.junit.Assert.assertNotNull(jsonNode49);
        org.junit.Assert.assertNotNull(jsonNode50);
        org.junit.Assert.assertNotNull(jsonNode52);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        boolean boolean10 = numberSerializer0._isInt;
        boolean boolean12 = numberSerializer0.isEmpty((java.lang.Number) 1);
        java.lang.Class<java.lang.Number> numberClass13 = numberSerializer0.handledType();
        boolean boolean14 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer15.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = numberSerializer15.withFilterId((java.lang.Object) '#');
        boolean boolean21 = numberSerializer15.isEmpty((java.lang.Number) (-1));
        boolean boolean23 = numberSerializer15.isEmpty((java.lang.Number) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer24 = numberSerializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number>) numberSerializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(numberClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(numberSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer1 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = shortSerializer1.withFilterId((java.lang.Object) 10.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer5.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer5.withFilterId((java.lang.Object) '#');
        boolean boolean11 = numberSerializer5.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberSerializer5.properties();
        java.lang.Class<java.lang.Number> numberClass13 = numberSerializer5.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass13);
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = shortSerializer1.getSchema(serializerProvider4, (java.lang.reflect.Type) numberClass13);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = floatSerializer0.withFilterId((java.lang.Object) jsonNode15);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberSerializer19.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = numberSerializer19.withFilterId((java.lang.Object) '#');
        boolean boolean25 = numberSerializer19.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor26 = numberSerializer19.properties();
        java.lang.Class<java.lang.Number> numberClass27 = numberSerializer19.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer28 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass27);
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = numberSerializer17.getSchema(serializerProvider18, (java.lang.reflect.Type) numberClass27);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer31 = numberSerializer17.unwrappingSerializer(nameTransformer30);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.serialize((java.lang.Object) nameTransformer30, jsonGenerator32, serializerProvider33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(numberSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertNotNull(numberClass13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(numberSerializer17);
        org.junit.Assert.assertNotNull(numberSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor26);
        org.junit.Assert.assertNotNull(numberClass27);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(numberJsonSerializer31);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        boolean boolean1 = floatSerializer0._isInt;
        boolean boolean2 = floatSerializer0._isInt;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        boolean boolean9 = numberSerializer3.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer3.properties();
        java.lang.Class<java.lang.Number> numberClass11 = numberSerializer3.handledType();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer3.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        boolean boolean15 = numberSerializer3.isEmpty(serializerProvider13, (java.lang.Number) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer3.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass17 = numberSerializer3.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer18 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass17);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer19 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass17);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer20 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass17);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.serialize((java.lang.Object) numberSerializer20, jsonGenerator21, serializerProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.NumberSerializer cannot be cast to class java.lang.Float (com.fasterxml.jackson.databind.ser.std.NumberSerializer is in unnamed module of loader 'app'; java.lang.Float is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(numberClass11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(numberClass17);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = intLikeSerializer0.getSchema(serializerProvider1, type2);
        java.lang.String str4 = intLikeSerializer0._schemaType;
        java.lang.Class<java.lang.Object> objClass5 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer6.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = numberSerializer6.withFilterId((java.lang.Object) '#');
        boolean boolean12 = numberSerializer6.isEmpty((java.lang.Number) (-1));
        boolean boolean14 = numberSerializer6.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer16 = numberSerializer6.unwrappingSerializer(nameTransformer15);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = intLikeSerializer0.withFilterId((java.lang.Object) numberJsonSerializer16);
        java.lang.Class<java.lang.Object> objClass18 = intLikeSerializer0.handledType();
        java.lang.Class<java.lang.Object> objClass19 = intLikeSerializer0.handledType();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "integer" + "'", str4, "integer");
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(numberSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(objClass18);
        org.junit.Assert.assertNotNull(objClass19);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = numberSerializer12.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        boolean boolean22 = numberSerializer16.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = numberSerializer16.properties();
        java.lang.Class<java.lang.Number> numberClass24 = numberSerializer16.handledType();
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer16.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        boolean boolean28 = numberSerializer16.isEmpty(serializerProvider26, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass29 = numberSerializer16.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = numberSerializer12.getSchema(serializerProvider15, (java.lang.reflect.Type) numberClass29);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = numberSerializer0.getSchema(serializerProvider11, (java.lang.reflect.Type) numberClass29, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        java.lang.Throwable throwable34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer37 = numberSerializer35.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer39 = numberSerializer35.withFilterId((java.lang.Object) '#');
        boolean boolean41 = numberSerializer35.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor42 = numberSerializer35.properties();
        java.lang.Class<java.lang.Number> numberClass43 = numberSerializer35.handledType();
        java.lang.Class<java.lang.Number> numberClass44 = numberSerializer35.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        boolean boolean47 = numberSerializer35.isEmpty(serializerProvider45, (java.lang.Number) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer48 = numberSerializer35.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        boolean boolean51 = numberSerializer35.isEmpty(serializerProvider49, (java.lang.Number) (-1.0f));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider52 = null;
        boolean boolean54 = numberSerializer35.isEmpty(serializerProvider52, (java.lang.Number) 1);
        boolean boolean55 = numberSerializer35.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider56 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer57 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider58 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer59 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer61 = numberSerializer59.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer63 = numberSerializer59.withFilterId((java.lang.Object) '#');
        boolean boolean65 = numberSerializer59.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor66 = numberSerializer59.properties();
        java.lang.Class<java.lang.Number> numberClass67 = numberSerializer59.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = numberSerializer57.getSchema(serializerProvider58, (java.lang.reflect.Type) numberClass67, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode71 = numberSerializer35.getSchema(serializerProvider56, (java.lang.reflect.Type) numberClass67, true);
        java.lang.Class<java.lang.Number> numberClass72 = numberSerializer35.handledType();
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.wrapAndThrow(serializerProvider33, throwable34, (java.lang.Object) numberSerializer35, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(numberSerializer12);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertNotNull(numberClass24);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(numberClass29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(numberSerializer35);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer37);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor42);
        org.junit.Assert.assertNotNull(numberClass43);
        org.junit.Assert.assertNotNull(numberClass44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(numberSerializer57);
        org.junit.Assert.assertNotNull(numberSerializer59);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer61);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor66);
        org.junit.Assert.assertNotNull(numberClass67);
        org.junit.Assert.assertNotNull(jsonNode69);
        org.junit.Assert.assertNotNull(jsonNode71);
        org.junit.Assert.assertNotNull(numberClass72);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer2.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer2.withFilterId((java.lang.Object) '#');
        boolean boolean8 = numberSerializer2.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberSerializer2.properties();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) numberClass10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer14 = numberSerializer0.unwrappingSerializer(nameTransformer13);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        boolean boolean17 = numberJsonSerializer14.isEmpty(serializerProvider15, (java.lang.Number) 100.0f);
        boolean boolean19 = numberJsonSerializer14.isEmpty((java.lang.Number) (byte) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberJsonSerializer14.getDelegatee();
        boolean boolean22 = numberJsonSerializer14.isEmpty((java.lang.Number) 1.0d);
        boolean boolean23 = numberJsonSerializer14.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(numberJsonSerializer14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        boolean boolean5 = numberSerializer0.isEmpty(serializerProvider3, (java.lang.Number) (-1.0f));
        boolean boolean6 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        boolean boolean9 = numberSerializer0.isEmpty(serializerProvider7, (java.lang.Number) (byte) 0);
        java.lang.Class<?> wildcardClass10 = numberSerializer0.getClass();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        boolean boolean9 = numberSerializer3.isEmpty((java.lang.Number) (-1));
        boolean boolean11 = numberSerializer3.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer13 = numberSerializer3.unwrappingSerializer(nameTransformer12);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer14.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer14.withFilterId((java.lang.Object) '#');
        boolean boolean20 = numberSerializer14.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor21 = numberSerializer14.properties();
        java.lang.Class<java.lang.Number> numberClass22 = numberSerializer14.handledType();
        java.lang.Class<java.lang.Number> numberClass23 = numberSerializer14.handledType();
        boolean boolean24 = numberSerializer14.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer26 = numberSerializer14.unwrappingSerializer(nameTransformer25);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer3.withFilterId((java.lang.Object) numberJsonSerializer26);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        boolean boolean29 = intLikeSerializer28.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = wildcardJsonSerializer27.withFilterId((java.lang.Object) boolean29);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = numberSerializer0.withFilterId((java.lang.Object) wildcardJsonSerializer30);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = numberSerializer34.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = numberSerializer34.withFilterId((java.lang.Object) '#');
        boolean boolean40 = numberSerializer34.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor41 = numberSerializer34.properties();
        java.lang.Class<java.lang.Number> numberClass42 = numberSerializer34.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer43 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass42);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer45 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = numberSerializer45.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = numberSerializer45.withFilterId((java.lang.Object) '#');
        boolean boolean51 = numberSerializer45.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor52 = numberSerializer45.properties();
        java.lang.Class<java.lang.Number> numberClass53 = numberSerializer45.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer54 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass53);
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = numberSerializer43.getSchema(serializerProvider44, (java.lang.reflect.Type) numberClass53, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer57 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass53);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer58 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass53);
        com.fasterxml.jackson.databind.JsonNode jsonNode60 = numberSerializer0.getSchema(serializerProvider33, (java.lang.reflect.Type) numberClass53, false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer61 = numberSerializer0.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass62 = numberSerializer0.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator64 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider65 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serialize((java.lang.Number) (short) 1, jsonGenerator64, serializerProvider65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer13);
        org.junit.Assert.assertNotNull(numberSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor21);
        org.junit.Assert.assertNotNull(numberClass22);
        org.junit.Assert.assertNotNull(numberClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(intLikeSerializer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer31);
        org.junit.Assert.assertNull(wildcardJsonSerializer32);
        org.junit.Assert.assertNotNull(numberSerializer34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor41);
        org.junit.Assert.assertNotNull(numberClass42);
        org.junit.Assert.assertNotNull(numberSerializer45);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor52);
        org.junit.Assert.assertNotNull(numberClass53);
        org.junit.Assert.assertNotNull(jsonNode56);
        org.junit.Assert.assertNotNull(jsonNode60);
        org.junit.Assert.assertNull(wildcardJsonSerializer61);
        org.junit.Assert.assertNotNull(numberClass62);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        java.lang.Throwable throwable8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer9.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer9.withFilterId((java.lang.Object) '#');
        boolean boolean15 = numberSerializer9.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = numberSerializer9.properties();
        java.lang.Class<java.lang.Number> numberClass17 = numberSerializer9.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer18 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = doubleSerializer18.getDelegatee();
        java.lang.String str20 = doubleSerializer18._schemaType;
        java.lang.String str21 = doubleSerializer18._schemaType;
        boolean boolean22 = doubleSerializer18.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = doubleSerializer18.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = doubleSerializer18.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.wrapAndThrow(serializerProvider7, throwable8, (java.lang.Object) wildcardJsonSerializer24, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(numberSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
        org.junit.Assert.assertNotNull(numberClass17);
        org.junit.Assert.assertNull(wildcardJsonSerializer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "number" + "'", str20, "number");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "number" + "'", str21, "number");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertNull(wildcardJsonSerializer24);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType1 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        boolean boolean9 = numberSerializer3.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer3.properties();
        java.lang.Class<java.lang.Number> numberClass11 = numberSerializer3.handledType();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = intLikeSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) numberClass12, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType15 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer22 = numberSerializer16.unwrappingSerializer(nameTransformer21);
        boolean boolean23 = intLikeSerializer0.isEmpty((java.lang.Object) numberSerializer16);
        boolean boolean24 = numberSerializer16.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        java.lang.Throwable throwable26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer27 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = shortSerializer27.withFilterId((java.lang.Object) 10.0d);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer30 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer30.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = numberSerializer34.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = numberSerializer34.withFilterId((java.lang.Object) '#');
        boolean boolean40 = numberSerializer34.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor41 = numberSerializer34.properties();
        java.lang.Class<java.lang.Number> numberClass42 = numberSerializer34.handledType();
        java.lang.Class<java.lang.Number> numberClass43 = numberSerializer34.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        boolean boolean46 = numberSerializer34.isEmpty(serializerProvider44, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass47 = numberSerializer34.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = numberSerializer30.getSchema(serializerProvider33, (java.lang.reflect.Type) numberClass47);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer50 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer54 = numberSerializer52.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer56 = numberSerializer52.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer57 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer58 = numberSerializer52.unwrappingSerializer(nameTransformer57);
        boolean boolean59 = numberSerializer52.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider60 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer61 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider62 = null;
        java.lang.reflect.Type type63 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = intLikeSerializer61.getSchema(serializerProvider62, type63);
        java.lang.String str65 = intLikeSerializer61._schemaType;
        java.lang.Class<java.lang.Object> objClass66 = intLikeSerializer61.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = numberSerializer52.getSchema(serializerProvider60, (java.lang.reflect.Type) objClass66);
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = intLikeSerializer50.getSchema(serializerProvider51, (java.lang.reflect.Type) objClass66, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider70 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer71 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider72 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer73 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer75 = numberSerializer73.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer77 = numberSerializer73.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer78 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer79 = numberSerializer73.unwrappingSerializer(nameTransformer78);
        boolean boolean80 = numberSerializer73.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider81 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer82 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider83 = null;
        java.lang.reflect.Type type84 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode85 = intLikeSerializer82.getSchema(serializerProvider83, type84);
        java.lang.String str86 = intLikeSerializer82._schemaType;
        java.lang.Class<java.lang.Object> objClass87 = intLikeSerializer82.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode88 = numberSerializer73.getSchema(serializerProvider81, (java.lang.reflect.Type) objClass87);
        com.fasterxml.jackson.databind.JsonNode jsonNode90 = intLikeSerializer71.getSchema(serializerProvider72, (java.lang.reflect.Type) objClass87, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode92 = intLikeSerializer50.getSchema(serializerProvider70, (java.lang.reflect.Type) objClass87, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode94 = numberSerializer30.getSchema(serializerProvider49, (java.lang.reflect.Type) objClass87, false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer95 = wildcardJsonSerializer29.withFilterId((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer16.wrapAndThrow(serializerProvider25, throwable26, (java.lang.Object) wildcardJsonSerializer95, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + numberType1 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType1.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(numberClass11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + numberType15 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType15.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(numberJsonSerializer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer29);
        org.junit.Assert.assertNotNull(numberSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer32);
        org.junit.Assert.assertNotNull(numberSerializer34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor41);
        org.junit.Assert.assertNotNull(numberClass42);
        org.junit.Assert.assertNotNull(numberClass43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(numberClass47);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertNotNull(intLikeSerializer50);
        org.junit.Assert.assertNotNull(numberSerializer52);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer54);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer56);
        org.junit.Assert.assertNotNull(numberJsonSerializer58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer61);
        org.junit.Assert.assertNotNull(jsonNode64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "integer" + "'", str65, "integer");
        org.junit.Assert.assertNotNull(objClass66);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertNotNull(jsonNode69);
        org.junit.Assert.assertNotNull(intLikeSerializer71);
        org.junit.Assert.assertNotNull(numberSerializer73);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer75);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer77);
        org.junit.Assert.assertNotNull(numberJsonSerializer79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer82);
        org.junit.Assert.assertNotNull(jsonNode85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "integer" + "'", str86, "integer");
        org.junit.Assert.assertNotNull(objClass87);
        org.junit.Assert.assertNotNull(jsonNode88);
        org.junit.Assert.assertNotNull(jsonNode90);
        org.junit.Assert.assertNotNull(jsonNode92);
        org.junit.Assert.assertNotNull(jsonNode94);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer95);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer2.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer2.withFilterId((java.lang.Object) '#');
        boolean boolean8 = numberSerializer2.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberSerializer2.properties();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) numberClass10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberSerializer16.getDelegatee();
        boolean boolean22 = longSerializer14.isEmpty(serializerProvider15, (java.lang.Object) numberSerializer16);
        java.lang.Class<java.lang.Object> objClass23 = longSerializer14.handledType();
        java.lang.String str24 = longSerializer14._schemaType;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor25 = longSerializer14.properties();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer27 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType28 = intLikeSerializer27._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        java.lang.reflect.Type type30 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = intLikeSerializer27.getSchema(serializerProvider29, type30);
        boolean boolean32 = intLikeSerializer27._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer36 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer38 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer40 = numberSerializer38.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer42 = numberSerializer38.withFilterId((java.lang.Object) '#');
        boolean boolean44 = numberSerializer38.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor45 = numberSerializer38.properties();
        java.lang.Class<java.lang.Number> numberClass46 = numberSerializer38.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer47 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass46);
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = numberSerializer36.getSchema(serializerProvider37, (java.lang.reflect.Type) numberClass46);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer49 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass46);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer50 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass46);
        com.fasterxml.jackson.databind.JsonNode jsonNode51 = intLikeSerializer34.getSchema(serializerProvider35, (java.lang.reflect.Type) numberClass46);
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = intLikeSerializer27.getSchema(serializerProvider33, (java.lang.reflect.Type) numberClass46, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer54 = numberSerializer26.withFilterId((java.lang.Object) true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider55 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer56 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType57 = intLikeSerializer56._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider58 = null;
        java.lang.reflect.Type type59 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode60 = intLikeSerializer56.getSchema(serializerProvider58, type59);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider61 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer62 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer64 = numberSerializer62.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer66 = numberSerializer62.withFilterId((java.lang.Object) '#');
        boolean boolean68 = numberSerializer62.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor69 = numberSerializer62.properties();
        java.lang.Class<java.lang.Number> numberClass70 = numberSerializer62.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = intLikeSerializer56.getSchema(serializerProvider61, (java.lang.reflect.Type) numberClass70, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer73 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass70);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer74 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass70);
        java.lang.Class<java.lang.Object> objClass75 = integerSerializer74.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode77 = numberSerializer26.getSchema(serializerProvider55, (java.lang.reflect.Type) objClass75, false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer78 = longSerializer14.withFilterId((java.lang.Object) jsonNode77);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider79 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer80 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer82 = numberSerializer80.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer84 = numberSerializer80.withFilterId((java.lang.Object) '#');
        boolean boolean86 = numberSerializer80.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor87 = numberSerializer80.properties();
        java.lang.Class<java.lang.Number> numberClass88 = numberSerializer80.handledType();
        java.lang.Class<java.lang.Number> numberClass89 = numberSerializer80.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider90 = null;
        boolean boolean92 = numberSerializer80.isEmpty(serializerProvider90, (java.lang.Number) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer93 = numberSerializer80.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass94 = numberSerializer80.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer95 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass94);
        com.fasterxml.jackson.databind.JsonNode jsonNode97 = longSerializer14.getSchema(serializerProvider79, (java.lang.reflect.Type) numberClass94, false);
        java.lang.Class<java.lang.Object> objClass98 = longSerializer14.handledType();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNull(wildcardJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "number" + "'", str24, "number");
        org.junit.Assert.assertNotNull(propertyWriterItor25);
        org.junit.Assert.assertNotNull(numberSerializer26);
        org.junit.Assert.assertNotNull(intLikeSerializer27);
        org.junit.Assert.assertTrue("'" + numberType28 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType28.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intLikeSerializer34);
        org.junit.Assert.assertNotNull(numberSerializer36);
        org.junit.Assert.assertNotNull(numberSerializer38);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer40);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor45);
        org.junit.Assert.assertNotNull(numberClass46);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertNotNull(jsonNode51);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer54);
        org.junit.Assert.assertNotNull(intLikeSerializer56);
        org.junit.Assert.assertTrue("'" + numberType57 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType57.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonNode60);
        org.junit.Assert.assertNotNull(numberSerializer62);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer64);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor69);
        org.junit.Assert.assertNotNull(numberClass70);
        org.junit.Assert.assertNotNull(jsonNode72);
        org.junit.Assert.assertNotNull(objClass75);
        org.junit.Assert.assertNotNull(jsonNode77);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer78);
        org.junit.Assert.assertNotNull(numberSerializer80);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer82);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor87);
        org.junit.Assert.assertNotNull(numberClass88);
        org.junit.Assert.assertNotNull(numberClass89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer93);
        org.junit.Assert.assertNotNull(numberClass94);
        org.junit.Assert.assertNotNull(jsonNode97);
        org.junit.Assert.assertNotNull(objClass98);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        boolean boolean7 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = intLikeSerializer9.getSchema(serializerProvider10, type11);
        java.lang.String str13 = intLikeSerializer9._schemaType;
        java.lang.Class<java.lang.Object> objClass14 = intLikeSerializer9.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = numberSerializer0.getSchema(serializerProvider8, (java.lang.reflect.Type) objClass14);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer18 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer18.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = numberSerializer18.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer24 = numberSerializer18.unwrappingSerializer(nameTransformer23);
        boolean boolean25 = numberSerializer18.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer27 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        java.lang.reflect.Type type29 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = intLikeSerializer27.getSchema(serializerProvider28, type29);
        java.lang.String str31 = intLikeSerializer27._schemaType;
        java.lang.Class<java.lang.Object> objClass32 = intLikeSerializer27.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = numberSerializer18.getSchema(serializerProvider26, (java.lang.reflect.Type) objClass32);
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = intLikeSerializer16.getSchema(serializerProvider17, (java.lang.reflect.Type) objClass32, true);
        java.lang.String str36 = intLikeSerializer16._schemaType;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer37 = numberSerializer0.withFilterId((java.lang.Object) str36);
        boolean boolean38 = numberSerializer0._isInt;
        java.lang.Class<java.lang.Number> numberClass39 = numberSerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor40 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass41 = numberSerializer0.handledType();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "integer" + "'", str13, "integer");
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(intLikeSerializer16);
        org.junit.Assert.assertNotNull(numberSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer22);
        org.junit.Assert.assertNotNull(numberJsonSerializer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer27);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "integer" + "'", str31, "integer");
        org.junit.Assert.assertNotNull(objClass32);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "integer" + "'", str36, "integer");
        org.junit.Assert.assertNotNull(wildcardJsonSerializer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(numberClass39);
        org.junit.Assert.assertNotNull(propertyWriterItor40);
        org.junit.Assert.assertNotNull(numberClass41);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        boolean boolean11 = numberSerializer0.isEmpty(serializerProvider9, (java.lang.Number) (-1.0d));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer15.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = numberSerializer15.withFilterId((java.lang.Object) '#');
        boolean boolean21 = numberSerializer15.isEmpty((java.lang.Number) (-1));
        boolean boolean23 = numberSerializer15.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer25 = numberSerializer15.unwrappingSerializer(nameTransformer24);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer26.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = numberSerializer26.withFilterId((java.lang.Object) '#');
        boolean boolean32 = numberSerializer26.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor33 = numberSerializer26.properties();
        java.lang.Class<java.lang.Number> numberClass34 = numberSerializer26.handledType();
        java.lang.Class<java.lang.Number> numberClass35 = numberSerializer26.handledType();
        boolean boolean36 = numberSerializer26.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer37 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer38 = numberSerializer26.unwrappingSerializer(nameTransformer37);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer39 = numberSerializer15.withFilterId((java.lang.Object) numberJsonSerializer38);
        java.lang.Class<java.lang.Number> numberClass40 = numberSerializer15.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = numberSerializer0.getSchema(serializerProvider14, (java.lang.reflect.Type) numberClass40, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        boolean boolean45 = numberSerializer0.isEmpty(serializerProvider43, (java.lang.Number) (short) -1);
        java.lang.Class<java.lang.Number> numberClass46 = numberSerializer0.handledType();
        boolean boolean48 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        java.lang.Throwable throwable50 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer51 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer53 = numberSerializer51.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer54 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer55 = numberSerializer51.unwrappingSerializer(nameTransformer54);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer56 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer58 = numberSerializer56.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer60 = numberSerializer56.withFilterId((java.lang.Object) '#');
        boolean boolean62 = numberSerializer56.isEmpty((java.lang.Number) (-1));
        boolean boolean64 = numberSerializer56.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer65 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer66 = numberSerializer56.unwrappingSerializer(nameTransformer65);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer67 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer69 = numberSerializer67.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer71 = numberSerializer67.withFilterId((java.lang.Object) '#');
        boolean boolean73 = numberSerializer67.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor74 = numberSerializer67.properties();
        java.lang.Class<java.lang.Number> numberClass75 = numberSerializer67.handledType();
        java.lang.Class<java.lang.Number> numberClass76 = numberSerializer67.handledType();
        boolean boolean77 = numberSerializer67.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer78 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer79 = numberSerializer67.unwrappingSerializer(nameTransformer78);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer80 = numberSerializer56.withFilterId((java.lang.Object) numberJsonSerializer79);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer81 = numberJsonSerializer55.withFilterId((java.lang.Object) wildcardJsonSerializer80);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider82 = null;
        boolean boolean84 = numberJsonSerializer55.isEmpty(serializerProvider82, (java.lang.Number) 1.0d);
        boolean boolean86 = numberJsonSerializer55.isEmpty((java.lang.Number) (byte) 10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer87 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer88 = numberJsonSerializer55.unwrappingSerializer(nameTransformer87);
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.wrapAndThrow(serializerProvider49, throwable50, (java.lang.Object) nameTransformer87, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(numberSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer25);
        org.junit.Assert.assertNotNull(numberSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor33);
        org.junit.Assert.assertNotNull(numberClass34);
        org.junit.Assert.assertNotNull(numberClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer38);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer39);
        org.junit.Assert.assertNotNull(numberClass40);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(numberClass46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(numberSerializer51);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer53);
        org.junit.Assert.assertNotNull(numberJsonSerializer55);
        org.junit.Assert.assertNotNull(numberSerializer56);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer58);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer66);
        org.junit.Assert.assertNotNull(numberSerializer67);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer69);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor74);
        org.junit.Assert.assertNotNull(numberClass75);
        org.junit.Assert.assertNotNull(numberClass76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer79);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer80);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer88);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType1 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        boolean boolean9 = numberSerializer3.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer3.properties();
        java.lang.Class<java.lang.Number> numberClass11 = numberSerializer3.handledType();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = intLikeSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) numberClass12, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType15 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer22 = numberSerializer16.unwrappingSerializer(nameTransformer21);
        boolean boolean23 = intLikeSerializer0.isEmpty((java.lang.Object) numberSerializer16);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        boolean boolean26 = numberSerializer16.isEmpty(serializerProvider24, (java.lang.Number) (byte) -1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer16.getDelegatee();
        boolean boolean28 = numberSerializer16.usesObjectId();
        boolean boolean29 = numberSerializer16.isUnwrappingSerializer();
        boolean boolean30 = numberSerializer16._isInt;
        boolean boolean31 = numberSerializer16.isUnwrappingSerializer();
        boolean boolean33 = numberSerializer16.isEmpty((java.lang.Number) (-1.0d));
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + numberType1 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType1.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(numberClass11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + numberType15 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType15.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(numberJsonSerializer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer4.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer4.withFilterId((java.lang.Object) '#');
        boolean boolean10 = numberSerializer4.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer4.properties();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer4.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass12);
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = numberSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) numberClass12);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass12);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass12);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = intLikeSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) numberClass12);
        boolean boolean18 = intLikeSerializer0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass19 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper20, javaType21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(numberSerializer2);
        org.junit.Assert.assertNotNull(numberSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objClass19);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer8 = numberSerializer0.unwrappingSerializer(nameTransformer7);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberJsonSerializer8.properties();
        boolean boolean10 = numberJsonSerializer8.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberJsonSerializer8.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer8);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass6 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer7 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass6);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer9.withFilterId((java.lang.Object) 100.0d);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberSerializer9.properties();
        java.lang.Class<java.lang.Number> numberClass13 = numberSerializer9.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = numberSerializer9.getDelegatee();
        boolean boolean15 = numberSerializer9.isUnwrappingSerializer();
        boolean boolean16 = numberSerializer9.usesObjectId();
        java.lang.Class<java.lang.Number> numberClass17 = numberSerializer9.handledType();
        java.lang.Class<?> wildcardClass18 = numberSerializer9.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = longSerializer7.getSchema(serializerProvider8, (java.lang.reflect.Type) wildcardClass18);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        boolean boolean22 = intLikeSerializer21.usesObjectId();
        java.lang.Class<java.lang.Object> objClass23 = intLikeSerializer21.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean26 = shortSerializer25._isInt;
        boolean boolean27 = shortSerializer25._isInt;
        boolean boolean28 = intLikeSerializer21.isEmpty(serializerProvider24, (java.lang.Object) boolean27);
        java.lang.Class<?> wildcardClass29 = intLikeSerializer21.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = longSerializer7.getSchema(serializerProvider20, (java.lang.reflect.Type) wildcardClass29);
        boolean boolean31 = longSerializer7.usesObjectId();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(numberClass6);
        org.junit.Assert.assertNotNull(numberSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertNotNull(numberClass13);
        org.junit.Assert.assertNull(wildcardJsonSerializer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(numberClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(intLikeSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objClass23);
        org.junit.Assert.assertNotNull(shortSerializer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer2.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer2.withFilterId((java.lang.Object) '#');
        boolean boolean8 = numberSerializer2.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberSerializer2.properties();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer2.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) numberClass10, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        boolean boolean22 = numberSerializer16.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = numberSerializer16.properties();
        java.lang.Class<java.lang.Number> numberClass24 = numberSerializer16.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = numberSerializer14.getSchema(serializerProvider15, (java.lang.reflect.Type) numberClass24, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = numberSerializer0.getSchema(serializerProvider13, (java.lang.reflect.Type) numberClass24, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer29 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass24);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer30 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass24);
        boolean boolean31 = numberSerializer30._isInt;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer35 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer30.serializeWithType((java.lang.Number) 1.0d, jsonGenerator33, serializerProvider34, typeSerializer35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(numberSerializer14);
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertNotNull(numberClass24);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        boolean boolean12 = numberSerializer0.isEmpty(serializerProvider10, (java.lang.Number) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        boolean boolean16 = numberSerializer0.isEmpty(serializerProvider14, (java.lang.Number) (-1.0f));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer18 = numberSerializer0.unwrappingSerializer(nameTransformer17);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer20 = numberJsonSerializer18.unwrappingSerializer(nameTransformer19);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor21 = numberJsonSerializer18.properties();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer18);
        org.junit.Assert.assertNotNull(numberJsonSerializer20);
        org.junit.Assert.assertNotNull(propertyWriterItor21);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        boolean boolean7 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = numberSerializer8.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = numberSerializer12.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer12.withFilterId((java.lang.Object) '#');
        boolean boolean18 = numberSerializer12.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = numberSerializer12.properties();
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer12.handledType();
        java.lang.Class<java.lang.Number> numberClass21 = numberSerializer12.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        boolean boolean24 = numberSerializer12.isEmpty(serializerProvider22, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer12.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = numberSerializer8.getSchema(serializerProvider11, (java.lang.reflect.Type) numberClass25);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer30 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer30.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberSerializer30.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer35 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer36 = numberSerializer30.unwrappingSerializer(nameTransformer35);
        boolean boolean37 = numberSerializer30.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer39 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        java.lang.reflect.Type type41 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = intLikeSerializer39.getSchema(serializerProvider40, type41);
        java.lang.String str43 = intLikeSerializer39._schemaType;
        java.lang.Class<java.lang.Object> objClass44 = intLikeSerializer39.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = numberSerializer30.getSchema(serializerProvider38, (java.lang.reflect.Type) objClass44);
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = intLikeSerializer28.getSchema(serializerProvider29, (java.lang.reflect.Type) objClass44, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider48 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer49 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider50 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer51 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer53 = numberSerializer51.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer55 = numberSerializer51.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer56 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer57 = numberSerializer51.unwrappingSerializer(nameTransformer56);
        boolean boolean58 = numberSerializer51.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider59 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer60 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider61 = null;
        java.lang.reflect.Type type62 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = intLikeSerializer60.getSchema(serializerProvider61, type62);
        java.lang.String str64 = intLikeSerializer60._schemaType;
        java.lang.Class<java.lang.Object> objClass65 = intLikeSerializer60.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = numberSerializer51.getSchema(serializerProvider59, (java.lang.reflect.Type) objClass65);
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = intLikeSerializer49.getSchema(serializerProvider50, (java.lang.reflect.Type) objClass65, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = intLikeSerializer28.getSchema(serializerProvider48, (java.lang.reflect.Type) objClass65, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = numberSerializer8.getSchema(serializerProvider27, (java.lang.reflect.Type) objClass65, false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer73 = numberSerializer0.withFilterId((java.lang.Object) objClass65);
        java.lang.Class<java.lang.Number> numberClass74 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer75 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer76 = numberSerializer0.unwrappingSerializer(nameTransformer75);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider77 = null;
        boolean boolean79 = numberSerializer0.isEmpty(serializerProvider77, (java.lang.Number) 1L);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer80 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer81 = numberSerializer0.unwrappingSerializer(nameTransformer80);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer82 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer83 = numberJsonSerializer81.unwrappingSerializer(nameTransformer82);
        boolean boolean84 = numberJsonSerializer81.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider85 = null;
        boolean boolean87 = numberJsonSerializer81.isEmpty(serializerProvider85, (java.lang.Number) 1.0f);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(numberSerializer8);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(numberSerializer12);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertNotNull(numberClass21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(intLikeSerializer28);
        org.junit.Assert.assertNotNull(numberSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer32);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNotNull(numberJsonSerializer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer39);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "integer" + "'", str43, "integer");
        org.junit.Assert.assertNotNull(objClass44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertNotNull(intLikeSerializer49);
        org.junit.Assert.assertNotNull(numberSerializer51);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer53);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer55);
        org.junit.Assert.assertNotNull(numberJsonSerializer57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer60);
        org.junit.Assert.assertNotNull(jsonNode63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "integer" + "'", str64, "integer");
        org.junit.Assert.assertNotNull(objClass65);
        org.junit.Assert.assertNotNull(jsonNode66);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertNotNull(jsonNode70);
        org.junit.Assert.assertNotNull(jsonNode72);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer73);
        org.junit.Assert.assertNotNull(numberClass74);
        org.junit.Assert.assertNotNull(numberJsonSerializer76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer81);
        org.junit.Assert.assertNotNull(numberJsonSerializer83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = intLikeSerializer0.getSchema(serializerProvider1, type2);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType4 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = intLikeSerializer0.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType9 = intLikeSerializer8._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = numberSerializer11.properties();
        java.lang.Class<java.lang.Number> numberClass19 = numberSerializer11.handledType();
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer11.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = intLikeSerializer8.getSchema(serializerProvider10, (java.lang.reflect.Type) numberClass20, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer23 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass20);
        boolean boolean24 = doubleSerializer23._isInt;
        boolean boolean25 = doubleSerializer23._isInt;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor26 = doubleSerializer23.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = numberSerializer28.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer28.withFilterId((java.lang.Object) '#');
        boolean boolean34 = numberSerializer28.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor35 = numberSerializer28.properties();
        java.lang.Class<java.lang.Number> numberClass36 = numberSerializer28.handledType();
        java.lang.Class<java.lang.Number> numberClass37 = numberSerializer28.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        boolean boolean40 = numberSerializer28.isEmpty(serializerProvider38, (java.lang.Number) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer41 = numberSerializer28.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        boolean boolean44 = numberSerializer28.isEmpty(serializerProvider42, (java.lang.Number) (-1.0f));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        boolean boolean47 = numberSerializer28.isEmpty(serializerProvider45, (java.lang.Number) 1);
        boolean boolean48 = numberSerializer28.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer50 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer54 = numberSerializer52.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer56 = numberSerializer52.withFilterId((java.lang.Object) '#');
        boolean boolean58 = numberSerializer52.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor59 = numberSerializer52.properties();
        java.lang.Class<java.lang.Number> numberClass60 = numberSerializer52.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = numberSerializer50.getSchema(serializerProvider51, (java.lang.reflect.Type) numberClass60, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = numberSerializer28.getSchema(serializerProvider49, (java.lang.reflect.Type) numberClass60, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer65 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass60);
        java.lang.Class<java.lang.Object> objClass66 = doubleSerializer65.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = doubleSerializer23.getSchema(serializerProvider27, (java.lang.reflect.Type) objClass66);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator68 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider69 = null;
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.serialize((java.lang.Object) doubleSerializer23, jsonGenerator68, serializerProvider69);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer cannot be cast to class java.lang.Number (com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer is in unnamed module of loader 'app'; java.lang.Number is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertTrue("'" + numberType4 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType4.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertTrue("'" + numberType5 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType5.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertTrue("'" + numberType9 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType9.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertNotNull(numberClass19);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor26);
        org.junit.Assert.assertNotNull(numberSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor35);
        org.junit.Assert.assertNotNull(numberClass36);
        org.junit.Assert.assertNotNull(numberClass37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(numberSerializer50);
        org.junit.Assert.assertNotNull(numberSerializer52);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer54);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor59);
        org.junit.Assert.assertNotNull(numberClass60);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertNotNull(jsonNode64);
        org.junit.Assert.assertNotNull(objClass66);
        org.junit.Assert.assertNotNull(jsonNode67);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = intLikeSerializer0.getSchema(serializerProvider1, type2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer7.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer7.withFilterId((java.lang.Object) '#');
        boolean boolean13 = numberSerializer7.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = numberSerializer7.properties();
        java.lang.Class<java.lang.Number> numberClass15 = numberSerializer7.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = numberSerializer5.getSchema(serializerProvider6, (java.lang.reflect.Type) numberClass15, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) numberClass15);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer19 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass15);
        boolean boolean20 = doubleSerializer19.isUnwrappingSerializer();
        java.lang.Object obj21 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleSerializer19.serializeWithType(obj21, jsonGenerator22, serializerProvider23, typeSerializer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(numberSerializer5);
        org.junit.Assert.assertNotNull(numberSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
        org.junit.Assert.assertNotNull(numberClass15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        boolean boolean12 = numberSerializer0.isEmpty(serializerProvider10, (java.lang.Number) (short) 0);
        boolean boolean13 = numberSerializer0.usesObjectId();
        boolean boolean14 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer15.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = numberSerializer15.withFilterId((java.lang.Object) '#');
        boolean boolean21 = numberSerializer15.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor22 = numberSerializer15.properties();
        java.lang.Class<java.lang.Number> numberClass23 = numberSerializer15.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer24 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass23);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = doubleSerializer24.getDelegatee();
        boolean boolean26 = doubleSerializer24._isInt;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer0.withFilterId((java.lang.Object) boolean26);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = numberSerializer28.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer28.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer33 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer34 = numberSerializer28.unwrappingSerializer(nameTransformer33);
        boolean boolean35 = numberSerializer28.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer36 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer37 = numberSerializer28.unwrappingSerializer(nameTransformer36);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer38 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer39 = numberSerializer28.unwrappingSerializer(nameTransformer38);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer40 = numberSerializer0.withFilterId((java.lang.Object) nameTransformer38);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer41 = wildcardJsonSerializer40.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(numberSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor22);
        org.junit.Assert.assertNotNull(numberClass23);
        org.junit.Assert.assertNull(wildcardJsonSerializer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(numberSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer32);
        org.junit.Assert.assertNotNull(numberJsonSerializer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer37);
        org.junit.Assert.assertNotNull(numberJsonSerializer39);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer40);
        org.junit.Assert.assertNull(wildcardJsonSerializer41);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        boolean boolean7 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = numberSerializer8.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = numberSerializer12.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer12.withFilterId((java.lang.Object) '#');
        boolean boolean18 = numberSerializer12.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = numberSerializer12.properties();
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer12.handledType();
        java.lang.Class<java.lang.Number> numberClass21 = numberSerializer12.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        boolean boolean24 = numberSerializer12.isEmpty(serializerProvider22, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer12.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = numberSerializer8.getSchema(serializerProvider11, (java.lang.reflect.Type) numberClass25);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer30 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer30.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberSerializer30.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer35 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer36 = numberSerializer30.unwrappingSerializer(nameTransformer35);
        boolean boolean37 = numberSerializer30.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer39 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        java.lang.reflect.Type type41 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = intLikeSerializer39.getSchema(serializerProvider40, type41);
        java.lang.String str43 = intLikeSerializer39._schemaType;
        java.lang.Class<java.lang.Object> objClass44 = intLikeSerializer39.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = numberSerializer30.getSchema(serializerProvider38, (java.lang.reflect.Type) objClass44);
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = intLikeSerializer28.getSchema(serializerProvider29, (java.lang.reflect.Type) objClass44, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider48 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer49 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider50 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer51 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer53 = numberSerializer51.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer55 = numberSerializer51.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer56 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer57 = numberSerializer51.unwrappingSerializer(nameTransformer56);
        boolean boolean58 = numberSerializer51.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider59 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer60 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider61 = null;
        java.lang.reflect.Type type62 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = intLikeSerializer60.getSchema(serializerProvider61, type62);
        java.lang.String str64 = intLikeSerializer60._schemaType;
        java.lang.Class<java.lang.Object> objClass65 = intLikeSerializer60.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = numberSerializer51.getSchema(serializerProvider59, (java.lang.reflect.Type) objClass65);
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = intLikeSerializer49.getSchema(serializerProvider50, (java.lang.reflect.Type) objClass65, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = intLikeSerializer28.getSchema(serializerProvider48, (java.lang.reflect.Type) objClass65, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = numberSerializer8.getSchema(serializerProvider27, (java.lang.reflect.Type) objClass65, false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer73 = numberSerializer0.withFilterId((java.lang.Object) objClass65);
        java.lang.Class<java.lang.Number> numberClass74 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass75 = numberSerializer0.handledType();
        boolean boolean76 = numberSerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor77 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider78 = null;
        boolean boolean80 = numberSerializer0.isEmpty(serializerProvider78, (java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer81 = numberSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(numberSerializer8);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(numberSerializer12);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertNotNull(numberClass21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(intLikeSerializer28);
        org.junit.Assert.assertNotNull(numberSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer32);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNotNull(numberJsonSerializer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer39);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "integer" + "'", str43, "integer");
        org.junit.Assert.assertNotNull(objClass44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertNotNull(intLikeSerializer49);
        org.junit.Assert.assertNotNull(numberSerializer51);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer53);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer55);
        org.junit.Assert.assertNotNull(numberJsonSerializer57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer60);
        org.junit.Assert.assertNotNull(jsonNode63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "integer" + "'", str64, "integer");
        org.junit.Assert.assertNotNull(objClass65);
        org.junit.Assert.assertNotNull(jsonNode66);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertNotNull(jsonNode70);
        org.junit.Assert.assertNotNull(jsonNode72);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer73);
        org.junit.Assert.assertNotNull(numberClass74);
        org.junit.Assert.assertNotNull(numberClass75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer81);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType1 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        boolean boolean9 = numberSerializer3.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer3.properties();
        java.lang.Class<java.lang.Number> numberClass11 = numberSerializer3.handledType();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = intLikeSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) numberClass12, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType15 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer22 = numberSerializer16.unwrappingSerializer(nameTransformer21);
        boolean boolean23 = intLikeSerializer0.isEmpty((java.lang.Object) numberSerializer16);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        boolean boolean26 = numberSerializer16.isEmpty(serializerProvider24, (java.lang.Number) (byte) -1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer16.getDelegatee();
        boolean boolean28 = numberSerializer16.usesObjectId();
        boolean boolean29 = numberSerializer16.isUnwrappingSerializer();
        boolean boolean30 = numberSerializer16._isInt;
        boolean boolean31 = numberSerializer16.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor32 = numberSerializer16.properties();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + numberType1 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType1.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(numberClass11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + numberType15 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType15.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(numberJsonSerializer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor32);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        boolean boolean5 = numberSerializer0.isEmpty(serializerProvider3, (java.lang.Number) (-1.0f));
        boolean boolean6 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer8 = numberSerializer0.unwrappingSerializer(nameTransformer7);
        boolean boolean9 = numberSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass7 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer8 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass7);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer9 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass7);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertNotNull(numberClass7);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer10 = numberSerializer0.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = numberSerializer11.properties();
        java.lang.Class<java.lang.Number> numberClass19 = numberSerializer11.handledType();
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer11.handledType();
        boolean boolean21 = numberSerializer11.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer23 = numberSerializer11.unwrappingSerializer(nameTransformer22);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer0.withFilterId((java.lang.Object) numberJsonSerializer23);
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer26 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass25);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer26.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer26.getDelegatee();
        boolean boolean29 = numberSerializer26.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer10);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertNotNull(numberClass19);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNull(wildcardJsonSerializer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = intLikeSerializer0.getSchema(serializerProvider1, type2);
        java.lang.String str4 = intLikeSerializer0._schemaType;
        java.lang.Class<java.lang.Object> objClass5 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer6.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = numberSerializer6.withFilterId((java.lang.Object) '#');
        boolean boolean12 = numberSerializer6.isEmpty((java.lang.Number) (-1));
        boolean boolean14 = numberSerializer6.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer16 = numberSerializer6.unwrappingSerializer(nameTransformer15);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = intLikeSerializer0.withFilterId((java.lang.Object) numberJsonSerializer16);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = intLikeSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "integer" + "'", str4, "integer");
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(numberSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNull(wildcardJsonSerializer18);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer9 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = numberSerializer11.properties();
        java.lang.Class<java.lang.Number> numberClass19 = numberSerializer11.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer20 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass19);
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = numberSerializer9.getSchema(serializerProvider10, (java.lang.reflect.Type) numberClass19, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer23 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass19);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer24 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass19);
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer24.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        boolean boolean28 = numberSerializer24.isEmpty(serializerProvider26, (java.lang.Number) 100.0f);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertNotNull(numberClass19);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer1 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = shortSerializer1.withFilterId((java.lang.Object) 10.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer5.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer5.withFilterId((java.lang.Object) '#');
        boolean boolean11 = numberSerializer5.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberSerializer5.properties();
        java.lang.Class<java.lang.Number> numberClass13 = numberSerializer5.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass13);
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = shortSerializer1.getSchema(serializerProvider4, (java.lang.reflect.Type) numberClass13);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = floatSerializer0.withFilterId((java.lang.Object) jsonNode15);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = intLikeSerializer17.getSchema(serializerProvider18, type19);
        boolean boolean21 = intLikeSerializer17.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = numberSerializer23.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer23.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer23.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass29 = numberSerializer23.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer30 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass29);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer31 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass29);
        boolean boolean32 = intLikeSerializer17.isEmpty(serializerProvider22, (java.lang.Object) numberSerializer31);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = numberSerializer34.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = numberSerializer34.withFilterId((java.lang.Object) '#');
        boolean boolean40 = numberSerializer34.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor41 = numberSerializer34.properties();
        java.lang.Class<java.lang.Number> numberClass42 = numberSerializer34.handledType();
        java.lang.Class<java.lang.Number> numberClass43 = numberSerializer34.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        boolean boolean46 = numberSerializer34.isEmpty(serializerProvider44, (java.lang.Number) (short) 0);
        boolean boolean47 = numberSerializer34.usesObjectId();
        boolean boolean48 = numberSerializer34.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor49 = numberSerializer34.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor50 = numberSerializer34.properties();
        java.lang.Class<java.lang.Number> numberClass51 = numberSerializer34.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = numberSerializer31.getSchema(serializerProvider33, (java.lang.reflect.Type) numberClass51);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator53 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider54 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.serialize((java.lang.Object) serializerProvider33, jsonGenerator53, serializerProvider54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(numberSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertNotNull(numberClass13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(intLikeSerializer17);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(numberSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(numberClass29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(numberSerializer34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor41);
        org.junit.Assert.assertNotNull(numberClass42);
        org.junit.Assert.assertNotNull(numberClass43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor49);
        org.junit.Assert.assertNotNull(propertyWriterItor50);
        org.junit.Assert.assertNotNull(numberClass51);
        org.junit.Assert.assertNotNull(jsonNode52);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        boolean boolean12 = numberSerializer0.isEmpty(serializerProvider10, (java.lang.Number) (short) 0);
        boolean boolean13 = numberSerializer0.usesObjectId();
        boolean boolean14 = numberSerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor15 = numberSerializer0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        boolean boolean19 = numberSerializer0.isEmpty(serializerProvider17, (java.lang.Number) 1.0d);
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = numberSerializer21.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = numberSerializer21.withFilterId((java.lang.Object) '#');
        boolean boolean27 = numberSerializer21.isEmpty((java.lang.Number) (-1));
        boolean boolean29 = numberSerializer21.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        boolean boolean32 = numberSerializer21.isEmpty(serializerProvider30, (java.lang.Number) (-1.0d));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor33 = numberSerializer21.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberSerializer21.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer36 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer38 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer40 = numberSerializer38.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer42 = numberSerializer38.withFilterId((java.lang.Object) '#');
        boolean boolean44 = numberSerializer38.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor45 = numberSerializer38.properties();
        java.lang.Class<java.lang.Number> numberClass46 = numberSerializer38.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = numberSerializer36.getSchema(serializerProvider37, (java.lang.reflect.Type) numberClass46, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer50 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer54 = numberSerializer52.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer56 = numberSerializer52.withFilterId((java.lang.Object) '#');
        boolean boolean58 = numberSerializer52.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor59 = numberSerializer52.properties();
        java.lang.Class<java.lang.Number> numberClass60 = numberSerializer52.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = numberSerializer50.getSchema(serializerProvider51, (java.lang.reflect.Type) numberClass60, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = numberSerializer36.getSchema(serializerProvider49, (java.lang.reflect.Type) numberClass60, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer65 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass60);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = numberSerializer21.getSchema(serializerProvider35, (java.lang.reflect.Type) numberClass60, true);
        boolean boolean68 = numberSerializer21.isUnwrappingSerializer();
        boolean boolean69 = numberSerializer21.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer70 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer71 = numberSerializer21.unwrappingSerializer(nameTransformer70);
        boolean boolean72 = numberSerializer21.isUnwrappingSerializer();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer73 = numberSerializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number>) numberSerializer21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor15);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertNotNull(numberSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor33);
        org.junit.Assert.assertNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNotNull(numberSerializer36);
        org.junit.Assert.assertNotNull(numberSerializer38);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer40);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor45);
        org.junit.Assert.assertNotNull(numberClass46);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertNotNull(numberSerializer50);
        org.junit.Assert.assertNotNull(numberSerializer52);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer54);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor59);
        org.junit.Assert.assertNotNull(numberClass60);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertNotNull(jsonNode64);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer2.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer2.withFilterId((java.lang.Object) '#');
        boolean boolean8 = numberSerializer2.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberSerializer2.properties();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) numberClass10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer14 = numberSerializer0.unwrappingSerializer(nameTransformer13);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer15.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberSerializer19.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = numberSerializer19.withFilterId((java.lang.Object) '#');
        boolean boolean25 = numberSerializer19.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor26 = numberSerializer19.properties();
        java.lang.Class<java.lang.Number> numberClass27 = numberSerializer19.handledType();
        java.lang.Class<java.lang.Number> numberClass28 = numberSerializer19.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        boolean boolean31 = numberSerializer19.isEmpty(serializerProvider29, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass32 = numberSerializer19.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = numberSerializer15.getSchema(serializerProvider18, (java.lang.reflect.Type) numberClass32);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer34 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass32);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer35 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer36 = doubleSerializer34.unwrappingSerializer(nameTransformer35);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer37 = numberSerializer0.withFilterId((java.lang.Object) doubleSerializer34);
        boolean boolean38 = doubleSerializer34.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty40 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer41 = doubleSerializer34.createContextual(serializerProvider39, beanProperty40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(numberJsonSerializer14);
        org.junit.Assert.assertNotNull(numberSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(numberSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor26);
        org.junit.Assert.assertNotNull(numberClass27);
        org.junit.Assert.assertNotNull(numberClass28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(numberClass32);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(objJsonSerializer36);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer9 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass8);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = doubleSerializer9.getDelegatee();
        java.lang.String str11 = doubleSerializer9._schemaType;
        boolean boolean12 = doubleSerializer9.usesObjectId();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType13 = doubleSerializer9._numberType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = doubleSerializer9.unwrappingSerializer(nameTransformer14);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "number" + "'", str11, "number");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + numberType13 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE + "'", numberType13.equals(com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE));
        org.junit.Assert.assertNotNull(objJsonSerializer15);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer0.withFilterId((java.lang.Object) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = numberSerializer0.createContextual(serializerProvider10, beanProperty11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        boolean boolean9 = numberSerializer3.isEmpty((java.lang.Number) (-1));
        boolean boolean11 = numberSerializer3.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer13 = numberSerializer3.unwrappingSerializer(nameTransformer12);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer14.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer14.withFilterId((java.lang.Object) '#');
        boolean boolean20 = numberSerializer14.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor21 = numberSerializer14.properties();
        java.lang.Class<java.lang.Number> numberClass22 = numberSerializer14.handledType();
        java.lang.Class<java.lang.Number> numberClass23 = numberSerializer14.handledType();
        boolean boolean24 = numberSerializer14.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer26 = numberSerializer14.unwrappingSerializer(nameTransformer25);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer3.withFilterId((java.lang.Object) numberJsonSerializer26);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        boolean boolean29 = intLikeSerializer28.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = wildcardJsonSerializer27.withFilterId((java.lang.Object) boolean29);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = numberSerializer0.withFilterId((java.lang.Object) wildcardJsonSerializer30);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer32 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer33 = numberSerializer0.unwrappingSerializer(nameTransformer32);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer13);
        org.junit.Assert.assertNotNull(numberSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor21);
        org.junit.Assert.assertNotNull(numberClass22);
        org.junit.Assert.assertNotNull(numberClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(intLikeSerializer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer31);
        org.junit.Assert.assertNotNull(numberJsonSerializer33);
        org.junit.Assert.assertNull(wildcardJsonSerializer34);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean7 = numberSerializer0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        boolean boolean9 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.Throwable throwable11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = numberSerializer12.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer12.withFilterId((java.lang.Object) '#');
        boolean boolean18 = numberSerializer12.isEmpty((java.lang.Number) (-1));
        boolean boolean20 = numberSerializer12.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        boolean boolean23 = numberSerializer12.isEmpty(serializerProvider21, (java.lang.Number) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.wrapAndThrow(serializerProvider10, throwable11, (java.lang.Object) serializerProvider21, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberSerializer12);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer9 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass8);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = doubleSerializer9.getDelegatee();
        java.lang.String str11 = doubleSerializer9._schemaType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        boolean boolean14 = doubleSerializer9.isEmpty(serializerProvider12, (java.lang.Object) numberSerializer13);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer22 = numberSerializer16.unwrappingSerializer(nameTransformer21);
        boolean boolean23 = doubleSerializer9.isEmpty(serializerProvider15, (java.lang.Object) numberJsonSerializer22);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        java.lang.reflect.Type type25 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = doubleSerializer9.getSchema(serializerProvider24, type25);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = numberSerializer28.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer28.withFilterId((java.lang.Object) '#');
        boolean boolean34 = numberSerializer28.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor35 = numberSerializer28.properties();
        java.lang.Class<java.lang.Number> numberClass36 = numberSerializer28.handledType();
        java.lang.Class<java.lang.Number> numberClass37 = numberSerializer28.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        boolean boolean40 = numberSerializer28.isEmpty(serializerProvider38, (java.lang.Number) (short) 0);
        boolean boolean41 = numberSerializer28.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = numberSerializer43.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = numberSerializer43.withFilterId((java.lang.Object) '#');
        boolean boolean49 = numberSerializer43.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor50 = numberSerializer43.properties();
        java.lang.Class<java.lang.Number> numberClass51 = numberSerializer43.handledType();
        java.lang.Class<java.lang.Number> numberClass52 = numberSerializer43.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider53 = null;
        boolean boolean55 = numberSerializer43.isEmpty(serializerProvider53, (java.lang.Number) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer56 = numberSerializer43.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider57 = null;
        boolean boolean59 = numberSerializer43.isEmpty(serializerProvider57, (java.lang.Number) (-1.0f));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider60 = null;
        boolean boolean62 = numberSerializer43.isEmpty(serializerProvider60, (java.lang.Number) 1);
        boolean boolean63 = numberSerializer43.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider64 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer65 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider66 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer67 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer69 = numberSerializer67.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer71 = numberSerializer67.withFilterId((java.lang.Object) '#');
        boolean boolean73 = numberSerializer67.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor74 = numberSerializer67.properties();
        java.lang.Class<java.lang.Number> numberClass75 = numberSerializer67.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode77 = numberSerializer65.getSchema(serializerProvider66, (java.lang.reflect.Type) numberClass75, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode79 = numberSerializer43.getSchema(serializerProvider64, (java.lang.reflect.Type) numberClass75, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer80 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass75);
        com.fasterxml.jackson.databind.JsonNode jsonNode82 = numberSerializer28.getSchema(serializerProvider42, (java.lang.reflect.Type) numberClass75, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode83 = doubleSerializer9.getSchema(serializerProvider27, (java.lang.reflect.Type) numberClass75);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType84 = doubleSerializer9._numberType;
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "number" + "'", str11, "number");
        org.junit.Assert.assertNotNull(numberSerializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(numberJsonSerializer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(numberSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor35);
        org.junit.Assert.assertNotNull(numberClass36);
        org.junit.Assert.assertNotNull(numberClass37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(numberSerializer43);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer45);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor50);
        org.junit.Assert.assertNotNull(numberClass51);
        org.junit.Assert.assertNotNull(numberClass52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(numberSerializer65);
        org.junit.Assert.assertNotNull(numberSerializer67);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer69);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor74);
        org.junit.Assert.assertNotNull(numberClass75);
        org.junit.Assert.assertNotNull(jsonNode77);
        org.junit.Assert.assertNotNull(jsonNode79);
        org.junit.Assert.assertNotNull(jsonNode82);
        org.junit.Assert.assertNotNull(jsonNode83);
        org.junit.Assert.assertTrue("'" + numberType84 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE + "'", numberType84.equals(com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer8 = numberSerializer0.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer9.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer9.withFilterId((java.lang.Object) '#');
        boolean boolean15 = numberSerializer9.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = numberSerializer9.properties();
        java.lang.Class<java.lang.Number> numberClass17 = numberSerializer9.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer18 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = doubleSerializer18.getDelegatee();
        java.lang.String str20 = doubleSerializer18._schemaType;
        boolean boolean21 = doubleSerializer18.usesObjectId();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType22 = doubleSerializer18._numberType;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = numberSerializer0.withFilterId((java.lang.Object) numberType22);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serialize((java.lang.Number) 1, jsonGenerator25, serializerProvider26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer8);
        org.junit.Assert.assertNotNull(numberSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
        org.junit.Assert.assertNotNull(numberClass17);
        org.junit.Assert.assertNull(wildcardJsonSerializer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "number" + "'", str20, "number");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + numberType22 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE + "'", numberType22.equals(com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE));
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        boolean boolean7 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = numberSerializer8.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = numberSerializer8.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer14 = numberSerializer8.unwrappingSerializer(nameTransformer13);
        boolean boolean15 = numberSerializer8.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = intLikeSerializer17.getSchema(serializerProvider18, type19);
        java.lang.String str21 = intLikeSerializer17._schemaType;
        java.lang.Class<java.lang.Object> objClass22 = intLikeSerializer17.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = numberSerializer8.getSchema(serializerProvider16, (java.lang.reflect.Type) objClass22);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer26.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = numberSerializer26.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer31 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer32 = numberSerializer26.unwrappingSerializer(nameTransformer31);
        boolean boolean33 = numberSerializer26.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        java.lang.reflect.Type type37 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = intLikeSerializer35.getSchema(serializerProvider36, type37);
        java.lang.String str39 = intLikeSerializer35._schemaType;
        java.lang.Class<java.lang.Object> objClass40 = intLikeSerializer35.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = numberSerializer26.getSchema(serializerProvider34, (java.lang.reflect.Type) objClass40);
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = intLikeSerializer24.getSchema(serializerProvider25, (java.lang.reflect.Type) objClass40, true);
        java.lang.String str44 = intLikeSerializer24._schemaType;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = numberSerializer8.withFilterId((java.lang.Object) str44);
        boolean boolean46 = numberSerializer8._isInt;
        java.lang.Class<java.lang.Number> numberClass47 = numberSerializer8.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer48 = numberSerializer8.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = numberSerializer0.withFilterId((java.lang.Object) numberSerializer8);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor50 = numberSerializer0.properties();
        boolean boolean51 = numberSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(numberSerializer8);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNotNull(numberJsonSerializer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer17);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "integer" + "'", str21, "integer");
        org.junit.Assert.assertNotNull(objClass22);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(intLikeSerializer24);
        org.junit.Assert.assertNotNull(numberSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(numberJsonSerializer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer35);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "integer" + "'", str39, "integer");
        org.junit.Assert.assertNotNull(objClass40);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "integer" + "'", str44, "integer");
        org.junit.Assert.assertNotNull(wildcardJsonSerializer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(numberClass47);
        org.junit.Assert.assertNull(wildcardJsonSerializer48);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer49);
        org.junit.Assert.assertNotNull(propertyWriterItor50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        boolean boolean12 = numberSerializer0.isEmpty(serializerProvider10, (java.lang.Number) (short) 0);
        boolean boolean13 = numberSerializer0.usesObjectId();
        boolean boolean14 = numberSerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor15 = numberSerializer0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        boolean boolean19 = numberSerializer0.isEmpty(serializerProvider17, (java.lang.Number) (short) -1);
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        boolean boolean23 = numberSerializer0.isEmpty(serializerProvider21, (java.lang.Number) 10L);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor15);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        boolean boolean7 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer9 = numberSerializer0.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        boolean boolean12 = numberSerializer0.isEmpty(serializerProvider10, (java.lang.Number) 10L);
        java.lang.Class<java.lang.Number> numberClass13 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer15.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = numberSerializer15.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer21 = numberSerializer15.unwrappingSerializer(nameTransformer20);
        boolean boolean22 = numberSerializer15.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = numberSerializer23.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer27 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = numberSerializer27.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = numberSerializer27.withFilterId((java.lang.Object) '#');
        boolean boolean33 = numberSerializer27.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor34 = numberSerializer27.properties();
        java.lang.Class<java.lang.Number> numberClass35 = numberSerializer27.handledType();
        java.lang.Class<java.lang.Number> numberClass36 = numberSerializer27.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        boolean boolean39 = numberSerializer27.isEmpty(serializerProvider37, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass40 = numberSerializer27.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = numberSerializer23.getSchema(serializerProvider26, (java.lang.reflect.Type) numberClass40);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer45 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = numberSerializer45.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = numberSerializer45.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer50 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer51 = numberSerializer45.unwrappingSerializer(nameTransformer50);
        boolean boolean52 = numberSerializer45.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider53 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer54 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider55 = null;
        java.lang.reflect.Type type56 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = intLikeSerializer54.getSchema(serializerProvider55, type56);
        java.lang.String str58 = intLikeSerializer54._schemaType;
        java.lang.Class<java.lang.Object> objClass59 = intLikeSerializer54.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode60 = numberSerializer45.getSchema(serializerProvider53, (java.lang.reflect.Type) objClass59);
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = intLikeSerializer43.getSchema(serializerProvider44, (java.lang.reflect.Type) objClass59, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider63 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer64 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider65 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer66 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer68 = numberSerializer66.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer70 = numberSerializer66.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer71 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer72 = numberSerializer66.unwrappingSerializer(nameTransformer71);
        boolean boolean73 = numberSerializer66.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider74 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer75 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider76 = null;
        java.lang.reflect.Type type77 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode78 = intLikeSerializer75.getSchema(serializerProvider76, type77);
        java.lang.String str79 = intLikeSerializer75._schemaType;
        java.lang.Class<java.lang.Object> objClass80 = intLikeSerializer75.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode81 = numberSerializer66.getSchema(serializerProvider74, (java.lang.reflect.Type) objClass80);
        com.fasterxml.jackson.databind.JsonNode jsonNode83 = intLikeSerializer64.getSchema(serializerProvider65, (java.lang.reflect.Type) objClass80, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode85 = intLikeSerializer43.getSchema(serializerProvider63, (java.lang.reflect.Type) objClass80, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode87 = numberSerializer23.getSchema(serializerProvider42, (java.lang.reflect.Type) objClass80, false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer88 = numberSerializer15.withFilterId((java.lang.Object) objClass80);
        java.lang.Class<java.lang.Number> numberClass89 = numberSerializer15.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer90 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer91 = numberSerializer15.unwrappingSerializer(nameTransformer90);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider92 = null;
        boolean boolean94 = numberSerializer15.isEmpty(serializerProvider92, (java.lang.Number) 1L);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor95 = numberSerializer15.properties();
        java.lang.Class<java.lang.Number> numberClass96 = numberSerializer15.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer97 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass96);
        com.fasterxml.jackson.databind.JsonNode jsonNode98 = numberSerializer0.getSchema(serializerProvider14, (java.lang.reflect.Type) numberClass96);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(numberClass13);
        org.junit.Assert.assertNotNull(numberSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer19);
        org.junit.Assert.assertNotNull(numberJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(numberSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(numberSerializer27);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer29);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor34);
        org.junit.Assert.assertNotNull(numberClass35);
        org.junit.Assert.assertNotNull(numberClass36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(numberClass40);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(intLikeSerializer43);
        org.junit.Assert.assertNotNull(numberSerializer45);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer49);
        org.junit.Assert.assertNotNull(numberJsonSerializer51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer54);
        org.junit.Assert.assertNotNull(jsonNode57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "integer" + "'", str58, "integer");
        org.junit.Assert.assertNotNull(objClass59);
        org.junit.Assert.assertNotNull(jsonNode60);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertNotNull(intLikeSerializer64);
        org.junit.Assert.assertNotNull(numberSerializer66);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer68);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer70);
        org.junit.Assert.assertNotNull(numberJsonSerializer72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer75);
        org.junit.Assert.assertNotNull(jsonNode78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "integer" + "'", str79, "integer");
        org.junit.Assert.assertNotNull(objClass80);
        org.junit.Assert.assertNotNull(jsonNode81);
        org.junit.Assert.assertNotNull(jsonNode83);
        org.junit.Assert.assertNotNull(jsonNode85);
        org.junit.Assert.assertNotNull(jsonNode87);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer88);
        org.junit.Assert.assertNotNull(numberClass89);
        org.junit.Assert.assertNotNull(numberJsonSerializer91);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor95);
        org.junit.Assert.assertNotNull(numberClass96);
        org.junit.Assert.assertNotNull(jsonNode98);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType1 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        boolean boolean9 = numberSerializer3.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer3.properties();
        java.lang.Class<java.lang.Number> numberClass11 = numberSerializer3.handledType();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = intLikeSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) numberClass12, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType15 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer22 = numberSerializer16.unwrappingSerializer(nameTransformer21);
        boolean boolean23 = intLikeSerializer0.isEmpty((java.lang.Object) numberSerializer16);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        boolean boolean26 = numberSerializer16.isEmpty(serializerProvider24, (java.lang.Number) (byte) -1);
        boolean boolean28 = numberSerializer16.isEmpty((java.lang.Number) (byte) 1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        boolean boolean31 = numberSerializer16.isEmpty(serializerProvider29, (java.lang.Number) (short) 100);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + numberType1 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType1.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(numberClass11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + numberType15 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType15.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(numberJsonSerializer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = intLikeSerializer0.getSchema(serializerProvider1, type2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer7.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer7.withFilterId((java.lang.Object) '#');
        boolean boolean13 = numberSerializer7.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = numberSerializer7.properties();
        java.lang.Class<java.lang.Number> numberClass15 = numberSerializer7.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = numberSerializer5.getSchema(serializerProvider6, (java.lang.reflect.Type) numberClass15, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) numberClass15);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = numberSerializer20.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer24.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer24.withFilterId((java.lang.Object) '#');
        boolean boolean30 = numberSerializer24.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor31 = numberSerializer24.properties();
        java.lang.Class<java.lang.Number> numberClass32 = numberSerializer24.handledType();
        java.lang.Class<java.lang.Number> numberClass33 = numberSerializer24.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        boolean boolean36 = numberSerializer24.isEmpty(serializerProvider34, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass37 = numberSerializer24.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = numberSerializer20.getSchema(serializerProvider23, (java.lang.reflect.Type) numberClass37);
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = intLikeSerializer0.getSchema(serializerProvider19, (java.lang.reflect.Type) numberClass37, false);
        boolean boolean41 = intLikeSerializer0.usesObjectId();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType42 = intLikeSerializer0._numberType;
        java.lang.Class<java.lang.Object> objClass43 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer45 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType46 = intLikeSerializer45._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        java.lang.reflect.Type type48 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = intLikeSerializer45.getSchema(serializerProvider47, type48);
        boolean boolean50 = intLikeSerializer45._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider53 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer54 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider55 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer56 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer58 = numberSerializer56.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer60 = numberSerializer56.withFilterId((java.lang.Object) '#');
        boolean boolean62 = numberSerializer56.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor63 = numberSerializer56.properties();
        java.lang.Class<java.lang.Number> numberClass64 = numberSerializer56.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer65 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass64);
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = numberSerializer54.getSchema(serializerProvider55, (java.lang.reflect.Type) numberClass64);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer67 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass64);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer68 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass64);
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = intLikeSerializer52.getSchema(serializerProvider53, (java.lang.reflect.Type) numberClass64);
        com.fasterxml.jackson.databind.JsonNode jsonNode71 = intLikeSerializer45.getSchema(serializerProvider51, (java.lang.reflect.Type) numberClass64, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = intLikeSerializer0.getSchema(serializerProvider44, (java.lang.reflect.Type) numberClass64);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(numberSerializer5);
        org.junit.Assert.assertNotNull(numberSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
        org.junit.Assert.assertNotNull(numberClass15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(numberSerializer20);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer22);
        org.junit.Assert.assertNotNull(numberSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor31);
        org.junit.Assert.assertNotNull(numberClass32);
        org.junit.Assert.assertNotNull(numberClass33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(numberClass37);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + numberType42 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType42.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objClass43);
        org.junit.Assert.assertNotNull(intLikeSerializer45);
        org.junit.Assert.assertTrue("'" + numberType46 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType46.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonNode49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intLikeSerializer52);
        org.junit.Assert.assertNotNull(numberSerializer54);
        org.junit.Assert.assertNotNull(numberSerializer56);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer58);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor63);
        org.junit.Assert.assertNotNull(numberClass64);
        org.junit.Assert.assertNotNull(jsonNode66);
        org.junit.Assert.assertNotNull(jsonNode69);
        org.junit.Assert.assertNotNull(jsonNode71);
        org.junit.Assert.assertNotNull(jsonNode72);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer2.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer2.withFilterId((java.lang.Object) '#');
        boolean boolean8 = numberSerializer2.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberSerializer2.properties();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) numberClass10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        boolean boolean22 = numberSerializer16.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = numberSerializer16.properties();
        java.lang.Class<java.lang.Number> numberClass24 = numberSerializer16.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer25 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass24);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer27 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = numberSerializer27.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = numberSerializer27.withFilterId((java.lang.Object) '#');
        boolean boolean33 = numberSerializer27.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor34 = numberSerializer27.properties();
        java.lang.Class<java.lang.Number> numberClass35 = numberSerializer27.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer36 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass35);
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = numberSerializer25.getSchema(serializerProvider26, (java.lang.reflect.Type) numberClass35, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = longSerializer14.getSchema(serializerProvider15, (java.lang.reflect.Type) numberClass35);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer41 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        java.lang.reflect.Type type43 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = intLikeSerializer41.getSchema(serializerProvider42, type43);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer46 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer48 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer50 = numberSerializer48.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer52 = numberSerializer48.withFilterId((java.lang.Object) '#');
        boolean boolean54 = numberSerializer48.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor55 = numberSerializer48.properties();
        java.lang.Class<java.lang.Number> numberClass56 = numberSerializer48.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = numberSerializer46.getSchema(serializerProvider47, (java.lang.reflect.Type) numberClass56, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode59 = intLikeSerializer41.getSchema(serializerProvider45, (java.lang.reflect.Type) numberClass56);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer60 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass56);
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = longSerializer14.getSchema(serializerProvider40, (java.lang.reflect.Type) numberClass56);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer62 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer64 = numberSerializer62.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer66 = numberSerializer62.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer67 = numberSerializer62.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass68 = numberSerializer62.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer69 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass68);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer70 = longSerializer14.withFilterId((java.lang.Object) numberClass68);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer71 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass68);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer72 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass68);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer73 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass68);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer74 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer75 = doubleSerializer73.unwrappingSerializer(nameTransformer74);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertNotNull(numberClass24);
        org.junit.Assert.assertNotNull(numberSerializer27);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer29);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor34);
        org.junit.Assert.assertNotNull(numberClass35);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(intLikeSerializer41);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNotNull(numberSerializer46);
        org.junit.Assert.assertNotNull(numberSerializer48);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer50);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor55);
        org.junit.Assert.assertNotNull(numberClass56);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(jsonNode59);
        org.junit.Assert.assertNotNull(jsonNode61);
        org.junit.Assert.assertNotNull(numberSerializer62);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer64);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer66);
        org.junit.Assert.assertNull(wildcardJsonSerializer67);
        org.junit.Assert.assertNotNull(numberClass68);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer70);
        org.junit.Assert.assertNotNull(objJsonSerializer75);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        boolean boolean1 = floatSerializer0._isInt;
        boolean boolean2 = floatSerializer0._isInt;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        boolean boolean9 = numberSerializer3.isEmpty((java.lang.Number) (-1));
        boolean boolean11 = numberSerializer3.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer13 = numberSerializer3.unwrappingSerializer(nameTransformer12);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer14.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer14.withFilterId((java.lang.Object) '#');
        boolean boolean20 = numberSerializer14.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor21 = numberSerializer14.properties();
        java.lang.Class<java.lang.Number> numberClass22 = numberSerializer14.handledType();
        java.lang.Class<java.lang.Number> numberClass23 = numberSerializer14.handledType();
        boolean boolean24 = numberSerializer14.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer26 = numberSerializer14.unwrappingSerializer(nameTransformer25);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer3.withFilterId((java.lang.Object) numberJsonSerializer26);
        java.lang.Class<java.lang.Number> numberClass28 = numberSerializer3.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer29 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass28);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType30 = integerSerializer29._numberType;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.serialize((java.lang.Object) numberType30, jsonGenerator31, serializerProvider32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.core.JsonParser$NumberType cannot be cast to class java.lang.Float (com.fasterxml.jackson.core.JsonParser$NumberType is in unnamed module of loader 'app'; java.lang.Float is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer13);
        org.junit.Assert.assertNotNull(numberSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor21);
        org.junit.Assert.assertNotNull(numberClass22);
        org.junit.Assert.assertNotNull(numberClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(numberClass28);
        org.junit.Assert.assertTrue("'" + numberType30 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType30.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType1 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        boolean boolean9 = numberSerializer3.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer3.properties();
        java.lang.Class<java.lang.Number> numberClass11 = numberSerializer3.handledType();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = intLikeSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) numberClass12, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass12);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass12);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            longSerializer16.acceptJsonFormatVisitor(jsonFormatVisitorWrapper17, javaType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + numberType1 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType1.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(numberClass11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer11 = numberSerializer0.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = numberSerializer12.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer12.withFilterId((java.lang.Object) '#');
        boolean boolean18 = numberSerializer12.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = numberSerializer12.properties();
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer12.handledType();
        java.lang.Class<java.lang.Number> numberClass21 = numberSerializer12.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        boolean boolean24 = numberSerializer12.isEmpty(serializerProvider22, (java.lang.Number) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = numberSerializer12.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass26 = numberSerializer12.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = numberSerializer0.withFilterId((java.lang.Object) numberClass26);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        boolean boolean30 = numberSerializer0.isEmpty(serializerProvider28, (java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertNotNull(numberJsonSerializer11);
        org.junit.Assert.assertNotNull(numberSerializer12);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertNotNull(numberClass21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(numberClass26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer10 = numberSerializer0.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = numberSerializer11.properties();
        java.lang.Class<java.lang.Number> numberClass19 = numberSerializer11.handledType();
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer11.handledType();
        boolean boolean21 = numberSerializer11.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer23 = numberSerializer11.unwrappingSerializer(nameTransformer22);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer0.withFilterId((java.lang.Object) numberJsonSerializer23);
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor26 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer28 = numberSerializer0.unwrappingSerializer(nameTransformer27);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor29 = numberSerializer0.properties();
        boolean boolean30 = numberSerializer0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Number> numberClass31 = numberSerializer0.handledType();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer10);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertNotNull(numberClass19);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertNotNull(propertyWriterItor26);
        org.junit.Assert.assertNotNull(numberJsonSerializer28);
        org.junit.Assert.assertNotNull(propertyWriterItor29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(numberClass31);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer4.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer4.withFilterId((java.lang.Object) '#');
        boolean boolean10 = numberSerializer4.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer4.properties();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer4.handledType();
        java.lang.Class<java.lang.Number> numberClass13 = numberSerializer4.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        boolean boolean16 = numberSerializer4.isEmpty(serializerProvider14, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass17 = numberSerializer4.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = numberSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) numberClass17);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer22.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer22.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer28 = numberSerializer22.unwrappingSerializer(nameTransformer27);
        boolean boolean29 = numberSerializer22.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer31 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        java.lang.reflect.Type type33 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = intLikeSerializer31.getSchema(serializerProvider32, type33);
        java.lang.String str35 = intLikeSerializer31._schemaType;
        java.lang.Class<java.lang.Object> objClass36 = intLikeSerializer31.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = numberSerializer22.getSchema(serializerProvider30, (java.lang.reflect.Type) objClass36);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = intLikeSerializer20.getSchema(serializerProvider21, (java.lang.reflect.Type) objClass36, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer41 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = numberSerializer43.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = numberSerializer43.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer48 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer49 = numberSerializer43.unwrappingSerializer(nameTransformer48);
        boolean boolean50 = numberSerializer43.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider53 = null;
        java.lang.reflect.Type type54 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = intLikeSerializer52.getSchema(serializerProvider53, type54);
        java.lang.String str56 = intLikeSerializer52._schemaType;
        java.lang.Class<java.lang.Object> objClass57 = intLikeSerializer52.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = numberSerializer43.getSchema(serializerProvider51, (java.lang.reflect.Type) objClass57);
        com.fasterxml.jackson.databind.JsonNode jsonNode60 = intLikeSerializer41.getSchema(serializerProvider42, (java.lang.reflect.Type) objClass57, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = intLikeSerializer20.getSchema(serializerProvider40, (java.lang.reflect.Type) objClass57, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = numberSerializer0.getSchema(serializerProvider19, (java.lang.reflect.Type) objClass57, false);
        java.lang.Class<java.lang.Number> numberClass65 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer66 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider67 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer68 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer70 = numberSerializer68.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer72 = numberSerializer68.withFilterId((java.lang.Object) '#');
        boolean boolean74 = numberSerializer68.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor75 = numberSerializer68.properties();
        java.lang.Class<java.lang.Number> numberClass76 = numberSerializer68.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer77 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass76);
        com.fasterxml.jackson.databind.JsonNode jsonNode78 = numberSerializer66.getSchema(serializerProvider67, (java.lang.reflect.Type) numberClass76);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer79 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass76);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider80 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer81 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider82 = null;
        java.lang.reflect.Type type83 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode84 = intLikeSerializer81.getSchema(serializerProvider82, type83);
        java.lang.String str85 = intLikeSerializer81._schemaType;
        java.lang.Class<java.lang.Object> objClass86 = intLikeSerializer81.handledType();
        java.lang.Class<?> wildcardClass87 = intLikeSerializer81.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode89 = longSerializer79.getSchema(serializerProvider80, (java.lang.reflect.Type) wildcardClass87, false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer90 = numberSerializer0.withFilterId((java.lang.Object) jsonNode89);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(numberSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(numberClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(numberClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(numberSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(numberJsonSerializer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer31);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "integer" + "'", str35, "integer");
        org.junit.Assert.assertNotNull(objClass36);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(intLikeSerializer41);
        org.junit.Assert.assertNotNull(numberSerializer43);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer45);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNotNull(numberJsonSerializer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer52);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "integer" + "'", str56, "integer");
        org.junit.Assert.assertNotNull(objClass57);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(jsonNode60);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertNotNull(jsonNode64);
        org.junit.Assert.assertNotNull(numberClass65);
        org.junit.Assert.assertNotNull(numberSerializer66);
        org.junit.Assert.assertNotNull(numberSerializer68);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer70);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor75);
        org.junit.Assert.assertNotNull(numberClass76);
        org.junit.Assert.assertNotNull(jsonNode78);
        org.junit.Assert.assertNotNull(intLikeSerializer81);
        org.junit.Assert.assertNotNull(jsonNode84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "integer" + "'", str85, "integer");
        org.junit.Assert.assertNotNull(objClass86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(jsonNode89);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer90);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType1 = intLikeSerializer0._numberType;
        java.lang.Class<java.lang.Object> objClass2 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType3 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        java.lang.reflect.Type type7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = intLikeSerializer5.getSchema(serializerProvider6, type7);
        java.lang.String str9 = intLikeSerializer5._schemaType;
        java.lang.Class<java.lang.Object> objClass10 = intLikeSerializer5.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        boolean boolean19 = numberSerializer11.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer21 = numberSerializer11.unwrappingSerializer(nameTransformer20);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = intLikeSerializer5.withFilterId((java.lang.Object) numberJsonSerializer21);
        java.lang.Class<?> wildcardClass23 = wildcardJsonSerializer22.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = intLikeSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) wildcardClass23, false);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer26.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer29 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = numberSerializer29.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer33 = numberSerializer29.withFilterId((java.lang.Object) '#');
        boolean boolean35 = numberSerializer29.isEmpty((java.lang.Number) (-1));
        boolean boolean37 = numberSerializer29.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer38 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer39 = numberSerializer29.unwrappingSerializer(nameTransformer38);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer40 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer42 = numberSerializer40.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer44 = numberSerializer40.withFilterId((java.lang.Object) '#');
        boolean boolean46 = numberSerializer40.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor47 = numberSerializer40.properties();
        java.lang.Class<java.lang.Number> numberClass48 = numberSerializer40.handledType();
        java.lang.Class<java.lang.Number> numberClass49 = numberSerializer40.handledType();
        boolean boolean50 = numberSerializer40.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer51 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer52 = numberSerializer40.unwrappingSerializer(nameTransformer51);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer53 = numberSerializer29.withFilterId((java.lang.Object) numberJsonSerializer52);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer54 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        boolean boolean55 = intLikeSerializer54.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer56 = wildcardJsonSerializer53.withFilterId((java.lang.Object) boolean55);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer57 = numberSerializer26.withFilterId((java.lang.Object) wildcardJsonSerializer56);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider58 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer59 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType60 = intLikeSerializer59._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider61 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer62 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer64 = numberSerializer62.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer66 = numberSerializer62.withFilterId((java.lang.Object) '#');
        boolean boolean68 = numberSerializer62.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor69 = numberSerializer62.properties();
        java.lang.Class<java.lang.Number> numberClass70 = numberSerializer62.handledType();
        java.lang.Class<java.lang.Number> numberClass71 = numberSerializer62.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode73 = intLikeSerializer59.getSchema(serializerProvider61, (java.lang.reflect.Type) numberClass71, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType74 = intLikeSerializer59._numberType;
        java.lang.Class<java.lang.Object> objClass75 = intLikeSerializer59.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode77 = numberSerializer26.getSchema(serializerProvider58, (java.lang.reflect.Type) objClass75, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider78 = null;
        boolean boolean80 = numberSerializer26.isEmpty(serializerProvider78, (java.lang.Number) 10L);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer81 = intLikeSerializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number>) numberSerializer26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + numberType1 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType1.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + numberType3 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType3.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "integer" + "'", str9, "integer");
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertNotNull(numberSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(numberSerializer29);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer31);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer39);
        org.junit.Assert.assertNotNull(numberSerializer40);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer42);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor47);
        org.junit.Assert.assertNotNull(numberClass48);
        org.junit.Assert.assertNotNull(numberClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer52);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer53);
        org.junit.Assert.assertNotNull(intLikeSerializer54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer56);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer57);
        org.junit.Assert.assertNotNull(intLikeSerializer59);
        org.junit.Assert.assertTrue("'" + numberType60 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType60.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer62);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer64);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor69);
        org.junit.Assert.assertNotNull(numberClass70);
        org.junit.Assert.assertNotNull(numberClass71);
        org.junit.Assert.assertNotNull(jsonNode73);
        org.junit.Assert.assertTrue("'" + numberType74 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType74.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objClass75);
        org.junit.Assert.assertNotNull(jsonNode77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer2.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer2.withFilterId((java.lang.Object) '#');
        boolean boolean8 = numberSerializer2.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberSerializer2.properties();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer2.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) numberClass10, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        boolean boolean22 = numberSerializer16.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = numberSerializer16.properties();
        java.lang.Class<java.lang.Number> numberClass24 = numberSerializer16.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = numberSerializer14.getSchema(serializerProvider15, (java.lang.reflect.Type) numberClass24, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = numberSerializer0.getSchema(serializerProvider13, (java.lang.reflect.Type) numberClass24, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer29 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass24);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer30 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass24);
        boolean boolean31 = numberSerializer30.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(numberSerializer14);
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertNotNull(numberClass24);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer10 = numberSerializer0.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = numberSerializer11.properties();
        java.lang.Class<java.lang.Number> numberClass19 = numberSerializer11.handledType();
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer11.handledType();
        boolean boolean21 = numberSerializer11.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer23 = numberSerializer11.unwrappingSerializer(nameTransformer22);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer0.withFilterId((java.lang.Object) numberJsonSerializer23);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        boolean boolean26 = intLikeSerializer25.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = wildcardJsonSerializer24.withFilterId((java.lang.Object) boolean26);
        java.lang.Class<?> wildcardClass28 = wildcardJsonSerializer27.getClass();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer10);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertNotNull(numberClass19);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(intLikeSerializer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer9 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer11.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer11.withFilterId((java.lang.Object) '#');
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = numberSerializer11.properties();
        java.lang.Class<java.lang.Number> numberClass19 = numberSerializer11.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer20 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass19);
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = numberSerializer9.getSchema(serializerProvider10, (java.lang.reflect.Type) numberClass19, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer23 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass19);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType26 = intLikeSerializer25._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = numberSerializer28.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = numberSerializer28.withFilterId((java.lang.Object) '#');
        boolean boolean34 = numberSerializer28.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor35 = numberSerializer28.properties();
        java.lang.Class<java.lang.Number> numberClass36 = numberSerializer28.handledType();
        java.lang.Class<java.lang.Number> numberClass37 = numberSerializer28.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = intLikeSerializer25.getSchema(serializerProvider27, (java.lang.reflect.Type) numberClass37, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType40 = intLikeSerializer25._numberType;
        java.lang.Class<java.lang.Object> objClass41 = intLikeSerializer25.handledType();
        boolean boolean42 = intLikeSerializer25._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer44 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType45 = intLikeSerializer44._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer47 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = numberSerializer47.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer51 = numberSerializer47.withFilterId((java.lang.Object) '#');
        boolean boolean53 = numberSerializer47.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor54 = numberSerializer47.properties();
        java.lang.Class<java.lang.Number> numberClass55 = numberSerializer47.handledType();
        java.lang.Class<java.lang.Number> numberClass56 = numberSerializer47.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = intLikeSerializer44.getSchema(serializerProvider46, (java.lang.reflect.Type) numberClass56, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer59 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer61 = numberSerializer59.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer63 = numberSerializer59.withFilterId((java.lang.Object) '#');
        boolean boolean65 = numberSerializer59.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor66 = numberSerializer59.properties();
        java.lang.Class<java.lang.Number> numberClass67 = numberSerializer59.handledType();
        java.lang.Class<java.lang.Number> numberClass68 = numberSerializer59.handledType();
        boolean boolean69 = numberSerializer59.usesObjectId();
        boolean boolean70 = intLikeSerializer44.isEmpty((java.lang.Object) boolean69);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider71 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer72 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType73 = intLikeSerializer72._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider74 = null;
        java.lang.reflect.Type type75 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode76 = intLikeSerializer72.getSchema(serializerProvider74, type75);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider77 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer78 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer80 = numberSerializer78.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer82 = numberSerializer78.withFilterId((java.lang.Object) '#');
        boolean boolean84 = numberSerializer78.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor85 = numberSerializer78.properties();
        java.lang.Class<java.lang.Number> numberClass86 = numberSerializer78.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode88 = intLikeSerializer72.getSchema(serializerProvider77, (java.lang.reflect.Type) numberClass86, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode89 = intLikeSerializer44.getSchema(serializerProvider71, (java.lang.reflect.Type) numberClass86);
        com.fasterxml.jackson.databind.JsonNode jsonNode90 = intLikeSerializer25.getSchema(serializerProvider43, (java.lang.reflect.Type) numberClass86);
        com.fasterxml.jackson.databind.JsonNode jsonNode91 = longSerializer23.getSchema(serializerProvider24, (java.lang.reflect.Type) numberClass86);
        boolean boolean92 = longSerializer23.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper93 = null;
        com.fasterxml.jackson.databind.JavaType javaType94 = null;
        // The following exception was thrown during execution in test generation
        try {
            longSerializer23.acceptJsonFormatVisitor(jsonFormatVisitorWrapper93, javaType94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertNotNull(numberClass19);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(intLikeSerializer25);
        org.junit.Assert.assertTrue("'" + numberType26 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType26.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor35);
        org.junit.Assert.assertNotNull(numberClass36);
        org.junit.Assert.assertNotNull(numberClass37);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertTrue("'" + numberType40 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType40.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intLikeSerializer44);
        org.junit.Assert.assertTrue("'" + numberType45 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType45.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer49);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor54);
        org.junit.Assert.assertNotNull(numberClass55);
        org.junit.Assert.assertNotNull(numberClass56);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(numberSerializer59);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer61);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor66);
        org.junit.Assert.assertNotNull(numberClass67);
        org.junit.Assert.assertNotNull(numberClass68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer72);
        org.junit.Assert.assertTrue("'" + numberType73 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType73.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonNode76);
        org.junit.Assert.assertNotNull(numberSerializer78);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer80);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor85);
        org.junit.Assert.assertNotNull(numberClass86);
        org.junit.Assert.assertNotNull(jsonNode88);
        org.junit.Assert.assertNotNull(jsonNode89);
        org.junit.Assert.assertNotNull(jsonNode90);
        org.junit.Assert.assertNotNull(jsonNode91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer9 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass8);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = doubleSerializer9.getDelegatee();
        java.lang.String str11 = doubleSerializer9._schemaType;
        java.lang.String str12 = doubleSerializer9._schemaType;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = doubleSerializer9.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = numberSerializer17.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberSerializer17.withFilterId((java.lang.Object) '#');
        boolean boolean23 = numberSerializer17.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor24 = numberSerializer17.properties();
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer17.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer26 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass25);
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = numberSerializer15.getSchema(serializerProvider16, (java.lang.reflect.Type) numberClass25);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer28 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass25);
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = doubleSerializer9.getSchema(serializerProvider14, (java.lang.reflect.Type) numberClass25);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer30 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass25);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "number" + "'", str11, "number");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "number" + "'", str12, "number");
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(numberSerializer15);
        org.junit.Assert.assertNotNull(numberSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor24);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(jsonNode29);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = intLikeSerializer0.getSchema(serializerProvider1, type2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer7.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer7.withFilterId((java.lang.Object) '#');
        boolean boolean13 = numberSerializer7.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = numberSerializer7.properties();
        java.lang.Class<java.lang.Number> numberClass15 = numberSerializer7.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = numberSerializer5.getSchema(serializerProvider6, (java.lang.reflect.Type) numberClass15, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) numberClass15);
        boolean boolean19 = intLikeSerializer0._isInt;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer22.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer22.withFilterId((java.lang.Object) '#');
        boolean boolean28 = numberSerializer22.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor29 = numberSerializer22.properties();
        java.lang.Class<java.lang.Number> numberClass30 = numberSerializer22.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer31 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass30);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = numberSerializer20.getSchema(serializerProvider21, (java.lang.reflect.Type) numberClass30);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer33 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer34 = numberSerializer20.unwrappingSerializer(nameTransformer33);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        boolean boolean37 = numberJsonSerializer34.isEmpty(serializerProvider35, (java.lang.Number) 100.0f);
        boolean boolean39 = numberJsonSerializer34.isEmpty((java.lang.Number) (byte) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer40 = numberJsonSerializer34.getDelegatee();
        boolean boolean41 = intLikeSerializer0.isEmpty((java.lang.Object) wildcardJsonSerializer40);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(numberSerializer5);
        org.junit.Assert.assertNotNull(numberSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
        org.junit.Assert.assertNotNull(numberClass15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(numberSerializer20);
        org.junit.Assert.assertNotNull(numberSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor29);
        org.junit.Assert.assertNotNull(numberClass30);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(numberJsonSerializer34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        boolean boolean10 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer14.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer14.withFilterId((java.lang.Object) '#');
        boolean boolean20 = numberSerializer14.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor21 = numberSerializer14.properties();
        java.lang.Class<java.lang.Number> numberClass22 = numberSerializer14.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer23 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass22);
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = numberSerializer12.getSchema(serializerProvider13, (java.lang.reflect.Type) numberClass22);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer26 = numberSerializer12.unwrappingSerializer(nameTransformer25);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer27 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = numberSerializer27.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer31 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer33 = numberSerializer31.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer35 = numberSerializer31.withFilterId((java.lang.Object) '#');
        boolean boolean37 = numberSerializer31.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor38 = numberSerializer31.properties();
        java.lang.Class<java.lang.Number> numberClass39 = numberSerializer31.handledType();
        java.lang.Class<java.lang.Number> numberClass40 = numberSerializer31.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider41 = null;
        boolean boolean43 = numberSerializer31.isEmpty(serializerProvider41, (java.lang.Number) (short) 0);
        java.lang.Class<java.lang.Number> numberClass44 = numberSerializer31.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = numberSerializer27.getSchema(serializerProvider30, (java.lang.reflect.Type) numberClass44);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer46 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass44);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer47 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer48 = doubleSerializer46.unwrappingSerializer(nameTransformer47);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = numberSerializer12.withFilterId((java.lang.Object) doubleSerializer46);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider50 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer51 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer53 = numberSerializer51.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer55 = numberSerializer51.withFilterId((java.lang.Object) '#');
        boolean boolean57 = numberSerializer51.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor58 = numberSerializer51.properties();
        java.lang.Class<java.lang.Number> numberClass59 = numberSerializer51.handledType();
        java.lang.Class<java.lang.Number> numberClass60 = numberSerializer51.handledType();
        boolean boolean61 = numberSerializer51.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer62 = numberSerializer51.getDelegatee();
        boolean boolean63 = numberSerializer51.usesObjectId();
        boolean boolean64 = numberSerializer51.isUnwrappingSerializer();
        boolean boolean65 = numberSerializer51._isInt;
        java.lang.Class<java.lang.Number> numberClass66 = numberSerializer51.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer67 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass66);
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = doubleSerializer46.getSchema(serializerProvider50, (java.lang.reflect.Type) numberClass66);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer69 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass66);
        com.fasterxml.jackson.databind.JsonNode jsonNode71 = numberSerializer0.getSchema(serializerProvider11, (java.lang.reflect.Type) numberClass66, false);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(numberSerializer12);
        org.junit.Assert.assertNotNull(numberSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor21);
        org.junit.Assert.assertNotNull(numberClass22);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(numberJsonSerializer26);
        org.junit.Assert.assertNotNull(numberSerializer27);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer29);
        org.junit.Assert.assertNotNull(numberSerializer31);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer33);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor38);
        org.junit.Assert.assertNotNull(numberClass39);
        org.junit.Assert.assertNotNull(numberClass40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(numberClass44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(objJsonSerializer48);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer49);
        org.junit.Assert.assertNotNull(numberSerializer51);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer53);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor58);
        org.junit.Assert.assertNotNull(numberClass59);
        org.junit.Assert.assertNotNull(numberClass60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(numberClass66);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertNotNull(jsonNode71);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberJsonSerializer6.properties();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType9 = intLikeSerializer8._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = intLikeSerializer8.getSchema(serializerProvider10, type11);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer14.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer14.withFilterId((java.lang.Object) '#');
        boolean boolean20 = numberSerializer14.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor21 = numberSerializer14.properties();
        java.lang.Class<java.lang.Number> numberClass22 = numberSerializer14.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = intLikeSerializer8.getSchema(serializerProvider13, (java.lang.reflect.Type) numberClass22, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = numberJsonSerializer6.withFilterId((java.lang.Object) intLikeSerializer8);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer26.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = numberSerializer26.withFilterId((java.lang.Object) '#');
        boolean boolean32 = numberSerializer26.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor33 = numberSerializer26.properties();
        java.lang.Class<java.lang.Number> numberClass34 = numberSerializer26.handledType();
        java.lang.Class<java.lang.Number> numberClass35 = numberSerializer26.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        boolean boolean38 = numberSerializer26.isEmpty(serializerProvider36, (java.lang.Number) (short) 0);
        boolean boolean39 = numberSerializer26.usesObjectId();
        boolean boolean40 = numberSerializer26.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer41 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer43 = numberSerializer41.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = numberSerializer41.withFilterId((java.lang.Object) '#');
        boolean boolean47 = numberSerializer41.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor48 = numberSerializer41.properties();
        java.lang.Class<java.lang.Number> numberClass49 = numberSerializer41.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer50 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass49);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer51 = doubleSerializer50.getDelegatee();
        boolean boolean52 = doubleSerializer50._isInt;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer53 = numberSerializer26.withFilterId((java.lang.Object) boolean52);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer54 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer55 = numberSerializer26.unwrappingSerializer(nameTransformer54);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer56 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer57 = numberJsonSerializer55.unwrappingSerializer(nameTransformer56);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer58 = numberJsonSerializer55.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer59 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer60 = numberJsonSerializer55.unwrappingSerializer(nameTransformer59);
        boolean boolean61 = numberJsonSerializer55.isUnwrappingSerializer();
        boolean boolean63 = numberJsonSerializer55.isEmpty((java.lang.Number) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer64 = intLikeSerializer8.replaceDelegatee(numberJsonSerializer55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertTrue("'" + numberType9 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType9.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(numberSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor21);
        org.junit.Assert.assertNotNull(numberClass22);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(numberSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor33);
        org.junit.Assert.assertNotNull(numberClass34);
        org.junit.Assert.assertNotNull(numberClass35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(numberSerializer41);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer43);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor48);
        org.junit.Assert.assertNotNull(numberClass49);
        org.junit.Assert.assertNull(wildcardJsonSerializer51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer53);
        org.junit.Assert.assertNotNull(numberJsonSerializer55);
        org.junit.Assert.assertNotNull(numberJsonSerializer57);
        org.junit.Assert.assertNull(wildcardJsonSerializer58);
        org.junit.Assert.assertNotNull(numberJsonSerializer60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        boolean boolean1 = floatSerializer0._isInt;
        boolean boolean2 = floatSerializer0._isInt;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer9 = numberSerializer3.unwrappingSerializer(nameTransformer8);
        boolean boolean10 = numberSerializer3.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        java.lang.reflect.Type type14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = intLikeSerializer12.getSchema(serializerProvider13, type14);
        java.lang.String str16 = intLikeSerializer12._schemaType;
        java.lang.Class<java.lang.Object> objClass17 = intLikeSerializer12.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = numberSerializer3.getSchema(serializerProvider11, (java.lang.reflect.Type) objClass17);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = numberSerializer21.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = numberSerializer21.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer26 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer27 = numberSerializer21.unwrappingSerializer(nameTransformer26);
        boolean boolean28 = numberSerializer21.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer30 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        java.lang.reflect.Type type32 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = intLikeSerializer30.getSchema(serializerProvider31, type32);
        java.lang.String str34 = intLikeSerializer30._schemaType;
        java.lang.Class<java.lang.Object> objClass35 = intLikeSerializer30.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = numberSerializer21.getSchema(serializerProvider29, (java.lang.reflect.Type) objClass35);
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = intLikeSerializer19.getSchema(serializerProvider20, (java.lang.reflect.Type) objClass35, true);
        java.lang.String str39 = intLikeSerializer19._schemaType;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer40 = numberSerializer3.withFilterId((java.lang.Object) str39);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider41 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer42 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer44 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer46 = numberSerializer44.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer48 = numberSerializer44.withFilterId((java.lang.Object) '#');
        boolean boolean50 = numberSerializer44.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor51 = numberSerializer44.properties();
        java.lang.Class<java.lang.Number> numberClass52 = numberSerializer44.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer53 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass52);
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = numberSerializer42.getSchema(serializerProvider43, (java.lang.reflect.Type) numberClass52);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer55 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass52);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer56 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass52);
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = numberSerializer3.getSchema(serializerProvider41, (java.lang.reflect.Type) numberClass52, true);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer59 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer60 = numberSerializer3.unwrappingSerializer(nameTransformer59);
        java.lang.Class<java.lang.Number> numberClass61 = numberSerializer3.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator62 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider63 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.serialize((java.lang.Object) numberClass61, jsonGenerator62, serializerProvider63);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class java.lang.Float (java.lang.Class and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(numberJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer12);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "integer" + "'", str16, "integer");
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(intLikeSerializer19);
        org.junit.Assert.assertNotNull(numberSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(numberJsonSerializer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer30);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "integer" + "'", str34, "integer");
        org.junit.Assert.assertNotNull(objClass35);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "integer" + "'", str39, "integer");
        org.junit.Assert.assertNotNull(wildcardJsonSerializer40);
        org.junit.Assert.assertNotNull(numberSerializer42);
        org.junit.Assert.assertNotNull(numberSerializer44);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer46);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor51);
        org.junit.Assert.assertNotNull(numberClass52);
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(numberJsonSerializer60);
        org.junit.Assert.assertNotNull(numberClass61);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer13.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer13.withFilterId((java.lang.Object) '#');
        boolean boolean19 = numberSerializer13.isEmpty((java.lang.Number) (-1));
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer21 = numberSerializer13.unwrappingSerializer(nameTransformer20);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor22 = numberJsonSerializer21.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = numberJsonSerializer21.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer0.withFilterId((java.lang.Object) numberJsonSerializer21);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serializeWithType((java.lang.Number) 10L, jsonGenerator26, serializerProvider27, typeSerializer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertNotNull(numberSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer21);
        org.junit.Assert.assertNotNull(propertyWriterItor22);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType1 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer3.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer3.withFilterId((java.lang.Object) '#');
        boolean boolean9 = numberSerializer3.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer3.properties();
        java.lang.Class<java.lang.Number> numberClass11 = numberSerializer3.handledType();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = intLikeSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) numberClass12, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = intLikeSerializer0.getDelegatee();
        java.lang.String str16 = intLikeSerializer0._schemaType;
        java.lang.String str17 = intLikeSerializer0._schemaType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer19 = intLikeSerializer0.unwrappingSerializer(nameTransformer18);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor20 = intLikeSerializer0.properties();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + numberType1 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType1.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(numberClass11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "integer" + "'", str16, "integer");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "integer" + "'", str17, "integer");
        org.junit.Assert.assertNotNull(objJsonSerializer19);
        org.junit.Assert.assertNotNull(propertyWriterItor20);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer2.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer2.withFilterId((java.lang.Object) '#');
        boolean boolean8 = numberSerializer2.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberSerializer2.properties();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer2.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) numberClass10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass10);
        boolean boolean14 = doubleSerializer13._isInt;
        boolean boolean15 = doubleSerializer13.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        boolean boolean22 = numberSerializer16.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = numberSerializer16.properties();
        java.lang.Class<java.lang.Number> numberClass24 = numberSerializer16.handledType();
        java.lang.Class<java.lang.Number> numberClass25 = numberSerializer16.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = doubleSerializer13.withFilterId((java.lang.Object) numberClass25);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer27 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(numberClass25);
        boolean boolean29 = numberSerializer27.isEmpty((java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertNotNull(numberClass24);
        org.junit.Assert.assertNotNull(numberClass25);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.Class<java.lang.Number> numberClass0 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer1 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = integerSerializer1.createContextual(serializerProvider2, beanProperty3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer2.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer2.withFilterId((java.lang.Object) '#');
        boolean boolean8 = numberSerializer2.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberSerializer2.properties();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer2.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) numberClass10, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = numberSerializer16.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer16.withFilterId((java.lang.Object) '#');
        boolean boolean22 = numberSerializer16.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = numberSerializer16.properties();
        java.lang.Class<java.lang.Number> numberClass24 = numberSerializer16.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = numberSerializer14.getSchema(serializerProvider15, (java.lang.reflect.Type) numberClass24, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = numberSerializer0.getSchema(serializerProvider13, (java.lang.reflect.Type) numberClass24, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer29 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass24);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer30 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer(numberClass24);
        java.lang.String str31 = longSerializer30._schemaType;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType32 = longSerializer30._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        java.lang.reflect.Type type34 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = longSerializer30.getSchema(serializerProvider33, type34);
        boolean boolean36 = longSerializer30.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer37 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer39 = numberSerializer37.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer41 = numberSerializer37.withFilterId((java.lang.Object) '#');
        boolean boolean43 = numberSerializer37.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor44 = numberSerializer37.properties();
        java.lang.Class<java.lang.Number> numberClass45 = numberSerializer37.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer46 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass45);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = doubleSerializer46.getDelegatee();
        java.lang.String str48 = doubleSerializer46._schemaType;
        java.lang.String str49 = doubleSerializer46._schemaType;
        boolean boolean50 = doubleSerializer46.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider53 = null;
        java.lang.reflect.Type type54 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = intLikeSerializer52.getSchema(serializerProvider53, type54);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider56 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer57 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider58 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer59 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer61 = numberSerializer59.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer63 = numberSerializer59.withFilterId((java.lang.Object) '#');
        boolean boolean65 = numberSerializer59.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor66 = numberSerializer59.properties();
        java.lang.Class<java.lang.Number> numberClass67 = numberSerializer59.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = numberSerializer57.getSchema(serializerProvider58, (java.lang.reflect.Type) numberClass67, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = intLikeSerializer52.getSchema(serializerProvider56, (java.lang.reflect.Type) numberClass67);
        com.fasterxml.jackson.databind.JsonNode jsonNode71 = doubleSerializer46.getSchema(serializerProvider51, (java.lang.reflect.Type) numberClass67);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer72 = longSerializer30.withFilterId((java.lang.Object) doubleSerializer46);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(numberSerializer14);
        org.junit.Assert.assertNotNull(numberSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertNotNull(numberClass24);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "number" + "'", str31, "number");
        org.junit.Assert.assertTrue("'" + numberType32 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.LONG + "'", numberType32.equals(com.fasterxml.jackson.core.JsonParser.NumberType.LONG));
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(numberSerializer37);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer39);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor44);
        org.junit.Assert.assertNotNull(numberClass45);
        org.junit.Assert.assertNull(wildcardJsonSerializer47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "number" + "'", str48, "number");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "number" + "'", str49, "number");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer52);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertNotNull(numberSerializer57);
        org.junit.Assert.assertNotNull(numberSerializer59);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer61);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor66);
        org.junit.Assert.assertNotNull(numberClass67);
        org.junit.Assert.assertNotNull(jsonNode69);
        org.junit.Assert.assertNotNull(jsonNode70);
        org.junit.Assert.assertNotNull(jsonNode71);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer72);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        boolean boolean7 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer9 = numberSerializer0.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        boolean boolean12 = numberSerializer0.isEmpty(serializerProvider10, (java.lang.Number) 10L);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer14 = numberSerializer0.unwrappingSerializer(nameTransformer13);
        boolean boolean16 = numberSerializer0.isEmpty((java.lang.Number) (byte) 100);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer18 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = shortSerializer18.withFilterId((java.lang.Object) 10.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer22.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer22.withFilterId((java.lang.Object) '#');
        boolean boolean28 = numberSerializer22.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor29 = numberSerializer22.properties();
        java.lang.Class<java.lang.Number> numberClass30 = numberSerializer22.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer31 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer(numberClass30);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = shortSerializer18.getSchema(serializerProvider21, (java.lang.reflect.Type) numberClass30);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer33 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer(numberClass30);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberSerializer0.withFilterId((java.lang.Object) integerSerializer33);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer36 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = numberSerializer36.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer40 = numberSerializer36.withFilterId((java.lang.Object) '#');
        boolean boolean42 = numberSerializer36.isEmpty((java.lang.Number) (-1));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor43 = numberSerializer36.properties();
        java.lang.Class<java.lang.Number> numberClass44 = numberSerializer36.handledType();
        java.lang.Class<java.lang.Number> numberClass45 = numberSerializer36.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = null;
        boolean boolean48 = numberSerializer36.isEmpty(serializerProvider46, (java.lang.Number) (short) 0);
        boolean boolean49 = numberSerializer36.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer50 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer51 = numberSerializer36.unwrappingSerializer(nameTransformer50);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider52 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer53 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider54 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer55 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer57 = numberSerializer55.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer59 = numberSerializer55.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer60 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer61 = numberSerializer55.unwrappingSerializer(nameTransformer60);
        boolean boolean62 = numberSerializer55.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider63 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer64 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider65 = null;
        java.lang.reflect.Type type66 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = intLikeSerializer64.getSchema(serializerProvider65, type66);
        java.lang.String str68 = intLikeSerializer64._schemaType;
        java.lang.Class<java.lang.Object> objClass69 = intLikeSerializer64.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = numberSerializer55.getSchema(serializerProvider63, (java.lang.reflect.Type) objClass69);
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = intLikeSerializer53.getSchema(serializerProvider54, (java.lang.reflect.Type) objClass69, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider73 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer74 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider75 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer76 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer78 = numberSerializer76.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer80 = numberSerializer76.withFilterId((java.lang.Object) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer81 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer82 = numberSerializer76.unwrappingSerializer(nameTransformer81);
        boolean boolean83 = numberSerializer76.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider84 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer85 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider86 = null;
        java.lang.reflect.Type type87 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode88 = intLikeSerializer85.getSchema(serializerProvider86, type87);
        java.lang.String str89 = intLikeSerializer85._schemaType;
        java.lang.Class<java.lang.Object> objClass90 = intLikeSerializer85.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode91 = numberSerializer76.getSchema(serializerProvider84, (java.lang.reflect.Type) objClass90);
        com.fasterxml.jackson.databind.JsonNode jsonNode93 = intLikeSerializer74.getSchema(serializerProvider75, (java.lang.reflect.Type) objClass90, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode95 = intLikeSerializer53.getSchema(serializerProvider73, (java.lang.reflect.Type) objClass90, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode96 = numberSerializer36.getSchema(serializerProvider52, (java.lang.reflect.Type) objClass90);
        com.fasterxml.jackson.databind.JsonNode jsonNode98 = integerSerializer33.getSchema(serializerProvider35, (java.lang.reflect.Type) objClass90, true);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(numberSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor29);
        org.junit.Assert.assertNotNull(numberClass30);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNotNull(numberSerializer36);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer38);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor43);
        org.junit.Assert.assertNotNull(numberClass44);
        org.junit.Assert.assertNotNull(numberClass45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer51);
        org.junit.Assert.assertNotNull(intLikeSerializer53);
        org.junit.Assert.assertNotNull(numberSerializer55);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer57);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer59);
        org.junit.Assert.assertNotNull(numberJsonSerializer61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer64);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "integer" + "'", str68, "integer");
        org.junit.Assert.assertNotNull(objClass69);
        org.junit.Assert.assertNotNull(jsonNode70);
        org.junit.Assert.assertNotNull(jsonNode72);
        org.junit.Assert.assertNotNull(intLikeSerializer74);
        org.junit.Assert.assertNotNull(numberSerializer76);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer78);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer80);
        org.junit.Assert.assertNotNull(numberJsonSerializer82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer85);
        org.junit.Assert.assertNotNull(jsonNode88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "integer" + "'", str89, "integer");
        org.junit.Assert.assertNotNull(objClass90);
        org.junit.Assert.assertNotNull(jsonNode91);
        org.junit.Assert.assertNotNull(jsonNode93);
        org.junit.Assert.assertNotNull(jsonNode95);
        org.junit.Assert.assertNotNull(jsonNode96);
        org.junit.Assert.assertNotNull(jsonNode98);
    }
}

