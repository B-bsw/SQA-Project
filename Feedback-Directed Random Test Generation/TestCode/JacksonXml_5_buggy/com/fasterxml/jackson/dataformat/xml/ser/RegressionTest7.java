package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup0 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup0);
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        java.lang.Object obj3 = null;
        com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter4 = xmlSerializerProvider1.converterInstance(annotated2, obj3);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = xmlSerializerProvider1.getGenerator();
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup6 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup6);
        java.lang.reflect.Type type8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = xmlSerializerProvider7.constructType(type8);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = xmlSerializerProvider7.getDefaultNullKeySerializer();
        xmlSerializerProvider1.setNullKeySerializer(objJsonSerializer10);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup12 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider13 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup12);
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        java.lang.Object obj15 = null;
        com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter16 = xmlSerializerProvider13.converterInstance(annotated14, obj15);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = xmlSerializerProvider13.getGenerator();
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup18 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider19 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup18);
        java.lang.reflect.Type type20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = xmlSerializerProvider19.constructType(type20);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = xmlSerializerProvider19.getDefaultNullKeySerializer();
        xmlSerializerProvider13.setNullKeySerializer(objJsonSerializer22);
        com.fasterxml.jackson.databind.BeanProperty beanProperty24 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = xmlSerializerProvider1.handleSecondaryContextualization(objJsonSerializer22, beanProperty24);
        java.lang.Class<?> wildcardClass26 = xmlSerializerProvider1.getActiveView();
        com.fasterxml.jackson.databind.JavaType javaType27 = null;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper28 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlSerializerProvider1.acceptJsonFormatVisitor(javaType27, jsonFormatVisitorWrapper28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A class must be provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objConverter4);
        org.junit.Assert.assertNull(jsonGenerator5);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNull(objConverter16);
        org.junit.Assert.assertNull(jsonGenerator17);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNull(wildcardClass26);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup0 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup0);
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = xmlSerializerProvider1.findNullKeySerializer(javaType2, beanProperty3);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup6 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup6);
        java.lang.reflect.Type type8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = xmlSerializerProvider7.constructType(type8);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider10 = xmlSerializerProvider7.copy();
        java.lang.Class<?> wildcardClass11 = xmlSerializerProvider7.getSerializationView();
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup12 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider13 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup12);
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        java.lang.Object obj15 = null;
        com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter16 = xmlSerializerProvider13.converterInstance(annotated14, obj15);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = xmlSerializerProvider13.getDefaultNullKeySerializer();
        xmlSerializerProvider7.setNullKeySerializer(objJsonSerializer17);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup19 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider20 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup19);
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        java.lang.Object obj22 = null;
        com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter23 = xmlSerializerProvider20.converterInstance(annotated21, obj22);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = xmlSerializerProvider20.getGenerator();
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup25 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider26 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup25);
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        java.lang.Object obj28 = null;
        com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter29 = xmlSerializerProvider26.converterInstance(annotated27, obj28);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = xmlSerializerProvider26.getGenerator();
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup31 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider32 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup31);
        com.fasterxml.jackson.databind.introspect.Annotated annotated33 = null;
        java.lang.Object obj34 = null;
        com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter35 = xmlSerializerProvider32.converterInstance(annotated33, obj34);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = xmlSerializerProvider32.getGenerator();
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup37 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider38 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup37);
        com.fasterxml.jackson.databind.introspect.Annotated annotated39 = null;
        java.lang.Object obj40 = null;
        com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter41 = xmlSerializerProvider38.converterInstance(annotated39, obj40);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer42 = xmlSerializerProvider38.getDefaultNullKeySerializer();
        xmlSerializerProvider32.setNullKeySerializer(objJsonSerializer42);
        com.fasterxml.jackson.databind.BeanProperty beanProperty44 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = xmlSerializerProvider26.handlePrimaryContextualization(objJsonSerializer42, beanProperty44);
        boolean boolean46 = xmlSerializerProvider20.includeFilterSuppressNulls((java.lang.Object) objJsonSerializer42);
        com.fasterxml.jackson.databind.BeanProperty beanProperty47 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer48 = xmlSerializerProvider7.handlePrimaryContextualization(objJsonSerializer42, beanProperty47);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup50 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider51 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup50);
        java.lang.reflect.Type type52 = null;
        com.fasterxml.jackson.databind.JavaType javaType53 = xmlSerializerProvider51.constructType(type52);
        xmlSerializerProvider51.flushCachedSerializers();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator55 = null;
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup56 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider57 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup56);
        java.lang.reflect.Type type58 = null;
        com.fasterxml.jackson.databind.JavaType javaType59 = xmlSerializerProvider57.constructType(type58);
        xmlSerializerProvider57.flushCachedSerializers();
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup61 = xmlSerializerProvider57._rootNameLookup;
        com.fasterxml.jackson.databind.JavaType javaType62 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException65 = xmlSerializerProvider57.invalidTypeIdException(javaType62, "hi!", "hi!");
        java.io.IOException iOException66 = xmlSerializerProvider51._wrapAsIOE(jsonGenerator55, (java.lang.Exception) jsonMappingException65);
        java.lang.Object[] objArray67 = new java.lang.Object[] { xmlSerializerProvider51 };
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException68 = xmlSerializerProvider7.mappingException("", objArray67);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException69 = xmlSerializerProvider1.mappingException("hi!", objArray67);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup70 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider71 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup70);
        java.lang.reflect.Type type72 = null;
        com.fasterxml.jackson.databind.JavaType javaType73 = xmlSerializerProvider71.constructType(type72);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup74 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider75 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup74);
        com.fasterxml.jackson.databind.introspect.Annotated annotated76 = null;
        java.lang.Object obj77 = null;
        com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter78 = xmlSerializerProvider75.converterInstance(annotated76, obj77);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer79 = xmlSerializerProvider75.getDefaultNullKeySerializer();
        xmlSerializerProvider71.setDefaultKeySerializer(objJsonSerializer79);
        xmlSerializerProvider1.setNullValueSerializer(objJsonSerializer79);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider82 = xmlSerializerProvider1.copy();
        com.fasterxml.jackson.databind.JavaType javaType83 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty84 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer85 = defaultSerializerProvider82.findPrimaryPropertySerializer(javaType83, beanProperty84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(defaultSerializerProvider10);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(objConverter16);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNull(objConverter23);
        org.junit.Assert.assertNull(jsonGenerator24);
        org.junit.Assert.assertNull(objConverter29);
        org.junit.Assert.assertNull(jsonGenerator30);
        org.junit.Assert.assertNull(objConverter35);
        org.junit.Assert.assertNull(jsonGenerator36);
        org.junit.Assert.assertNull(objConverter41);
        org.junit.Assert.assertNotNull(objJsonSerializer42);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer48);
        org.junit.Assert.assertNull(javaType53);
        org.junit.Assert.assertNull(javaType59);
        org.junit.Assert.assertNull(xmlRootNameLookup61);
        org.junit.Assert.assertNotNull(jsonMappingException65);
        org.junit.Assert.assertNotNull(iOException66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(jsonMappingException68);
        org.junit.Assert.assertNotNull(jsonMappingException69);
        org.junit.Assert.assertNull(javaType73);
        org.junit.Assert.assertNull(objConverter78);
        org.junit.Assert.assertNotNull(objJsonSerializer79);
        org.junit.Assert.assertNotNull(defaultSerializerProvider82);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup0 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup0);
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        java.lang.Object obj3 = null;
        com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter4 = xmlSerializerProvider1.converterInstance(annotated2, obj3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = xmlSerializerProvider1.findNullKeySerializer(javaType5, beanProperty6);
        int int8 = xmlSerializerProvider1.cachedSerializersCount();
        int int9 = xmlSerializerProvider1.cachedSerializersCount();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = xmlSerializerProvider1.findNullKeySerializer(javaType10, beanProperty11);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = xmlSerializerProvider1.getDefaultNullKeySerializer();
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider14 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlSerializerProvider1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = xmlSerializerProvider1.hasSerializationFeatures((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objConverter4);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
    }
}

