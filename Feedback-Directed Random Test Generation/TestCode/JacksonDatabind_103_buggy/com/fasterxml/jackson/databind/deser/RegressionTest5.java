package com.fasterxml.jackson.databind.deser;

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
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        boolean boolean6 = impl0.includeFilterSuppressNulls((java.lang.Object) true);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl0.copy();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = impl0.findPrimaryPropertySerializer(javaType8, beanProperty9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = impl0.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl4);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = impl4.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = impl4.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = impl0.handleSecondaryContextualization(objJsonSerializer7, beanProperty8);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = impl0.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider11 = impl0.copy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone12 = impl0.getTimeZone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(defaultSerializerProvider6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNotNull(defaultSerializerProvider11);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = impl0.getConfig();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl5.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl5.findNullValueSerializer(beanProperty8);
        boolean boolean11 = impl5.includeFilterSuppressNulls((java.lang.Object) true);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider12 = impl5.copy();
        java.lang.Class<?> wildcardClass13 = impl5.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl14);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider16 = impl14.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = impl14.findNullValueSerializer(beanProperty17);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl19);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider21 = impl19.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = impl19.findNullValueSerializer(beanProperty22);
        com.fasterxml.jackson.databind.BeanProperty beanProperty24 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = impl14.handleSecondaryContextualization(objJsonSerializer23, beanProperty24);
        impl5.setNullKeySerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer25);
        impl0.setDefaultKeySerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer25);
        com.fasterxml.jackson.databind.JavaType javaType28 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = impl0.findValueSerializer(javaType28, beanProperty29);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Null passed for `valueType` of `findValueSerializer()`");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(serializationConfig1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(serializationConfig4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(defaultSerializerProvider12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(defaultSerializerProvider16);
        org.junit.Assert.assertNotNull(objJsonSerializer18);
        org.junit.Assert.assertNotNull(defaultSerializerProvider21);
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = impl0.invalidTypeIdException(javaType2, "hi!", "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        impl0.setNullKeySerializer(objJsonSerializer7);
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = objJsonDeserializer12.getObjectIdReader();
        java.lang.Object obj14 = objJsonDeserializer12.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty16 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty9, annotatedMember10, javaType11, objJsonDeserializer12, typeDeserializer15);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException19 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser17, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        jsonMappingException19.prependPath((java.lang.Object) objJsonDeserializer20, "[null]");
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern23 = objJsonDeserializer20.getEmptyAccessPattern();
        settableAnyProperty16._valueDeserializer = objJsonDeserializer20;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext25 = null;
        java.lang.Object obj26 = objJsonDeserializer20.getEmptyValue(deserializationContext25);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            impl0.defaultSerializeValue(obj26, jsonGenerator27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(jsonMappingException19);
        org.junit.Assert.assertNotNull(objJsonDeserializer20);
        org.junit.Assert.assertTrue("'" + accessPattern23 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern23.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = stdValueInstantiator2.getDelegateType(deserializationConfig7);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = impl0.invalidTypeIdException(javaType2, "hi!", "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        java.lang.Class<?> wildcardClass7 = impl6.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider8 = impl6.copy();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig9, javaType10);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = stdValueInstantiator11.getWithArgsCreator();
        boolean boolean13 = stdValueInstantiator11.canCreateUsingDelegate();
        java.lang.Class<?> wildcardClass14 = stdValueInstantiator11.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator19 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig17, javaType18);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams20 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty23 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray24 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty23 };
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams25 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray26 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator19.configureFromObjectSettings(annotatedWithParams20, annotatedWithParams21, javaType22, settableBeanPropertyArray24, annotatedWithParams25, settableBeanPropertyArray26);
        stdValueInstantiator11.configureFromArraySettings(annotatedWithParams15, javaType16, settableBeanPropertyArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = defaultSerializerProvider8.getAttribute((java.lang.Object) annotatedWithParams15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(defaultSerializerProvider8);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray24);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray24, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray26);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray26, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "[null]");
        java.lang.Throwable throwable3 = com.fasterxml.jackson.databind.util.ClassUtil.getRootCause((java.lang.Throwable) jsonMappingException2);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig4 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription7 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder8 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray9 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList10 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList10, beanPropertyDefinitionArray9);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList18 = beanDeserializerFactory5.filterBeanProps(deserializationContext6, beanDescription7, beanDeserializerBuilder8, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList10, (java.util.Set<java.lang.String>) strSet16);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException20 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) beanPropertyDefinitionList10, 1);
        java.util.List<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList21 = jsonMappingException2.getPath();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException24 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser22, "");
        java.lang.StringBuilder stringBuilder25 = null;
        java.lang.StringBuilder stringBuilder26 = jsonMappingException24.getPathReference(stringBuilder25);
        java.lang.StringBuilder stringBuilder27 = null;
        java.lang.StringBuilder stringBuilder28 = jsonMappingException24.getPathReference(stringBuilder27);
        java.io.Serializable serializable29 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull((java.io.Serializable) jsonMappingException2, (java.io.Serializable) stringBuilder28);
        com.fasterxml.jackson.databind.BeanProperty beanProperty30 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember31 = null;
        com.fasterxml.jackson.databind.JavaType javaType32 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty33 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember34 = null;
        com.fasterxml.jackson.databind.JavaType javaType35 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader37 = objJsonDeserializer36.getObjectIdReader();
        java.lang.Object obj38 = objJsonDeserializer36.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer39 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty40 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty33, annotatedMember34, javaType35, objJsonDeserializer36, typeDeserializer39);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer41 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty42 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty30, annotatedMember31, javaType32, objJsonDeserializer36, typeDeserializer41);
        boolean boolean43 = settableAnyProperty42._setterIsField;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer44 = settableAnyProperty42._valueDeserializer;
        com.fasterxml.jackson.databind.BeanProperty beanProperty45 = settableAnyProperty42._property;
        com.fasterxml.jackson.databind.JavaType javaType46 = settableAnyProperty42.getType();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException48 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) javaType46, "java.lang.Long[?]");
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNotNull(throwable3);
        org.junit.Assert.assertEquals(throwable3.getLocalizedMessage(), "[null] (through reference chain: UNKNOWN[\"java.lang.Long[?]\"]->java.util.ArrayList[1])");
        org.junit.Assert.assertEquals(throwable3.getMessage(), "[null] (through reference chain: UNKNOWN[\"java.lang.Long[?]\"]->java.util.ArrayList[1])");
        org.junit.Assert.assertEquals(throwable3.toString(), "com.fasterxml.jackson.databind.JsonMappingException: [null] (through reference chain: UNKNOWN[\"java.lang.Long[?]\"]->java.util.ArrayList[1])");
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray9);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray9, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList18);
        org.junit.Assert.assertNotNull(jsonMappingException20);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertNotNull(jsonMappingException24);
        org.junit.Assert.assertNull(stringBuilder26);
        org.junit.Assert.assertNull(stringBuilder28);
        org.junit.Assert.assertNotNull(serializable29);
        org.junit.Assert.assertNotNull(objJsonDeserializer36);
        org.junit.Assert.assertNull(objectIdReader37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer44);
        org.junit.Assert.assertNull(beanProperty45);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNotNull(jsonMappingException48);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.type.ArrayType arrayType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objJsonDeserializer8.getObjectIdReader();
        java.lang.Object obj10 = objJsonDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty5, annotatedMember6, javaType7, objJsonDeserializer8, typeDeserializer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = objJsonDeserializer8.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = objJsonDeserializer14.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = objJsonDeserializer14.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = beanDeserializerFactory0._findCustomArrayDeserializer(arrayType1, deserializationConfig2, beanDescription3, typeDeserializer4, objJsonDeserializer14);
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory20 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig21 = beanDeserializerFactory20.getFactoryConfig();
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig21);
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory23 = beanDeserializerFactory0.withConfig(deserializerFactoryConfig21);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer26 = beanDeserializerFactory0.findTypeDeserializer(deserializationConfig24, javaType25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objJsonDeserializer18);
        org.junit.Assert.assertNull(wildcardJsonDeserializer19);
        org.junit.Assert.assertNotNull(beanDeserializerFactory20);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig21);
        org.junit.Assert.assertNotNull(deserializerFactory23);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = defaultSerializerProvider2.invalidTypeIdException(javaType3, "UNKNOWN[?]", "`[null]`");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultSerializerProvider2.defaultSerializeDateValue((long) 0, jsonGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(jsonMappingException6);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        java.io.Closeable closeable4 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = new com.fasterxml.jackson.databind.JsonMappingException(closeable4, "hi!", jsonLocation6);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = new com.fasterxml.jackson.databind.JsonMappingException("hi!", (java.lang.Throwable) jsonMappingException7);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "[null]", (java.lang.Throwable) jsonMappingException7);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "java.lang.Short[?]");
        java.lang.Class<?> wildcardClass12 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = impl0.findTypeSerializer(javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException9);
        org.junit.Assert.assertNotNull(jsonMappingException11);
        org.junit.Assert.assertNull(wildcardClass12);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objJsonDeserializer6.getObjectIdReader();
        java.lang.Object obj8 = objJsonDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty10 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty3, annotatedMember4, javaType5, objJsonDeserializer6, typeDeserializer9);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer6, typeDeserializer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = objJsonDeserializer6.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern15 = objJsonDeserializer6.getEmptyAccessPattern();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = objJsonDeserializer6.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern18 = objJsonDeserializer6.getEmptyAccessPattern();
        java.lang.String str19 = com.fasterxml.jackson.databind.util.ClassUtil.classNameOf((java.lang.Object) accessPattern18);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertTrue("'" + accessPattern15 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern15.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNotNull(objJsonDeserializer17);
        org.junit.Assert.assertTrue("'" + accessPattern18 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern18.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "`com.fasterxml.jackson.databind.util.AccessPattern`" + "'", str19, "`com.fasterxml.jackson.databind.util.AccessPattern`");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator0, "com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: com.fasterxml.jackson.databind.JsonMappingException[100])");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory3 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig4 = beanDeserializerFactory3.getFactoryConfig();
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig4);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) beanDeserializerFactory5, 8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = beanDeserializerFactory5.mapAbstractType(deserializationConfig8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNotNull(beanDeserializerFactory3);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig4);
        org.junit.Assert.assertNotNull(jsonMappingException7);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl5.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl5.findNullValueSerializer(beanProperty8);
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = impl0.handleSecondaryContextualization(objJsonSerializer9, beanProperty10);
        int int12 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl13.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl13.findNullValueSerializer(beanProperty16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl18.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = impl18.findNullValueSerializer(beanProperty21);
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = impl13.handleSecondaryContextualization(objJsonSerializer22, beanProperty23);
        impl0.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer24);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = impl26.getGenerator();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer28 = impl26.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.BeanProperty beanProperty29 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = impl26.findNullValueSerializer(beanProperty29);
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = impl26.findValueSerializer(javaType31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNull(jsonGenerator27);
        org.junit.Assert.assertNotNull(objJsonSerializer28);
        org.junit.Assert.assertNotNull(objJsonSerializer30);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException1 = new com.fasterxml.jackson.databind.JsonMappingException("com.fasterxml.jackson.databind.JsonMappingException: `java.util.LinkedHashSet`");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.type.ArrayType arrayType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objJsonDeserializer8.getObjectIdReader();
        java.lang.Object obj10 = objJsonDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty5, annotatedMember6, javaType7, objJsonDeserializer8, typeDeserializer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = objJsonDeserializer8.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = objJsonDeserializer14.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = objJsonDeserializer14.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = beanDeserializerFactory0._findCustomArrayDeserializer(arrayType1, deserializationConfig2, beanDescription3, typeDeserializer4, objJsonDeserializer14);
        com.fasterxml.jackson.databind.type.ArrayType arrayType20 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig21 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription22 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer23 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty24 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty27 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader31 = objJsonDeserializer30.getObjectIdReader();
        java.lang.Object obj32 = objJsonDeserializer30.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty34 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty27, annotatedMember28, javaType29, objJsonDeserializer30, typeDeserializer33);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer35 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = objJsonDeserializer30.unwrappingDeserializer(nameTransformer35);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty38 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty24, annotatedMember25, javaType26, objJsonDeserializer36, typeDeserializer37);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer39 = beanDeserializerFactory0._findCustomArrayDeserializer(arrayType20, deserializationConfig21, beanDescription22, typeDeserializer23, objJsonDeserializer36);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig40 = beanDeserializerFactory0.getFactoryConfig();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext41 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription42 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder43 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanDeserializerFactory0.addInjectables(deserializationContext41, beanDescription42, beanDeserializerBuilder43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objJsonDeserializer18);
        org.junit.Assert.assertNull(wildcardJsonDeserializer19);
        org.junit.Assert.assertNotNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(objectIdReader31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objJsonDeserializer36);
        org.junit.Assert.assertNull(wildcardJsonDeserializer39);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig40);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) objJsonDeserializer3, (int) '#');
        java.lang.Object obj7 = objJsonDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = objJsonDeserializer3.getEmptyValue(deserializationContext8);
        boolean boolean10 = objJsonDeserializer3.isCachable();
        java.util.Collection<java.lang.Object> objCollection11 = objJsonDeserializer3.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern12 = objJsonDeserializer3.getEmptyAccessPattern();
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(jsonMappingException6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertTrue("'" + accessPattern12 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern12.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = impl0.invalidTypeIdException(javaType2, "hi!", "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = impl0.copy();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl0.findNullKeySerializer(javaType7, beanProperty8);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl10);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider12 = impl10.copy();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig14 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig14);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig16 = beanDeserializerFactory15.getFactoryConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl10.serializerInstance(annotated13, (java.lang.Object) deserializerFactoryConfig16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl18.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = impl18.findNullValueSerializer(beanProperty21);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl23);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider25 = impl23.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty26 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer27 = impl23.findNullValueSerializer(beanProperty26);
        com.fasterxml.jackson.databind.BeanProperty beanProperty28 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = impl18.handleSecondaryContextualization(objJsonSerializer27, beanProperty28);
        com.fasterxml.jackson.databind.BeanProperty beanProperty30 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = impl10.handlePrimaryContextualization(objJsonSerializer27, beanProperty30);
        impl0.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer31);
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty34 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer35 = impl0.findNullKeySerializer(javaType33, beanProperty34);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl36 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl37 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl36);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider38 = impl36.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty39 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer40 = impl36.findNullValueSerializer(beanProperty39);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl41 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl42 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl41);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider43 = impl41.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty44 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer45 = impl41.findNullValueSerializer(beanProperty44);
        com.fasterxml.jackson.databind.BeanProperty beanProperty46 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = impl36.handleSecondaryContextualization(objJsonSerializer45, beanProperty46);
        int int48 = impl36.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl49 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl50 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl49);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider51 = impl49.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty52 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer53 = impl49.findNullValueSerializer(beanProperty52);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl54 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl55 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl54);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider56 = impl54.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty57 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer58 = impl54.findNullValueSerializer(beanProperty57);
        com.fasterxml.jackson.databind.BeanProperty beanProperty59 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer60 = impl49.handleSecondaryContextualization(objJsonSerializer58, beanProperty59);
        impl36.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer60);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl62 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl36);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator63 = impl62.getGenerator();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer64 = impl62.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl65 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl66 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl65);
        com.fasterxml.jackson.databind.JavaType javaType67 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException70 = impl65.invalidTypeIdException(javaType67, "hi!", "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl71 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl65);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer72 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        impl65.setNullKeySerializer(objJsonSerializer72);
        com.fasterxml.jackson.databind.BeanProperty beanProperty74 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer75 = impl62.handlePrimaryContextualization(objJsonSerializer72, beanProperty74);
        com.fasterxml.jackson.databind.BeanProperty beanProperty76 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer77 = impl0.handleSecondaryContextualization(objJsonSerializer72, beanProperty76);
        org.junit.Assert.assertNotNull(jsonMappingException5);
        org.junit.Assert.assertNotNull(defaultSerializerProvider6);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(defaultSerializerProvider12);
        org.junit.Assert.assertNull(deserializerFactoryConfig16);
        org.junit.Assert.assertNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(defaultSerializerProvider25);
        org.junit.Assert.assertNotNull(objJsonSerializer27);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer29);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer31);
        org.junit.Assert.assertNotNull(objJsonSerializer35);
        org.junit.Assert.assertNotNull(defaultSerializerProvider38);
        org.junit.Assert.assertNotNull(objJsonSerializer40);
        org.junit.Assert.assertNotNull(defaultSerializerProvider43);
        org.junit.Assert.assertNotNull(objJsonSerializer45);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider51);
        org.junit.Assert.assertNotNull(objJsonSerializer53);
        org.junit.Assert.assertNotNull(defaultSerializerProvider56);
        org.junit.Assert.assertNotNull(objJsonSerializer58);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer60);
        org.junit.Assert.assertNull(jsonGenerator63);
        org.junit.Assert.assertNotNull(objJsonSerializer64);
        org.junit.Assert.assertNotNull(jsonMappingException70);
        org.junit.Assert.assertNotNull(objJsonSerializer72);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer75);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer77);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getDelegateType(deserializationConfig3);
        boolean boolean5 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        boolean boolean6 = stdValueInstantiator2.canCreateUsingDelegate();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl5.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl5.findNullValueSerializer(beanProperty8);
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = impl0.handleSecondaryContextualization(objJsonSerializer9, beanProperty10);
        int int12 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl13.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl13.findNullValueSerializer(beanProperty16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl18.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = impl18.findNullValueSerializer(beanProperty21);
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = impl13.handleSecondaryContextualization(objJsonSerializer22, beanProperty23);
        impl0.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer24);
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer28 = impl0.findNullKeySerializer(javaType26, beanProperty27);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig29 = impl0.getConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = impl0.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer31 = impl0.getDefaultNullKeySerializer();
        java.lang.Class<?> wildcardClass32 = impl0.getActiveView();
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(objJsonSerializer28);
        org.junit.Assert.assertNull(serializationConfig29);
        org.junit.Assert.assertNotNull(objJsonSerializer30);
        org.junit.Assert.assertNotNull(objJsonSerializer31);
        org.junit.Assert.assertNull(wildcardClass32);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider3 = impl0.copy();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser5, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objJsonDeserializer8.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException7, (java.lang.Object) objJsonDeserializer8, (int) '#');
        java.lang.Object obj12 = objJsonDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Object obj14 = objJsonDeserializer8.getEmptyValue(deserializationContext13);
        boolean boolean15 = objJsonDeserializer8.isCachable();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern16 = objJsonDeserializer8.getEmptyAccessPattern();
        java.lang.Class<? extends java.lang.Enum<?>> wildcardClass17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType((java.lang.Enum<com.fasterxml.jackson.databind.util.AccessPattern>) accessPattern16);
        // The following exception was thrown during execution in test generation
        try {
            impl0.serializeValue(jsonGenerator4, (java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(serializationConfig1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(defaultSerializerProvider3);
        org.junit.Assert.assertNotNull(jsonMappingException7);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(jsonMappingException11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + accessPattern16 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern16.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objJsonDeserializer6.getObjectIdReader();
        java.lang.Object obj8 = objJsonDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty10 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty3, annotatedMember4, javaType5, objJsonDeserializer6, typeDeserializer9);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer6, typeDeserializer11);
        boolean boolean13 = settableAnyProperty12._setterIsField;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = settableAnyProperty12._setter;
        com.fasterxml.jackson.databind.JavaType javaType15 = settableAnyProperty12.getType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember16 = settableAnyProperty12._setter;
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(annotatedMember14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(annotatedMember16);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl1.findNullKeySerializer(javaType2, beanProperty3);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider5 = impl1.copy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = defaultSerializerProvider5.canOverrideAccessModifiers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider5);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = impl0.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl4);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = impl4.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = impl4.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = impl0.handleSecondaryContextualization(objJsonSerializer7, beanProperty8);
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty13 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = objJsonDeserializer16.getObjectIdReader();
        java.lang.Object obj18 = objJsonDeserializer16.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty20 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty13, annotatedMember14, javaType15, objJsonDeserializer16, typeDeserializer19);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty22 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty10, annotatedMember11, javaType12, objJsonDeserializer16, typeDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty24 = settableAnyProperty22.withValueDeserializer(objJsonDeserializer23);
        boolean boolean25 = impl0.includeFilterSuppressNulls((java.lang.Object) settableAnyProperty22);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider26 = impl0.copy();
        com.fasterxml.jackson.databind.JavaType javaType27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser30 = null;
        java.io.Closeable closeable32 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser34 = null;
        java.io.Closeable closeable36 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation38 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException39 = new com.fasterxml.jackson.databind.JsonMappingException(closeable36, "hi!", jsonLocation38);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException40 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser34, "hi!", (java.lang.Throwable) jsonMappingException39);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException41 = new com.fasterxml.jackson.databind.JsonMappingException(closeable32, "", (java.lang.Throwable) jsonMappingException39);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException42 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser30, "", (java.lang.Throwable) jsonMappingException41);
        java.lang.String str43 = jsonMappingException42.getPathReference();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException44 = new com.fasterxml.jackson.databind.JsonMappingException("``java.lang.Double``", (java.lang.Throwable) jsonMappingException42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Throwable throwable45 = impl0.reportBadDefinition(javaType27, "```com.fasterxml.jackson.databind.JsonMappingException```", (java.lang.Throwable) jsonMappingException44);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.InvalidDefinitionException; message: ```com.fasterxml.jackson.databind.JsonMappingException```");
        } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(defaultSerializerProvider6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objectIdReader17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(settableAnyProperty24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(defaultSerializerProvider26);
        org.junit.Assert.assertNotNull(jsonMappingException40);
        org.junit.Assert.assertNotNull(jsonMappingException42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator9 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig7, javaType8);
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator10 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(stdValueInstantiator2, stdValueInstantiator9);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = stdValueInstantiator10.getDelegateType(deserializationConfig11);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray14 = stdValueInstantiator10.getFromObjectArguments(deserializationConfig13);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = null;
        stdValueInstantiator10.configureFromIntCreator(annotatedWithParams15);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator20 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig18, javaType19);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = stdValueInstantiator20.getArrayDelegateType(deserializationConfig21);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams23 = stdValueInstantiator20.getDefaultCreator();
        boolean boolean24 = stdValueInstantiator20.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams25 = null;
        stdValueInstantiator20.configureFromDoubleCreator(annotatedWithParams25);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams27 = stdValueInstantiator20.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams28 = null;
        stdValueInstantiator20.configureFromLongCreator(annotatedWithParams28);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams30 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams31 = null;
        com.fasterxml.jackson.databind.JavaType javaType32 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig33 = null;
        com.fasterxml.jackson.databind.JavaType javaType34 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator35 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig33, javaType34);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig36 = null;
        com.fasterxml.jackson.databind.JavaType javaType37 = stdValueInstantiator35.getArrayDelegateType(deserializationConfig36);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams38 = stdValueInstantiator35.getDefaultCreator();
        boolean boolean39 = stdValueInstantiator35.canCreateFromString();
        java.lang.String str40 = stdValueInstantiator35.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams41 = null;
        com.fasterxml.jackson.databind.JavaType javaType42 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig43 = null;
        com.fasterxml.jackson.databind.JavaType javaType44 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator45 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig43, javaType44);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams46 = stdValueInstantiator45.getWithArgsCreator();
        boolean boolean47 = stdValueInstantiator45.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams48 = null;
        com.fasterxml.jackson.databind.JavaType javaType49 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray50 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator45.configureFromArraySettings(annotatedWithParams48, javaType49, settableBeanPropertyArray50);
        stdValueInstantiator35.configureFromArraySettings(annotatedWithParams41, javaType42, settableBeanPropertyArray50);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams53 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig54 = null;
        com.fasterxml.jackson.databind.JavaType javaType55 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator56 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig54, javaType55);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams57 = stdValueInstantiator56.getWithArgsCreator();
        boolean boolean58 = stdValueInstantiator56.canCreateUsingDelegate();
        java.lang.Class<?> wildcardClass59 = stdValueInstantiator56.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams60 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams61 = null;
        com.fasterxml.jackson.databind.JavaType javaType62 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig63 = null;
        com.fasterxml.jackson.databind.JavaType javaType64 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator65 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig63, javaType64);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams66 = stdValueInstantiator65.getWithArgsCreator();
        boolean boolean67 = stdValueInstantiator65.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams68 = null;
        com.fasterxml.jackson.databind.JavaType javaType69 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray70 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator65.configureFromArraySettings(annotatedWithParams68, javaType69, settableBeanPropertyArray70);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams72 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig73 = null;
        com.fasterxml.jackson.databind.JavaType javaType74 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator75 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig73, javaType74);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams76 = stdValueInstantiator75.getWithArgsCreator();
        boolean boolean77 = stdValueInstantiator75.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams78 = null;
        com.fasterxml.jackson.databind.JavaType javaType79 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray80 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator75.configureFromArraySettings(annotatedWithParams78, javaType79, settableBeanPropertyArray80);
        stdValueInstantiator56.configureFromObjectSettings(annotatedWithParams60, annotatedWithParams61, javaType62, settableBeanPropertyArray70, annotatedWithParams72, settableBeanPropertyArray80);
        stdValueInstantiator20.configureFromObjectSettings(annotatedWithParams30, annotatedWithParams31, javaType32, settableBeanPropertyArray50, annotatedWithParams53, settableBeanPropertyArray70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj84 = stdValueInstantiator10.createFromObjectWith(deserializationContext17, (java.lang.Object[]) settableBeanPropertyArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stdValueInstantiator10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(settableBeanPropertyArray14);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(annotatedWithParams23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(annotatedWithParams27);
        org.junit.Assert.assertNull(javaType37);
        org.junit.Assert.assertNull(annotatedWithParams38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UNKNOWN TYPE" + "'", str40, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray50);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray50, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNull(annotatedWithParams57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNull(annotatedWithParams66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray70);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray70, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNull(annotatedWithParams76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray80);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray80, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        java.lang.Object obj5 = objJsonDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty7 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer3, typeDeserializer6);
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = settableAnyProperty7.getProperty();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = settableAnyProperty7._valueTypeDeserializer;
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = settableAnyProperty7._property;
        com.fasterxml.jackson.databind.JavaType javaType11 = settableAnyProperty7.getType();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = objJsonDeserializer18.getObjectIdReader();
        java.lang.Object obj20 = objJsonDeserializer18.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty22 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty15, annotatedMember16, javaType17, objJsonDeserializer18, typeDeserializer21);
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = settableAnyProperty22.getProperty();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = settableAnyProperty22._valueTypeDeserializer;
        com.fasterxml.jackson.databind.BeanProperty beanProperty25 = settableAnyProperty22._property;
        com.fasterxml.jackson.databind.BeanProperty beanProperty26 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader30 = objJsonDeserializer29.getObjectIdReader();
        java.lang.Object obj31 = objJsonDeserializer29.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty33 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty26, annotatedMember27, javaType28, objJsonDeserializer29, typeDeserializer32);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException36 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser34, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer37 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        jsonMappingException36.prependPath((java.lang.Object) objJsonDeserializer37, "[null]");
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern40 = objJsonDeserializer37.getEmptyAccessPattern();
        settableAnyProperty33._valueDeserializer = objJsonDeserializer37;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer42 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer43 = objJsonDeserializer37.unwrappingDeserializer(nameTransformer42);
        settableAnyProperty22._valueDeserializer = objJsonDeserializer37;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty46 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty12, annotatedMember13, javaType14, objJsonDeserializer37, typeDeserializer45);
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty47 = settableAnyProperty7.withValueDeserializer(objJsonDeserializer37);
        com.fasterxml.jackson.databind.BeanProperty beanProperty48 = settableAnyProperty7._property;
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(beanProperty8);
        org.junit.Assert.assertNull(typeDeserializer9);
        org.junit.Assert.assertNull(beanProperty10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(objJsonDeserializer18);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(beanProperty23);
        org.junit.Assert.assertNull(typeDeserializer24);
        org.junit.Assert.assertNull(beanProperty25);
        org.junit.Assert.assertNotNull(objJsonDeserializer29);
        org.junit.Assert.assertNull(objectIdReader30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(jsonMappingException36);
        org.junit.Assert.assertNotNull(objJsonDeserializer37);
        org.junit.Assert.assertTrue("'" + accessPattern40 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern40.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNotNull(objJsonDeserializer43);
        org.junit.Assert.assertNotNull(settableAnyProperty47);
        org.junit.Assert.assertNull(beanProperty48);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription2 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder3 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig4 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription7 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder8 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray9 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList10 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList10, beanPropertyDefinitionArray9);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList18 = beanDeserializerFactory5.filterBeanProps(deserializationContext6, beanDescription7, beanDeserializerBuilder8, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList10, (java.util.Set<java.lang.String>) strSet16);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig19 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig19);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription22 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder23 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig24 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig24);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig26 = beanDeserializerFactory25.getFactoryConfig();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext27 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription28 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder29 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig30 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig30);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext32 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription33 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder34 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray35 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList36 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList36, beanPropertyDefinitionArray35);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList44 = beanDeserializerFactory31.filterBeanProps(deserializationContext32, beanDescription33, beanDeserializerBuilder34, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList36, (java.util.Set<java.lang.String>) strSet42);
        java.lang.String[] strArray47 = new java.lang.String[] { "```com.fasterxml.jackson.databind.JsonMappingException```", "" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList50 = beanDeserializerFactory25.filterBeanProps(deserializationContext27, beanDescription28, beanDeserializerBuilder29, beanPropertyDefinitionList44, (java.util.Set<java.lang.String>) strSet48);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "`UNKNOWN TYPE`", "``com.fasterxml.jackson.databind.JsonMappingException``", "``com.fasterxml.jackson.databind.JsonMappingException``", "UNKNOWN TYPE", "hi!", "[null]" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList61 = beanDeserializerFactory20.filterBeanProps(deserializationContext21, beanDescription22, beanDeserializerBuilder23, beanPropertyDefinitionList50, (java.util.Set<java.lang.String>) strSet59);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig62 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory63 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig62);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig64 = beanDeserializerFactory63.getFactoryConfig();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext65 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription66 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder67 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig68 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory69 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig68);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext70 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription71 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder72 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray73 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList74 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList74, beanPropertyDefinitionArray73);
        java.lang.String[] strArray79 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList82 = beanDeserializerFactory69.filterBeanProps(deserializationContext70, beanDescription71, beanDeserializerBuilder72, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList74, (java.util.Set<java.lang.String>) strSet80);
        java.lang.String[] strArray85 = new java.lang.String[] { "```com.fasterxml.jackson.databind.JsonMappingException```", "" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList88 = beanDeserializerFactory63.filterBeanProps(deserializationContext65, beanDescription66, beanDeserializerBuilder67, beanPropertyDefinitionList82, (java.util.Set<java.lang.String>) strSet86);
        java.util.Set<java.lang.String> strSet89 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull((java.util.Set<java.lang.String>) strSet59, (java.util.Set<java.lang.String>) strSet86);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList90 = beanDeserializerFactory0.filterBeanProps(deserializationContext1, beanDescription2, beanDeserializerBuilder3, beanPropertyDefinitionList18, strSet89);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext91 = null;
        com.fasterxml.jackson.databind.JavaType javaType92 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription93 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer94 = beanDeserializerFactory0.buildBeanDeserializer(deserializationContext91, javaType92, beanDescription93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray9);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray9, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList18);
        org.junit.Assert.assertNull(deserializerFactoryConfig26);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray35);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray35, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "```com.fasterxml.jackson.databind.JsonMappingException```", "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList50);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "`UNKNOWN TYPE`", "``com.fasterxml.jackson.databind.JsonMappingException``", "``com.fasterxml.jackson.databind.JsonMappingException``", "UNKNOWN TYPE", "hi!", "[null]" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList61);
        org.junit.Assert.assertNull(deserializerFactoryConfig64);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray73);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray73, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList82);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "```com.fasterxml.jackson.databind.JsonMappingException```", "" });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList88);
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList90);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        boolean boolean7 = stdValueInstantiator2.canCreateFromObjectWith();
        java.lang.String str8 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean10 = stdValueInstantiator2.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = stdValueInstantiator2.getDefaultCreator();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UNKNOWN TYPE" + "'", str8, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig2);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod6 = beanDeserializerFactory1._findJsonValueFor(deserializationConfig4, javaType5);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig7);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig9 = beanDeserializerFactory1.getFactoryConfig();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanDeserializerFactory1._reportUnwrappedCreatorProperty(deserializationContext10, beanDescription11, annotatedParameter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deserializerFactory3);
        org.junit.Assert.assertNull(annotatedMethod6);
        org.junit.Assert.assertNotNull(deserializerFactory8);
        org.junit.Assert.assertNull(deserializerFactoryConfig9);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator0, "hi!");
        java.lang.Object obj3 = null;
        jsonMappingException2.prependPath(obj3, "hi!");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference7 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(obj3, "```com.fasterxml.jackson.databind.JsonMappingException```");
        java.lang.String str8 = reference7.toString();
        java.lang.Object obj9 = reference7.getFrom();
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UNKNOWN[\"```com.fasterxml.jackson.databind.JsonMappingException```\"]" + "'", str8, "UNKNOWN[\"```com.fasterxml.jackson.databind.JsonMappingException```\"]");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig1 = beanDeserializerFactory0.getFactoryConfig();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.type.ReferenceType referenceType3 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = beanDeserializerFactory0.createReferenceDeserializer(deserializationContext2, referenceType3, beanDescription4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig1);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig2);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference5 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) beanDeserializerFactory1, "java.lang.Short[?]");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        java.io.Closeable closeable8 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation10 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = new com.fasterxml.jackson.databind.JsonMappingException(closeable8, "`com.fasterxml.jackson.databind.JsonMappingException`", jsonLocation10);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException12 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE((java.io.IOException) jsonMappingException11);
        java.lang.StringBuilder stringBuilder13 = null;
        java.lang.StringBuilder stringBuilder14 = jsonMappingException12.getPathReference(stringBuilder13);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator15 = beanDeserializerFactory1._valueInstantiatorInstance(deserializationConfig6, annotated7, (java.lang.Object) stringBuilder13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.type.CollectionType collectionType17 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = beanDeserializerFactory1.createCollectionDeserializer(deserializationContext16, collectionType17, beanDescription18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deserializerFactory3);
        org.junit.Assert.assertNotNull(jsonMappingException12);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNull(valueInstantiator15);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        java.lang.Object obj5 = objJsonDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty7 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer3, typeDeserializer6);
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = settableAnyProperty7.getProperty();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = settableAnyProperty7._valueTypeDeserializer;
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = settableAnyProperty7._property;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = objJsonDeserializer14.getObjectIdReader();
        java.lang.Object obj16 = objJsonDeserializer14.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty18 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty11, annotatedMember12, javaType13, objJsonDeserializer14, typeDeserializer17);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException21 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser19, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        jsonMappingException21.prependPath((java.lang.Object) objJsonDeserializer22, "[null]");
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern25 = objJsonDeserializer22.getEmptyAccessPattern();
        settableAnyProperty18._valueDeserializer = objJsonDeserializer22;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer28 = objJsonDeserializer22.unwrappingDeserializer(nameTransformer27);
        settableAnyProperty7._valueDeserializer = objJsonDeserializer22;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader31 = objJsonDeserializer30.getObjectIdReader();
        java.lang.Object obj32 = objJsonDeserializer30.getNullValue();
        settableAnyProperty7._valueDeserializer = objJsonDeserializer30;
        boolean boolean34 = settableAnyProperty7._setterIsField;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = settableAnyProperty7.deserialize(jsonParser35, deserializationContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(beanProperty8);
        org.junit.Assert.assertNull(typeDeserializer9);
        org.junit.Assert.assertNull(beanProperty10);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(jsonMappingException21);
        org.junit.Assert.assertNotNull(objJsonDeserializer22);
        org.junit.Assert.assertTrue("'" + accessPattern25 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern25.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNotNull(objJsonDeserializer28);
        org.junit.Assert.assertNotNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(objectIdReader31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider5 = impl0.copy();
        com.fasterxml.jackson.databind.cfg.MapperConfig<?> wildcardMapperConfig6 = impl0.getConfig();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl0.findNullKeySerializer(javaType7, beanProperty8);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = impl0.getGenerator();
        org.junit.Assert.assertNull(jsonGenerator2);
        org.junit.Assert.assertNotNull(jsonMappingException4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider5);
        org.junit.Assert.assertNull(wildcardMapperConfig6);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNull(jsonGenerator10);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl5.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl5.findNullValueSerializer(beanProperty8);
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = impl0.handleSecondaryContextualization(objJsonSerializer9, beanProperty10);
        int int12 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl13.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl13.findNullValueSerializer(beanProperty16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl18.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = impl18.findNullValueSerializer(beanProperty21);
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = impl13.handleSecondaryContextualization(objJsonSerializer22, beanProperty23);
        impl0.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer24);
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer28 = impl0.findNullKeySerializer(javaType26, beanProperty27);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig29 = impl0.getConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = impl0.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer31 = impl0.getDefaultNullKeySerializer();
        com.fasterxml.jackson.databind.JavaType javaType32 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException35 = impl0.invalidTypeIdException(javaType32, "class java.lang.Long", "```com.fasterxml.jackson.databind.JsonMappingException```");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig36 = null;
        com.fasterxml.jackson.databind.JavaType javaType37 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator38 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig36, javaType37);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams39 = stdValueInstantiator38.getWithArgsCreator();
        boolean boolean40 = stdValueInstantiator38.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig41 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray42 = stdValueInstantiator38.getFromObjectArguments(deserializationConfig41);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams43 = stdValueInstantiator38.getWithArgsCreator();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator44 = null;
        // The following exception was thrown during execution in test generation
        try {
            impl0.defaultSerializeValue((java.lang.Object) annotatedWithParams43, jsonGenerator44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(objJsonSerializer28);
        org.junit.Assert.assertNull(serializationConfig29);
        org.junit.Assert.assertNotNull(objJsonSerializer30);
        org.junit.Assert.assertNotNull(objJsonSerializer31);
        org.junit.Assert.assertNotNull(jsonMappingException35);
        org.junit.Assert.assertNull(annotatedWithParams39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray42);
        org.junit.Assert.assertNull(annotatedWithParams43);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter10 = deserializerCache0.findConverter(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder4 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig5 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig5);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig7 = beanDeserializerFactory6.getFactoryConfig();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription9 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder10 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig11 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription14 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder15 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray16 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList17 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList17, beanPropertyDefinitionArray16);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList25 = beanDeserializerFactory12.filterBeanProps(deserializationContext13, beanDescription14, beanDeserializerBuilder15, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList17, (java.util.Set<java.lang.String>) strSet23);
        java.lang.String[] strArray28 = new java.lang.String[] { "```com.fasterxml.jackson.databind.JsonMappingException```", "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList31 = beanDeserializerFactory6.filterBeanProps(deserializationContext8, beanDescription9, beanDeserializerBuilder10, beanPropertyDefinitionList25, (java.util.Set<java.lang.String>) strSet29);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "`UNKNOWN TYPE`", "``com.fasterxml.jackson.databind.JsonMappingException``", "``com.fasterxml.jackson.databind.JsonMappingException``", "UNKNOWN TYPE", "hi!", "[null]" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList42 = beanDeserializerFactory1.filterBeanProps(deserializationContext2, beanDescription3, beanDeserializerBuilder4, beanPropertyDefinitionList31, (java.util.Set<java.lang.String>) strSet40);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig43 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory44 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig43);
        java.lang.String str45 = com.fasterxml.jackson.databind.util.ClassUtil.getClassDescription((java.lang.Object) beanDeserializerFactory1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext46 = null;
        com.fasterxml.jackson.databind.JavaType javaType47 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription48 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer49 = beanDeserializerFactory1.createEnumDeserializer(deserializationContext46, javaType47, beanDescription48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(deserializerFactoryConfig7);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray16);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray16, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "```com.fasterxml.jackson.databind.JsonMappingException```", "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!", "`UNKNOWN TYPE`", "``com.fasterxml.jackson.databind.JsonMappingException``", "``com.fasterxml.jackson.databind.JsonMappingException``", "UNKNOWN TYPE", "hi!", "[null]" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList42);
        org.junit.Assert.assertNotNull(deserializerFactory44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "`com.fasterxml.jackson.databind.deser.BeanDeserializerFactory`" + "'", str45, "`com.fasterxml.jackson.databind.deser.BeanDeserializerFactory`");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig2);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod6 = beanDeserializerFactory1._findJsonValueFor(deserializationConfig4, javaType5);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod11 = beanDeserializerFactory1._findJsonValueFor(deserializationConfig9, javaType10);
        com.fasterxml.jackson.databind.deser.BeanDeserializerModifier beanDeserializerModifier12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = beanDeserializerFactory1.withDeserializerModifier(beanDeserializerModifier12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deserializerFactory3);
        org.junit.Assert.assertNull(annotatedMethod6);
        org.junit.Assert.assertNotNull(deserializerFactory8);
        org.junit.Assert.assertNull(annotatedMethod11);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.type.ArrayType arrayType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objJsonDeserializer8.getObjectIdReader();
        java.lang.Object obj10 = objJsonDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty5, annotatedMember6, javaType7, objJsonDeserializer8, typeDeserializer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = objJsonDeserializer8.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = objJsonDeserializer14.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = objJsonDeserializer14.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = beanDeserializerFactory0._findCustomArrayDeserializer(arrayType1, deserializationConfig2, beanDescription3, typeDeserializer4, objJsonDeserializer14);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig20 = beanDeserializerFactory0._factoryConfig;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = beanDeserializerFactory0.buildBuilderBasedDeserializer(deserializationContext21, javaType22, beanDescription23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objJsonDeserializer18);
        org.junit.Assert.assertNull(wildcardJsonDeserializer19);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig20);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.util.Iterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.util.ClassUtil.emptyIterator();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator9 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig7, javaType8);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty13 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray14 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty13 };
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray16 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator9.configureFromObjectSettings(annotatedWithParams10, annotatedWithParams11, javaType12, settableBeanPropertyArray14, annotatedWithParams15, settableBeanPropertyArray16);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams18 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator21 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig19, javaType20);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams22 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams23 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty25 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray26 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty25 };
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams27 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray28 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator21.configureFromObjectSettings(annotatedWithParams22, annotatedWithParams23, javaType24, settableBeanPropertyArray26, annotatedWithParams27, settableBeanPropertyArray28);
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams4, annotatedWithParams5, javaType6, settableBeanPropertyArray16, annotatedWithParams18, settableBeanPropertyArray28);
        boolean boolean31 = stdValueInstantiator2.canCreateFromLong();
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray14);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray14, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray16);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray16, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray26);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray26, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray28);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray28, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.io.Closeable closeable2 = null;
        java.io.Closeable closeable4 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = new com.fasterxml.jackson.databind.JsonMappingException(closeable4, "hi!");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = new com.fasterxml.jackson.databind.JsonMappingException(closeable2, "hi!", (java.lang.Throwable) jsonMappingException6);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = new com.fasterxml.jackson.databind.JsonMappingException("`com.fasterxml.jackson.databind.JsonMappingException: hi!`", (java.lang.Throwable) jsonMappingException6);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = new com.fasterxml.jackson.databind.JsonMappingException("class java.lang.Long", (java.lang.Throwable) jsonMappingException6);
        java.lang.Throwable[] throwableArray10 = jsonMappingException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator0 = null;
        java.io.Closeable closeable2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException(closeable2, "hi!");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator0, "`com.fasterxml.jackson.databind.JsonMappingException`", (java.lang.Throwable) jsonMappingException4);
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = jsonMappingException5.getLocation();
        java.lang.String str7 = jsonMappingException5.getPathReference();
        org.junit.Assert.assertNotNull(jsonMappingException5);
        org.junit.Assert.assertNull(jsonLocation6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder4 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray5 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, beanPropertyDefinitionArray5);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList14 = beanDeserializerFactory1.filterBeanProps(deserializationContext2, beanDescription3, beanDeserializerBuilder4, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, (java.util.Set<java.lang.String>) strSet12);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig15 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory16 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig15);
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory17 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = beanDeserializerFactory17._findCustomBeanDeserializer(javaType18, deserializationConfig19, beanDescription20);
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig23 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = beanDeserializerFactory17._findCustomBeanDeserializer(javaType22, deserializationConfig23, beanDescription24);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig26 = beanDeserializerFactory17._factoryConfig;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory27 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig26);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext28 = null;
        com.fasterxml.jackson.databind.type.MapType mapType29 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer31 = beanDeserializerFactory1.createMapDeserializer(deserializationContext28, mapType29, beanDescription30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray5);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray5, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList14);
        org.junit.Assert.assertNotNull(deserializerFactory16);
        org.junit.Assert.assertNotNull(beanDeserializerFactory17);
        org.junit.Assert.assertNull(objJsonDeserializer21);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig26);
        org.junit.Assert.assertNotNull(deserializerFactory27);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig4 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig4);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig6 = beanDeserializerFactory5.getFactoryConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = impl0.serializerInstance(annotated3, (java.lang.Object) deserializerFactoryConfig6);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl8);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider10 = impl8.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = impl8.findNullValueSerializer(beanProperty11);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl13.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl13.findNullValueSerializer(beanProperty16);
        com.fasterxml.jackson.databind.BeanProperty beanProperty18 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = impl8.handleSecondaryContextualization(objJsonSerializer17, beanProperty18);
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = impl0.handlePrimaryContextualization(objJsonSerializer17, beanProperty20);
        com.fasterxml.jackson.databind.cfg.MapperConfig<?> wildcardMapperConfig22 = impl0.getConfig();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl23);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = impl23.getGenerator();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig27 = impl26.getConfig();
        java.lang.Class<?> wildcardClass28 = impl26.getActiveView();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer29 = impl26.getDefaultNullKeySerializer();
        impl23.setNullValueSerializer(objJsonSerializer29);
        impl0.setDefaultKeySerializer(objJsonSerializer29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone32 = impl0.getTimeZone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNull(deserializerFactoryConfig6);
        org.junit.Assert.assertNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(defaultSerializerProvider10);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertNull(wildcardMapperConfig22);
        org.junit.Assert.assertNull(jsonGenerator25);
        org.junit.Assert.assertNull(serializationConfig27);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNotNull(objJsonSerializer29);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "``com.fasterxml.jackson.databind.JsonMappingException``");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl7);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider9 = impl7.copy();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig11 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig11);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig13 = beanDeserializerFactory12.getFactoryConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = impl7.serializerInstance(annotated10, (java.lang.Object) deserializerFactoryConfig13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl15);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider17 = impl15.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty18 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer19 = impl15.findNullValueSerializer(beanProperty18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl20);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider22 = impl20.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer24 = impl20.findNullValueSerializer(beanProperty23);
        com.fasterxml.jackson.databind.BeanProperty beanProperty25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = impl15.handleSecondaryContextualization(objJsonSerializer24, beanProperty25);
        com.fasterxml.jackson.databind.BeanProperty beanProperty27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = impl7.handlePrimaryContextualization(objJsonSerializer24, beanProperty27);
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty30 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer31 = impl7.findNullKeySerializer(javaType29, beanProperty30);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl7);
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty34 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer35 = impl32.findNullKeySerializer(javaType33, beanProperty34);
        impl0.setDefaultKeySerializer(objJsonSerializer35);
        com.fasterxml.jackson.databind.introspect.Annotated annotated37 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo38 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.ObjectIdResolver objectIdResolver39 = impl0.objectIdResolverInstance(annotated37, objectIdInfo38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(jsonMappingException6);
        org.junit.Assert.assertNotNull(defaultSerializerProvider9);
        org.junit.Assert.assertNull(deserializerFactoryConfig13);
        org.junit.Assert.assertNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(defaultSerializerProvider17);
        org.junit.Assert.assertNotNull(objJsonSerializer19);
        org.junit.Assert.assertNotNull(defaultSerializerProvider22);
        org.junit.Assert.assertNotNull(objJsonSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(objJsonSerializer31);
        org.junit.Assert.assertNotNull(objJsonSerializer35);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        impl0.flushCachedSerializers();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "`java.lang.Long`");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = impl0.getGenerator();
        java.lang.Class<?> wildcardClass7 = impl0.getActiveView();
        org.junit.Assert.assertNull(serializationConfig1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(jsonMappingException5);
        org.junit.Assert.assertNull(jsonGenerator6);
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        java.lang.String str7 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        java.lang.String str9 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stdValueInstantiator2.createFromLong(deserializationContext10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UNKNOWN TYPE" + "'", str7, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UNKNOWN TYPE" + "'", str9, "UNKNOWN TYPE");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl5.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl5.findNullValueSerializer(beanProperty8);
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = impl0.handleSecondaryContextualization(objJsonSerializer9, beanProperty10);
        int int12 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl13.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl13.findNullValueSerializer(beanProperty16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl18.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = impl18.findNullValueSerializer(beanProperty21);
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = impl13.handleSecondaryContextualization(objJsonSerializer22, beanProperty23);
        impl0.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer24);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider27 = impl0.copy();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig28 = defaultSerializerProvider27.getConfig();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector29 = defaultSerializerProvider27.getAnnotationIntrospector();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(defaultSerializerProvider27);
        org.junit.Assert.assertNull(serializationConfig28);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        java.lang.String str7 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        java.lang.String str9 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams11);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UNKNOWN TYPE" + "'", str7, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UNKNOWN TYPE" + "'", str9, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter10);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objJsonDeserializer6.getObjectIdReader();
        java.lang.Object obj8 = objJsonDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty10 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty3, annotatedMember4, javaType5, objJsonDeserializer6, typeDeserializer9);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer6, typeDeserializer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = objJsonDeserializer6.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern15 = objJsonDeserializer6.getEmptyAccessPattern();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = objJsonDeserializer6.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern18 = objJsonDeserializer6.getEmptyAccessPattern();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = objJsonDeserializer6.deserialize(jsonParser19, deserializationContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertTrue("'" + accessPattern15 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern15.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNotNull(objJsonDeserializer17);
        org.junit.Assert.assertTrue("'" + accessPattern18 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern18.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        java.io.Closeable closeable3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        java.io.Closeable closeable7 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation9 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException10 = new com.fasterxml.jackson.databind.JsonMappingException(closeable7, "hi!", jsonLocation9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser5, "hi!", (java.lang.Throwable) jsonMappingException10);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException12 = new com.fasterxml.jackson.databind.JsonMappingException(closeable3, "", (java.lang.Throwable) jsonMappingException10);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser1, "", (java.lang.Throwable) jsonMappingException12);
        java.lang.String str14 = jsonMappingException13.getPathReference();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException15 = new com.fasterxml.jackson.databind.JsonMappingException("``java.lang.Double``", (java.lang.Throwable) jsonMappingException13);
        java.lang.Object obj16 = jsonMappingException13.getProcessor();
        org.junit.Assert.assertNotNull(jsonMappingException11);
        org.junit.Assert.assertNotNull(jsonMappingException13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        boolean boolean6 = impl0.includeFilterSuppressNulls((java.lang.Object) true);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl0.findNullValueSerializer(beanProperty8);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        java.io.Closeable closeable13 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        java.io.Closeable closeable17 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException20 = new com.fasterxml.jackson.databind.JsonMappingException(closeable17, "hi!", jsonLocation19);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException21 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser15, "hi!", (java.lang.Throwable) jsonMappingException20);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException22 = new com.fasterxml.jackson.databind.JsonMappingException(closeable13, "", (java.lang.Throwable) jsonMappingException20);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException23 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser11, "", (java.lang.Throwable) jsonMappingException22);
        java.util.List<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList24 = jsonMappingException22.getPath();
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        java.io.Closeable closeable27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = null;
        java.io.Closeable closeable31 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation33 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException34 = new com.fasterxml.jackson.databind.JsonMappingException(closeable31, "hi!", jsonLocation33);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException35 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser29, "hi!", (java.lang.Throwable) jsonMappingException34);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException36 = new com.fasterxml.jackson.databind.JsonMappingException(closeable27, "", (java.lang.Throwable) jsonMappingException34);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException37 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser25, "", (java.lang.Throwable) jsonMappingException36);
        jsonMappingException22.addSuppressed((java.lang.Throwable) jsonMappingException36);
        java.io.Closeable closeable39 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation41 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException42 = new com.fasterxml.jackson.databind.JsonMappingException(closeable39, "hi!", jsonLocation41);
        java.lang.Class<?> wildcardClass43 = com.fasterxml.jackson.databind.util.ClassUtil.classOf((java.lang.Object) jsonMappingException42);
        com.fasterxml.jackson.core.JsonParser jsonParser44 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException46 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser44, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        jsonMappingException46.prependPath((java.lang.Object) objJsonDeserializer47, "[null]");
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern50 = objJsonDeserializer47.getEmptyAccessPattern();
        java.lang.Class<? extends java.lang.Enum<?>> wildcardClass51 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType((java.lang.Enum<com.fasterxml.jackson.databind.util.AccessPattern>) accessPattern50);
        jsonMappingException42.prependPath((java.lang.Object) accessPattern50, (-1));
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference54 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) accessPattern50);
        java.lang.Class<? extends java.lang.Enum<?>> wildcardClass55 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType((java.lang.Enum<com.fasterxml.jackson.databind.util.AccessPattern>) accessPattern50);
        jsonMappingException36.prependPath((java.lang.Object) accessPattern50, 7);
        com.fasterxml.jackson.databind.JavaType javaType58 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl59 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl60 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl59);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider61 = impl59.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer62 = impl59.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl63 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl64 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl63);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider65 = impl63.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer66 = impl63.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.BeanProperty beanProperty67 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer68 = impl59.handleSecondaryContextualization(objJsonSerializer66, beanProperty67);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer69 = null;
        // The following exception was thrown during execution in test generation
        try {
            impl0.serializePolymorphic(jsonGenerator10, (java.lang.Object) 7, javaType58, objJsonSerializer66, typeSerializer69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(jsonMappingException21);
        org.junit.Assert.assertNotNull(jsonMappingException23);
        org.junit.Assert.assertNotNull(referenceList24);
        org.junit.Assert.assertNotNull(jsonMappingException35);
        org.junit.Assert.assertNotNull(jsonMappingException37);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(jsonMappingException46);
        org.junit.Assert.assertNotNull(objJsonDeserializer47);
        org.junit.Assert.assertTrue("'" + accessPattern50 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern50.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(defaultSerializerProvider61);
        org.junit.Assert.assertNotNull(objJsonSerializer62);
        org.junit.Assert.assertNotNull(defaultSerializerProvider65);
        org.junit.Assert.assertNotNull(objJsonSerializer66);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer68);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = defaultSerializerProvider1.findNullValueSerializer(beanProperty2);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = defaultSerializerProvider1.getGenerator();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = impl5.getGenerator();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl5, "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl10);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider12 = impl10.copy();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig14 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig14);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig16 = beanDeserializerFactory15.getFactoryConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl10.serializerInstance(annotated13, (java.lang.Object) deserializerFactoryConfig16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl18.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = impl18.findNullValueSerializer(beanProperty21);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl23);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider25 = impl23.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty26 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer27 = impl23.findNullValueSerializer(beanProperty26);
        com.fasterxml.jackson.databind.BeanProperty beanProperty28 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = impl18.handleSecondaryContextualization(objJsonSerializer27, beanProperty28);
        com.fasterxml.jackson.databind.BeanProperty beanProperty30 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = impl10.handlePrimaryContextualization(objJsonSerializer27, beanProperty30);
        impl5.setDefaultKeySerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer31);
        defaultSerializerProvider1.setNullKeySerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer31);
        com.fasterxml.jackson.databind.BeanDescription beanDescription34 = null;
        java.io.Closeable closeable36 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException40 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser38, "[null]");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException41 = new com.fasterxml.jackson.databind.JsonMappingException(closeable36, "[null]", (java.lang.Throwable) jsonMappingException40);
        java.lang.Throwable[] throwableArray42 = jsonMappingException40.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JacksonAnnotationValue<com.fasterxml.jackson.annotation.JsonFormat> jsonFormatJacksonAnnotationValue43 = defaultSerializerProvider1.reportBadTypeDefinition(beanDescription34, "java.lang.Boolean[\"`[null]`\"]", (java.lang.Object[]) throwableArray42);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.InvalidDefinitionException; message: Invalid type definition for type N/A: java.lang.Boolean[\"`[null]`\"]");
        } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider1);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNull(jsonGenerator4);
        org.junit.Assert.assertNull(jsonGenerator7);
        org.junit.Assert.assertNotNull(jsonMappingException9);
        org.junit.Assert.assertNotNull(defaultSerializerProvider12);
        org.junit.Assert.assertNull(deserializerFactoryConfig16);
        org.junit.Assert.assertNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(defaultSerializerProvider25);
        org.junit.Assert.assertNotNull(objJsonSerializer27);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer29);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer31);
        org.junit.Assert.assertNotNull(jsonMappingException40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertArrayEquals(throwableArray42, new java.lang.Throwable[] {});
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        java.lang.Object obj5 = objJsonDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty7 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer3, typeDeserializer6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException10 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser8, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        jsonMappingException10.prependPath((java.lang.Object) objJsonDeserializer11, "[null]");
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern14 = objJsonDeserializer11.getEmptyAccessPattern();
        settableAnyProperty7._valueDeserializer = objJsonDeserializer11;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.lang.Object obj17 = objJsonDeserializer11.getEmptyValue(deserializationContext16);
        java.lang.Object obj18 = objJsonDeserializer11.getEmptyValue();
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonMappingException10);
        org.junit.Assert.assertNotNull(objJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + accessPattern14 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern14.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        java.lang.Class<?> wildcardClass3 = defaultSerializerProvider2.getActiveView();
        java.lang.String str4 = com.fasterxml.jackson.databind.util.ClassUtil.nullOrToString((java.lang.Object) defaultSerializerProvider2);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator7 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig5, javaType6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = stdValueInstantiator7.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = stdValueInstantiator7.getDefaultCreator();
        boolean boolean11 = stdValueInstantiator7.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator14 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig12, javaType13);
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator15 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(stdValueInstantiator7, stdValueInstantiator14);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = null;
        stdValueInstantiator15.configureFromStringCreator(annotatedWithParams16);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig18 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray19 = stdValueInstantiator15.getFromObjectArguments(deserializationConfig18);
        boolean boolean20 = defaultSerializerProvider2.includeFilterSuppressNulls((java.lang.Object) deserializationConfig18);
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator24 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig22, javaType23);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams25 = stdValueInstantiator24.getWithArgsCreator();
        boolean boolean26 = stdValueInstantiator24.canCreateUsingDelegate();
        java.lang.Class<?> wildcardClass27 = stdValueInstantiator24.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig30 = null;
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator32 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig30, javaType31);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams33 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams34 = null;
        com.fasterxml.jackson.databind.JavaType javaType35 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty36 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray37 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty36 };
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams38 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray39 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator32.configureFromObjectSettings(annotatedWithParams33, annotatedWithParams34, javaType35, settableBeanPropertyArray37, annotatedWithParams38, settableBeanPropertyArray39);
        stdValueInstantiator24.configureFromArraySettings(annotatedWithParams28, javaType29, settableBeanPropertyArray37);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams42 = stdValueInstantiator24.getArrayDelegateCreator();
        boolean boolean43 = stdValueInstantiator24.canCreateFromDouble();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer44 = defaultSerializerProvider2.serializerInstance(annotated21, (java.lang.Object) stdValueInstantiator24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stdValueInstantiator15);
        org.junit.Assert.assertNull(settableBeanPropertyArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(annotatedWithParams25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray37);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray37, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray39);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray39, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNull(annotatedWithParams42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty6 };
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams3, annotatedWithParams4, javaType5, settableBeanPropertyArray7, annotatedWithParams8, settableBeanPropertyArray9);
        boolean boolean11 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean12 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean14 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean15 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        org.junit.Assert.assertNotNull(settableBeanPropertyArray7);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray7, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray9);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray9, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objJsonDeserializer6.getObjectIdReader();
        java.lang.Object obj8 = objJsonDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty10 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty3, annotatedMember4, javaType5, objJsonDeserializer6, typeDeserializer9);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer6, typeDeserializer11);
        boolean boolean13 = settableAnyProperty12._setterIsField;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = settableAnyProperty12._setter;
        com.fasterxml.jackson.databind.JavaType javaType15 = settableAnyProperty12.getType();
        boolean boolean16 = settableAnyProperty12._setterIsField;
        com.fasterxml.jackson.databind.BeanProperty beanProperty17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory20 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.type.ArrayType arrayType21 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig22 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription23 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty25 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer28 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader29 = objJsonDeserializer28.getObjectIdReader();
        java.lang.Object obj30 = objJsonDeserializer28.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer31 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty32 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty25, annotatedMember26, javaType27, objJsonDeserializer28, typeDeserializer31);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer33 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer34 = objJsonDeserializer28.unwrappingDeserializer(nameTransformer33);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext35 = null;
        java.lang.Object obj36 = objJsonDeserializer34.getEmptyValue(deserializationContext35);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = objJsonDeserializer34.unwrappingDeserializer(nameTransformer37);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer39 = beanDeserializerFactory20._findCustomArrayDeserializer(arrayType21, deserializationConfig22, beanDescription23, typeDeserializer24, objJsonDeserializer34);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty41 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty17, annotatedMember18, javaType19, objJsonDeserializer34, typeDeserializer40);
        settableAnyProperty12._valueDeserializer = objJsonDeserializer34;
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(annotatedMember14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(beanDeserializerFactory20);
        org.junit.Assert.assertNotNull(objJsonDeserializer28);
        org.junit.Assert.assertNull(objectIdReader29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objJsonDeserializer34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objJsonDeserializer38);
        org.junit.Assert.assertNull(wildcardJsonDeserializer39);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl5.copy();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig9 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig9);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig11 = beanDeserializerFactory10.getFactoryConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = impl5.serializerInstance(annotated8, (java.lang.Object) deserializerFactoryConfig11);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl13.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl13.findNullValueSerializer(beanProperty16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl18.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = impl18.findNullValueSerializer(beanProperty21);
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = impl13.handleSecondaryContextualization(objJsonSerializer22, beanProperty23);
        com.fasterxml.jackson.databind.BeanProperty beanProperty25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = impl5.handlePrimaryContextualization(objJsonSerializer22, beanProperty25);
        impl0.setDefaultKeySerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer26);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl28);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider30 = impl28.copy();
        com.fasterxml.jackson.databind.introspect.Annotated annotated31 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig32 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig32);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig34 = beanDeserializerFactory33.getFactoryConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer35 = impl28.serializerInstance(annotated31, (java.lang.Object) deserializerFactoryConfig34);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl36 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl37 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl36);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider38 = impl36.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty39 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer40 = impl36.findNullValueSerializer(beanProperty39);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl41 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl42 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl41);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider43 = impl41.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty44 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer45 = impl41.findNullValueSerializer(beanProperty44);
        com.fasterxml.jackson.databind.BeanProperty beanProperty46 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = impl36.handleSecondaryContextualization(objJsonSerializer45, beanProperty46);
        com.fasterxml.jackson.databind.BeanProperty beanProperty48 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = impl28.handlePrimaryContextualization(objJsonSerializer45, beanProperty48);
        impl0.setDefaultKeySerializer(objJsonSerializer45);
        java.lang.Class<?> wildcardClass51 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider52 = impl0.copy();
        java.io.Closeable closeable54 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation56 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException57 = new com.fasterxml.jackson.databind.JsonMappingException(closeable54, "hi!", jsonLocation56);
        java.lang.Throwable[] throwableArray58 = jsonMappingException57.getSuppressed();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException59 = defaultSerializerProvider52.mappingException("UNKNOWN[?]", (java.lang.Object[]) throwableArray58);
        com.fasterxml.jackson.databind.BeanProperty beanProperty60 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer61 = defaultSerializerProvider52.findNullValueSerializer(beanProperty60);
        org.junit.Assert.assertNull(jsonGenerator2);
        org.junit.Assert.assertNotNull(jsonMappingException4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNull(deserializerFactoryConfig11);
        org.junit.Assert.assertNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(defaultSerializerProvider30);
        org.junit.Assert.assertNull(deserializerFactoryConfig34);
        org.junit.Assert.assertNull(objJsonSerializer35);
        org.junit.Assert.assertNotNull(defaultSerializerProvider38);
        org.junit.Assert.assertNotNull(objJsonSerializer40);
        org.junit.Assert.assertNotNull(defaultSerializerProvider43);
        org.junit.Assert.assertNotNull(objJsonSerializer45);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer49);
        org.junit.Assert.assertNull(wildcardClass51);
        org.junit.Assert.assertNotNull(defaultSerializerProvider52);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertArrayEquals(throwableArray58, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(jsonMappingException59);
        org.junit.Assert.assertNotNull(objJsonSerializer61);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.type.CollectionType collectionType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objJsonDeserializer8.getObjectIdReader();
        java.lang.Object obj10 = objJsonDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty5, annotatedMember6, javaType7, objJsonDeserializer8, typeDeserializer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = objJsonDeserializer8.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = objJsonDeserializer14.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = objJsonDeserializer14.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = beanDeserializerFactory0._findCustomCollectionDeserializer(collectionType1, deserializationConfig2, beanDescription3, typeDeserializer4, objJsonDeserializer18);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer22 = beanDeserializerFactory0.findKeyDeserializerFromAnnotation(deserializationContext20, annotated21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objJsonDeserializer18);
        org.junit.Assert.assertNull(wildcardJsonDeserializer19);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder4 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray5 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, beanPropertyDefinitionArray5);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList14 = beanDeserializerFactory1.filterBeanProps(deserializationContext2, beanDescription3, beanDeserializerBuilder4, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, (java.util.Set<java.lang.String>) strSet12);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig15 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory16 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig15);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig17 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory18 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig17);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig19 = beanDeserializerFactory1.getFactoryConfig();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig20 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator24 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig22, javaType23);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = stdValueInstantiator24.getArrayDelegateType(deserializationConfig25);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams27 = stdValueInstantiator24.getDefaultCreator();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = beanDeserializerFactory1._valueInstantiatorInstance(deserializationConfig20, annotated21, (java.lang.Object) annotatedWithParams27);
        com.fasterxml.jackson.databind.deser.BeanDeserializerModifier beanDeserializerModifier29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory30 = beanDeserializerFactory1.withDeserializerModifier(beanDeserializerModifier29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray5);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray5, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList14);
        org.junit.Assert.assertNotNull(deserializerFactory16);
        org.junit.Assert.assertNotNull(deserializerFactory18);
        org.junit.Assert.assertNull(deserializerFactoryConfig19);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNull(annotatedWithParams27);
        org.junit.Assert.assertNull(valueInstantiator28);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator4, "hi!");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator2, "`com.fasterxml.jackson.databind.JsonMappingException`", (java.lang.Throwable) jsonMappingException6);
        java.lang.Object obj8 = jsonMappingException7.getProcessor();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "java.lang.String[?]", (java.lang.Throwable) jsonMappingException7);
        org.junit.Assert.assertNotNull(jsonMappingException6);
        org.junit.Assert.assertNotNull(jsonMappingException7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(jsonMappingException9);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty6 };
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams3, annotatedWithParams4, javaType5, settableBeanPropertyArray7, annotatedWithParams8, settableBeanPropertyArray9);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = stdValueInstantiator2.getDelegateType(deserializationConfig11);
        boolean boolean13 = stdValueInstantiator2.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig14);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams16);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray7);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray7, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray9);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray9, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(javaType15);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl5.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl5.findNullValueSerializer(beanProperty8);
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = impl0.handleSecondaryContextualization(objJsonSerializer9, beanProperty10);
        int int12 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl13.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl13.findNullValueSerializer(beanProperty16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl18.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = impl18.findNullValueSerializer(beanProperty21);
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = impl13.handleSecondaryContextualization(objJsonSerializer22, beanProperty23);
        impl0.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer24);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = impl26.getGenerator();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer28 = impl26.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.BeanProperty beanProperty29 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = impl26.findNullValueSerializer(beanProperty29);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider32 = impl31.copy();
        boolean boolean33 = impl26.includeFilterSuppressNulls((java.lang.Object) defaultSerializerProvider32);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = impl26.isEnabled(serializationFeature34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNull(jsonGenerator27);
        org.junit.Assert.assertNotNull(objJsonSerializer28);
        org.junit.Assert.assertNotNull(objJsonSerializer30);
        org.junit.Assert.assertNotNull(defaultSerializerProvider32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "com.fasterxml.jackson.databind.JsonMappingException: [null]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl3);
        java.io.Closeable closeable7 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation9 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException10 = new com.fasterxml.jackson.databind.JsonMappingException(closeable7, "hi!", jsonLocation9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = new com.fasterxml.jackson.databind.JsonMappingException("hi!", (java.lang.Throwable) jsonMappingException10);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException12 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl3, "[null]", (java.lang.Throwable) jsonMappingException10);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE((java.io.IOException) jsonMappingException10);
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = jsonMappingException10.getLocation();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl15);
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException20 = impl15.invalidTypeIdException(javaType17, "hi!", "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider21 = impl15.copy();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer24 = impl15.findNullKeySerializer(javaType22, beanProperty23);
        com.fasterxml.jackson.databind.BeanProperty beanProperty25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer26 = impl15.findNullValueSerializer(beanProperty25);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference27 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) beanProperty25);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException29 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException10, (java.lang.Object) beanProperty25, "`java.util.ArrayList`");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException31 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) beanProperty25, "java.lang.Long[\"``java.lang.Short[?]``\"]");
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNotNull(jsonMappingException12);
        org.junit.Assert.assertNotNull(jsonMappingException13);
        org.junit.Assert.assertNull(jsonLocation14);
        org.junit.Assert.assertNotNull(jsonMappingException20);
        org.junit.Assert.assertNotNull(defaultSerializerProvider21);
        org.junit.Assert.assertNotNull(objJsonSerializer24);
        org.junit.Assert.assertNotNull(objJsonSerializer26);
        org.junit.Assert.assertNotNull(jsonMappingException29);
        org.junit.Assert.assertNotNull(jsonMappingException31);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig2);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference5 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) beanDeserializerFactory1, "java.lang.Short[?]");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        java.io.Closeable closeable8 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation10 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = new com.fasterxml.jackson.databind.JsonMappingException(closeable8, "`com.fasterxml.jackson.databind.JsonMappingException`", jsonLocation10);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException12 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE((java.io.IOException) jsonMappingException11);
        java.lang.StringBuilder stringBuilder13 = null;
        java.lang.StringBuilder stringBuilder14 = jsonMappingException12.getPathReference(stringBuilder13);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator15 = beanDeserializerFactory1._valueInstantiatorInstance(deserializationConfig6, annotated7, (java.lang.Object) stringBuilder13);
        com.fasterxml.jackson.databind.deser.ValueInstantiators valueInstantiators16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory17 = beanDeserializerFactory1.withValueInstantiators(valueInstantiators16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deserializerFactory3);
        org.junit.Assert.assertNotNull(jsonMappingException12);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNull(valueInstantiator15);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean4 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator2.configureFromArraySettings(annotatedWithParams5, javaType6, settableBeanPropertyArray7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams9);
        boolean boolean11 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stdValueInstantiator2.createFromInt(deserializationContext14, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray7);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray7, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator0 = null;
        java.io.Closeable closeable2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        java.io.Closeable closeable6 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = new com.fasterxml.jackson.databind.JsonMappingException(closeable6, "hi!", jsonLocation8);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException10 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser4, "hi!", (java.lang.Throwable) jsonMappingException9);
        java.lang.StringBuilder stringBuilder11 = null;
        java.lang.StringBuilder stringBuilder12 = jsonMappingException9.getPathReference(stringBuilder11);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = new com.fasterxml.jackson.databind.JsonMappingException(closeable2, "[null]", (java.lang.Throwable) jsonMappingException9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException14 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator0, "hi!", (java.lang.Throwable) jsonMappingException9);
        java.lang.Throwable throwable15 = com.fasterxml.jackson.databind.util.ClassUtil.getRootCause((java.lang.Throwable) jsonMappingException9);
        org.junit.Assert.assertNotNull(jsonMappingException10);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertNotNull(jsonMappingException14);
        org.junit.Assert.assertNotNull(throwable15);
        org.junit.Assert.assertEquals(throwable15.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable15.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable15.toString(), "com.fasterxml.jackson.databind.JsonMappingException: hi!");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig7 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig7);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = beanDeserializerFactory8.withConfig(deserializerFactoryConfig9);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference12 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) beanDeserializerFactory8, "java.lang.Short[?]");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = beanDeserializerFactory8.withConfig(deserializerFactoryConfig13);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig15 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory16 = beanDeserializerFactory8.withConfig(deserializerFactoryConfig15);
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = deserializerCache0.findValueDeserializer(deserializationContext6, deserializerFactory16, javaType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(deserializerFactory10);
        org.junit.Assert.assertNotNull(deserializerFactory14);
        org.junit.Assert.assertNotNull(deserializerFactory16);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        java.lang.Class<?> wildcardClass4 = impl3.getActiveView();
        int int5 = impl3.cachedSerializersCount();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig6 = null;
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = impl3.createInstance(serializationConfig6, serializerFactory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(serializationConfig1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = impl0.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl4);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = impl4.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = impl4.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = impl0.handleSecondaryContextualization(objJsonSerializer7, beanProperty8);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider10 = impl0.copy();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = defaultSerializerProvider10.findNullKeySerializer(javaType11, beanProperty12);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultSerializerProvider10.defaultSerializeNull(jsonGenerator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(defaultSerializerProvider6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(defaultSerializerProvider10);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        java.io.Closeable closeable3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        java.io.Closeable closeable7 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation9 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException10 = new com.fasterxml.jackson.databind.JsonMappingException(closeable7, "hi!", jsonLocation9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser5, "hi!", (java.lang.Throwable) jsonMappingException10);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException12 = new com.fasterxml.jackson.databind.JsonMappingException(closeable3, "", (java.lang.Throwable) jsonMappingException10);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser1, "", (java.lang.Throwable) jsonMappingException12);
        java.lang.String str14 = jsonMappingException13.getPathReference();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException15 = new com.fasterxml.jackson.databind.JsonMappingException("``java.lang.Double``", (java.lang.Throwable) jsonMappingException13);
        java.lang.String str16 = jsonMappingException13.getPathReference();
        java.io.Closeable closeable17 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        java.io.Closeable closeable21 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation23 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException24 = new com.fasterxml.jackson.databind.JsonMappingException(closeable21, "hi!", jsonLocation23);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException25 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser19, "hi!", (java.lang.Throwable) jsonMappingException24);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException26 = new com.fasterxml.jackson.databind.JsonMappingException(closeable17, "", (java.lang.Throwable) jsonMappingException24);
        java.lang.String str27 = com.fasterxml.jackson.databind.util.ClassUtil.getClassDescription((java.lang.Object) jsonMappingException26);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference29 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) str27, "``java.lang.Short[?]``");
        jsonMappingException13.prependPath(reference29);
        java.lang.String str31 = reference29.toString();
        org.junit.Assert.assertNotNull(jsonMappingException11);
        org.junit.Assert.assertNotNull(jsonMappingException13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(jsonMappingException25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "`com.fasterxml.jackson.databind.JsonMappingException`" + "'", str27, "`com.fasterxml.jackson.databind.JsonMappingException`");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.String[\"``java.lang.Short[?]``\"]" + "'", str31, "java.lang.String[\"``java.lang.Short[?]``\"]");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.String str5 = com.fasterxml.jackson.databind.util.ClassUtil.nullOrToString((java.lang.Object) deserializerCache0);
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer11 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = beanDeserializerFactory0._findCustomBeanDeserializer(javaType1, deserializationConfig2, beanDescription3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = beanDeserializerFactory0._findCustomBeanDeserializer(javaType5, deserializationConfig6, beanDescription7);
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory9 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig10 = beanDeserializerFactory9.getFactoryConfig();
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig10);
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig10);
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = beanDeserializerFactory0.withConfig(deserializerFactoryConfig10);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = beanDeserializerFactory0.findTypeDeserializer(deserializationConfig14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(beanDeserializerFactory9);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig10);
        org.junit.Assert.assertNotNull(deserializerFactory13);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException1 = new com.fasterxml.jackson.databind.JsonMappingException("java.lang.Long[?]");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        boolean boolean5 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = stdValueInstantiator2.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams8);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams10);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = stdValueInstantiator2.getDefaultCreator();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedWithParams12);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl5.copy();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig9 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig9);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig11 = beanDeserializerFactory10.getFactoryConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = impl5.serializerInstance(annotated8, (java.lang.Object) deserializerFactoryConfig11);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl13.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl13.findNullValueSerializer(beanProperty16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl18.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = impl18.findNullValueSerializer(beanProperty21);
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = impl13.handleSecondaryContextualization(objJsonSerializer22, beanProperty23);
        com.fasterxml.jackson.databind.BeanProperty beanProperty25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = impl5.handlePrimaryContextualization(objJsonSerializer22, beanProperty25);
        impl0.setDefaultKeySerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer26);
        java.lang.Class<?> wildcardClass28 = impl0.getActiveView();
        org.junit.Assert.assertNull(jsonGenerator2);
        org.junit.Assert.assertNotNull(jsonMappingException4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNull(deserializerFactoryConfig11);
        org.junit.Assert.assertNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNull(wildcardClass28);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = defaultSerializerProvider2.invalidTypeIdException(javaType3, "UNKNOWN[?]", "`[null]`");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = defaultSerializerProvider2.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference9 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) defaultSerializerProvider2, "`UNKNOWN[8]`");
        java.lang.String str10 = reference9.getDescription();
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(jsonMappingException6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl[\"`UNKNOWN[8]`\"]" + "'", str10, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl[\"`UNKNOWN[8]`\"]");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objJsonDeserializer6.getObjectIdReader();
        java.lang.Object obj8 = objJsonDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty10 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty3, annotatedMember4, javaType5, objJsonDeserializer6, typeDeserializer9);
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = settableAnyProperty10.getProperty();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = settableAnyProperty10._valueTypeDeserializer;
        com.fasterxml.jackson.databind.BeanProperty beanProperty13 = settableAnyProperty10._property;
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader18 = objJsonDeserializer17.getObjectIdReader();
        java.lang.Object obj19 = objJsonDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty21 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty14, annotatedMember15, javaType16, objJsonDeserializer17, typeDeserializer20);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException24 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser22, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        jsonMappingException24.prependPath((java.lang.Object) objJsonDeserializer25, "[null]");
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern28 = objJsonDeserializer25.getEmptyAccessPattern();
        settableAnyProperty21._valueDeserializer = objJsonDeserializer25;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = objJsonDeserializer25.unwrappingDeserializer(nameTransformer30);
        settableAnyProperty10._valueDeserializer = objJsonDeserializer25;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty34 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer25, typeDeserializer33);
        com.fasterxml.jackson.databind.JavaType javaType35 = settableAnyProperty34._type;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember36 = settableAnyProperty34._setter;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = settableAnyProperty34._valueTypeDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException40 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser38, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer41 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader42 = objJsonDeserializer41.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException44 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException40, (java.lang.Object) objJsonDeserializer41, (int) '#');
        com.fasterxml.jackson.core.JsonParser jsonParser45 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException47 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser45, "[null]");
        java.lang.Throwable throwable48 = com.fasterxml.jackson.databind.util.ClassUtil.getRootCause((java.lang.Throwable) jsonMappingException47);
        jsonMappingException44.prependPath((java.lang.Object) throwable48, (int) (short) 1);
        java.io.Closeable closeable51 = null;
        java.io.Closeable closeable53 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser55 = null;
        java.io.Closeable closeable57 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation59 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException60 = new com.fasterxml.jackson.databind.JsonMappingException(closeable57, "hi!", jsonLocation59);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException61 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser55, "hi!", (java.lang.Throwable) jsonMappingException60);
        java.lang.StringBuilder stringBuilder62 = null;
        java.lang.StringBuilder stringBuilder63 = jsonMappingException60.getPathReference(stringBuilder62);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException64 = new com.fasterxml.jackson.databind.JsonMappingException(closeable53, "[null]", (java.lang.Throwable) jsonMappingException60);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException65 = new com.fasterxml.jackson.databind.JsonMappingException(closeable51, "hi!", (java.lang.Throwable) jsonMappingException64);
        jsonMappingException44.addSuppressed((java.lang.Throwable) jsonMappingException64);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference69 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) "hi!", (int) (short) 100);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException70 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException64, reference69);
        java.lang.Throwable throwable71 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfRTE((java.lang.Throwable) jsonMappingException64);
        java.lang.Throwable throwable72 = com.fasterxml.jackson.databind.util.ClassUtil.getRootCause((java.lang.Throwable) jsonMappingException64);
        java.lang.Object obj73 = null;
        // The following exception was thrown during execution in test generation
        try {
            settableAnyProperty34._throwAsIOE((java.lang.Exception) jsonMappingException64, obj73, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: [null] (through reference chain: java.lang.String[100])");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(beanProperty11);
        org.junit.Assert.assertNull(typeDeserializer12);
        org.junit.Assert.assertNull(beanProperty13);
        org.junit.Assert.assertNotNull(objJsonDeserializer17);
        org.junit.Assert.assertNull(objectIdReader18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(jsonMappingException24);
        org.junit.Assert.assertNotNull(objJsonDeserializer25);
        org.junit.Assert.assertTrue("'" + accessPattern28 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern28.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNotNull(objJsonDeserializer31);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertNull(annotatedMember36);
        org.junit.Assert.assertNull(typeDeserializer37);
        org.junit.Assert.assertNotNull(jsonMappingException40);
        org.junit.Assert.assertNotNull(objJsonDeserializer41);
        org.junit.Assert.assertNull(objectIdReader42);
        org.junit.Assert.assertNotNull(jsonMappingException44);
        org.junit.Assert.assertNotNull(jsonMappingException47);
        org.junit.Assert.assertNotNull(throwable48);
        org.junit.Assert.assertEquals(throwable48.getLocalizedMessage(), "[null]");
        org.junit.Assert.assertEquals(throwable48.getMessage(), "[null]");
        org.junit.Assert.assertEquals(throwable48.toString(), "com.fasterxml.jackson.databind.JsonMappingException: [null]");
        org.junit.Assert.assertNotNull(jsonMappingException61);
        org.junit.Assert.assertNull(stringBuilder63);
        org.junit.Assert.assertNotNull(jsonMappingException70);
        org.junit.Assert.assertNotNull(throwable71);
        org.junit.Assert.assertEquals(throwable71.getLocalizedMessage(), "[null] (through reference chain: java.lang.String[100])");
        org.junit.Assert.assertEquals(throwable71.getMessage(), "[null] (through reference chain: java.lang.String[100])");
        org.junit.Assert.assertEquals(throwable71.toString(), "com.fasterxml.jackson.databind.JsonMappingException: [null] (through reference chain: java.lang.String[100])");
        org.junit.Assert.assertNotNull(throwable72);
        org.junit.Assert.assertEquals(throwable72.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable72.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable72.toString(), "com.fasterxml.jackson.databind.JsonMappingException: hi!");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        impl0.flushCachedSerializers();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl6.copy();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl8);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider10 = impl8.copy();
        int int11 = defaultSerializerProvider10.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl12);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider14 = impl12.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = impl12.findNullValueSerializer(beanProperty15);
        defaultSerializerProvider10.setNullValueSerializer(objJsonSerializer16);
        defaultSerializerProvider7.setNullKeySerializer(objJsonSerializer16);
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            impl0.serializeValue(jsonGenerator4, (java.lang.Object) defaultSerializerProvider7, javaType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(serializationConfig1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNotNull(defaultSerializerProvider10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider14);
        org.junit.Assert.assertNotNull(objJsonSerializer16);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "``com.fasterxml.jackson.databind.JsonMappingException``");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl7);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider9 = impl7.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = impl7.findNullValueSerializer(beanProperty10);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl12);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider14 = impl12.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = impl12.findNullValueSerializer(beanProperty15);
        com.fasterxml.jackson.databind.BeanProperty beanProperty17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = impl7.handleSecondaryContextualization(objJsonSerializer16, beanProperty17);
        impl0.setNullKeySerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer18);
        java.lang.Class<?> wildcardClass20 = com.fasterxml.jackson.databind.util.ClassUtil.classOf((java.lang.Object) impl0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(jsonMappingException6);
        org.junit.Assert.assertNotNull(defaultSerializerProvider9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(defaultSerializerProvider14);
        org.junit.Assert.assertNotNull(objJsonSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.String str5 = com.fasterxml.jackson.databind.util.ClassUtil.nullOrToString((java.lang.Object) deserializerCache0);
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._findCachedDeserializer(javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objJsonDeserializer6.getObjectIdReader();
        java.lang.Object obj8 = objJsonDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty10 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty3, annotatedMember4, javaType5, objJsonDeserializer6, typeDeserializer9);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer6, typeDeserializer11);
        boolean boolean13 = settableAnyProperty12._setterIsField;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = settableAnyProperty12._valueDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType15 = settableAnyProperty12.getType();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader20 = objJsonDeserializer19.getObjectIdReader();
        java.lang.Object obj21 = objJsonDeserializer19.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer22 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty23 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty16, annotatedMember17, javaType18, objJsonDeserializer19, typeDeserializer22);
        com.fasterxml.jackson.databind.BeanProperty beanProperty24 = settableAnyProperty23.getProperty();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = settableAnyProperty23._valueTypeDeserializer;
        com.fasterxml.jackson.databind.BeanProperty beanProperty26 = settableAnyProperty23._property;
        com.fasterxml.jackson.databind.BeanProperty beanProperty27 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader31 = objJsonDeserializer30.getObjectIdReader();
        java.lang.Object obj32 = objJsonDeserializer30.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty34 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty27, annotatedMember28, javaType29, objJsonDeserializer30, typeDeserializer33);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException37 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser35, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        jsonMappingException37.prependPath((java.lang.Object) objJsonDeserializer38, "[null]");
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern41 = objJsonDeserializer38.getEmptyAccessPattern();
        settableAnyProperty34._valueDeserializer = objJsonDeserializer38;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer43 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer44 = objJsonDeserializer38.unwrappingDeserializer(nameTransformer43);
        settableAnyProperty23._valueDeserializer = objJsonDeserializer38;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer46 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader47 = objJsonDeserializer46.getObjectIdReader();
        java.lang.Object obj48 = objJsonDeserializer46.getNullValue();
        settableAnyProperty23._valueDeserializer = objJsonDeserializer46;
        com.fasterxml.jackson.databind.BeanProperty beanProperty50 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember51 = null;
        com.fasterxml.jackson.databind.JavaType javaType52 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty53 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember54 = null;
        com.fasterxml.jackson.databind.JavaType javaType55 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer56 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader57 = objJsonDeserializer56.getObjectIdReader();
        java.lang.Object obj58 = objJsonDeserializer56.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer59 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty60 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty53, annotatedMember54, javaType55, objJsonDeserializer56, typeDeserializer59);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer61 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty62 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty50, annotatedMember51, javaType52, objJsonDeserializer56, typeDeserializer61);
        boolean boolean63 = settableAnyProperty62._setterIsField;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer64 = settableAnyProperty62._valueDeserializer;
        settableAnyProperty23._valueDeserializer = objJsonDeserializer64;
        settableAnyProperty12._valueDeserializer = objJsonDeserializer64;
        com.fasterxml.jackson.core.JsonParser jsonParser67 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext68 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty69 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember70 = null;
        com.fasterxml.jackson.databind.JavaType javaType71 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer72 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader73 = objJsonDeserializer72.getObjectIdReader();
        java.lang.Object obj74 = objJsonDeserializer72.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer75 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty76 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty69, annotatedMember70, javaType71, objJsonDeserializer72, typeDeserializer75);
        com.fasterxml.jackson.databind.BeanProperty beanProperty77 = settableAnyProperty76.getProperty();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer78 = settableAnyProperty76._valueTypeDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj79 = objJsonDeserializer64.deserialize(jsonParser67, deserializationContext68, (java.lang.Object) settableAnyProperty76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNotNull(objJsonDeserializer19);
        org.junit.Assert.assertNull(objectIdReader20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(beanProperty24);
        org.junit.Assert.assertNull(typeDeserializer25);
        org.junit.Assert.assertNull(beanProperty26);
        org.junit.Assert.assertNotNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(objectIdReader31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(jsonMappingException37);
        org.junit.Assert.assertNotNull(objJsonDeserializer38);
        org.junit.Assert.assertTrue("'" + accessPattern41 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern41.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNotNull(objJsonDeserializer44);
        org.junit.Assert.assertNotNull(objJsonDeserializer46);
        org.junit.Assert.assertNull(objectIdReader47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objJsonDeserializer56);
        org.junit.Assert.assertNull(objectIdReader57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer64);
        org.junit.Assert.assertNotNull(objJsonDeserializer72);
        org.junit.Assert.assertNull(objectIdReader73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(beanProperty77);
        org.junit.Assert.assertNull(typeDeserializer78);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = impl0.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl4);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = impl4.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = impl4.findNullValueSerializer(beanProperty7);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl9);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider11 = impl9.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = impl9.findNullValueSerializer(beanProperty12);
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = impl4.handleSecondaryContextualization(objJsonSerializer13, beanProperty14);
        impl0.setNullKeySerializer(objJsonSerializer13);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig17 = impl0.getConfig();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig18 = null;
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl0.createInstance(serializationConfig18, serializerFactory19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(defaultSerializerProvider6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(defaultSerializerProvider11);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNull(serializationConfig17);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = beanDeserializerFactory0._findCustomBeanDeserializer(javaType1, deserializationConfig2, beanDescription3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = beanDeserializerFactory0._findCustomBeanDeserializer(javaType5, deserializationConfig6, beanDescription7);
        com.fasterxml.jackson.databind.type.ArrayType arrayType9 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty13 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = objJsonDeserializer16.getObjectIdReader();
        java.lang.Object obj18 = objJsonDeserializer16.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty20 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty13, annotatedMember14, javaType15, objJsonDeserializer16, typeDeserializer19);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = objJsonDeserializer16.unwrappingDeserializer(nameTransformer21);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        java.lang.Object obj24 = objJsonDeserializer22.getEmptyValue(deserializationContext23);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext25 = null;
        java.lang.Object obj26 = objJsonDeserializer22.getNullValue(deserializationContext25);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer27 = beanDeserializerFactory0._findCustomArrayDeserializer(arrayType9, deserializationConfig10, beanDescription11, typeDeserializer12, objJsonDeserializer22);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType28 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig29 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription30 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer31 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty32 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember33 = null;
        com.fasterxml.jackson.databind.JavaType javaType34 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty35 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember36 = null;
        com.fasterxml.jackson.databind.JavaType javaType37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader39 = objJsonDeserializer38.getObjectIdReader();
        java.lang.Object obj40 = objJsonDeserializer38.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer41 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty42 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty35, annotatedMember36, javaType37, objJsonDeserializer38, typeDeserializer41);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty44 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty32, annotatedMember33, javaType34, objJsonDeserializer38, typeDeserializer43);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer45 = beanDeserializerFactory0._findCustomCollectionLikeDeserializer(collectionLikeType28, deserializationConfig29, beanDescription30, typeDeserializer31, objJsonDeserializer38);
        com.fasterxml.jackson.databind.JavaType javaType46 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig47 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.CollectionType collectionType48 = beanDeserializerFactory0._mapAbstractCollectionType(javaType46, deserializationConfig47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objectIdReader17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objJsonDeserializer22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(wildcardJsonDeserializer27);
        org.junit.Assert.assertNotNull(objJsonDeserializer38);
        org.junit.Assert.assertNull(objectIdReader39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(wildcardJsonDeserializer45);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator0 = null;
        java.io.Closeable closeable1 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation3 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException("`com.fasterxml.jackson.databind.JsonMappingException`", jsonLocation3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator0, closeable1, (java.lang.Exception) jsonMappingException4);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: `com.fasterxml.jackson.databind.JsonMappingException`");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = impl0.invalidTypeIdException(javaType2, "hi!", "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale7 = impl0.getLocale();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException5);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(deserializationContext0, "\"java.lang.String[?]\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.fasterxml.jackson.core.JsonLocation jsonLocation2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException3 = new com.fasterxml.jackson.databind.JsonMappingException("`com.fasterxml.jackson.databind.deser.BeanDeserializerFactory`", jsonLocation2);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException("`com.fasterxml.jackson.databind.JsonMappingException: hi!`", (java.lang.Throwable) jsonMappingException3);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = impl0.getDefaultNullKeySerializer();
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = impl0.findNullKeySerializer(javaType4, beanProperty5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl8);
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = impl8.invalidTypeIdException(javaType10, "hi!", "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl8);
        java.lang.Class<?> wildcardClass15 = impl14.getSerializationView();
        java.lang.Class<?> wildcardClass16 = impl14.getSerializationView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl17);
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException22 = impl17.invalidTypeIdException(javaType19, "hi!", "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider23 = impl17.copy();
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer26 = impl17.findNullKeySerializer(javaType24, beanProperty25);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl27);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider29 = impl27.copy();
        com.fasterxml.jackson.databind.introspect.Annotated annotated30 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig31 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig31);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig33 = beanDeserializerFactory32.getFactoryConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer34 = impl27.serializerInstance(annotated30, (java.lang.Object) deserializerFactoryConfig33);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl36 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl35);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider37 = impl35.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty38 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer39 = impl35.findNullValueSerializer(beanProperty38);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl40 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl41 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl40);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider42 = impl40.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty43 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer44 = impl40.findNullValueSerializer(beanProperty43);
        com.fasterxml.jackson.databind.BeanProperty beanProperty45 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer46 = impl35.handleSecondaryContextualization(objJsonSerializer44, beanProperty45);
        com.fasterxml.jackson.databind.BeanProperty beanProperty47 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer48 = impl27.handlePrimaryContextualization(objJsonSerializer44, beanProperty47);
        impl17.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer48);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl50 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl51 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl50);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider52 = impl50.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty53 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer54 = impl50.findNullValueSerializer(beanProperty53);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl55 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl56 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl55);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider57 = impl55.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty58 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer59 = impl55.findNullValueSerializer(beanProperty58);
        com.fasterxml.jackson.databind.BeanProperty beanProperty60 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer61 = impl50.handleSecondaryContextualization(objJsonSerializer59, beanProperty60);
        int int62 = impl50.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl63 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl64 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl63);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider65 = impl63.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty66 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer67 = impl63.findNullValueSerializer(beanProperty66);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl68 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl69 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl68);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider70 = impl68.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty71 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer72 = impl68.findNullValueSerializer(beanProperty71);
        com.fasterxml.jackson.databind.BeanProperty beanProperty73 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer74 = impl63.handleSecondaryContextualization(objJsonSerializer72, beanProperty73);
        impl50.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer74);
        impl17.setNullKeySerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer74);
        com.fasterxml.jackson.databind.BeanProperty beanProperty77 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer78 = impl14.handleSecondaryContextualization((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer74, beanProperty77);
        impl0.setDefaultKeySerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer78);
        org.junit.Assert.assertNull(serializationConfig1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(jsonMappingException13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(jsonMappingException22);
        org.junit.Assert.assertNotNull(defaultSerializerProvider23);
        org.junit.Assert.assertNotNull(objJsonSerializer26);
        org.junit.Assert.assertNotNull(defaultSerializerProvider29);
        org.junit.Assert.assertNull(deserializerFactoryConfig33);
        org.junit.Assert.assertNull(objJsonSerializer34);
        org.junit.Assert.assertNotNull(defaultSerializerProvider37);
        org.junit.Assert.assertNotNull(objJsonSerializer39);
        org.junit.Assert.assertNotNull(defaultSerializerProvider42);
        org.junit.Assert.assertNotNull(objJsonSerializer44);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer46);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer48);
        org.junit.Assert.assertNotNull(defaultSerializerProvider52);
        org.junit.Assert.assertNotNull(objJsonSerializer54);
        org.junit.Assert.assertNotNull(defaultSerializerProvider57);
        org.junit.Assert.assertNotNull(objJsonSerializer59);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider65);
        org.junit.Assert.assertNotNull(objJsonSerializer67);
        org.junit.Assert.assertNotNull(defaultSerializerProvider70);
        org.junit.Assert.assertNotNull(objJsonSerializer72);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer74);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer78);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator9 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig7, javaType8);
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator10 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(stdValueInstantiator2, stdValueInstantiator9);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = null;
        stdValueInstantiator10.configureFromStringCreator(annotatedWithParams11);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = null;
        stdValueInstantiator10.configureFromLongCreator(annotatedWithParams13);
        boolean boolean15 = stdValueInstantiator10.canCreateUsingDefault();
        boolean boolean16 = stdValueInstantiator10.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = null;
        stdValueInstantiator10.configureFromIntCreator(annotatedWithParams17);
        boolean boolean19 = stdValueInstantiator10.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig20 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray21 = stdValueInstantiator10.getFromObjectArguments(deserializationConfig20);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext22 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray23 = null;
        com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer propertyValueBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = stdValueInstantiator10.createFromObjectWith(deserializationContext22, settableBeanPropertyArray23, propertyValueBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stdValueInstantiator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray21);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder4 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray5 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, beanPropertyDefinitionArray5);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList14 = beanDeserializerFactory1.filterBeanProps(deserializationContext2, beanDescription3, beanDeserializerBuilder4, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, (java.util.Set<java.lang.String>) strSet12);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig15 = beanDeserializerFactory1.getFactoryConfig();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty19 = beanDeserializerFactory1.constructAnySetter(deserializationContext16, beanDescription17, annotatedMember18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray5);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray5, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList14);
        org.junit.Assert.assertNull(deserializerFactoryConfig15);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) objJsonDeserializer3, (int) '#');
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser7, "[null]");
        java.lang.Throwable throwable10 = com.fasterxml.jackson.databind.util.ClassUtil.getRootCause((java.lang.Throwable) jsonMappingException9);
        jsonMappingException6.prependPath((java.lang.Object) throwable10, (int) (short) 1);
        java.io.Closeable closeable13 = null;
        java.io.Closeable closeable15 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        java.io.Closeable closeable19 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation21 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException22 = new com.fasterxml.jackson.databind.JsonMappingException(closeable19, "hi!", jsonLocation21);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException23 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser17, "hi!", (java.lang.Throwable) jsonMappingException22);
        java.lang.StringBuilder stringBuilder24 = null;
        java.lang.StringBuilder stringBuilder25 = jsonMappingException22.getPathReference(stringBuilder24);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException26 = new com.fasterxml.jackson.databind.JsonMappingException(closeable15, "[null]", (java.lang.Throwable) jsonMappingException22);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException27 = new com.fasterxml.jackson.databind.JsonMappingException(closeable13, "hi!", (java.lang.Throwable) jsonMappingException26);
        jsonMappingException6.addSuppressed((java.lang.Throwable) jsonMappingException26);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference31 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) "hi!", (int) (short) 100);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException32 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException26, reference31);
        java.lang.Throwable throwable33 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfRTE((java.lang.Throwable) jsonMappingException26);
        java.lang.Throwable[] throwableArray34 = jsonMappingException26.getSuppressed();
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(jsonMappingException6);
        org.junit.Assert.assertNotNull(jsonMappingException9);
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "[null]");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "[null]");
        org.junit.Assert.assertEquals(throwable10.toString(), "com.fasterxml.jackson.databind.JsonMappingException: [null]");
        org.junit.Assert.assertNotNull(jsonMappingException23);
        org.junit.Assert.assertNull(stringBuilder25);
        org.junit.Assert.assertNotNull(jsonMappingException32);
        org.junit.Assert.assertNotNull(throwable33);
        org.junit.Assert.assertEquals(throwable33.getLocalizedMessage(), "[null] (through reference chain: java.lang.String[100])");
        org.junit.Assert.assertEquals(throwable33.getMessage(), "[null] (through reference chain: java.lang.String[100])");
        org.junit.Assert.assertEquals(throwable33.toString(), "com.fasterxml.jackson.databind.JsonMappingException: [null] (through reference chain: java.lang.String[100])");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertArrayEquals(throwableArray34, new java.lang.Throwable[] {});
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.io.Closeable closeable0 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException3 = new com.fasterxml.jackson.databind.JsonMappingException(closeable0, "``com.fasterxml.jackson.databind.JsonMappingException``", jsonLocation2);
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache4 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache4.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache4._incompleteDeserializers;
        jsonMappingException3.prependPath((java.lang.Object) javaTypeMap6, 16);
        java.lang.Throwable throwable9 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfRTE((java.lang.Throwable) jsonMappingException3);
        java.lang.Throwable[] throwableArray10 = jsonMappingException3.getSuppressed();
        java.lang.String str11 = jsonMappingException3.toString();
        java.lang.Class<?> wildcardClass12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf((java.lang.Object) str11);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "``com.fasterxml.jackson.databind.JsonMappingException`` (through reference chain: java.util.HashMap[16])");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "``com.fasterxml.jackson.databind.JsonMappingException`` (through reference chain: java.util.HashMap[16])");
        org.junit.Assert.assertEquals(throwable9.toString(), "com.fasterxml.jackson.databind.JsonMappingException: ``com.fasterxml.jackson.databind.JsonMappingException`` (through reference chain: java.util.HashMap[16])");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.fasterxml.jackson.databind.JsonMappingException: ``com.fasterxml.jackson.databind.JsonMappingException`` (through reference chain: java.util.HashMap[16])" + "'", str11, "com.fasterxml.jackson.databind.JsonMappingException: ``com.fasterxml.jackson.databind.JsonMappingException`` (through reference chain: java.util.HashMap[16])");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.type.ArrayType arrayType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objJsonDeserializer8.getObjectIdReader();
        java.lang.Object obj10 = objJsonDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty5, annotatedMember6, javaType7, objJsonDeserializer8, typeDeserializer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = objJsonDeserializer8.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = objJsonDeserializer14.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = objJsonDeserializer14.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = beanDeserializerFactory0._findCustomArrayDeserializer(arrayType1, deserializationConfig2, beanDescription3, typeDeserializer4, objJsonDeserializer14);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig20 = beanDeserializerFactory0._factoryConfig;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer24 = beanDeserializerFactory0.findStdDeserializer(deserializationContext21, javaType22, beanDescription23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objJsonDeserializer18);
        org.junit.Assert.assertNull(wildcardJsonDeserializer19);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig20);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory9 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.type.ArrayType arrayType10 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader18 = objJsonDeserializer17.getObjectIdReader();
        java.lang.Object obj19 = objJsonDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty21 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty14, annotatedMember15, javaType16, objJsonDeserializer17, typeDeserializer20);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = objJsonDeserializer17.unwrappingDeserializer(nameTransformer22);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext24 = null;
        java.lang.Object obj25 = objJsonDeserializer23.getEmptyValue(deserializationContext24);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = objJsonDeserializer23.unwrappingDeserializer(nameTransformer26);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer28 = beanDeserializerFactory9._findCustomArrayDeserializer(arrayType10, deserializationConfig11, beanDescription12, typeDeserializer13, objJsonDeserializer23);
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = deserializerCache0._createDeserializer(deserializationContext8, (com.fasterxml.jackson.databind.deser.DeserializerFactory) beanDeserializerFactory9, javaType29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(beanDeserializerFactory9);
        org.junit.Assert.assertNotNull(objJsonDeserializer17);
        org.junit.Assert.assertNull(objectIdReader18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objJsonDeserializer23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objJsonDeserializer27);
        org.junit.Assert.assertNull(wildcardJsonDeserializer28);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator0 = null;
        java.io.Closeable closeable2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException(closeable2, "hi!");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator0, "`com.fasterxml.jackson.databind.JsonMappingException`", (java.lang.Throwable) jsonMappingException4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Throwable throwable6 = com.fasterxml.jackson.databind.util.ClassUtil.throwRootCauseIfIOE((java.lang.Throwable) jsonMappingException4);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: hi!");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException5);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromBooleanCreator(annotatedWithParams8);
        boolean boolean10 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = null;
        stdValueInstantiator2.configureFromLongCreator(annotatedWithParams11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stdValueInstantiator2.createFromDouble(deserializationContext13, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty6 };
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams3, annotatedWithParams4, javaType5, settableBeanPropertyArray7, annotatedWithParams8, settableBeanPropertyArray9);
        boolean boolean11 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean12 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams15);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = stdValueInstantiator2.getDelegateCreator();
        org.junit.Assert.assertNotNull(settableBeanPropertyArray7);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray7, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray9);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray9, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertNull(annotatedWithParams17);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objJsonDeserializer6.getObjectIdReader();
        java.lang.Object obj8 = objJsonDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty10 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty3, annotatedMember4, javaType5, objJsonDeserializer6, typeDeserializer9);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer6, typeDeserializer11);
        boolean boolean13 = settableAnyProperty12._setterIsField;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = settableAnyProperty12._valueDeserializer;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = objJsonDeserializer14.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = objJsonDeserializer14.getDelegatee();
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        java.lang.String str7 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromLongCreator(annotatedWithParams8);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = stdValueInstantiator2.getArrayDelegateCreator();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UNKNOWN TYPE" + "'", str7, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator0 = null;
        java.io.Closeable closeable1 = null;
        java.io.Closeable closeable2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        java.io.Closeable closeable6 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = new com.fasterxml.jackson.databind.JsonMappingException(closeable6, "hi!", jsonLocation8);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException10 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser4, "hi!", (java.lang.Throwable) jsonMappingException9);
        java.lang.StringBuilder stringBuilder11 = null;
        java.lang.StringBuilder stringBuilder12 = jsonMappingException9.getPathReference(stringBuilder11);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = new com.fasterxml.jackson.databind.JsonMappingException(closeable2, "[null]", (java.lang.Throwable) jsonMappingException9);
        java.lang.String str14 = jsonMappingException9.getOriginalMessage();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator0, closeable1, (java.lang.Exception) jsonMappingException9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: hi!");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException10);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objJsonDeserializer6.getObjectIdReader();
        java.lang.Object obj8 = objJsonDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty10 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty3, annotatedMember4, javaType5, objJsonDeserializer6, typeDeserializer9);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer6, typeDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty14 = settableAnyProperty12.withValueDeserializer(objJsonDeserializer13);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = settableAnyProperty12._valueDeserializer;
        java.lang.String str16 = com.fasterxml.jackson.databind.util.ClassUtil.classNameOf((java.lang.Object) objJsonDeserializer15);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(settableAnyProperty14);
        org.junit.Assert.assertNotNull(objJsonDeserializer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "`com.fasterxml.jackson.databind.deser.impl.FailingDeserializer`" + "'", str16, "`com.fasterxml.jackson.databind.deser.impl.FailingDeserializer`");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = impl0.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl4);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = impl4.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = impl4.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = impl0.handleSecondaryContextualization(objJsonSerializer7, beanProperty8);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider10 = impl0.copy();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = defaultSerializerProvider10.getConfig();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = null;
        java.io.Closeable closeable14 = null;
        java.io.Closeable closeable16 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException18 = new com.fasterxml.jackson.databind.JsonMappingException(closeable16, "hi!");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException19 = new com.fasterxml.jackson.databind.JsonMappingException(closeable14, "hi!", (java.lang.Throwable) jsonMappingException18);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException20 = new com.fasterxml.jackson.databind.JsonMappingException("`com.fasterxml.jackson.databind.JsonMappingException: hi!`", (java.lang.Throwable) jsonMappingException18);
        // The following exception was thrown during execution in test generation
        try {
            defaultSerializerProvider10.serializeValue(jsonGenerator12, (java.lang.Object) jsonMappingException20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(defaultSerializerProvider6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(defaultSerializerProvider10);
        org.junit.Assert.assertNull(serializationConfig11);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        java.lang.Object obj5 = objJsonDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty7 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer3, typeDeserializer6);
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = settableAnyProperty7.getProperty();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = settableAnyProperty7._valueTypeDeserializer;
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = settableAnyProperty7._property;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = objJsonDeserializer14.getObjectIdReader();
        java.lang.Object obj16 = objJsonDeserializer14.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty18 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty11, annotatedMember12, javaType13, objJsonDeserializer14, typeDeserializer17);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException21 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser19, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        jsonMappingException21.prependPath((java.lang.Object) objJsonDeserializer22, "[null]");
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern25 = objJsonDeserializer22.getEmptyAccessPattern();
        settableAnyProperty18._valueDeserializer = objJsonDeserializer22;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer28 = objJsonDeserializer22.unwrappingDeserializer(nameTransformer27);
        settableAnyProperty7._valueDeserializer = objJsonDeserializer22;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader31 = objJsonDeserializer30.getObjectIdReader();
        java.lang.Object obj32 = objJsonDeserializer30.getNullValue();
        settableAnyProperty7._valueDeserializer = objJsonDeserializer30;
        com.fasterxml.jackson.databind.BeanProperty beanProperty34 = settableAnyProperty7.getProperty();
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(beanProperty8);
        org.junit.Assert.assertNull(typeDeserializer9);
        org.junit.Assert.assertNull(beanProperty10);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(jsonMappingException21);
        org.junit.Assert.assertNotNull(objJsonDeserializer22);
        org.junit.Assert.assertTrue("'" + accessPattern25 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern25.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNotNull(objJsonDeserializer28);
        org.junit.Assert.assertNotNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(objectIdReader31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(beanProperty34);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean4 = stdValueInstantiator2.canCreateUsingDelegate();
        java.lang.Class<?> wildcardClass5 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig8, javaType9);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty14 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray15 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty14 };
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray17 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator10.configureFromObjectSettings(annotatedWithParams11, annotatedWithParams12, javaType13, settableBeanPropertyArray15, annotatedWithParams16, settableBeanPropertyArray17);
        stdValueInstantiator2.configureFromArraySettings(annotatedWithParams6, javaType7, settableBeanPropertyArray15);
        java.lang.String str20 = com.fasterxml.jackson.databind.util.ClassUtil.classNameOf((java.lang.Object) stdValueInstantiator2);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams21 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams21);
        java.lang.Class<?> wildcardClass23 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams24 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams24);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams26 = stdValueInstantiator2.getDefaultCreator();
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray15);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray15, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray17);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray17, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "`com.fasterxml.jackson.databind.deser.std.StdValueInstantiator`" + "'", str20, "`com.fasterxml.jackson.databind.deser.std.StdValueInstantiator`");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(annotatedWithParams26);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) objJsonDeserializer3, (int) '#');
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = jsonMappingException6.getLocation();
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(jsonMappingException6);
        org.junit.Assert.assertNull(jsonLocation7);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig4 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig4);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig6 = beanDeserializerFactory5.getFactoryConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = impl0.serializerInstance(annotated3, (java.lang.Object) deserializerFactoryConfig6);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl8);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider10 = impl8.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = impl8.findNullValueSerializer(beanProperty11);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl13.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl13.findNullValueSerializer(beanProperty16);
        com.fasterxml.jackson.databind.BeanProperty beanProperty18 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = impl8.handleSecondaryContextualization(objJsonSerializer17, beanProperty18);
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = impl0.handlePrimaryContextualization(objJsonSerializer17, beanProperty20);
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer24 = impl0.findNullKeySerializer(javaType22, beanProperty23);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = null;
        // The following exception was thrown during execution in test generation
        try {
            impl0.defaultSerializeNull(jsonGenerator26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNull(deserializerFactoryConfig6);
        org.junit.Assert.assertNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(defaultSerializerProvider10);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertNotNull(objJsonSerializer24);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty6 };
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams3, annotatedWithParams4, javaType5, settableBeanPropertyArray7, annotatedWithParams8, settableBeanPropertyArray9);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = stdValueInstantiator2.getDelegateType(deserializationConfig11);
        boolean boolean13 = stdValueInstantiator2.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig14);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams16);
        boolean boolean18 = stdValueInstantiator2.canInstantiate();
        org.junit.Assert.assertNotNull(settableBeanPropertyArray7);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray7, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray9);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray9, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        java.io.Closeable closeable4 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = new com.fasterxml.jackson.databind.JsonMappingException(closeable4, "hi!", jsonLocation6);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = new com.fasterxml.jackson.databind.JsonMappingException("hi!", (java.lang.Throwable) jsonMappingException7);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "[null]", (java.lang.Throwable) jsonMappingException7);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "java.lang.Short[?]");
        java.lang.Class<?> wildcardClass12 = impl0.getActiveView();
        java.lang.Class<?> wildcardClass13 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl14.copy();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl16 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(impl0, impl14);
        java.lang.String str18 = com.fasterxml.jackson.databind.util.ClassUtil.quotedOr((java.lang.Object) impl14, "com.fasterxml.jackson.databind.JsonMappingException[1]->com.fasterxml.jackson.databind.deser.impl.FailingDeserializer[35]");
        org.junit.Assert.assertNotNull(jsonMappingException9);
        org.junit.Assert.assertNotNull(jsonMappingException11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(impl16);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = impl3.getConfig();
        java.lang.Class<?> wildcardClass5 = impl3.getActiveView();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = impl3.getDefaultNullKeySerializer();
        impl0.setNullValueSerializer(objJsonSerializer6);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig9 = impl8.getConfig();
        java.lang.Class<?> wildcardClass10 = impl8.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl8);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException15 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser13, "[null]");
        java.lang.Throwable throwable16 = com.fasterxml.jackson.databind.util.ClassUtil.getRootCause((java.lang.Throwable) jsonMappingException15);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig17 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig17);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription20 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder21 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray22 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList23 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList23, beanPropertyDefinitionArray22);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList31 = beanDeserializerFactory18.filterBeanProps(deserializationContext19, beanDescription20, beanDeserializerBuilder21, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList23, (java.util.Set<java.lang.String>) strSet29);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException33 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException15, (java.lang.Object) beanPropertyDefinitionList23, 1);
        java.util.List<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList34 = jsonMappingException15.getPath();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException35 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl8, "class java.lang.Long", (java.lang.Throwable) jsonMappingException15);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl36 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl37 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl36);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider38 = impl36.copy();
        int int39 = defaultSerializerProvider38.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl40 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl41 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl40);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider42 = impl40.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty43 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer44 = impl40.findNullValueSerializer(beanProperty43);
        defaultSerializerProvider38.setNullValueSerializer(objJsonSerializer44);
        com.fasterxml.jackson.databind.BeanProperty beanProperty46 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = impl8.handlePrimaryContextualization(objJsonSerializer44, beanProperty46);
        com.fasterxml.jackson.databind.BeanProperty beanProperty48 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = impl0.handleSecondaryContextualization(objJsonSerializer44, beanProperty48);
        java.util.Date date50 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator51 = null;
        // The following exception was thrown during execution in test generation
        try {
            impl0.defaultSerializeDateValue(date50, jsonGenerator51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonGenerator2);
        org.junit.Assert.assertNull(serializationConfig4);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNull(serializationConfig9);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonMappingException15);
        org.junit.Assert.assertNotNull(throwable16);
        org.junit.Assert.assertEquals(throwable16.getLocalizedMessage(), "[null] (through reference chain: java.util.ArrayList[1])");
        org.junit.Assert.assertEquals(throwable16.getMessage(), "[null] (through reference chain: java.util.ArrayList[1])");
        org.junit.Assert.assertEquals(throwable16.toString(), "com.fasterxml.jackson.databind.JsonMappingException: [null] (through reference chain: java.util.ArrayList[1])");
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray22);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray22, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList31);
        org.junit.Assert.assertNotNull(jsonMappingException33);
        org.junit.Assert.assertNotNull(referenceList34);
        org.junit.Assert.assertNotNull(jsonMappingException35);
        org.junit.Assert.assertNotNull(defaultSerializerProvider38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider42);
        org.junit.Assert.assertNotNull(objJsonSerializer44);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer49);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objJsonDeserializer6.getObjectIdReader();
        java.lang.Object obj8 = objJsonDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty10 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty3, annotatedMember4, javaType5, objJsonDeserializer6, typeDeserializer9);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer6, typeDeserializer11);
        boolean boolean13 = settableAnyProperty12._setterIsField;
        com.fasterxml.jackson.databind.JavaType javaType14 = settableAnyProperty12._type;
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty18 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader22 = objJsonDeserializer21.getObjectIdReader();
        java.lang.Object obj23 = objJsonDeserializer21.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty25 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty18, annotatedMember19, javaType20, objJsonDeserializer21, typeDeserializer24);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty27 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty15, annotatedMember16, javaType17, objJsonDeserializer21, typeDeserializer26);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = objJsonDeserializer21.unwrappingDeserializer(nameTransformer28);
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty30 = settableAnyProperty12.withValueDeserializer(objJsonDeserializer21);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig31 = null;
        // The following exception was thrown during execution in test generation
        try {
            settableAnyProperty12.fixAccess(deserializationConfig31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(objJsonDeserializer21);
        org.junit.Assert.assertNull(objectIdReader22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objJsonDeserializer29);
        org.junit.Assert.assertNotNull(settableAnyProperty30);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objJsonDeserializer6.getObjectIdReader();
        java.lang.Object obj8 = objJsonDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty10 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty3, annotatedMember4, javaType5, objJsonDeserializer6, typeDeserializer9);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty12 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer6, typeDeserializer11);
        com.fasterxml.jackson.databind.JavaType javaType13 = settableAnyProperty12.getType();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        // The following exception was thrown during execution in test generation
        try {
            settableAnyProperty12.fixAccess(deserializationConfig14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider0 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation3 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException("`java.lang.Short[?]`", jsonLocation3);
        java.lang.StringBuilder stringBuilder5 = null;
        java.lang.StringBuilder stringBuilder6 = jsonMappingException4.getPathReference(stringBuilder5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl7);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider9 = impl7.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = impl7.findNullValueSerializer(beanProperty10);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl12);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider14 = impl12.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = impl12.findNullValueSerializer(beanProperty15);
        com.fasterxml.jackson.databind.BeanProperty beanProperty17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = impl7.handleSecondaryContextualization(objJsonSerializer16, beanProperty17);
        int int19 = impl7.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl20);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider22 = impl20.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer24 = impl20.findNullValueSerializer(beanProperty23);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl25);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider27 = impl25.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty28 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer29 = impl25.findNullValueSerializer(beanProperty28);
        com.fasterxml.jackson.databind.BeanProperty beanProperty30 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = impl20.handleSecondaryContextualization(objJsonSerializer29, beanProperty30);
        impl7.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer31);
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty34 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer35 = impl7.findNullKeySerializer(javaType33, beanProperty34);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference37 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) javaType33, 8);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException39 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException4, (java.lang.Object) 8, "[null]");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonMappingException jsonMappingException40 = com.fasterxml.jackson.databind.JsonMappingException.from(serializerProvider0, "java.lang.Long[\"``java.lang.Short[?]``\"]", (java.lang.Throwable) jsonMappingException4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(defaultSerializerProvider9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(defaultSerializerProvider14);
        org.junit.Assert.assertNotNull(objJsonSerializer16);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider22);
        org.junit.Assert.assertNotNull(objJsonSerializer24);
        org.junit.Assert.assertNotNull(defaultSerializerProvider27);
        org.junit.Assert.assertNotNull(objJsonSerializer29);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer31);
        org.junit.Assert.assertNotNull(objJsonSerializer35);
        org.junit.Assert.assertNotNull(jsonMappingException39);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator0 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator2, "hi!");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator0, "`com.fasterxml.jackson.databind.JsonMappingException`", (java.lang.Throwable) jsonMappingException4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Throwable throwable6 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfIOE((java.lang.Throwable) jsonMappingException4);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: hi!");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException4);
        org.junit.Assert.assertNotNull(jsonMappingException5);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean4 = stdValueInstantiator2.canCreateUsingDelegate();
        java.lang.Class<?> wildcardClass5 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stdValueInstantiator2.createFromString(deserializationContext7, "com.fasterxml.jackson.databind.JsonMappingException: com.fasterxml.jackson.databind.JsonMappingException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(annotatedParameter6);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        java.io.Closeable closeable4 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = new com.fasterxml.jackson.databind.JsonMappingException(closeable4, "hi!", jsonLocation6);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = new com.fasterxml.jackson.databind.JsonMappingException("hi!", (java.lang.Throwable) jsonMappingException7);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "[null]", (java.lang.Throwable) jsonMappingException7);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "java.lang.Short[?]");
        java.lang.Class<?> wildcardClass12 = impl0.getActiveView();
        java.lang.Class<?> wildcardClass13 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        org.junit.Assert.assertNotNull(jsonMappingException9);
        org.junit.Assert.assertNotNull(jsonMappingException11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass13);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.io.Closeable closeable0 = null;
        java.io.Closeable closeable2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException(closeable2, "hi!");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = new com.fasterxml.jackson.databind.JsonMappingException(closeable0, "hi!", (java.lang.Throwable) jsonMappingException4);
        java.lang.String str6 = jsonMappingException5.toString();
        java.lang.Throwable throwable7 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfError((java.lang.Throwable) jsonMappingException5);
        java.lang.Throwable throwable8 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfError((java.lang.Throwable) jsonMappingException5);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        java.io.Closeable closeable12 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        java.io.Closeable closeable16 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException19 = new com.fasterxml.jackson.databind.JsonMappingException(closeable16, "hi!", jsonLocation18);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException20 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser14, "hi!", (java.lang.Throwable) jsonMappingException19);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException21 = new com.fasterxml.jackson.databind.JsonMappingException(closeable12, "", (java.lang.Throwable) jsonMappingException19);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException22 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser10, "", (java.lang.Throwable) jsonMappingException21);
        java.lang.String str23 = jsonMappingException22.getPathReference();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException24 = new com.fasterxml.jackson.databind.JsonMappingException("``java.lang.Double``", (java.lang.Throwable) jsonMappingException22);
        java.lang.String str25 = jsonMappingException22.getPathReference();
        throwable8.addSuppressed((java.lang.Throwable) jsonMappingException22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.fasterxml.jackson.databind.JsonMappingException: hi!" + "'", str6, "com.fasterxml.jackson.databind.JsonMappingException: hi!");
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.toString(), "com.fasterxml.jackson.databind.JsonMappingException: hi!");
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.toString(), "com.fasterxml.jackson.databind.JsonMappingException: hi!");
        org.junit.Assert.assertNotNull(jsonMappingException20);
        org.junit.Assert.assertNotNull(jsonMappingException22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = beanDeserializerFactory0._findCustomBeanDeserializer(javaType1, deserializationConfig2, beanDescription3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = beanDeserializerFactory0._findCustomBeanDeserializer(javaType5, deserializationConfig6, beanDescription7);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig9 = beanDeserializerFactory0._factoryConfig;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanDeserializerFactory0.addBackReferenceProperties(deserializationContext10, beanDescription11, beanDeserializerBuilder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig9);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objJsonDeserializer6.getObjectIdReader();
        java.lang.Object obj8 = objJsonDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty10 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty3, annotatedMember4, javaType5, objJsonDeserializer6, typeDeserializer9);
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = settableAnyProperty10.getProperty();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = settableAnyProperty10._valueTypeDeserializer;
        com.fasterxml.jackson.databind.BeanProperty beanProperty13 = settableAnyProperty10._property;
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader18 = objJsonDeserializer17.getObjectIdReader();
        java.lang.Object obj19 = objJsonDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty21 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty14, annotatedMember15, javaType16, objJsonDeserializer17, typeDeserializer20);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException24 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser22, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        jsonMappingException24.prependPath((java.lang.Object) objJsonDeserializer25, "[null]");
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern28 = objJsonDeserializer25.getEmptyAccessPattern();
        settableAnyProperty21._valueDeserializer = objJsonDeserializer25;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = objJsonDeserializer25.unwrappingDeserializer(nameTransformer30);
        settableAnyProperty10._valueDeserializer = objJsonDeserializer25;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty34 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer25, typeDeserializer33);
        java.util.Collection<java.lang.Object> objCollection35 = objJsonDeserializer25.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext36 = null;
        java.lang.Object obj37 = objJsonDeserializer25.getNullValue(deserializationContext36);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(beanProperty11);
        org.junit.Assert.assertNull(typeDeserializer12);
        org.junit.Assert.assertNull(beanProperty13);
        org.junit.Assert.assertNotNull(objJsonDeserializer17);
        org.junit.Assert.assertNull(objectIdReader18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(jsonMappingException24);
        org.junit.Assert.assertNotNull(objJsonDeserializer25);
        org.junit.Assert.assertTrue("'" + accessPattern28 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern28.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNotNull(objJsonDeserializer31);
        org.junit.Assert.assertNull(objCollection35);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "com.fasterxml.jackson.databind.JsonMappingException: `java.lang.Class`");
        java.io.Closeable closeable3 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = new com.fasterxml.jackson.databind.JsonMappingException(closeable3, "``com.fasterxml.jackson.databind.JsonMappingException``", jsonLocation5);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference9 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) "hi!", (int) (short) 100);
        java.lang.String str10 = reference9.getFieldName();
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference11 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) reference9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException12 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException6, reference9);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException15 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator13, "`com.fasterxml.jackson.databind.JsonMappingException`");
        jsonMappingException12.addSuppressed((java.lang.Throwable) jsonMappingException15);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference17 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) jsonMappingException12);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException18 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, reference17);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference19 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) jsonMappingException2);
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jsonMappingException12);
        org.junit.Assert.assertNotNull(jsonMappingException15);
        org.junit.Assert.assertNotNull(jsonMappingException18);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = impl0.invalidTypeIdException(javaType2, "hi!", "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = impl0.copy();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl0.findNullKeySerializer(javaType7, beanProperty8);
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = impl0.resolveSubType(javaType10, "java.lang.Double[11]");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.InvalidTypeIdException; message: Could not resolve type id 'java.lang.Double[11]' as a subtype of null: problem: (java.lang.NullPointerException) null");
        } catch (com.fasterxml.jackson.databind.exc.InvalidTypeIdException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException5);
        org.junit.Assert.assertNotNull(defaultSerializerProvider6);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        java.lang.Object obj5 = objJsonDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty7 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer3, typeDeserializer6);
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = settableAnyProperty7.getProperty();
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = settableAnyProperty7.getProperty();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = settableAnyProperty7._property;
        boolean boolean11 = settableAnyProperty7.hasValueDeserializer();
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(beanProperty8);
        org.junit.Assert.assertNull(beanProperty9);
        org.junit.Assert.assertNull(beanProperty10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator9 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig7, javaType8);
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator10 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(stdValueInstantiator2, stdValueInstantiator9);
        boolean boolean11 = stdValueInstantiator10.canCreateFromString();
        boolean boolean12 = stdValueInstantiator10.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = stdValueInstantiator10.getArrayDelegateType(deserializationConfig13);
        boolean boolean15 = stdValueInstantiator10.canCreateFromLong();
        boolean boolean16 = stdValueInstantiator10.canCreateFromObjectWith();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stdValueInstantiator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl5.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl5.findNullValueSerializer(beanProperty8);
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = impl0.handleSecondaryContextualization(objJsonSerializer9, beanProperty10);
        int int12 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl13.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl13.findNullValueSerializer(beanProperty16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl18.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = impl18.findNullValueSerializer(beanProperty21);
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = impl13.handleSecondaryContextualization(objJsonSerializer22, beanProperty23);
        impl0.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer24);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = impl26.getGenerator();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer28 = impl26.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl29);
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException34 = impl29.invalidTypeIdException(javaType31, "hi!", "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl29);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer36 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        impl29.setNullKeySerializer(objJsonSerializer36);
        com.fasterxml.jackson.databind.BeanProperty beanProperty38 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer39 = impl26.handlePrimaryContextualization(objJsonSerializer36, beanProperty38);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer40 = impl26.getDefaultNullKeySerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider41 = impl26.copy();
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNull(jsonGenerator27);
        org.junit.Assert.assertNotNull(objJsonSerializer28);
        org.junit.Assert.assertNotNull(jsonMappingException34);
        org.junit.Assert.assertNotNull(objJsonSerializer36);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer39);
        org.junit.Assert.assertNotNull(objJsonSerializer40);
        org.junit.Assert.assertNotNull(defaultSerializerProvider41);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig1 = beanDeserializerFactory0.getFactoryConfig();
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig1);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig3 = beanDeserializerFactory2._factoryConfig;
        java.lang.String str4 = com.fasterxml.jackson.databind.util.ClassUtil.classNameOf((java.lang.Object) deserializerFactoryConfig3);
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig1);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "`com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig`" + "'", str4, "`com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig`");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder4 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray5 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, beanPropertyDefinitionArray5);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList14 = beanDeserializerFactory1.filterBeanProps(deserializationContext2, beanDescription3, beanDeserializerBuilder4, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, (java.util.Set<java.lang.String>) strSet12);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig15 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory16 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig15);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig17 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory18 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig17);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod21 = beanDeserializerFactory1._findJsonValueFor(deserializationConfig19, javaType20);
        com.fasterxml.jackson.databind.deser.KeyDeserializers keyDeserializers22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory23 = beanDeserializerFactory1.withAdditionalKeyDeserializers(keyDeserializers22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray5);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray5, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList14);
        org.junit.Assert.assertNotNull(deserializerFactory16);
        org.junit.Assert.assertNotNull(deserializerFactory18);
        org.junit.Assert.assertNull(annotatedMethod21);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        java.lang.Object obj5 = objJsonDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty7 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer3, typeDeserializer6);
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = settableAnyProperty7.getProperty();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = settableAnyProperty7._valueTypeDeserializer;
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = settableAnyProperty7._property;
        com.fasterxml.jackson.databind.JavaType javaType11 = settableAnyProperty7.getType();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException14 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser12, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = objJsonDeserializer15.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException18 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException14, (java.lang.Object) objJsonDeserializer15, (int) '#');
        java.lang.Object obj19 = objJsonDeserializer15.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        java.lang.Object obj21 = objJsonDeserializer15.getEmptyValue(deserializationContext20);
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty22 = settableAnyProperty7.withValueDeserializer(objJsonDeserializer15);
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern23 = objJsonDeserializer15.getEmptyAccessPattern();
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(beanProperty8);
        org.junit.Assert.assertNull(typeDeserializer9);
        org.junit.Assert.assertNull(beanProperty10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(jsonMappingException14);
        org.junit.Assert.assertNotNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertNotNull(jsonMappingException18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(settableAnyProperty22);
        org.junit.Assert.assertTrue("'" + accessPattern23 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern23.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder4 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray5 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, beanPropertyDefinitionArray5);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList14 = beanDeserializerFactory1.filterBeanProps(deserializationContext2, beanDescription3, beanDeserializerBuilder4, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, (java.util.Set<java.lang.String>) strSet12);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig15 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory16 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig15);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig17 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory18 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig17);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod21 = beanDeserializerFactory1._findJsonValueFor(deserializationConfig19, javaType20);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = beanDeserializerFactory1.createBeanDeserializer(deserializationContext22, javaType23, beanDescription24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray5);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray5, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList14);
        org.junit.Assert.assertNotNull(deserializerFactory16);
        org.junit.Assert.assertNotNull(deserializerFactory18);
        org.junit.Assert.assertNull(annotatedMethod21);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.fasterxml.jackson.core.JsonLocation jsonLocation1 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = new com.fasterxml.jackson.databind.JsonMappingException("``com.fasterxml.jackson.databind.JsonMappingException: hi!``", jsonLocation1);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl5.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl5.findNullValueSerializer(beanProperty8);
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = impl0.handleSecondaryContextualization(objJsonSerializer9, beanProperty10);
        int int12 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl13.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl13.findNullValueSerializer(beanProperty16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl18.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = impl18.findNullValueSerializer(beanProperty21);
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = impl13.handleSecondaryContextualization(objJsonSerializer22, beanProperty23);
        impl0.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer24);
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer28 = impl0.findNullKeySerializer(javaType26, beanProperty27);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig29 = impl0.getConfig();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(objJsonSerializer28);
        org.junit.Assert.assertNull(serializationConfig29);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.io.Closeable closeable0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        java.io.Closeable closeable4 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = new com.fasterxml.jackson.databind.JsonMappingException(closeable4, "hi!", jsonLocation6);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser2, "hi!", (java.lang.Throwable) jsonMappingException7);
        java.lang.StringBuilder stringBuilder9 = null;
        java.lang.StringBuilder stringBuilder10 = jsonMappingException7.getPathReference(stringBuilder9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = new com.fasterxml.jackson.databind.JsonMappingException(closeable0, "[null]", (java.lang.Throwable) jsonMappingException7);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = new com.fasterxml.jackson.databind.JsonMappingException("`java.lang.Long`");
        jsonMappingException11.prependPath((java.lang.Object) jsonMappingException13, "`com.fasterxml.jackson.databind.JsonMappingException`");
        java.lang.String str16 = jsonMappingException11.getPathReference();
        org.junit.Assert.assertNotNull(jsonMappingException8);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.JsonMappingException[\"`com.fasterxml.jackson.databind.JsonMappingException`\"]" + "'", str16, "com.fasterxml.jackson.databind.JsonMappingException[\"`com.fasterxml.jackson.databind.JsonMappingException`\"]");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder4 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray5 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, beanPropertyDefinitionArray5);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList14 = beanDeserializerFactory1.filterBeanProps(deserializationContext2, beanDescription3, beanDeserializerBuilder4, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, (java.util.Set<java.lang.String>) strSet12);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig15 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory16 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig15);
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory17 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = beanDeserializerFactory17._findCustomBeanDeserializer(javaType18, deserializationConfig19, beanDescription20);
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig23 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = beanDeserializerFactory17._findCustomBeanDeserializer(javaType22, deserializationConfig23, beanDescription24);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig26 = beanDeserializerFactory17._factoryConfig;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory27 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig26);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = beanDeserializerFactory1.buildBeanDeserializer(deserializationContext28, javaType29, beanDescription30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray5);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray5, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList14);
        org.junit.Assert.assertNotNull(deserializerFactory16);
        org.junit.Assert.assertNotNull(beanDeserializerFactory17);
        org.junit.Assert.assertNull(objJsonDeserializer21);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig26);
        org.junit.Assert.assertNotNull(deserializerFactory27);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = null;
        stdValueInstantiator2.configureFromBooleanCreator(annotatedWithParams5);
        boolean boolean7 = stdValueInstantiator2.canCreateUsingDelegate();
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        java.io.Closeable closeable2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        java.io.Closeable closeable6 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = new com.fasterxml.jackson.databind.JsonMappingException(closeable6, "hi!", jsonLocation8);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException10 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser4, "hi!", (java.lang.Throwable) jsonMappingException9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = new com.fasterxml.jackson.databind.JsonMappingException(closeable2, "", (java.lang.Throwable) jsonMappingException9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException12 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "", (java.lang.Throwable) jsonMappingException11);
        java.lang.Throwable throwable13 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfRTE((java.lang.Throwable) jsonMappingException11);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException16 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser14, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader18 = objJsonDeserializer17.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException20 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException16, (java.lang.Object) objJsonDeserializer17, (int) '#');
        com.fasterxml.jackson.core.JsonParser jsonParser21 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException23 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser21, "[null]");
        java.lang.Throwable throwable24 = com.fasterxml.jackson.databind.util.ClassUtil.getRootCause((java.lang.Throwable) jsonMappingException23);
        jsonMappingException20.prependPath((java.lang.Object) throwable24, (int) (short) 1);
        java.io.Closeable closeable27 = null;
        java.io.Closeable closeable29 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser31 = null;
        java.io.Closeable closeable33 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation35 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException36 = new com.fasterxml.jackson.databind.JsonMappingException(closeable33, "hi!", jsonLocation35);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException37 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser31, "hi!", (java.lang.Throwable) jsonMappingException36);
        java.lang.StringBuilder stringBuilder38 = null;
        java.lang.StringBuilder stringBuilder39 = jsonMappingException36.getPathReference(stringBuilder38);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException40 = new com.fasterxml.jackson.databind.JsonMappingException(closeable29, "[null]", (java.lang.Throwable) jsonMappingException36);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException41 = new com.fasterxml.jackson.databind.JsonMappingException(closeable27, "hi!", (java.lang.Throwable) jsonMappingException40);
        jsonMappingException20.addSuppressed((java.lang.Throwable) jsonMappingException40);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference45 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) "hi!", (int) (short) 100);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException46 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException40, reference45);
        java.lang.Throwable throwable47 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfRTE((java.lang.Throwable) jsonMappingException40);
        throwable13.addSuppressed((java.lang.Throwable) jsonMappingException40);
        org.junit.Assert.assertNotNull(jsonMappingException10);
        org.junit.Assert.assertNotNull(jsonMappingException12);
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "");
        org.junit.Assert.assertEquals(throwable13.toString(), "com.fasterxml.jackson.databind.JsonMappingException: ");
        org.junit.Assert.assertNotNull(jsonMappingException16);
        org.junit.Assert.assertNotNull(objJsonDeserializer17);
        org.junit.Assert.assertNull(objectIdReader18);
        org.junit.Assert.assertNotNull(jsonMappingException20);
        org.junit.Assert.assertNotNull(jsonMappingException23);
        org.junit.Assert.assertNotNull(throwable24);
        org.junit.Assert.assertEquals(throwable24.getLocalizedMessage(), "[null]");
        org.junit.Assert.assertEquals(throwable24.getMessage(), "[null]");
        org.junit.Assert.assertEquals(throwable24.toString(), "com.fasterxml.jackson.databind.JsonMappingException: [null]");
        org.junit.Assert.assertNotNull(jsonMappingException37);
        org.junit.Assert.assertNull(stringBuilder39);
        org.junit.Assert.assertNotNull(jsonMappingException46);
        org.junit.Assert.assertNotNull(throwable47);
        org.junit.Assert.assertEquals(throwable47.getLocalizedMessage(), "[null] (through reference chain: java.lang.String[100])");
        org.junit.Assert.assertEquals(throwable47.getMessage(), "[null] (through reference chain: java.lang.String[100])");
        org.junit.Assert.assertEquals(throwable47.toString(), "com.fasterxml.jackson.databind.JsonMappingException: [null] (through reference chain: java.lang.String[100])");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator0 = null;
        java.io.Closeable closeable2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        java.io.Closeable closeable6 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = new com.fasterxml.jackson.databind.JsonMappingException(closeable6, "hi!", jsonLocation8);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException10 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser4, "hi!", (java.lang.Throwable) jsonMappingException9);
        java.lang.StringBuilder stringBuilder11 = null;
        java.lang.StringBuilder stringBuilder12 = jsonMappingException9.getPathReference(stringBuilder11);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = new com.fasterxml.jackson.databind.JsonMappingException(closeable2, "[null]", (java.lang.Throwable) jsonMappingException9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException14 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator0, "hi!", (java.lang.Throwable) jsonMappingException9);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference16 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) (short) -1);
        int int17 = reference16.getIndex();
        java.lang.Object obj18 = reference16.getFrom();
        java.lang.Object obj19 = reference16.getFrom();
        jsonMappingException9.prependPath(reference16);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.ClassUtil.unwrapAndThrowAsIAE((java.lang.Throwable) jsonMappingException9, "com.fasterxml.jackson.databind.JsonMappingException[1]->com.fasterxml.jackson.databind.deser.impl.FailingDeserializer[35]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: com.fasterxml.jackson.databind.JsonMappingException[1]->com.fasterxml.jackson.databind.deser.impl.FailingDeserializer[35]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException10);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertNotNull(jsonMappingException14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) -1 + "'", obj19, (short) -1);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig2 = beanDeserializerFactory1.getFactoryConfig();
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig3);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig5 = beanDeserializerFactory1._factoryConfig;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod8 = beanDeserializerFactory1._findJsonValueFor(deserializationConfig6, javaType7);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig9 = beanDeserializerFactory1._factoryConfig;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod12 = beanDeserializerFactory1._findJsonValueFor(deserializationConfig10, javaType11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription14 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition beanPropertyDefinition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty16 = beanDeserializerFactory1.constructSetterlessProperty(deserializationContext13, beanDescription14, beanPropertyDefinition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(deserializerFactoryConfig2);
        org.junit.Assert.assertNotNull(deserializerFactory4);
        org.junit.Assert.assertNull(deserializerFactoryConfig5);
        org.junit.Assert.assertNull(annotatedMethod8);
        org.junit.Assert.assertNull(deserializerFactoryConfig9);
        org.junit.Assert.assertNull(annotatedMethod12);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "[null]");
        java.lang.Throwable throwable3 = com.fasterxml.jackson.databind.util.ClassUtil.getRootCause((java.lang.Throwable) jsonMappingException2);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator6 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig4, javaType5);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = stdValueInstantiator6.getArrayDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator6.getDefaultCreator();
        boolean boolean10 = stdValueInstantiator6.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig11, javaType12);
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator14 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(stdValueInstantiator6, stdValueInstantiator13);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = null;
        stdValueInstantiator14.configureFromStringCreator(annotatedWithParams15);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig17 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray18 = stdValueInstantiator14.getFromObjectArguments(deserializationConfig17);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException20 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) settableBeanPropertyArray18, 3);
        java.lang.Throwable[] throwableArray21 = jsonMappingException2.getSuppressed();
        java.lang.StringBuilder stringBuilder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder23 = jsonMappingException2.getPathReference(stringBuilder22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNotNull(throwable3);
        org.junit.Assert.assertEquals(throwable3.getLocalizedMessage(), "[null] (through reference chain: UNKNOWN[3])");
        org.junit.Assert.assertEquals(throwable3.getMessage(), "[null] (through reference chain: UNKNOWN[3])");
        org.junit.Assert.assertEquals(throwable3.toString(), "com.fasterxml.jackson.databind.JsonMappingException: [null] (through reference chain: UNKNOWN[3])");
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stdValueInstantiator14);
        org.junit.Assert.assertNull(settableBeanPropertyArray18);
        org.junit.Assert.assertNotNull(jsonMappingException20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertArrayEquals(throwableArray21, new java.lang.Throwable[] {});
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder4 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray5 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, beanPropertyDefinitionArray5);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList14 = beanDeserializerFactory1.filterBeanProps(deserializationContext2, beanDescription3, beanDeserializerBuilder4, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, (java.util.Set<java.lang.String>) strSet12);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig15 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory16 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig15);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig17 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory18 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig17);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = beanDeserializerFactory1.createEnumDeserializer(deserializationContext19, javaType20, beanDescription21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray5);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray5, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList14);
        org.junit.Assert.assertNotNull(deserializerFactory16);
        org.junit.Assert.assertNotNull(deserializerFactory18);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator6, "hi!");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator4, "`com.fasterxml.jackson.databind.JsonMappingException`", (java.lang.Throwable) jsonMappingException8);
        java.lang.Object obj10 = jsonMappingException9.getProcessor();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE((java.io.IOException) jsonMappingException9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException12 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator2, "com.fasterxml.jackson.databind.JsonMappingException: ", (java.lang.Throwable) jsonMappingException11);
        java.lang.String str13 = jsonMappingException11.getOriginalMessage();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException14 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "`java.lang.Long`", (java.lang.Throwable) jsonMappingException11);
        org.junit.Assert.assertNotNull(jsonMappingException8);
        org.junit.Assert.assertNotNull(jsonMappingException9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(jsonMappingException11);
        org.junit.Assert.assertNotNull(jsonMappingException12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Unexpected IOException (of type com.fasterxml.jackson.databind.JsonMappingException): `com.fasterxml.jackson.databind.JsonMappingException`" + "'", str13, "Unexpected IOException (of type com.fasterxml.jackson.databind.JsonMappingException): `com.fasterxml.jackson.databind.JsonMappingException`");
        org.junit.Assert.assertNotNull(jsonMappingException14);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.String str5 = com.fasterxml.jackson.databind.util.ClassUtil.nullOrToString((java.lang.Object) deserializerCache0);
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory9 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = beanDeserializerFactory9._findCustomBeanDeserializer(javaType10, deserializationConfig11, beanDescription12);
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = beanDeserializerFactory9._findCustomBeanDeserializer(javaType14, deserializationConfig15, beanDescription16);
        com.fasterxml.jackson.databind.type.ArrayType arrayType18 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription20 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer21 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty22 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember23 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader26 = objJsonDeserializer25.getObjectIdReader();
        java.lang.Object obj27 = objJsonDeserializer25.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer28 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty29 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty22, annotatedMember23, javaType24, objJsonDeserializer25, typeDeserializer28);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = objJsonDeserializer25.unwrappingDeserializer(nameTransformer30);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext32 = null;
        java.lang.Object obj33 = objJsonDeserializer31.getEmptyValue(deserializationContext32);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext34 = null;
        java.lang.Object obj35 = objJsonDeserializer31.getNullValue(deserializationContext34);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer36 = beanDeserializerFactory9._findCustomArrayDeserializer(arrayType18, deserializationConfig19, beanDescription20, typeDeserializer21, objJsonDeserializer31);
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType37 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig38 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription39 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty41 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember42 = null;
        com.fasterxml.jackson.databind.JavaType javaType43 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty44 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember45 = null;
        com.fasterxml.jackson.databind.JavaType javaType46 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader48 = objJsonDeserializer47.getObjectIdReader();
        java.lang.Object obj49 = objJsonDeserializer47.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty51 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty44, annotatedMember45, javaType46, objJsonDeserializer47, typeDeserializer50);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer52 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty53 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty41, annotatedMember42, javaType43, objJsonDeserializer47, typeDeserializer52);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer54 = beanDeserializerFactory9._findCustomCollectionLikeDeserializer(collectionLikeType37, deserializationConfig38, beanDescription39, typeDeserializer40, objJsonDeserializer47);
        com.fasterxml.jackson.databind.JavaType javaType55 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = deserializerCache0.hasValueDeserializerFor(deserializationContext8, (com.fasterxml.jackson.databind.deser.DeserializerFactory) beanDeserializerFactory9, javaType55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(beanDeserializerFactory9);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer17);
        org.junit.Assert.assertNotNull(objJsonDeserializer25);
        org.junit.Assert.assertNull(objectIdReader26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objJsonDeserializer31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(wildcardJsonDeserializer36);
        org.junit.Assert.assertNotNull(objJsonDeserializer47);
        org.junit.Assert.assertNull(objectIdReader48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(wildcardJsonDeserializer54);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer0 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objJsonDeserializer0.getObjectIdReader();
        java.lang.Object obj2 = objJsonDeserializer0.getNullValue();
        java.lang.Object obj3 = objJsonDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(objJsonDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        boolean boolean7 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getArrayDelegateCreator();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(annotatedWithParams9);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig1 = beanDeserializerFactory0.getFactoryConfig();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.UNWRAPPED_CREATOR_PARAM_NAME;
        boolean boolean5 = com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl((java.lang.Object) propertyName4);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = null;
        com.fasterxml.jackson.annotation.JacksonInject.Value value8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = beanDeserializerFactory0.constructCreatorProperty(deserializationContext2, beanDescription3, propertyName4, (int) '4', annotatedParameter7, value8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig1);
        org.junit.Assert.assertNotNull(propertyName4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        boolean boolean7 = stdValueInstantiator2.canCreateFromObjectWith();
        java.lang.String str8 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean10 = stdValueInstantiator2.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray12 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig11);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams14);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UNKNOWN TYPE" + "'", str8, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
        org.junit.Assert.assertNull(annotatedParameter13);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        impl0.flushCachedSerializers();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider5 = impl4.copy();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = impl4.getGenerator();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl7);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider9 = impl7.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = impl7.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl11);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider13 = impl11.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = impl11.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = impl7.handleSecondaryContextualization(objJsonSerializer14, beanProperty15);
        impl4.setNullValueSerializer(objJsonSerializer14);
        impl0.setNullValueSerializer(objJsonSerializer14);
        int int19 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl0.copy();
        org.junit.Assert.assertNotNull(defaultSerializerProvider1);
        org.junit.Assert.assertNull(jsonGenerator2);
        org.junit.Assert.assertNotNull(defaultSerializerProvider5);
        org.junit.Assert.assertNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(defaultSerializerProvider9);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNotNull(defaultSerializerProvider13);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        java.io.Closeable closeable2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        java.io.Closeable closeable6 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = new com.fasterxml.jackson.databind.JsonMappingException(closeable6, "hi!", jsonLocation8);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException10 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser4, "hi!", (java.lang.Throwable) jsonMappingException9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = new com.fasterxml.jackson.databind.JsonMappingException(closeable2, "", (java.lang.Throwable) jsonMappingException9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException12 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "", (java.lang.Throwable) jsonMappingException11);
        java.util.List<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList13 = jsonMappingException11.getPath();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        java.io.Closeable closeable16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        java.io.Closeable closeable20 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation22 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException23 = new com.fasterxml.jackson.databind.JsonMappingException(closeable20, "hi!", jsonLocation22);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException24 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser18, "hi!", (java.lang.Throwable) jsonMappingException23);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException25 = new com.fasterxml.jackson.databind.JsonMappingException(closeable16, "", (java.lang.Throwable) jsonMappingException23);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException26 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser14, "", (java.lang.Throwable) jsonMappingException25);
        jsonMappingException11.addSuppressed((java.lang.Throwable) jsonMappingException25);
        java.io.Closeable closeable28 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation30 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException31 = new com.fasterxml.jackson.databind.JsonMappingException(closeable28, "hi!", jsonLocation30);
        java.lang.Class<?> wildcardClass32 = com.fasterxml.jackson.databind.util.ClassUtil.classOf((java.lang.Object) jsonMappingException31);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException35 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser33, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        jsonMappingException35.prependPath((java.lang.Object) objJsonDeserializer36, "[null]");
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern39 = objJsonDeserializer36.getEmptyAccessPattern();
        java.lang.Class<? extends java.lang.Enum<?>> wildcardClass40 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType((java.lang.Enum<com.fasterxml.jackson.databind.util.AccessPattern>) accessPattern39);
        jsonMappingException31.prependPath((java.lang.Object) accessPattern39, (-1));
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference43 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) accessPattern39);
        java.lang.Class<? extends java.lang.Enum<?>> wildcardClass44 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType((java.lang.Enum<com.fasterxml.jackson.databind.util.AccessPattern>) accessPattern39);
        jsonMappingException25.prependPath((java.lang.Object) accessPattern39, 7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Throwable throwable47 = com.fasterxml.jackson.databind.util.ClassUtil.throwRootCauseIfIOE((java.lang.Throwable) jsonMappingException25);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: hi!");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException10);
        org.junit.Assert.assertNotNull(jsonMappingException12);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertNotNull(jsonMappingException24);
        org.junit.Assert.assertNotNull(jsonMappingException26);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(jsonMappingException35);
        org.junit.Assert.assertNotNull(objJsonDeserializer36);
        org.junit.Assert.assertTrue("'" + accessPattern39 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern39.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder4 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray5 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, beanPropertyDefinitionArray5);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList14 = beanDeserializerFactory1.filterBeanProps(deserializationContext2, beanDescription3, beanDeserializerBuilder4, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, (java.util.Set<java.lang.String>) strSet12);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod17 = beanDeserializerFactory1._findJsonValueFor(deserializationConfig15, javaType16);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription19 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName20 = com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.UNWRAPPED_CREATOR_PARAM_NAME;
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter22 = null;
        com.fasterxml.jackson.annotation.JacksonInject.Value value23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty24 = beanDeserializerFactory1.constructCreatorProperty(deserializationContext18, beanDescription19, propertyName20, (int) (short) 10, annotatedParameter22, value23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray5);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray5, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList14);
        org.junit.Assert.assertNull(annotatedMethod17);
        org.junit.Assert.assertNotNull(propertyName20);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.fasterxml.jackson.core.JsonLocation jsonLocation1 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = new com.fasterxml.jackson.databind.JsonMappingException("UNKNOWN[\"com.fasterxml.jackson.databind.JsonMappingException: java.lang.String[?]\"]", jsonLocation1);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator9 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig7, javaType8);
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator10 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(stdValueInstantiator2, stdValueInstantiator9);
        boolean boolean11 = stdValueInstantiator10.canCreateFromString();
        boolean boolean12 = stdValueInstantiator10.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = stdValueInstantiator10.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = null;
        stdValueInstantiator10.configureFromBooleanCreator(annotatedWithParams14);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = stdValueInstantiator10.getDelegateType(deserializationConfig16);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stdValueInstantiator10.createUsingDefault(deserializationContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stdValueInstantiator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(javaType17);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl1.copy();
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Class<? extends java.util.Collection>> strMap5 = impl1.reportBadDefinition(javaType3, "UNKNOWN TYPE");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.InvalidDefinitionException; message: UNKNOWN TYPE");
        } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = beanDeserializerFactory0._findCustomBeanDeserializer(javaType1, deserializationConfig2, beanDescription3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = beanDeserializerFactory0._findCustomBeanDeserializer(javaType5, deserializationConfig6, beanDescription7);
        com.fasterxml.jackson.databind.type.ArrayType arrayType9 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty13 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = objJsonDeserializer16.getObjectIdReader();
        java.lang.Object obj18 = objJsonDeserializer16.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty20 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty13, annotatedMember14, javaType15, objJsonDeserializer16, typeDeserializer19);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = objJsonDeserializer16.unwrappingDeserializer(nameTransformer21);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        java.lang.Object obj24 = objJsonDeserializer22.getEmptyValue(deserializationContext23);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext25 = null;
        java.lang.Object obj26 = objJsonDeserializer22.getNullValue(deserializationContext25);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer27 = beanDeserializerFactory0._findCustomArrayDeserializer(arrayType9, deserializationConfig10, beanDescription11, typeDeserializer12, objJsonDeserializer22);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod30 = beanDeserializerFactory0._findJsonValueFor(deserializationConfig28, javaType29);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext31 = null;
        com.fasterxml.jackson.databind.type.MapType mapType32 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer34 = beanDeserializerFactory0.createMapDeserializer(deserializationContext31, mapType32, beanDescription33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objectIdReader17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objJsonDeserializer22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(wildcardJsonDeserializer27);
        org.junit.Assert.assertNull(annotatedMethod30);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        impl0.flushCachedSerializers();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider5 = impl4.copy();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = impl4.getGenerator();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl7);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider9 = impl7.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = impl7.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl11);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider13 = impl11.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = impl11.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = impl7.handleSecondaryContextualization(objJsonSerializer14, beanProperty15);
        impl4.setNullValueSerializer(objJsonSerializer14);
        impl0.setNullValueSerializer(objJsonSerializer14);
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = impl0.findNullValueSerializer(beanProperty19);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = impl0.handleSecondaryContextualization(objJsonSerializer21, beanProperty22);
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        java.io.Closeable closeable27 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation29 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException30 = new com.fasterxml.jackson.databind.JsonMappingException(closeable27, "hi!", jsonLocation29);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException31 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser25, "hi!", (java.lang.Throwable) jsonMappingException30);
        java.lang.StringBuilder stringBuilder32 = null;
        java.lang.StringBuilder stringBuilder33 = jsonMappingException30.getPathReference(stringBuilder32);
        com.fasterxml.jackson.core.JsonLocation jsonLocation34 = jsonMappingException30.getLocation();
        jsonMappingException30.clearLocation();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException36 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "com.fasterxml.jackson.databind.util", (java.lang.Throwable) jsonMappingException30);
        org.junit.Assert.assertNotNull(defaultSerializerProvider1);
        org.junit.Assert.assertNull(jsonGenerator2);
        org.junit.Assert.assertNotNull(defaultSerializerProvider5);
        org.junit.Assert.assertNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(defaultSerializerProvider9);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNotNull(defaultSerializerProvider13);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(objJsonSerializer20);
        org.junit.Assert.assertNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNotNull(jsonMappingException31);
        org.junit.Assert.assertNull(stringBuilder33);
        org.junit.Assert.assertNull(jsonLocation34);
        org.junit.Assert.assertNotNull(jsonMappingException36);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.String str5 = com.fasterxml.jackson.databind.util.ClassUtil.nullOrToString((java.lang.Object) deserializerCache0);
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation3 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException("`java.lang.Integer`", jsonLocation3);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "\"java.lang.String[?]\"", (java.lang.Throwable) jsonMappingException4);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference7 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) jsonMappingException4, "`com.fasterxml.jackson.databind.deser.impl.FailingDeserializer`");
        org.junit.Assert.assertNotNull(jsonMappingException5);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = impl0.invalidTypeIdException(javaType2, "hi!", "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException12 = impl7.invalidTypeIdException(javaType9, "hi!", "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl7);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        impl7.setNullKeySerializer(objJsonSerializer14);
        impl0.setDefaultKeySerializer(objJsonSerializer14);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = impl0.getGenerator();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = impl0.getGenerator();
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = impl0.findNullValueSerializer(beanProperty19);
        org.junit.Assert.assertNotNull(jsonMappingException5);
        org.junit.Assert.assertNotNull(jsonMappingException12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNull(jsonGenerator17);
        org.junit.Assert.assertNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(objJsonSerializer20);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder4 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray5 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, beanPropertyDefinitionArray5);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList14 = beanDeserializerFactory1.filterBeanProps(deserializationContext2, beanDescription3, beanDeserializerBuilder4, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, (java.util.Set<java.lang.String>) strSet12);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig15 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory16 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig15);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig17 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory18 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig17);
        com.fasterxml.jackson.databind.type.ArrayType arrayType19 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig20 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription21 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer22 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException25 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser23, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader27 = objJsonDeserializer26.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException29 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException25, (java.lang.Object) objJsonDeserializer26, (int) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = objJsonDeserializer26.unwrappingDeserializer(nameTransformer30);
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern32 = objJsonDeserializer31.getEmptyAccessPattern();
        java.util.Collection<java.lang.Object> objCollection33 = objJsonDeserializer31.getKnownPropertyNames();
        boolean boolean34 = objJsonDeserializer31.isCachable();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern35 = objJsonDeserializer31.getNullAccessPattern();
        java.lang.Object obj36 = objJsonDeserializer31.getNullValue();
        java.lang.Object obj37 = objJsonDeserializer31.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer38 = beanDeserializerFactory1._findCustomArrayDeserializer(arrayType19, deserializationConfig20, beanDescription21, typeDeserializer22, objJsonDeserializer31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray5);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray5, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList14);
        org.junit.Assert.assertNotNull(deserializerFactory16);
        org.junit.Assert.assertNotNull(deserializerFactory18);
        org.junit.Assert.assertNotNull(jsonMappingException25);
        org.junit.Assert.assertNotNull(objJsonDeserializer26);
        org.junit.Assert.assertNull(objectIdReader27);
        org.junit.Assert.assertNotNull(jsonMappingException29);
        org.junit.Assert.assertNotNull(objJsonDeserializer31);
        org.junit.Assert.assertTrue("'" + accessPattern32 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern32.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(objCollection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + accessPattern35 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern35.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        boolean boolean6 = impl0.includeFilterSuppressNulls((java.lang.Object) true);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl0.copy();
        java.lang.Class<?> wildcardClass8 = impl0.getActiveView();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl0.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = impl0.invalidTypeIdException(javaType10, "java.lang", "`java.lang.Long`");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.ClassUtil.unwrapAndThrowAsIAE((java.lang.Throwable) jsonMappingException13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not resolve type id 'java.lang' as a subtype of null: `java.lang.Long`");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(jsonMappingException13);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        java.io.Closeable closeable4 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = new com.fasterxml.jackson.databind.JsonMappingException(closeable4, "hi!", jsonLocation6);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = new com.fasterxml.jackson.databind.JsonMappingException("hi!", (java.lang.Throwable) jsonMappingException7);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "[null]", (java.lang.Throwable) jsonMappingException7);
        java.lang.Class<?> wildcardClass10 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl11);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider13 = impl11.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = impl11.findNullValueSerializer(beanProperty14);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider18 = impl16.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = impl16.findNullValueSerializer(beanProperty19);
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = impl11.handleSecondaryContextualization(objJsonSerializer20, beanProperty21);
        int int23 = impl11.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl24);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider26 = impl24.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer28 = impl24.findNullValueSerializer(beanProperty27);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl29);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider31 = impl29.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty32 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer33 = impl29.findNullValueSerializer(beanProperty32);
        com.fasterxml.jackson.databind.BeanProperty beanProperty34 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer35 = impl24.handleSecondaryContextualization(objJsonSerializer33, beanProperty34);
        impl11.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer35);
        com.fasterxml.jackson.databind.JavaType javaType37 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty38 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer39 = impl11.findNullKeySerializer(javaType37, beanProperty38);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig40 = impl11.getConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer41 = impl11.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer42 = impl11.getDefaultNullKeySerializer();
        impl0.setNullKeySerializer(objJsonSerializer42);
        com.fasterxml.jackson.databind.JavaType javaType44 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer45 = impl0.findValueSerializer(javaType44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException9);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(defaultSerializerProvider13);
        org.junit.Assert.assertNotNull(objJsonSerializer15);
        org.junit.Assert.assertNotNull(defaultSerializerProvider18);
        org.junit.Assert.assertNotNull(objJsonSerializer20);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider26);
        org.junit.Assert.assertNotNull(objJsonSerializer28);
        org.junit.Assert.assertNotNull(defaultSerializerProvider31);
        org.junit.Assert.assertNotNull(objJsonSerializer33);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer35);
        org.junit.Assert.assertNotNull(objJsonSerializer39);
        org.junit.Assert.assertNull(serializationConfig40);
        org.junit.Assert.assertNotNull(objJsonSerializer41);
        org.junit.Assert.assertNotNull(objJsonSerializer42);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(serializerProvider0, "`com.fasterxml.jackson.databind.JsonMappingException`");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        boolean boolean1 = com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl((java.lang.Object) deserializerCache0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory3 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = beanDeserializerFactory3._findCustomBeanDeserializer(javaType4, deserializationConfig5, beanDescription6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = beanDeserializerFactory3._findCustomBeanDeserializer(javaType8, deserializationConfig9, beanDescription10);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig12 = beanDeserializerFactory3._factoryConfig;
        com.fasterxml.jackson.databind.type.ReferenceType referenceType13 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader21 = objJsonDeserializer20.getObjectIdReader();
        java.lang.Object obj22 = objJsonDeserializer20.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer23 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty24 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty17, annotatedMember18, javaType19, objJsonDeserializer20, typeDeserializer23);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig25 = null;
        java.lang.Boolean boolean26 = objJsonDeserializer20.supportsUpdate(deserializationConfig25);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer28 = objJsonDeserializer20.unwrappingDeserializer(nameTransformer27);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer29 = beanDeserializerFactory3._findCustomReferenceDeserializer(referenceType13, deserializationConfig14, beanDescription15, typeDeserializer16, objJsonDeserializer28);
        com.fasterxml.jackson.databind.JavaType javaType30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer31 = deserializerCache0.findKeyDeserializer(deserializationContext2, (com.fasterxml.jackson.databind.deser.DeserializerFactory) beanDeserializerFactory3, javaType30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(beanDeserializerFactory3);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig12);
        org.junit.Assert.assertNotNull(objJsonDeserializer20);
        org.junit.Assert.assertNull(objectIdReader21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNotNull(objJsonDeserializer28);
        org.junit.Assert.assertNull(wildcardJsonDeserializer29);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder4 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray5 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, beanPropertyDefinitionArray5);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList14 = beanDeserializerFactory1.filterBeanProps(deserializationContext2, beanDescription3, beanDeserializerBuilder4, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList6, (java.util.Set<java.lang.String>) strSet12);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig15 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory16 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig15);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig17 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory18 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig17);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod21 = beanDeserializerFactory1._findJsonValueFor(deserializationConfig19, javaType20);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig22 = beanDeserializerFactory1._factoryConfig;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory23 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig24 = beanDeserializerFactory23.getFactoryConfig();
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig24);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig26 = beanDeserializerFactory25._factoryConfig;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory27 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig26);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig28 = beanDeserializerFactory1._factoryConfig;
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray5);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray5, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList14);
        org.junit.Assert.assertNotNull(deserializerFactory16);
        org.junit.Assert.assertNotNull(deserializerFactory18);
        org.junit.Assert.assertNull(annotatedMethod21);
        org.junit.Assert.assertNull(deserializerFactoryConfig22);
        org.junit.Assert.assertNotNull(beanDeserializerFactory23);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig24);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig26);
        org.junit.Assert.assertNotNull(deserializerFactory27);
        org.junit.Assert.assertNull(deserializerFactoryConfig28);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.util.Iterator<com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig> deserializerFactoryConfigItor0 = com.fasterxml.jackson.databind.util.ClassUtil.emptyIterator();
        org.junit.Assert.assertNotNull(deserializerFactoryConfigItor0);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        java.lang.String str7 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean8 = stdValueInstantiator2.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams9);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams11);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UNKNOWN TYPE" + "'", str7, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator9 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig7, javaType8);
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator10 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(stdValueInstantiator2, stdValueInstantiator9);
        boolean boolean11 = stdValueInstantiator10.canCreateFromString();
        boolean boolean12 = stdValueInstantiator10.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = stdValueInstantiator10.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = null;
        stdValueInstantiator10.configureFromBooleanCreator(annotatedWithParams14);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator21 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig19, javaType20);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams22 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams23 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty25 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray26 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty25 };
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams27 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray28 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator21.configureFromObjectSettings(annotatedWithParams22, annotatedWithParams23, javaType24, settableBeanPropertyArray26, annotatedWithParams27, settableBeanPropertyArray28);
        boolean boolean30 = stdValueInstantiator21.canCreateFromObjectWith();
        boolean boolean31 = stdValueInstantiator21.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams32 = stdValueInstantiator21.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams33 = stdValueInstantiator21.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig34 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray35 = stdValueInstantiator21.getFromObjectArguments(deserializationConfig34);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams36 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray37 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator10.configureFromObjectSettings(annotatedWithParams16, annotatedWithParams17, javaType18, settableBeanPropertyArray35, annotatedWithParams36, settableBeanPropertyArray37);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stdValueInstantiator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray26);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray26, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray28);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray28, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(annotatedWithParams32);
        org.junit.Assert.assertNull(annotatedWithParams33);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray35);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray35, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray37);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray37, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        boolean boolean7 = stdValueInstantiator2.canCreateFromObjectWith();
        java.lang.String str8 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean9 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = null;
        stdValueInstantiator2.configureFromBooleanCreator(annotatedWithParams10);
        boolean boolean12 = stdValueInstantiator2.canCreateUsingDelegate();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UNKNOWN TYPE" + "'", str8, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.io.Closeable closeable0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        java.io.Closeable closeable4 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = new com.fasterxml.jackson.databind.JsonMappingException(closeable4, "hi!", jsonLocation6);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser2, "hi!", (java.lang.Throwable) jsonMappingException7);
        java.lang.StringBuilder stringBuilder9 = null;
        java.lang.StringBuilder stringBuilder10 = jsonMappingException7.getPathReference(stringBuilder9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser11, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = objJsonDeserializer14.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException17 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException13, (java.lang.Object) objJsonDeserializer14, (int) '#');
        boolean boolean18 = objJsonDeserializer14.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = objJsonDeserializer14.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException21 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException7, (java.lang.Object) objJsonDeserializer14, (int) (short) 0);
        java.lang.Throwable[] throwableArray22 = jsonMappingException7.getSuppressed();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException23 = new com.fasterxml.jackson.databind.JsonMappingException(closeable0, "`com.fasterxml.jackson.databind.JsonMappingException`", (java.lang.Throwable) jsonMappingException7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Throwable throwable24 = com.fasterxml.jackson.databind.util.ClassUtil.throwRootCauseIfIOE((java.lang.Throwable) jsonMappingException23);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: hi! (through reference chain: com.fasterxml.jackson.databind.deser.impl.FailingDeserializer[0])");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException8);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNotNull(jsonMappingException13);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNotNull(jsonMappingException17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNotNull(jsonMappingException21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromBooleanCreator(annotatedWithParams8);
        boolean boolean10 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = null;
        stdValueInstantiator2.configureFromLongCreator(annotatedWithParams11);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = stdValueInstantiator2.getDelegateType(deserializationConfig13);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray17 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig16);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertNull(settableBeanPropertyArray17);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) objJsonDeserializer3, (int) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = objJsonDeserializer3.unwrappingDeserializer(nameTransformer7);
        boolean boolean9 = com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl((java.lang.Object) objJsonDeserializer3);
        boolean boolean10 = objJsonDeserializer3.isCachable();
        java.lang.Object obj11 = objJsonDeserializer3.getEmptyValue();
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(jsonMappingException6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription2 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder3 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig4 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription7 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder8 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray9 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList10 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList10, beanPropertyDefinitionArray9);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList18 = beanDeserializerFactory5.filterBeanProps(deserializationContext6, beanDescription7, beanDeserializerBuilder8, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList10, (java.util.Set<java.lang.String>) strSet16);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig19 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig19);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription22 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder23 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig24 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig24);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig26 = beanDeserializerFactory25.getFactoryConfig();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext27 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription28 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder29 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig30 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig30);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext32 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription33 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder34 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray35 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList36 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList36, beanPropertyDefinitionArray35);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList44 = beanDeserializerFactory31.filterBeanProps(deserializationContext32, beanDescription33, beanDeserializerBuilder34, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList36, (java.util.Set<java.lang.String>) strSet42);
        java.lang.String[] strArray47 = new java.lang.String[] { "```com.fasterxml.jackson.databind.JsonMappingException```", "" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList50 = beanDeserializerFactory25.filterBeanProps(deserializationContext27, beanDescription28, beanDeserializerBuilder29, beanPropertyDefinitionList44, (java.util.Set<java.lang.String>) strSet48);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "`UNKNOWN TYPE`", "``com.fasterxml.jackson.databind.JsonMappingException``", "``com.fasterxml.jackson.databind.JsonMappingException``", "UNKNOWN TYPE", "hi!", "[null]" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList61 = beanDeserializerFactory20.filterBeanProps(deserializationContext21, beanDescription22, beanDeserializerBuilder23, beanPropertyDefinitionList50, (java.util.Set<java.lang.String>) strSet59);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig62 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory63 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig62);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig64 = beanDeserializerFactory63.getFactoryConfig();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext65 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription66 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder67 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig68 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory69 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig68);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext70 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription71 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder72 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray73 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList74 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList74, beanPropertyDefinitionArray73);
        java.lang.String[] strArray79 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList82 = beanDeserializerFactory69.filterBeanProps(deserializationContext70, beanDescription71, beanDeserializerBuilder72, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList74, (java.util.Set<java.lang.String>) strSet80);
        java.lang.String[] strArray85 = new java.lang.String[] { "```com.fasterxml.jackson.databind.JsonMappingException```", "" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList88 = beanDeserializerFactory63.filterBeanProps(deserializationContext65, beanDescription66, beanDeserializerBuilder67, beanPropertyDefinitionList82, (java.util.Set<java.lang.String>) strSet86);
        java.util.Set<java.lang.String> strSet89 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull((java.util.Set<java.lang.String>) strSet59, (java.util.Set<java.lang.String>) strSet86);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList90 = beanDeserializerFactory0.filterBeanProps(deserializationContext1, beanDescription2, beanDeserializerBuilder3, beanPropertyDefinitionList18, strSet89);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig91 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated92 = null;
        java.lang.Object obj93 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator94 = beanDeserializerFactory0._valueInstantiatorInstance(deserializationConfig91, annotated92, obj93);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext95 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription96 = null;
        com.fasterxml.jackson.databind.JavaType javaType97 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember98 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType99 = beanDeserializerFactory0.resolveType(deserializationContext95, beanDescription96, javaType97, annotatedMember98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray9);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray9, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList18);
        org.junit.Assert.assertNull(deserializerFactoryConfig26);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray35);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray35, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "```com.fasterxml.jackson.databind.JsonMappingException```", "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList50);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "`UNKNOWN TYPE`", "``com.fasterxml.jackson.databind.JsonMappingException``", "``com.fasterxml.jackson.databind.JsonMappingException``", "UNKNOWN TYPE", "hi!", "[null]" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList61);
        org.junit.Assert.assertNull(deserializerFactoryConfig64);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray73);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray73, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList82);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "```com.fasterxml.jackson.databind.JsonMappingException```", "" });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList88);
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList90);
        org.junit.Assert.assertNull(valueInstantiator94);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "[null]");
        java.lang.Throwable throwable3 = com.fasterxml.jackson.databind.util.ClassUtil.getRootCause((java.lang.Throwable) jsonMappingException2);
        java.lang.String str4 = jsonMappingException2.getOriginalMessage();
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNotNull(throwable3);
        org.junit.Assert.assertEquals(throwable3.getLocalizedMessage(), "[null]");
        org.junit.Assert.assertEquals(throwable3.getMessage(), "[null]");
        org.junit.Assert.assertEquals(throwable3.toString(), "com.fasterxml.jackson.databind.JsonMappingException: [null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[null]" + "'", str4, "[null]");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        java.lang.Object obj5 = objJsonDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty7 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer3, typeDeserializer6);
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = settableAnyProperty7.getProperty();
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer9 = settableAnyProperty7._keyDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = settableAnyProperty7._valueTypeDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser11, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        jsonMappingException13.prependPath((java.lang.Object) objJsonDeserializer14, "[null]");
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty17 = settableAnyProperty7.withValueDeserializer(objJsonDeserializer14);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator22 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig20, javaType21);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams23 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty26 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray27 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty26 };
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams28 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray29 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator22.configureFromObjectSettings(annotatedWithParams23, annotatedWithParams24, javaType25, settableBeanPropertyArray27, annotatedWithParams28, settableBeanPropertyArray29);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig31 = null;
        com.fasterxml.jackson.databind.JavaType javaType32 = stdValueInstantiator22.getDelegateType(deserializationConfig31);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams33 = null;
        stdValueInstantiator22.configureFromLongCreator(annotatedWithParams33);
        // The following exception was thrown during execution in test generation
        try {
            settableAnyProperty17.deserializeAndSet(jsonParser18, deserializationContext19, (java.lang.Object) annotatedWithParams33, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer[0]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(beanProperty8);
        org.junit.Assert.assertNull(keyDeserializer9);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNotNull(jsonMappingException13);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNotNull(settableAnyProperty17);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray27);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray27, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray29);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray29, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNull(javaType32);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        boolean boolean6 = impl0.includeFilterSuppressNulls((java.lang.Object) true);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl0.copy();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = impl0.getTypeFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator9 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig7, javaType8);
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator10 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(stdValueInstantiator2, stdValueInstantiator9);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = stdValueInstantiator10.getDelegateType(deserializationConfig11);
        boolean boolean13 = stdValueInstantiator10.canCreateUsingDelegate();
        boolean boolean14 = stdValueInstantiator10.canInstantiate();
        boolean boolean15 = stdValueInstantiator10.canCreateFromBoolean();
        boolean boolean16 = stdValueInstantiator10.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stdValueInstantiator10.createFromLong(deserializationContext17, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stdValueInstantiator10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser5, "[null]");
        java.lang.Throwable throwable8 = com.fasterxml.jackson.databind.util.ClassUtil.getRootCause((java.lang.Throwable) jsonMappingException7);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig9 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription12 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder13 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray14 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList15 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList15, beanPropertyDefinitionArray14);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList23 = beanDeserializerFactory10.filterBeanProps(deserializationContext11, beanDescription12, beanDeserializerBuilder13, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList15, (java.util.Set<java.lang.String>) strSet21);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException25 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException7, (java.lang.Object) beanPropertyDefinitionList15, 1);
        java.util.List<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList26 = jsonMappingException7.getPath();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException27 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "class java.lang.Long", (java.lang.Throwable) jsonMappingException7);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl28);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider30 = impl28.copy();
        int int31 = defaultSerializerProvider30.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl33 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl32);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider34 = impl32.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty35 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer36 = impl32.findNullValueSerializer(beanProperty35);
        defaultSerializerProvider30.setNullValueSerializer(objJsonSerializer36);
        com.fasterxml.jackson.databind.BeanProperty beanProperty38 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer39 = impl0.handlePrimaryContextualization(objJsonSerializer36, beanProperty38);
        impl0.flushCachedSerializers();
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty43 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer44 = impl0.findTypedValueSerializer(javaType41, true, beanProperty43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(serializationConfig1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(jsonMappingException7);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "[null] (through reference chain: java.util.ArrayList[1])");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "[null] (through reference chain: java.util.ArrayList[1])");
        org.junit.Assert.assertEquals(throwable8.toString(), "com.fasterxml.jackson.databind.JsonMappingException: [null] (through reference chain: java.util.ArrayList[1])");
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray14);
        org.junit.Assert.assertArrayEquals(beanPropertyDefinitionArray14, new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(beanPropertyDefinitionList23);
        org.junit.Assert.assertNotNull(jsonMappingException25);
        org.junit.Assert.assertNotNull(referenceList26);
        org.junit.Assert.assertNotNull(jsonMappingException27);
        org.junit.Assert.assertNotNull(defaultSerializerProvider30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider34);
        org.junit.Assert.assertNotNull(objJsonSerializer36);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer39);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.fasterxml.jackson.core.JsonLocation jsonLocation1 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = new com.fasterxml.jackson.databind.JsonMappingException("java.lang.Short[?]", jsonLocation1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator5 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig3, javaType4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator5.getWithArgsCreator();
        boolean boolean7 = stdValueInstantiator5.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator5.configureFromArraySettings(annotatedWithParams8, javaType9, settableBeanPropertyArray10);
        java.lang.Class<?> wildcardClass12 = stdValueInstantiator5.getValueClass();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = stdValueInstantiator5.getDelegateType(deserializationConfig13);
        boolean boolean15 = stdValueInstantiator5.canCreateFromDouble();
        java.lang.Class<?> wildcardClass16 = stdValueInstantiator5.getValueClass();
        jsonMappingException2.prependPath((java.lang.Object) wildcardClass16, "com.fasterxml.jackson.databind.JsonMappingException: `java.util.LinkedHashSet`");
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray10);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray10, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator9 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig7, javaType8);
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator10 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(stdValueInstantiator2, stdValueInstantiator9);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = null;
        stdValueInstantiator10.configureFromStringCreator(annotatedWithParams11);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = null;
        stdValueInstantiator10.configureFromLongCreator(annotatedWithParams13);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray16 = stdValueInstantiator10.getFromObjectArguments(deserializationConfig15);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator22 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig20, javaType21);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams23 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty26 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray27 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty26 };
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams28 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray29 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator22.configureFromObjectSettings(annotatedWithParams23, annotatedWithParams24, javaType25, settableBeanPropertyArray27, annotatedWithParams28, settableBeanPropertyArray29);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams31 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig32 = null;
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator34 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig32, javaType33);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig35 = null;
        com.fasterxml.jackson.databind.JavaType javaType36 = stdValueInstantiator34.getArrayDelegateType(deserializationConfig35);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams37 = stdValueInstantiator34.getDefaultCreator();
        boolean boolean38 = stdValueInstantiator34.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig39 = null;
        com.fasterxml.jackson.databind.JavaType javaType40 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator41 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig39, javaType40);
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator42 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(stdValueInstantiator34, stdValueInstantiator41);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams43 = null;
        stdValueInstantiator34.configureFromIntCreator(annotatedWithParams43);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams45 = stdValueInstantiator34.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams46 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams47 = null;
        com.fasterxml.jackson.databind.JavaType javaType48 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig49 = null;
        com.fasterxml.jackson.databind.JavaType javaType50 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator51 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig49, javaType50);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams52 = stdValueInstantiator51.getWithArgsCreator();
        boolean boolean53 = stdValueInstantiator51.canCreateUsingDelegate();
        java.lang.Class<?> wildcardClass54 = stdValueInstantiator51.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams55 = null;
        com.fasterxml.jackson.databind.JavaType javaType56 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig57 = null;
        com.fasterxml.jackson.databind.JavaType javaType58 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator59 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig57, javaType58);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams60 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams61 = null;
        com.fasterxml.jackson.databind.JavaType javaType62 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty63 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray64 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty63 };
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams65 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray66 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator59.configureFromObjectSettings(annotatedWithParams60, annotatedWithParams61, javaType62, settableBeanPropertyArray64, annotatedWithParams65, settableBeanPropertyArray66);
        stdValueInstantiator51.configureFromArraySettings(annotatedWithParams55, javaType56, settableBeanPropertyArray64);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams69 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig70 = null;
        com.fasterxml.jackson.databind.JavaType javaType71 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator72 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig70, javaType71);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams73 = stdValueInstantiator72.getWithArgsCreator();
        boolean boolean74 = stdValueInstantiator72.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams75 = null;
        com.fasterxml.jackson.databind.JavaType javaType76 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray77 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator72.configureFromArraySettings(annotatedWithParams75, javaType76, settableBeanPropertyArray77);
        stdValueInstantiator34.configureFromObjectSettings(annotatedWithParams46, annotatedWithParams47, javaType48, settableBeanPropertyArray64, annotatedWithParams69, settableBeanPropertyArray77);
        stdValueInstantiator10.configureFromObjectSettings(annotatedWithParams17, annotatedWithParams18, javaType19, settableBeanPropertyArray29, annotatedWithParams31, settableBeanPropertyArray77);
        java.lang.Class<?> wildcardClass81 = stdValueInstantiator10.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams82 = null;
        stdValueInstantiator10.configureFromDoubleCreator(annotatedWithParams82);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stdValueInstantiator10);
        org.junit.Assert.assertNull(settableBeanPropertyArray16);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray27);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray27, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray29);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray29, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNull(annotatedWithParams37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(stdValueInstantiator42);
        org.junit.Assert.assertNull(annotatedWithParams45);
        org.junit.Assert.assertNull(annotatedWithParams52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray64);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray64, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray66);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray66, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNull(annotatedWithParams73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray77);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray77, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference1 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) "`java.lang.Long`");
        int int2 = reference1.getIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator0 = null;
        java.lang.Throwable throwable2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException3 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator0, "``", throwable2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.ClassUtil.unwrapAndThrowAsIAE((java.lang.Throwable) jsonMappingException3, "com.fasterxml.jackson.databind.JsonMappingException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: com.fasterxml.jackson.databind.JsonMappingException: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException3);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig2);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference5 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) beanDeserializerFactory1, "java.lang.Short[?]");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig6 = beanDeserializerFactory1.getFactoryConfig();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = beanDeserializerFactory1.mapAbstractType(deserializationConfig7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deserializerFactory3);
        org.junit.Assert.assertNull(deserializerFactoryConfig6);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.fasterxml.jackson.core.JsonLocation jsonLocation1 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = new com.fasterxml.jackson.databind.JsonMappingException("```com.fasterxml.jackson.databind.JsonMappingException```", jsonLocation1);
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objJsonDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty9 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty3, annotatedMember4, javaType5, objJsonDeserializer6, typeDeserializer8);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objJsonDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException12 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) wildcardJsonDeserializer10, "`java.util.ArrayList`");
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonMappingException12);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.io.Closeable closeable0 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException3 = new com.fasterxml.jackson.databind.JsonMappingException(closeable0, "java.util.HashMap[16]", jsonLocation2);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "java.lang.Short[?]");
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = jsonMappingException4.getLocation();
        org.junit.Assert.assertNull(jsonGenerator2);
        org.junit.Assert.assertNotNull(jsonMappingException4);
        org.junit.Assert.assertNull(jsonLocation5);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = impl1.getDefaultNullValueSerializer();
        boolean boolean3 = com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl((java.lang.Object) impl1);
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = impl1.invalidTypeIdException(javaType4, "`java.lang.Integer`", "``java.lang.Short[?]``");
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonMappingException7);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.lang.String str1 = com.fasterxml.jackson.databind.util.ClassUtil.backticked("``java.lang.Double``");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "```java.lang.Double```" + "'", str1, "```java.lang.Double```");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        java.io.Closeable closeable4 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = new com.fasterxml.jackson.databind.JsonMappingException(closeable4, "hi!", jsonLocation6);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = new com.fasterxml.jackson.databind.JsonMappingException("hi!", (java.lang.Throwable) jsonMappingException7);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "[null]", (java.lang.Throwable) jsonMappingException7);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "java.lang.Short[?]");
        java.lang.Class<?> wildcardClass12 = impl0.getActiveView();
        com.fasterxml.jackson.databind.cfg.MapperConfig<?> wildcardMapperConfig13 = impl0.getConfig();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator17 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig15, javaType16);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = stdValueInstantiator17.getArrayDelegateType(deserializationConfig18);
        boolean boolean20 = stdValueInstantiator17.canCreateFromLong();
        boolean boolean21 = stdValueInstantiator17.canCreateFromString();
        boolean boolean22 = stdValueInstantiator17.canCreateFromBoolean();
        // The following exception was thrown during execution in test generation
        try {
            impl0.serializeValue(jsonGenerator14, (java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException9);
        org.junit.Assert.assertNotNull(jsonMappingException11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardMapperConfig13);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean4 = stdValueInstantiator2.canCreateFromLong();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        boolean boolean6 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stdValueInstantiator2.createFromInt(deserializationContext9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory8 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig9 = beanDeserializerFactory8.getFactoryConfig();
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer12 = deserializerCache0.findKeyDeserializer(deserializationContext7, (com.fasterxml.jackson.databind.deser.DeserializerFactory) beanDeserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(beanDeserializerFactory8);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig9);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.io.Closeable closeable0 = null;
        java.io.Closeable closeable2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException(closeable2, "hi!");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = new com.fasterxml.jackson.databind.JsonMappingException(closeable0, "hi!", (java.lang.Throwable) jsonMappingException4);
        java.lang.String str6 = jsonMappingException5.toString();
        java.lang.Throwable throwable7 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfError((java.lang.Throwable) jsonMappingException5);
        java.lang.Throwable throwable8 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfError((java.lang.Throwable) jsonMappingException5);
        java.lang.Throwable throwable9 = com.fasterxml.jackson.databind.util.ClassUtil.getRootCause(throwable8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.fasterxml.jackson.databind.JsonMappingException: hi!" + "'", str6, "com.fasterxml.jackson.databind.JsonMappingException: hi!");
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.toString(), "com.fasterxml.jackson.databind.JsonMappingException: hi!");
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.toString(), "com.fasterxml.jackson.databind.JsonMappingException: hi!");
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable9.toString(), "com.fasterxml.jackson.databind.JsonMappingException: hi!");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig2 = beanDeserializerFactory1.getFactoryConfig();
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig3);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig5 = beanDeserializerFactory1._factoryConfig;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod8 = beanDeserializerFactory1._findJsonValueFor(deserializationConfig6, javaType7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = beanDeserializerFactory1.createBeanDeserializer(deserializationContext9, javaType10, beanDescription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(deserializerFactoryConfig2);
        org.junit.Assert.assertNotNull(deserializerFactory4);
        org.junit.Assert.assertNull(deserializerFactoryConfig5);
        org.junit.Assert.assertNull(annotatedMethod8);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = beanDeserializerFactory0._findCustomBeanDeserializer(javaType1, deserializationConfig2, beanDescription3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = beanDeserializerFactory0._findCustomBeanDeserializer(javaType5, deserializationConfig6, beanDescription7);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig9 = beanDeserializerFactory0._factoryConfig;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanDeserializerFactory0.addReferenceProperties(deserializationContext10, beanDescription11, beanDeserializerBuilder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig9);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) objJsonDeserializer3, (int) '#');
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = jsonMappingException2.getLocation();
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference9 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) (short) -1);
        java.lang.String str10 = reference9.toString();
        java.lang.String str11 = reference9.getDescription();
        jsonMappingException2.prependPath(reference9);
        java.lang.String str13 = reference9.toString();
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(jsonMappingException6);
        org.junit.Assert.assertNull(jsonLocation7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Short[?]" + "'", str10, "java.lang.Short[?]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Short[?]" + "'", str11, "java.lang.Short[?]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Short[?]" + "'", str13, "java.lang.Short[?]");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(deserializationContext0, "``java.util.LinkedHashSet``");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig0);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig2);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod6 = beanDeserializerFactory1._findJsonValueFor(deserializationConfig4, javaType5);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = beanDeserializerFactory1.withConfig(deserializerFactoryConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod11 = beanDeserializerFactory1._findJsonValueFor(deserializationConfig9, javaType10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.type.CollectionType collectionType13 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = beanDeserializerFactory1.createCollectionDeserializer(deserializationContext12, collectionType13, beanDescription14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deserializerFactory3);
        org.junit.Assert.assertNull(annotatedMethod6);
        org.junit.Assert.assertNotNull(deserializerFactory8);
        org.junit.Assert.assertNull(annotatedMethod11);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        boolean boolean7 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = null;
        stdValueInstantiator2.configureIncompleteParameter(annotatedParameter11);
        boolean boolean13 = stdValueInstantiator2.canCreateFromString();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl5.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl5.findNullValueSerializer(beanProperty8);
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = impl0.handleSecondaryContextualization(objJsonSerializer9, beanProperty10);
        int int12 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl13.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl13.findNullValueSerializer(beanProperty16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl18.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = impl18.findNullValueSerializer(beanProperty21);
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = impl13.handleSecondaryContextualization(objJsonSerializer22, beanProperty23);
        impl0.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer24);
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer28 = impl0.findNullKeySerializer(javaType26, beanProperty27);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig29 = impl0.getConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = impl0.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer31 = impl0.getDefaultNullKeySerializer();
        com.fasterxml.jackson.databind.introspect.Annotated annotated32 = null;
        java.lang.Object obj33 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer34 = impl0.serializerInstance(annotated32, obj33);
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(objJsonSerializer28);
        org.junit.Assert.assertNull(serializationConfig29);
        org.junit.Assert.assertNotNull(objJsonSerializer30);
        org.junit.Assert.assertNotNull(objJsonSerializer31);
        org.junit.Assert.assertNull(objJsonSerializer34);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "`com.fasterxml.jackson.databind.deser.DeserializerCache`");
        org.junit.Assert.assertNotNull(jsonMappingException2);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = beanDeserializerFactory0._findCustomBeanDeserializer(javaType1, deserializationConfig2, beanDescription3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = beanDeserializerFactory0._findCustomBeanDeserializer(javaType5, deserializationConfig6, beanDescription7);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig9 = beanDeserializerFactory0._factoryConfig;
        com.fasterxml.jackson.databind.type.ReferenceType referenceType10 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader18 = objJsonDeserializer17.getObjectIdReader();
        java.lang.Object obj19 = objJsonDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty21 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty14, annotatedMember15, javaType16, objJsonDeserializer17, typeDeserializer20);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig22 = null;
        java.lang.Boolean boolean23 = objJsonDeserializer17.supportsUpdate(deserializationConfig22);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = objJsonDeserializer17.unwrappingDeserializer(nameTransformer24);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer26 = beanDeserializerFactory0._findCustomReferenceDeserializer(referenceType10, deserializationConfig11, beanDescription12, typeDeserializer13, objJsonDeserializer25);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext27 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription28 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector creatorCollector29 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCandidate creatorCandidate30 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanDeserializerFactory0._addExplicitDelegatingCreator(deserializationContext27, beanDescription28, creatorCollector29, creatorCandidate30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig9);
        org.junit.Assert.assertNotNull(objJsonDeserializer17);
        org.junit.Assert.assertNull(objectIdReader18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(objJsonDeserializer25);
        org.junit.Assert.assertNull(wildcardJsonDeserializer26);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        java.lang.Object obj5 = objJsonDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty7 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer3, typeDeserializer6);
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = settableAnyProperty7.getProperty();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = settableAnyProperty7._valueTypeDeserializer;
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = settableAnyProperty7._property;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = objJsonDeserializer14.getObjectIdReader();
        java.lang.Object obj16 = objJsonDeserializer14.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty18 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty11, annotatedMember12, javaType13, objJsonDeserializer14, typeDeserializer17);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException21 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser19, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        jsonMappingException21.prependPath((java.lang.Object) objJsonDeserializer22, "[null]");
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern25 = objJsonDeserializer22.getEmptyAccessPattern();
        settableAnyProperty18._valueDeserializer = objJsonDeserializer22;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer28 = objJsonDeserializer22.unwrappingDeserializer(nameTransformer27);
        settableAnyProperty7._valueDeserializer = objJsonDeserializer22;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader31 = objJsonDeserializer30.getObjectIdReader();
        java.lang.Object obj32 = objJsonDeserializer30.getNullValue();
        settableAnyProperty7._valueDeserializer = objJsonDeserializer30;
        com.fasterxml.jackson.databind.BeanProperty beanProperty34 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember35 = null;
        com.fasterxml.jackson.databind.JavaType javaType36 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty37 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember38 = null;
        com.fasterxml.jackson.databind.JavaType javaType39 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer40 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader41 = objJsonDeserializer40.getObjectIdReader();
        java.lang.Object obj42 = objJsonDeserializer40.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty44 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty37, annotatedMember38, javaType39, objJsonDeserializer40, typeDeserializer43);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty46 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty34, annotatedMember35, javaType36, objJsonDeserializer40, typeDeserializer45);
        boolean boolean47 = settableAnyProperty46._setterIsField;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = settableAnyProperty46._valueDeserializer;
        settableAnyProperty7._valueDeserializer = objJsonDeserializer48;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = settableAnyProperty7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(beanProperty8);
        org.junit.Assert.assertNull(typeDeserializer9);
        org.junit.Assert.assertNull(beanProperty10);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(jsonMappingException21);
        org.junit.Assert.assertNotNull(objJsonDeserializer22);
        org.junit.Assert.assertTrue("'" + accessPattern25 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern25.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNotNull(objJsonDeserializer28);
        org.junit.Assert.assertNotNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(objectIdReader31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objJsonDeserializer40);
        org.junit.Assert.assertNull(objectIdReader41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer48);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.findNullValueSerializer(beanProperty3);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl5);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider7 = impl5.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = impl5.findNullValueSerializer(beanProperty8);
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = impl0.handleSecondaryContextualization(objJsonSerializer9, beanProperty10);
        int int12 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = impl13.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = impl13.findNullValueSerializer(beanProperty16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl18);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider20 = impl18.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = impl18.findNullValueSerializer(beanProperty21);
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = impl13.handleSecondaryContextualization(objJsonSerializer22, beanProperty23);
        impl0.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer24);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = impl26.getGenerator();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer28 = impl26.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.BeanProperty beanProperty29 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = impl26.findNullValueSerializer(beanProperty29);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider32 = impl31.copy();
        boolean boolean33 = impl26.includeFilterSuppressNulls((java.lang.Object) defaultSerializerProvider32);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl34);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = impl34.getGenerator();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException38 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl34, "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider39 = impl34.copy();
        com.fasterxml.jackson.databind.cfg.MapperConfig<?> wildcardMapperConfig40 = impl34.getConfig();
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty42 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer43 = impl34.findNullKeySerializer(javaType41, beanProperty42);
        com.fasterxml.jackson.databind.BeanProperty beanProperty44 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = defaultSerializerProvider32.handlePrimaryContextualization(objJsonSerializer43, beanProperty44);
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(defaultSerializerProvider20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNull(jsonGenerator27);
        org.junit.Assert.assertNotNull(objJsonSerializer28);
        org.junit.Assert.assertNotNull(objJsonSerializer30);
        org.junit.Assert.assertNotNull(defaultSerializerProvider32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jsonGenerator36);
        org.junit.Assert.assertNotNull(jsonMappingException38);
        org.junit.Assert.assertNotNull(defaultSerializerProvider39);
        org.junit.Assert.assertNull(wildcardMapperConfig40);
        org.junit.Assert.assertNotNull(objJsonSerializer43);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer45);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.String str7 = com.fasterxml.jackson.databind.util.ClassUtil.getClassDescription((java.lang.Object) deserializerCache0);
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._findCachedDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "`com.fasterxml.jackson.databind.deser.DeserializerCache`" + "'", str7, "`com.fasterxml.jackson.databind.deser.DeserializerCache`");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        int int3 = defaultSerializerProvider2.cachedSerializersCount();
        java.lang.Class<?> wildcardClass4 = defaultSerializerProvider2.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider5 = defaultSerializerProvider2.copy();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) defaultSerializerProvider2, "java.lang.Short[?]");
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider5);
        org.junit.Assert.assertNotNull(jsonMappingException7);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.fasterxml.jackson.databind.BeanProperty beanProperty0 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        java.lang.Object obj5 = objJsonDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty7 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty0, annotatedMember1, javaType2, objJsonDeserializer3, typeDeserializer6);
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = settableAnyProperty7.getProperty();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = settableAnyProperty7._valueTypeDeserializer;
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = settableAnyProperty7._property;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = objJsonDeserializer14.getObjectIdReader();
        java.lang.Object obj16 = objJsonDeserializer14.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty18 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty11, annotatedMember12, javaType13, objJsonDeserializer14, typeDeserializer17);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException21 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser19, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        jsonMappingException21.prependPath((java.lang.Object) objJsonDeserializer22, "[null]");
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern25 = objJsonDeserializer22.getEmptyAccessPattern();
        settableAnyProperty18._valueDeserializer = objJsonDeserializer22;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer28 = objJsonDeserializer22.unwrappingDeserializer(nameTransformer27);
        settableAnyProperty7._valueDeserializer = objJsonDeserializer22;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader31 = objJsonDeserializer30.getObjectIdReader();
        java.lang.Object obj32 = objJsonDeserializer30.getNullValue();
        settableAnyProperty7._valueDeserializer = objJsonDeserializer30;
        com.fasterxml.jackson.databind.BeanProperty beanProperty34 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember35 = null;
        com.fasterxml.jackson.databind.JavaType javaType36 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty37 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember38 = null;
        com.fasterxml.jackson.databind.JavaType javaType39 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer40 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader41 = objJsonDeserializer40.getObjectIdReader();
        java.lang.Object obj42 = objJsonDeserializer40.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty44 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty37, annotatedMember38, javaType39, objJsonDeserializer40, typeDeserializer43);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.SettableAnyProperty settableAnyProperty46 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty(beanProperty34, annotatedMember35, javaType36, objJsonDeserializer40, typeDeserializer45);
        boolean boolean47 = settableAnyProperty46._setterIsField;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = settableAnyProperty46._valueDeserializer;
        settableAnyProperty7._valueDeserializer = objJsonDeserializer48;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember50 = settableAnyProperty7._setter;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer51 = settableAnyProperty7._keyDeserializer;
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(beanProperty8);
        org.junit.Assert.assertNull(typeDeserializer9);
        org.junit.Assert.assertNull(beanProperty10);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(jsonMappingException21);
        org.junit.Assert.assertNotNull(objJsonDeserializer22);
        org.junit.Assert.assertTrue("'" + accessPattern25 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern25.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNotNull(objJsonDeserializer28);
        org.junit.Assert.assertNotNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(objectIdReader31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objJsonDeserializer40);
        org.junit.Assert.assertNull(objectIdReader41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer48);
        org.junit.Assert.assertNull(annotatedMember50);
        org.junit.Assert.assertNull(keyDeserializer51);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        java.io.Closeable closeable4 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = new com.fasterxml.jackson.databind.JsonMappingException(closeable4, "hi!", jsonLocation6);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = new com.fasterxml.jackson.databind.JsonMappingException("hi!", (java.lang.Throwable) jsonMappingException7);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "[null]", (java.lang.Throwable) jsonMappingException7);
        java.lang.Class<?> wildcardClass10 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl11);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider13 = impl11.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = impl11.findNullValueSerializer(beanProperty14);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl16);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider18 = impl16.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = impl16.findNullValueSerializer(beanProperty19);
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = impl11.handleSecondaryContextualization(objJsonSerializer20, beanProperty21);
        int int23 = impl11.cachedSerializersCount();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl24);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider26 = impl24.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer28 = impl24.findNullValueSerializer(beanProperty27);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl29);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider31 = impl29.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty32 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer33 = impl29.findNullValueSerializer(beanProperty32);
        com.fasterxml.jackson.databind.BeanProperty beanProperty34 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer35 = impl24.handleSecondaryContextualization(objJsonSerializer33, beanProperty34);
        impl11.setNullValueSerializer((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer35);
        com.fasterxml.jackson.databind.JavaType javaType37 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty38 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer39 = impl11.findNullKeySerializer(javaType37, beanProperty38);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig40 = impl11.getConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer41 = impl11.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer42 = impl11.getDefaultNullKeySerializer();
        impl0.setNullKeySerializer(objJsonSerializer42);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator44 = null;
        java.io.Closeable closeable45 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser47 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException49 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser47, "[null]");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException50 = new com.fasterxml.jackson.databind.JsonMappingException(closeable45, "[null]", (java.lang.Throwable) jsonMappingException49);
        java.lang.Object obj51 = jsonMappingException50.getProcessor();
        java.lang.Throwable throwable52 = com.fasterxml.jackson.databind.util.ClassUtil.getRootCause((java.lang.Throwable) jsonMappingException50);
        com.fasterxml.jackson.databind.JavaType javaType53 = null;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl54 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl55 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl54);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider56 = impl54.copy();
        com.fasterxml.jackson.databind.introspect.Annotated annotated57 = null;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig58 = null;
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory59 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig58);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig60 = beanDeserializerFactory59.getFactoryConfig();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer61 = impl54.serializerInstance(annotated57, (java.lang.Object) deserializerFactoryConfig60);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl62 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl63 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl62);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider64 = impl62.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty65 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer66 = impl62.findNullValueSerializer(beanProperty65);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl67 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl68 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl67);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider69 = impl67.copy();
        com.fasterxml.jackson.databind.BeanProperty beanProperty70 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer71 = impl67.findNullValueSerializer(beanProperty70);
        com.fasterxml.jackson.databind.BeanProperty beanProperty72 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer73 = impl62.handleSecondaryContextualization(objJsonSerializer71, beanProperty72);
        com.fasterxml.jackson.databind.BeanProperty beanProperty74 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer75 = impl54.handlePrimaryContextualization(objJsonSerializer71, beanProperty74);
        com.fasterxml.jackson.databind.JavaType javaType76 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty77 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer78 = impl54.findNullKeySerializer(javaType76, beanProperty77);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl79 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl54);
        com.fasterxml.jackson.databind.JavaType javaType80 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty81 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer82 = impl79.findNullKeySerializer(javaType80, beanProperty81);
        // The following exception was thrown during execution in test generation
        try {
            impl0.serializeValue(jsonGenerator44, (java.lang.Object) throwable52, javaType53, objJsonSerializer82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException9);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(defaultSerializerProvider13);
        org.junit.Assert.assertNotNull(objJsonSerializer15);
        org.junit.Assert.assertNotNull(defaultSerializerProvider18);
        org.junit.Assert.assertNotNull(objJsonSerializer20);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(defaultSerializerProvider26);
        org.junit.Assert.assertNotNull(objJsonSerializer28);
        org.junit.Assert.assertNotNull(defaultSerializerProvider31);
        org.junit.Assert.assertNotNull(objJsonSerializer33);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer35);
        org.junit.Assert.assertNotNull(objJsonSerializer39);
        org.junit.Assert.assertNull(serializationConfig40);
        org.junit.Assert.assertNotNull(objJsonSerializer41);
        org.junit.Assert.assertNotNull(objJsonSerializer42);
        org.junit.Assert.assertNotNull(jsonMappingException49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(throwable52);
        org.junit.Assert.assertEquals(throwable52.getLocalizedMessage(), "[null]");
        org.junit.Assert.assertEquals(throwable52.getMessage(), "[null]");
        org.junit.Assert.assertEquals(throwable52.toString(), "com.fasterxml.jackson.databind.JsonMappingException: [null]");
        org.junit.Assert.assertNotNull(defaultSerializerProvider56);
        org.junit.Assert.assertNull(deserializerFactoryConfig60);
        org.junit.Assert.assertNull(objJsonSerializer61);
        org.junit.Assert.assertNotNull(defaultSerializerProvider64);
        org.junit.Assert.assertNotNull(objJsonSerializer66);
        org.junit.Assert.assertNotNull(defaultSerializerProvider69);
        org.junit.Assert.assertNotNull(objJsonSerializer71);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer73);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer75);
        org.junit.Assert.assertNotNull(objJsonSerializer78);
        org.junit.Assert.assertNotNull(objJsonSerializer82);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "");
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = com.fasterxml.jackson.databind.deser.SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objJsonDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) objJsonDeserializer3, (int) '#');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = objJsonDeserializer3.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern9 = objJsonDeserializer8.getEmptyAccessPattern();
        boolean boolean10 = objJsonDeserializer8.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = objJsonDeserializer8.getNullValue(deserializationContext11);
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(jsonMappingException6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + accessPattern9 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern9.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig1 = beanDeserializerFactory0.getFactoryConfig();
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(deserializerFactoryConfig1);
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig3 = beanDeserializerFactory2._factoryConfig;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig4 = beanDeserializerFactory2.getFactoryConfig();
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig1);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig3);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig4);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory beanDeserializerFactory0 = com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance;
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig1 = beanDeserializerFactory0.getFactoryConfig();
        com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig deserializerFactoryConfig2 = beanDeserializerFactory0._factoryConfig;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = beanDeserializerFactory0.findPropertyTypeDeserializer(deserializationConfig3, javaType4, annotatedMember5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanDeserializerFactory0);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig1);
        org.junit.Assert.assertNotNull(deserializerFactoryConfig2);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean4 = stdValueInstantiator2.canCreateUsingDelegate();
        java.lang.Class<?> wildcardClass5 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig9, javaType10);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = stdValueInstantiator11.getWithArgsCreator();
        boolean boolean13 = stdValueInstantiator11.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray16 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator11.configureFromArraySettings(annotatedWithParams14, javaType15, settableBeanPropertyArray16);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams18 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator21 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig19, javaType20);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams22 = stdValueInstantiator21.getWithArgsCreator();
        boolean boolean23 = stdValueInstantiator21.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray26 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator21.configureFromArraySettings(annotatedWithParams24, javaType25, settableBeanPropertyArray26);
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams6, annotatedWithParams7, javaType8, settableBeanPropertyArray16, annotatedWithParams18, settableBeanPropertyArray26);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig29);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray16);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray16, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNull(annotatedWithParams22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray26);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray26, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNull(javaType30);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = impl0.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl4);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = impl4.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = impl4.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = impl0.handleSecondaryContextualization(objJsonSerializer7, beanProperty8);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider10 = impl0.copy();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = defaultSerializerProvider10.findNullKeySerializer(javaType11, beanProperty12);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig14 = defaultSerializerProvider10.getConfig();
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = defaultSerializerProvider10.findTypedValueSerializer(javaType15, true, beanProperty17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultSerializerProvider2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(defaultSerializerProvider6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(defaultSerializerProvider10);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
        org.junit.Assert.assertNull(serializationConfig14);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.io.Closeable closeable0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser2, "[null]");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = new com.fasterxml.jackson.databind.JsonMappingException(closeable0, "[null]", (java.lang.Throwable) jsonMappingException4);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference7 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) (short) -1);
        int int8 = reference7.getIndex();
        jsonMappingException4.prependPath(reference7);
        java.lang.String str10 = reference7.getFieldName();
        java.lang.String str11 = com.fasterxml.jackson.databind.util.ClassUtil.classNameOf((java.lang.Object) reference7);
        org.junit.Assert.assertNotNull(jsonMappingException4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "`com.fasterxml.jackson.databind.JsonMappingException$Reference`" + "'", str11, "`com.fasterxml.jackson.databind.JsonMappingException$Reference`");
    }
}

