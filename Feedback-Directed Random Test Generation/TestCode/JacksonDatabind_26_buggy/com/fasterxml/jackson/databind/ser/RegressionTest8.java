package com.fasterxml.jackson.databind.ser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        boolean boolean4 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer5;
        boolean boolean7 = beanPropertyWriter0._suppressNulls;
        java.lang.Class<?> wildcardClass8 = beanPropertyWriter0.getRawSerializationType();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(typeSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap2 = beanPropertyWriter0._internalSettings;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) '4');
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType5;
        boolean boolean7 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType8;
        boolean boolean10 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.core.SerializableString serializableString11 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.PropertyName propertyName12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = beanPropertyWriter0._new(propertyName12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objMap2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(serializableString11);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        java.lang.Object obj5 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 0.0f);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value9 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector8);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter10._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = beanPropertyWriter10.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType15 = beanPropertyWriter14._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType16 = beanPropertyWriter14._nonTrivialBaseType;
        java.lang.Object obj18 = beanPropertyWriter14.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean19 = beanPropertyWriter14._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = beanPropertyWriter14._serializer;
        java.lang.Object obj21 = beanPropertyWriter10.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter14);
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter10._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap23 = beanPropertyWriter10._internalSettings;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember24 = beanPropertyWriter10.getMember();
        java.lang.Object obj25 = beanPropertyWriter10.readResolve();
        com.fasterxml.jackson.core.SerializableString serializableString26 = beanPropertyWriter10.getSerializedName();
        com.fasterxml.jackson.annotation.JsonFormat.Value value27 = beanPropertyWriter10._format;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass29 = beanPropertyWriter28.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember30 = beanPropertyWriter28.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer31 = beanPropertyWriter28._typeSerializer;
        boolean boolean32 = beanPropertyWriter28.willSuppressNulls();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer33 = null;
        beanPropertyWriter28._typeSerializer = typeSerializer33;
        java.lang.reflect.Method method35 = beanPropertyWriter28._accessorMethod;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType37 = beanPropertyWriter36._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray38 = beanPropertyWriter36._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap39 = null;
        beanPropertyWriter36._internalSettings = objMap39;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap41 = beanPropertyWriter36._dynamicSerializers;
        boolean boolean42 = beanPropertyWriter36.hasNullSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter43 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType44 = beanPropertyWriter43._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray45 = beanPropertyWriter43._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer46 = null;
        beanPropertyWriter43._serializer = objJsonSerializer46;
        java.lang.Object obj49 = beanPropertyWriter43.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata50 = beanPropertyWriter43._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter51 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType52 = beanPropertyWriter51._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray53 = beanPropertyWriter51._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap54 = null;
        beanPropertyWriter51._internalSettings = objMap54;
        java.lang.Object obj56 = beanPropertyWriter43.removeInternalSetting((java.lang.Object) beanPropertyWriter51);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter57 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter51);
        java.lang.Object obj58 = beanPropertyWriter36.removeInternalSetting((java.lang.Object) beanPropertyWriter57);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter59 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean60 = beanPropertyWriter59.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName61 = beanPropertyWriter59._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer62 = beanPropertyWriter59._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer63 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter64 = beanPropertyWriter59.unwrappingWriter(nameTransformer63);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer65 = beanPropertyWriter64.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType66 = null;
        beanPropertyWriter64.setNonTrivialBaseType(javaType66);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter68 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType69 = beanPropertyWriter68._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember70 = beanPropertyWriter68.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter72 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType73 = beanPropertyWriter72._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType74 = beanPropertyWriter72._nonTrivialBaseType;
        java.lang.Object obj76 = beanPropertyWriter72.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean77 = beanPropertyWriter72._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer78 = beanPropertyWriter72._serializer;
        java.lang.Object obj79 = beanPropertyWriter68.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter72);
        com.fasterxml.jackson.databind.JavaType javaType80 = beanPropertyWriter68._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap81 = beanPropertyWriter68._internalSettings;
        beanPropertyWriter64._internalSettings = objMap81;
        beanPropertyWriter36._internalSettings = objMap81;
        beanPropertyWriter28._internalSettings = objMap81;
        java.lang.Object obj85 = beanPropertyWriter0.setInternalSetting((java.lang.Object) value27, (java.lang.Object) objMap81);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(typeSerializer3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(typeSerializer6);
        org.junit.Assert.assertNull(typeSerializer7);
        org.junit.Assert.assertNull(value9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(annotatedMember12);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(objJsonSerializer20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNotNull(objMap23);
        org.junit.Assert.assertNull(annotatedMember24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(serializableString26);
        org.junit.Assert.assertNull(value27);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertNull(annotatedMember30);
        org.junit.Assert.assertNull(typeSerializer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertNull(javaType37);
        org.junit.Assert.assertNull(wildcardClassArray38);
        org.junit.Assert.assertNull(propertySerializerMap41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(javaType44);
        org.junit.Assert.assertNull(wildcardClassArray45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(propertyMetadata50);
        org.junit.Assert.assertNull(javaType52);
        org.junit.Assert.assertNull(wildcardClassArray53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(propertyName61);
        org.junit.Assert.assertNull(objJsonSerializer62);
        org.junit.Assert.assertNotNull(beanPropertyWriter64);
        org.junit.Assert.assertNull(typeSerializer65);
        org.junit.Assert.assertNull(javaType69);
        org.junit.Assert.assertNull(annotatedMember70);
        org.junit.Assert.assertNull(javaType73);
        org.junit.Assert.assertNull(javaType74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(objJsonSerializer78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(javaType80);
        org.junit.Assert.assertNotNull(objMap81);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = beanPropertyWriter5.getTypeSerializer();
        com.fasterxml.jackson.core.io.SerializedString serializedString7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5, serializedString7);
        java.lang.Object obj10 = beanPropertyWriter8.getInternalSetting((java.lang.Object) 10.0f);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = beanPropertyWriter8._typeSerializer;
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter8._cfgSerializationType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        beanPropertyWriter8.assignTypeSerializer(typeSerializer13);
        boolean boolean15 = beanPropertyWriter8.hasSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer16 = null;
        beanPropertyWriter8.assignTypeSerializer(typeSerializer16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(typeSerializer6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(typeSerializer11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = null;
        beanPropertyWriter4._nullSerializer = objJsonSerializer7;
        com.fasterxml.jackson.annotation.JsonFormat.Value value9 = null;
        beanPropertyWriter4._format = value9;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata11 = beanPropertyWriter4.getMetadata();
        java.lang.reflect.Type type12 = beanPropertyWriter4.getGenericPropertyType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter13._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray15 = beanPropertyWriter13._includeInViews;
        boolean boolean16 = beanPropertyWriter13.isVirtual();
        java.lang.Class<?>[] wildcardClassArray17 = beanPropertyWriter13.getViews();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata18 = beanPropertyWriter13.getMetadata();
        java.lang.Object obj19 = beanPropertyWriter4.getInternalSetting((java.lang.Object) beanPropertyWriter13);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter20._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember22 = beanPropertyWriter20.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType25 = beanPropertyWriter24._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType26 = beanPropertyWriter24._nonTrivialBaseType;
        java.lang.Object obj28 = beanPropertyWriter24.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean29 = beanPropertyWriter24._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = beanPropertyWriter24._serializer;
        java.lang.Object obj31 = beanPropertyWriter20.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter24);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer32 = null;
        beanPropertyWriter20.assignTypeSerializer(typeSerializer32);
        java.lang.reflect.Field field34 = null;
        beanPropertyWriter20._field = field34;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap36 = null;
        beanPropertyWriter20._dynamicSerializers = propertySerializerMap36;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap38 = beanPropertyWriter20._internalSettings;
        beanPropertyWriter13._internalSettings = objMap38;
        beanPropertyWriter0._internalSettings = objMap38;
        boolean boolean41 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer42 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.annotation.JsonFormat.Value value43 = beanPropertyWriter0._format;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(propertyMetadata11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardClassArray17);
        org.junit.Assert.assertNull(propertyMetadata18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(annotatedMember22);
        org.junit.Assert.assertNull(javaType25);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(objJsonSerializer30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objMap38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(objJsonSerializer42);
        org.junit.Assert.assertNull(value43);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean5 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = null;
        beanPropertyWriter0.assignSerializer(objJsonSerializer7);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = beanPropertyWriter0._dynamicSerializers;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objJsonSerializer6);
        org.junit.Assert.assertNull(propertySerializerMap9);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.reflect.Method method3 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = beanPropertyWriter0.getWrapperName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0._typeSerializer;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = beanPropertyWriter0.getSerializer();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType7;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(typeSerializer5);
        org.junit.Assert.assertNull(objJsonSerializer6);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = beanPropertyWriter0._name;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType3;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter5._cfgSerializationType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        beanPropertyWriter5._typeSerializer = typeSerializer7;
        java.lang.Object obj9 = beanPropertyWriter5.readResolve();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = beanPropertyWriter5.getTypeSerializer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = beanPropertyWriter0.get((java.lang.Object) beanPropertyWriter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(serializedString2);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(typeSerializer10);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor2 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor2);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer4;
        com.fasterxml.jackson.core.SerializableString serializableString6 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType7;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer9 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer9;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass12 = beanPropertyWriter11.getRawSerializationType();
        java.lang.reflect.Field field13 = null;
        beanPropertyWriter11._field = field13;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap15 = null;
        beanPropertyWriter11._internalSettings = objMap15;
        boolean boolean17 = beanPropertyWriter11.isUnwrapping();
        com.fasterxml.jackson.core.io.SerializedString serializedString18 = beanPropertyWriter11._name;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass20 = beanPropertyWriter19.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter19._nonTrivialBaseType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType23 = beanPropertyWriter22._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType24 = beanPropertyWriter22._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember25 = beanPropertyWriter22._member;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata26 = beanPropertyWriter22._metadata;
        com.fasterxml.jackson.core.SerializableString serializableString27 = beanPropertyWriter22.getSerializedName();
        java.lang.Object obj28 = beanPropertyWriter19.removeInternalSetting((java.lang.Object) beanPropertyWriter22);
        com.fasterxml.jackson.core.SerializableString serializableString29 = beanPropertyWriter19.getSerializedName();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass31 = beanPropertyWriter30.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType32 = beanPropertyWriter30._nonTrivialBaseType;
        java.lang.reflect.Method method33 = beanPropertyWriter30._accessorMethod;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap34 = null;
        beanPropertyWriter30._dynamicSerializers = propertySerializerMap34;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer36 = null;
        beanPropertyWriter30.assignSerializer(objJsonSerializer36);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer39 = null;
        beanPropertyWriter38.assignTypeSerializer(typeSerializer39);
        java.lang.Object obj41 = beanPropertyWriter38._suppressableValue;
        java.lang.Class<?> wildcardClass42 = beanPropertyWriter38.getRawSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = beanPropertyWriter38._name;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector44 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value45 = beanPropertyWriter38.findFormatOverrides(annotationIntrospector44);
        com.fasterxml.jackson.core.SerializableString serializableString46 = beanPropertyWriter38.getSerializedName();
        boolean boolean47 = beanPropertyWriter38.isVirtual();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter48 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType49 = beanPropertyWriter48._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType50 = beanPropertyWriter48._nonTrivialBaseType;
        java.lang.Object obj52 = beanPropertyWriter48.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean53 = beanPropertyWriter48._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer54 = beanPropertyWriter48._serializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter55 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType56 = beanPropertyWriter55._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember57 = beanPropertyWriter55.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter59 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType60 = beanPropertyWriter59._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType61 = beanPropertyWriter59._nonTrivialBaseType;
        java.lang.Object obj63 = beanPropertyWriter59.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean64 = beanPropertyWriter59._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer65 = beanPropertyWriter59._serializer;
        java.lang.Object obj66 = beanPropertyWriter55.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter59);
        com.fasterxml.jackson.databind.JavaType javaType67 = beanPropertyWriter55._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap68 = beanPropertyWriter55._internalSettings;
        beanPropertyWriter48._internalSettings = objMap68;
        beanPropertyWriter38._internalSettings = objMap68;
        beanPropertyWriter30._internalSettings = objMap68;
        beanPropertyWriter19._internalSettings = objMap68;
        beanPropertyWriter11._internalSettings = objMap68;
        beanPropertyWriter0._internalSettings = objMap68;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(serializableString6);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(serializedString18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(annotatedMember25);
        org.junit.Assert.assertNull(propertyMetadata26);
        org.junit.Assert.assertNull(serializableString27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(serializableString29);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertNull(serializedString43);
        org.junit.Assert.assertNull(value45);
        org.junit.Assert.assertNull(serializableString46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(javaType49);
        org.junit.Assert.assertNull(javaType50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(objJsonSerializer54);
        org.junit.Assert.assertNull(javaType56);
        org.junit.Assert.assertNull(annotatedMember57);
        org.junit.Assert.assertNull(javaType60);
        org.junit.Assert.assertNull(javaType61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(objJsonSerializer65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(javaType67);
        org.junit.Assert.assertNotNull(objMap68);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer1 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer3;
        boolean boolean5 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = beanPropertyWriter0._typeSerializer;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(typeSerializer6);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap2 = beanPropertyWriter0._internalSettings;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) '4');
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0._nonTrivialBaseType;
        boolean boolean6 = beanPropertyWriter0.isUnwrapping();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = beanPropertyWriter0.getWrapperName();
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = null;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap9;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor11 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objMap2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        beanPropertyWriter0.setNonTrivialBaseType(javaType3);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = null;
        beanPropertyWriter0._serializer = objJsonSerializer5;
        com.fasterxml.jackson.databind.util.Annotations annotations7 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer8;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter10._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter10._nonTrivialBaseType;
        java.lang.Object obj14 = beanPropertyWriter10.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName15 = beanPropertyWriter10._wrapperName;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector16 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value17 = beanPropertyWriter10.findFormatOverrides(annotationIntrospector16);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata18 = beanPropertyWriter10.getMetadata();
        java.lang.Class<?> wildcardClass19 = beanPropertyWriter10.getRawSerializationType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter20._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter20._nonTrivialBaseType;
        java.lang.Object obj24 = beanPropertyWriter20.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean25 = beanPropertyWriter20._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer26 = beanPropertyWriter20._serializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType28 = beanPropertyWriter27._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember29 = beanPropertyWriter27.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter31 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType32 = beanPropertyWriter31._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType33 = beanPropertyWriter31._nonTrivialBaseType;
        java.lang.Object obj35 = beanPropertyWriter31.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean36 = beanPropertyWriter31._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer37 = beanPropertyWriter31._serializer;
        java.lang.Object obj38 = beanPropertyWriter27.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter31);
        com.fasterxml.jackson.databind.JavaType javaType39 = beanPropertyWriter27._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap40 = beanPropertyWriter27._internalSettings;
        beanPropertyWriter20._internalSettings = objMap40;
        com.fasterxml.jackson.databind.PropertyName propertyName42 = beanPropertyWriter20._wrapperName;
        java.lang.Object obj43 = beanPropertyWriter0.setInternalSetting((java.lang.Object) beanPropertyWriter10, (java.lang.Object) beanPropertyWriter20);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember44 = beanPropertyWriter0.getMember();
        java.lang.Class<?>[] wildcardClassArray45 = beanPropertyWriter0._includeInViews;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = beanPropertyWriter0.isRequired();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(annotations7);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(propertyName15);
        org.junit.Assert.assertNull(value17);
        org.junit.Assert.assertNull(propertyMetadata18);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(objJsonSerializer26);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertNull(annotatedMember29);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(objJsonSerializer37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(javaType39);
        org.junit.Assert.assertNotNull(objMap40);
        org.junit.Assert.assertNull(propertyName42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(annotatedMember44);
        org.junit.Assert.assertNull(wildcardClassArray45);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?>[] wildcardClassArray1 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value3 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector2);
        com.fasterxml.jackson.databind.JavaType javaType4 = beanPropertyWriter0._nonTrivialBaseType;
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(value3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.lang.Class<?>[] wildcardClassArray3 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer4;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = beanPropertyWriter0._typeSerializer;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter0.getType();
        java.lang.Class<?>[] wildcardClassArray10 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = beanPropertyWriter11.getSerializedName();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = beanPropertyWriter11._serializer;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassArray3);
        org.junit.Assert.assertNull(typeSerializer6);
        org.junit.Assert.assertNull(propertySerializerMap7);
        org.junit.Assert.assertNull(annotatedMember8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(wildcardClassArray10);
        org.junit.Assert.assertNull(serializableString12);
        org.junit.Assert.assertNull(objJsonSerializer13);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0._wrapperName;
        boolean boolean6 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.core.SerializableString serializableString7 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = beanPropertyWriter0.getSerializer();
        com.fasterxml.jackson.annotation.JsonFormat.Value value9 = beanPropertyWriter0._format;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter0._nullSerializer;
        java.lang.reflect.Method method11 = beanPropertyWriter0._accessorMethod;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(serializableString7);
        org.junit.Assert.assertNull(objJsonSerializer8);
        org.junit.Assert.assertNull(value9);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        java.lang.reflect.Field field2 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = beanPropertyWriter0.unwrappingWriter(nameTransformer3);
        java.lang.reflect.Method method5 = null;
        beanPropertyWriter4._accessorMethod = method5;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata7 = beanPropertyWriter4.getMetadata();
        com.fasterxml.jackson.core.io.SerializedString serializedString8 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter4, serializedString8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = beanPropertyWriter4.unwrappingWriter(nameTransformer10);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType13 = beanPropertyWriter12._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray14 = beanPropertyWriter12._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap15 = null;
        beanPropertyWriter12._internalSettings = objMap15;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter12);
        com.fasterxml.jackson.databind.JavaType javaType18 = beanPropertyWriter17._declaredType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = beanPropertyWriter17.unwrappingWriter(nameTransformer19);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter11.serializeAsElement((java.lang.Object) beanPropertyWriter17, jsonGenerator21, serializerProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(field2);
        org.junit.Assert.assertNotNull(beanPropertyWriter4);
        org.junit.Assert.assertNull(propertyMetadata7);
        org.junit.Assert.assertNotNull(beanPropertyWriter11);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(wildcardClassArray14);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(beanPropertyWriter20);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        boolean boolean3 = beanPropertyWriter0.isVirtual();
        java.lang.Class<?>[] wildcardClassArray4 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0._declaredType;
        com.fasterxml.jackson.databind.util.Annotations annotations6 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter7._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter7._nonTrivialBaseType;
        java.lang.Object obj11 = beanPropertyWriter7.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName12 = beanPropertyWriter7._wrapperName;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector13 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value14 = beanPropertyWriter7.findFormatOverrides(annotationIntrospector13);
        java.lang.Class<?>[] wildcardClassArray15 = beanPropertyWriter7.getViews();
        java.lang.Object obj16 = beanPropertyWriter0.getInternalSetting((java.lang.Object) beanPropertyWriter7);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass18 = beanPropertyWriter17.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember19 = beanPropertyWriter17.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer20 = beanPropertyWriter17._typeSerializer;
        boolean boolean21 = beanPropertyWriter17.willSuppressNulls();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer22 = null;
        beanPropertyWriter17._typeSerializer = typeSerializer22;
        java.lang.reflect.Method method24 = beanPropertyWriter17._accessorMethod;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter25 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType26 = beanPropertyWriter25._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray27 = beanPropertyWriter25._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap28 = null;
        beanPropertyWriter25._internalSettings = objMap28;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap30 = beanPropertyWriter25._dynamicSerializers;
        boolean boolean31 = beanPropertyWriter25.hasNullSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType33 = beanPropertyWriter32._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray34 = beanPropertyWriter32._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer35 = null;
        beanPropertyWriter32._serializer = objJsonSerializer35;
        java.lang.Object obj38 = beanPropertyWriter32.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata39 = beanPropertyWriter32._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter40 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType41 = beanPropertyWriter40._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray42 = beanPropertyWriter40._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap43 = null;
        beanPropertyWriter40._internalSettings = objMap43;
        java.lang.Object obj45 = beanPropertyWriter32.removeInternalSetting((java.lang.Object) beanPropertyWriter40);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter46 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter40);
        java.lang.Object obj47 = beanPropertyWriter25.removeInternalSetting((java.lang.Object) beanPropertyWriter46);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter48 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean49 = beanPropertyWriter48.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName50 = beanPropertyWriter48._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer51 = beanPropertyWriter48._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer52 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter53 = beanPropertyWriter48.unwrappingWriter(nameTransformer52);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer54 = beanPropertyWriter53.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType55 = null;
        beanPropertyWriter53.setNonTrivialBaseType(javaType55);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter57 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType58 = beanPropertyWriter57._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember59 = beanPropertyWriter57.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter61 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType62 = beanPropertyWriter61._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType63 = beanPropertyWriter61._nonTrivialBaseType;
        java.lang.Object obj65 = beanPropertyWriter61.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean66 = beanPropertyWriter61._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer67 = beanPropertyWriter61._serializer;
        java.lang.Object obj68 = beanPropertyWriter57.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter61);
        com.fasterxml.jackson.databind.JavaType javaType69 = beanPropertyWriter57._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap70 = beanPropertyWriter57._internalSettings;
        beanPropertyWriter53._internalSettings = objMap70;
        beanPropertyWriter25._internalSettings = objMap70;
        beanPropertyWriter17._internalSettings = objMap70;
        beanPropertyWriter7._internalSettings = objMap70;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer75 = beanPropertyWriter7._serializer;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata76 = beanPropertyWriter7._metadata;
        com.fasterxml.jackson.core.io.SerializedString serializedString77 = beanPropertyWriter7._name;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardClassArray4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(annotations6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNull(value14);
        org.junit.Assert.assertNull(wildcardClassArray15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(annotatedMember19);
        org.junit.Assert.assertNull(typeSerializer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNull(wildcardClassArray27);
        org.junit.Assert.assertNull(propertySerializerMap30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNull(wildcardClassArray34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(propertyMetadata39);
        org.junit.Assert.assertNull(javaType41);
        org.junit.Assert.assertNull(wildcardClassArray42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(propertyName50);
        org.junit.Assert.assertNull(objJsonSerializer51);
        org.junit.Assert.assertNotNull(beanPropertyWriter53);
        org.junit.Assert.assertNull(typeSerializer54);
        org.junit.Assert.assertNull(javaType58);
        org.junit.Assert.assertNull(annotatedMember59);
        org.junit.Assert.assertNull(javaType62);
        org.junit.Assert.assertNull(javaType63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(objJsonSerializer67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(javaType69);
        org.junit.Assert.assertNotNull(objMap70);
        org.junit.Assert.assertNull(objJsonSerializer75);
        org.junit.Assert.assertNull(propertyMetadata76);
        org.junit.Assert.assertNull(serializedString77);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        java.lang.reflect.Field field2 = null;
        beanPropertyWriter0._field = field2;
        boolean boolean4 = beanPropertyWriter0.isUnwrapping();
        boolean boolean5 = beanPropertyWriter0.hasNullSerializer();
        boolean boolean6 = beanPropertyWriter0.isUnwrapping();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.PropertyName propertyName8 = beanPropertyWriter0._wrapperName;
        java.lang.reflect.Method method9 = null;
        beanPropertyWriter0._accessorMethod = method9;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass12 = beanPropertyWriter11.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = beanPropertyWriter11.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = beanPropertyWriter11._typeSerializer;
        java.lang.Object obj16 = beanPropertyWriter11.removeInternalSetting((java.lang.Object) 0.0f);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer17 = beanPropertyWriter11.getTypeSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer18 = beanPropertyWriter11.getTypeSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter20._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor22 = null;
        beanPropertyWriter20.depositSchemaProperty(jsonObjectFormatVisitor22);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer24 = null;
        beanPropertyWriter20.assignTypeSerializer(typeSerializer24);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer26 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter27 = beanPropertyWriter20.unwrappingWriter(nameTransformer26);
        boolean boolean28 = beanPropertyWriter27.isVirtual();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer29 = null;
        beanPropertyWriter27._nullSerializer = objJsonSerializer29;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata31 = beanPropertyWriter27.getMetadata();
        java.lang.Object obj32 = beanPropertyWriter11.setInternalSetting((java.lang.Object) (short) 0, (java.lang.Object) propertyMetadata31);
        com.fasterxml.jackson.databind.JavaType javaType33 = beanPropertyWriter11._cfgSerializationType;
        com.fasterxml.jackson.core.io.SerializedString serializedString34 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter11, serializedString34);
        java.lang.Object obj36 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter11);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(annotatedMember13);
        org.junit.Assert.assertNull(typeSerializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(typeSerializer17);
        org.junit.Assert.assertNull(typeSerializer18);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNotNull(beanPropertyWriter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(propertyMetadata31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        boolean boolean12 = beanPropertyWriter4.isVirtual();
        boolean boolean13 = beanPropertyWriter4.hasSerializer();
        java.lang.reflect.Method method14 = beanPropertyWriter4._accessorMethod;
        com.fasterxml.jackson.core.SerializableString serializableString15 = beanPropertyWriter4.getSerializedName();
        com.fasterxml.jackson.core.SerializableString serializableString16 = beanPropertyWriter4.getSerializedName();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(serializableString15);
        org.junit.Assert.assertNull(serializableString16);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value7 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector6);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata8 = beanPropertyWriter0.getMetadata();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.databind.util.Annotations annotations10 = beanPropertyWriter0._contextAnnotations;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNull(value7);
        org.junit.Assert.assertNull(propertyMetadata8);
        org.junit.Assert.assertNull(propertySerializerMap9);
        org.junit.Assert.assertNull(annotations10);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean5 = beanPropertyWriter0._suppressNulls;
        java.lang.reflect.Field field6 = null;
        beanPropertyWriter0._field = field6;
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter0.getType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean10 = beanPropertyWriter9.isVirtual();
        java.lang.reflect.Field field11 = beanPropertyWriter9._field;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = beanPropertyWriter9.unwrappingWriter(nameTransformer12);
        java.lang.Object obj14 = beanPropertyWriter0.getInternalSetting((java.lang.Object) nameTransformer12);
        com.fasterxml.jackson.databind.util.Annotations annotations15 = beanPropertyWriter0._contextAnnotations;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = beanPropertyWriter0.getPropertyType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(field11);
        org.junit.Assert.assertNotNull(beanPropertyWriter13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(annotations15);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor2 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor2);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        boolean boolean8 = beanPropertyWriter7.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap9 = null;
        beanPropertyWriter7._internalSettings = objMap9;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = beanPropertyWriter7.getTypeSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = null;
        beanPropertyWriter7.assignSerializer(objJsonSerializer12);
        java.lang.Class<?>[] wildcardClassArray14 = beanPropertyWriter7.getViews();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        beanPropertyWriter7._typeSerializer = typeSerializer15;
        boolean boolean17 = beanPropertyWriter7.hasNullSerializer();
        java.lang.Class<?> wildcardClass18 = beanPropertyWriter7.getRawSerializationType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer19 = null;
        beanPropertyWriter7._serializer = objJsonSerializer19;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = beanPropertyWriter7.unwrappingWriter(nameTransformer21);
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        beanPropertyWriter7._nonTrivialBaseType = javaType23;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typeSerializer11);
        org.junit.Assert.assertNull(wildcardClassArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(beanPropertyWriter22);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = beanPropertyWriter5.getTypeSerializer();
        java.lang.reflect.Field field7 = beanPropertyWriter5._field;
        java.lang.Object obj8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter5.serializeAsElement(obj8, jsonGenerator9, serializerProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(typeSerializer6);
        org.junit.Assert.assertNull(field7);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer1 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer1);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = beanPropertyWriter0._internalSettings;
        java.lang.reflect.Method method4 = null;
        beanPropertyWriter0._accessorMethod = method4;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer6;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer8);
        java.lang.reflect.Type type10 = beanPropertyWriter0.getGenericPropertyType();
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertNull(type10);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer7);
        java.lang.reflect.Method method9 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = beanPropertyWriter0._typeSerializer;
        com.fasterxml.jackson.core.SerializableString serializableString12 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata13 = beanPropertyWriter0.getMetadata();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = beanPropertyWriter0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(propertySerializerMap10);
        org.junit.Assert.assertNull(typeSerializer11);
        org.junit.Assert.assertNull(serializableString12);
        org.junit.Assert.assertNull(propertyMetadata13);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer3;
        java.lang.Object obj6 = beanPropertyWriter0.getInternalSetting((java.lang.Object) (short) 0);
        java.lang.reflect.Type type7 = beanPropertyWriter0.getGenericPropertyType();
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector10 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value11 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector10);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNull(value11);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap2 = beanPropertyWriter0._internalSettings;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) '4');
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0._nonTrivialBaseType;
        boolean boolean6 = beanPropertyWriter0.isUnwrapping();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = beanPropertyWriter0.removeInternalSetting(obj7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean12 = beanPropertyWriter11.isVirtual();
        java.lang.reflect.Field field13 = beanPropertyWriter11._field;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = beanPropertyWriter11.unwrappingWriter(nameTransformer14);
        com.fasterxml.jackson.core.SerializableString serializableString16 = beanPropertyWriter11.getSerializedName();
        boolean boolean17 = beanPropertyWriter11.willSuppressNulls();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter18 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass19 = beanPropertyWriter18.getRawSerializationType();
        java.lang.reflect.Field field20 = null;
        beanPropertyWriter18._field = field20;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap22 = null;
        beanPropertyWriter18._internalSettings = objMap22;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer24 = null;
        beanPropertyWriter18._nullSerializer = objJsonSerializer24;
        com.fasterxml.jackson.core.io.SerializedString serializedString26 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter18, serializedString26);
        com.fasterxml.jackson.databind.util.Annotations annotations28 = beanPropertyWriter27._contextAnnotations;
        java.lang.Object obj29 = beanPropertyWriter27.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap30 = beanPropertyWriter27._dynamicSerializers;
        beanPropertyWriter11._dynamicSerializers = propertySerializerMap30;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap30;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objMap2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(annotatedMember9);
        org.junit.Assert.assertNull(annotatedMember10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNotNull(beanPropertyWriter15);
        org.junit.Assert.assertNull(serializableString16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNull(annotations28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(propertySerializerMap30);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass4 = beanPropertyWriter3.getRawSerializationType();
        java.lang.reflect.Field field5 = null;
        beanPropertyWriter3._field = field5;
        java.lang.reflect.Field field7 = beanPropertyWriter3._field;
        java.lang.Object obj8 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter3);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter3);
        com.fasterxml.jackson.databind.util.Annotations annotations10 = beanPropertyWriter3._contextAnnotations;
        boolean boolean11 = beanPropertyWriter3._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = beanPropertyWriter3._serializer;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(field7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(annotations10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objJsonSerializer12);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        boolean boolean3 = beanPropertyWriter0.isVirtual();
        boolean boolean4 = beanPropertyWriter0.isUnwrapping();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = beanPropertyWriter5.getTypeSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = beanPropertyWriter5._serializer;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata8 = beanPropertyWriter5._metadata;
        boolean boolean9 = beanPropertyWriter5._suppressNulls;
        java.lang.Object obj10 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter5);
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter0.getType();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typeSerializer6);
        org.junit.Assert.assertNull(objJsonSerializer7);
        org.junit.Assert.assertNull(propertyMetadata8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector13 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value14 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector13);
        com.fasterxml.jackson.databind.JavaType javaType15 = beanPropertyWriter0.getType();
        java.lang.Class<?>[] wildcardClassArray16 = beanPropertyWriter0._includeInViews;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType18 = beanPropertyWriter17._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray19 = beanPropertyWriter17._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = null;
        beanPropertyWriter17._serializer = objJsonSerializer20;
        java.lang.Object obj23 = beanPropertyWriter17.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata24 = beanPropertyWriter17._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter25 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType26 = beanPropertyWriter25._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray27 = beanPropertyWriter25._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap28 = null;
        beanPropertyWriter25._internalSettings = objMap28;
        java.lang.Object obj30 = beanPropertyWriter17.removeInternalSetting((java.lang.Object) beanPropertyWriter25);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter31 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter25);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = beanPropertyWriter31._serializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType34 = beanPropertyWriter33._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType35 = beanPropertyWriter33._nonTrivialBaseType;
        java.lang.Object obj37 = beanPropertyWriter33.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName38 = beanPropertyWriter33._wrapperName;
        com.fasterxml.jackson.annotation.JsonFormat.Value value39 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.NO_FORMAT;
        beanPropertyWriter33._format = value39;
        beanPropertyWriter31._format = value39;
        beanPropertyWriter0._format = value39;
        java.lang.reflect.Method method43 = beanPropertyWriter0._accessorMethod;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(value14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(wildcardClassArray16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(wildcardClassArray19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(propertyMetadata24);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNull(wildcardClassArray27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(objJsonSerializer32);
        org.junit.Assert.assertNull(javaType34);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(propertyName38);
        org.junit.Assert.assertNotNull(value39);
        org.junit.Assert.assertNull(method43);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter1 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor2 = null;
        beanPropertyWriter1.depositSchemaProperty(jsonObjectFormatVisitor2);
        boolean boolean4 = beanPropertyWriter1.hasSerializer();
        java.lang.reflect.Field field5 = beanPropertyWriter1._field;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter6._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter6._nonTrivialBaseType;
        java.lang.Object obj10 = beanPropertyWriter6.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName11 = beanPropertyWriter6._wrapperName;
        com.fasterxml.jackson.annotation.JsonFormat.Value value12 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.NO_FORMAT;
        beanPropertyWriter6._format = value12;
        beanPropertyWriter1._format = value12;
        beanPropertyWriter0._format = value12;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap16 = beanPropertyWriter0._dynamicSerializers;
        java.lang.reflect.Field field17 = null;
        beanPropertyWriter0._field = field17;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(propertyName11);
        org.junit.Assert.assertNotNull(value12);
        org.junit.Assert.assertNull(propertySerializerMap16);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer3;
        java.lang.Object obj6 = beanPropertyWriter0.getInternalSetting((java.lang.Object) (short) 0);
        java.lang.reflect.Type type7 = beanPropertyWriter0.getGenericPropertyType();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer8);
        boolean boolean10 = beanPropertyWriter0.willSuppressNulls();
        boolean boolean11 = beanPropertyWriter0.hasSerializer();
        java.lang.reflect.Method method12 = null;
        beanPropertyWriter0._accessorMethod = method12;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = beanPropertyWriter0._typeSerializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = beanPropertyWriter0.getPropertyType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(typeSerializer14);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        java.lang.reflect.Field field2 = null;
        beanPropertyWriter0._field = field2;
        boolean boolean4 = beanPropertyWriter0.isUnwrapping();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter5._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray7 = beanPropertyWriter5._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter5._serializer = objJsonSerializer8;
        java.lang.Object obj11 = beanPropertyWriter5.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata12 = beanPropertyWriter5._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter13._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray15 = beanPropertyWriter13._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap16 = null;
        beanPropertyWriter13._internalSettings = objMap16;
        java.lang.Object obj18 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) beanPropertyWriter13);
        java.lang.Object obj19 = beanPropertyWriter0.removeInternalSetting(obj18);
        java.lang.reflect.Field field20 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter21._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType23 = beanPropertyWriter21._nonTrivialBaseType;
        java.lang.Object obj25 = beanPropertyWriter21.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName26 = beanPropertyWriter21._wrapperName;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType28 = beanPropertyWriter27._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType29 = beanPropertyWriter27._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember30 = beanPropertyWriter27._member;
        boolean boolean31 = beanPropertyWriter27.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter27);
        boolean boolean33 = beanPropertyWriter32.willSuppressNulls();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType35 = beanPropertyWriter34._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray36 = beanPropertyWriter34._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap37 = null;
        beanPropertyWriter34._internalSettings = objMap37;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap39 = beanPropertyWriter34._dynamicSerializers;
        boolean boolean40 = beanPropertyWriter34.hasNullSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter41 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType42 = beanPropertyWriter41._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray43 = beanPropertyWriter41._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer44 = null;
        beanPropertyWriter41._serializer = objJsonSerializer44;
        java.lang.Object obj47 = beanPropertyWriter41.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata48 = beanPropertyWriter41._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter49 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType50 = beanPropertyWriter49._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray51 = beanPropertyWriter49._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap52 = null;
        beanPropertyWriter49._internalSettings = objMap52;
        java.lang.Object obj54 = beanPropertyWriter41.removeInternalSetting((java.lang.Object) beanPropertyWriter49);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter55 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter49);
        java.lang.Object obj56 = beanPropertyWriter34.removeInternalSetting((java.lang.Object) beanPropertyWriter55);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter57 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType58 = beanPropertyWriter57._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember59 = beanPropertyWriter57.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter61 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType62 = beanPropertyWriter61._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType63 = beanPropertyWriter61._nonTrivialBaseType;
        java.lang.Object obj65 = beanPropertyWriter61.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean66 = beanPropertyWriter61._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer67 = beanPropertyWriter61._serializer;
        java.lang.Object obj68 = beanPropertyWriter57.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter61);
        com.fasterxml.jackson.databind.JavaType javaType69 = beanPropertyWriter61._cfgSerializationType;
        java.lang.Object obj70 = beanPropertyWriter61._suppressableValue;
        java.lang.Object obj71 = beanPropertyWriter34.getInternalSetting((java.lang.Object) beanPropertyWriter61);
        com.fasterxml.jackson.databind.JavaType javaType72 = beanPropertyWriter34.getType();
        java.lang.Object obj73 = beanPropertyWriter21.setInternalSetting((java.lang.Object) boolean33, (java.lang.Object) beanPropertyWriter34);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember74 = beanPropertyWriter21.getMember();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator75 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider76 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.serializeAsField((java.lang.Object) annotatedMember74, jsonGenerator75, serializerProvider76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(wildcardClassArray7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(propertyMetadata12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(wildcardClassArray15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(field20);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(propertyName26);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNull(annotatedMember30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertNull(wildcardClassArray36);
        org.junit.Assert.assertNull(propertySerializerMap39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(javaType42);
        org.junit.Assert.assertNull(wildcardClassArray43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(propertyMetadata48);
        org.junit.Assert.assertNull(javaType50);
        org.junit.Assert.assertNull(wildcardClassArray51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(javaType58);
        org.junit.Assert.assertNull(annotatedMember59);
        org.junit.Assert.assertNull(javaType62);
        org.junit.Assert.assertNull(javaType63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(objJsonSerializer67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(javaType69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(javaType72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(annotatedMember74);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        boolean boolean12 = beanPropertyWriter4.isVirtual();
        boolean boolean13 = beanPropertyWriter4._suppressNulls;
        boolean boolean14 = beanPropertyWriter4.isVirtual();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector15 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value16 = beanPropertyWriter4.findFormatOverrides(annotationIntrospector15);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector17 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value18 = beanPropertyWriter4.findFormatOverrides(annotationIntrospector17);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType20 = beanPropertyWriter19._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter19._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember22 = beanPropertyWriter19._member;
        java.lang.reflect.Field field23 = null;
        beanPropertyWriter19._field = field23;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer25 = beanPropertyWriter19.getSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter26 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass27 = beanPropertyWriter26.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember28 = beanPropertyWriter26.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer29 = beanPropertyWriter26._typeSerializer;
        boolean boolean30 = beanPropertyWriter26.willSuppressNulls();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer31 = null;
        beanPropertyWriter26._typeSerializer = typeSerializer31;
        com.fasterxml.jackson.databind.JavaType javaType33 = beanPropertyWriter26._declaredType;
        java.lang.reflect.Field field34 = beanPropertyWriter26._field;
        java.lang.Object obj35 = beanPropertyWriter4.setInternalSetting((java.lang.Object) objJsonSerializer25, (java.lang.Object) beanPropertyWriter26);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap36 = beanPropertyWriter4._internalSettings;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer37 = beanPropertyWriter4._nullSerializer;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(value16);
        org.junit.Assert.assertNull(value18);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(annotatedMember22);
        org.junit.Assert.assertNull(objJsonSerializer25);
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertNull(annotatedMember28);
        org.junit.Assert.assertNull(typeSerializer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNull(field34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objMap36);
        org.junit.Assert.assertNull(objJsonSerializer37);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer12 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer12);
        java.lang.reflect.Field field14 = null;
        beanPropertyWriter0._field = field14;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap16 = null;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap16;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = beanPropertyWriter0.getWrapperName();
        com.fasterxml.jackson.core.SerializableString serializableString19 = beanPropertyWriter0.getSerializedName();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNull(serializableString19);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer4;
        java.lang.Object obj6 = beanPropertyWriter0._suppressableValue;
        java.lang.Object obj7 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter0._nonTrivialBaseType;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.core.SerializableString serializableString6 = beanPropertyWriter0.getSerializedName();
        java.lang.Object obj9 = beanPropertyWriter0.setInternalSetting((java.lang.Object) "", (java.lang.Object) 1.0f);
        boolean boolean10 = beanPropertyWriter0.hasNullSerializer();
        java.lang.reflect.Method method11 = null;
        beanPropertyWriter0._accessorMethod = method11;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass14 = beanPropertyWriter13.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = beanPropertyWriter13.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer16 = beanPropertyWriter13._typeSerializer;
        java.lang.Object obj18 = beanPropertyWriter13.removeInternalSetting((java.lang.Object) 0.0f);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = beanPropertyWriter13.getTypeSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer20 = beanPropertyWriter13.getTypeSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType23 = beanPropertyWriter22._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor24 = null;
        beanPropertyWriter22.depositSchemaProperty(jsonObjectFormatVisitor24);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer26 = null;
        beanPropertyWriter22.assignTypeSerializer(typeSerializer26);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = beanPropertyWriter22.unwrappingWriter(nameTransformer28);
        boolean boolean30 = beanPropertyWriter29.isVirtual();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer31 = null;
        beanPropertyWriter29._nullSerializer = objJsonSerializer31;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata33 = beanPropertyWriter29.getMetadata();
        java.lang.Object obj34 = beanPropertyWriter13.setInternalSetting((java.lang.Object) (short) 0, (java.lang.Object) propertyMetadata33);
        com.fasterxml.jackson.databind.JavaType javaType35 = beanPropertyWriter13._cfgSerializationType;
        java.lang.Object obj36 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) javaType35);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap37 = null;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap37;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap39 = beanPropertyWriter0._dynamicSerializers;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap40 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata41 = beanPropertyWriter0.getMetadata();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(serializableString6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(annotatedMember15);
        org.junit.Assert.assertNull(typeSerializer16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(typeSerializer19);
        org.junit.Assert.assertNull(typeSerializer20);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNotNull(beanPropertyWriter29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(propertyMetadata33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(propertySerializerMap39);
        org.junit.Assert.assertNotNull(objMap40);
        org.junit.Assert.assertNull(propertyMetadata41);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        boolean boolean3 = beanPropertyWriter0.hasSerializer();
        java.lang.Class<?>[] wildcardClassArray4 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value6 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector5);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardClassArray4);
        org.junit.Assert.assertNull(value6);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer12 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer12);
        java.lang.reflect.Field field14 = null;
        beanPropertyWriter0._field = field14;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap16 = null;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap16;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = beanPropertyWriter0.getWrapperName();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer19 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer19);
        com.fasterxml.jackson.databind.PropertyName propertyName21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, propertyName21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(propertyName18);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer3;
        java.lang.Object obj6 = beanPropertyWriter0.getInternalSetting((java.lang.Object) (short) 0);
        java.lang.reflect.Type type7 = beanPropertyWriter0.getGenericPropertyType();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer8);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata11 = beanPropertyWriter10._metadata;
        com.fasterxml.jackson.core.io.SerializedString serializedString12 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter10, serializedString12);
        java.lang.Class<?> wildcardClass14 = beanPropertyWriter13.getRawSerializationType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = beanPropertyWriter13._serializer;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNull(propertyMetadata11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonSerializer15);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._serializer = objJsonSerializer3;
        java.lang.Object obj6 = beanPropertyWriter0.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata7 = beanPropertyWriter0._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter8._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray10 = beanPropertyWriter8._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap11 = null;
        beanPropertyWriter8._internalSettings = objMap11;
        java.lang.Object obj13 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter8);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap14 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.core.io.SerializedString serializedString15 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString15);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(propertyMetadata7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(wildcardClassArray10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(objMap14);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.lang.Class<?>[] wildcardClassArray3 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = beanPropertyWriter0.getSerializer();
        com.fasterxml.jackson.core.SerializableString serializableString5 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0.getType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = null;
        beanPropertyWriter0._serializer = objJsonSerializer7;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType10 = beanPropertyWriter9._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter9._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = beanPropertyWriter9._member;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata13 = beanPropertyWriter9._metadata;
        boolean boolean14 = beanPropertyWriter9.hasNullSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator15 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.serializeAsOmittedField((java.lang.Object) boolean14, jsonGenerator15, serializerProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassArray3);
        org.junit.Assert.assertNull(objJsonSerializer4);
        org.junit.Assert.assertNull(serializableString5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(annotatedMember12);
        org.junit.Assert.assertNull(propertyMetadata13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap2 = beanPropertyWriter0._internalSettings;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) '4');
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType5;
        boolean boolean7 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType8;
        boolean boolean10 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = beanPropertyWriter0.unwrappingWriter(nameTransformer11);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter13._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray15 = beanPropertyWriter13._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap16 = null;
        beanPropertyWriter13._internalSettings = objMap16;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap18 = beanPropertyWriter13._dynamicSerializers;
        boolean boolean19 = beanPropertyWriter13.hasNullSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter20._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray22 = beanPropertyWriter20._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = null;
        beanPropertyWriter20._serializer = objJsonSerializer23;
        java.lang.Object obj26 = beanPropertyWriter20.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata27 = beanPropertyWriter20._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType29 = beanPropertyWriter28._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray30 = beanPropertyWriter28._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap31 = null;
        beanPropertyWriter28._internalSettings = objMap31;
        java.lang.Object obj33 = beanPropertyWriter20.removeInternalSetting((java.lang.Object) beanPropertyWriter28);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter28);
        java.lang.Object obj35 = beanPropertyWriter13.removeInternalSetting((java.lang.Object) beanPropertyWriter34);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType37 = beanPropertyWriter36._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember38 = beanPropertyWriter36.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter40 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType41 = beanPropertyWriter40._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType42 = beanPropertyWriter40._nonTrivialBaseType;
        java.lang.Object obj44 = beanPropertyWriter40.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean45 = beanPropertyWriter40._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer46 = beanPropertyWriter40._serializer;
        java.lang.Object obj47 = beanPropertyWriter36.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter40);
        com.fasterxml.jackson.databind.JavaType javaType48 = beanPropertyWriter40._cfgSerializationType;
        java.lang.Object obj49 = beanPropertyWriter40._suppressableValue;
        java.lang.Object obj50 = beanPropertyWriter13.getInternalSetting((java.lang.Object) beanPropertyWriter40);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap51 = beanPropertyWriter13._dynamicSerializers;
        java.lang.Object obj52 = beanPropertyWriter12.removeInternalSetting((java.lang.Object) beanPropertyWriter13);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer53 = beanPropertyWriter13.getTypeSerializer();
        com.fasterxml.jackson.databind.PropertyName propertyName54 = beanPropertyWriter13.getWrapperName();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer55 = beanPropertyWriter13.getSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objMap2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(beanPropertyWriter12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(wildcardClassArray15);
        org.junit.Assert.assertNull(propertySerializerMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(wildcardClassArray22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(propertyMetadata27);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNull(wildcardClassArray30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(javaType37);
        org.junit.Assert.assertNull(annotatedMember38);
        org.junit.Assert.assertNull(javaType41);
        org.junit.Assert.assertNull(javaType42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(objJsonSerializer46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(javaType48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(propertySerializerMap51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(typeSerializer53);
        org.junit.Assert.assertNull(propertyName54);
        org.junit.Assert.assertNull(objJsonSerializer55);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor2 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor2);
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        boolean boolean5 = beanPropertyWriter0.hasSerializer();
        boolean boolean6 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter0._declaredType;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        java.lang.reflect.Field field4 = null;
        beanPropertyWriter0._field = field4;
        java.lang.Object obj6 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.core.io.SerializedString serializedString7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString7);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = beanPropertyWriter8.getSerializer();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = beanPropertyWriter8.getMember();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotatedMember3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(objJsonSerializer9);
        org.junit.Assert.assertNull(annotatedMember10);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0._typeSerializer;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = beanPropertyWriter0.getWrapperName();
        java.lang.Object obj9 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean11 = beanPropertyWriter10.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName12 = beanPropertyWriter10._wrapperName;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        beanPropertyWriter10.setNonTrivialBaseType(javaType13);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap15 = beanPropertyWriter10._internalSettings;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor17 = null;
        beanPropertyWriter16.depositSchemaProperty(jsonObjectFormatVisitor17);
        boolean boolean19 = beanPropertyWriter16.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter16);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter21._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType23 = beanPropertyWriter21._nonTrivialBaseType;
        java.lang.Object obj25 = beanPropertyWriter21.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName26 = beanPropertyWriter21._wrapperName;
        boolean boolean27 = beanPropertyWriter21._suppressNulls;
        com.fasterxml.jackson.core.SerializableString serializableString28 = beanPropertyWriter21.getSerializedName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer29 = null;
        beanPropertyWriter21.assignTypeSerializer(typeSerializer29);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter31 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType32 = beanPropertyWriter31._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor33 = null;
        beanPropertyWriter31.depositSchemaProperty(jsonObjectFormatVisitor33);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean36 = beanPropertyWriter35.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName37 = beanPropertyWriter35._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer38 = beanPropertyWriter35._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer39 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter40 = beanPropertyWriter35.unwrappingWriter(nameTransformer39);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer41 = beanPropertyWriter40.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType42 = null;
        beanPropertyWriter40.setNonTrivialBaseType(javaType42);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter44 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType45 = beanPropertyWriter44._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember46 = beanPropertyWriter44.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter48 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType49 = beanPropertyWriter48._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType50 = beanPropertyWriter48._nonTrivialBaseType;
        java.lang.Object obj52 = beanPropertyWriter48.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean53 = beanPropertyWriter48._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer54 = beanPropertyWriter48._serializer;
        java.lang.Object obj55 = beanPropertyWriter44.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter48);
        com.fasterxml.jackson.databind.JavaType javaType56 = beanPropertyWriter44._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap57 = beanPropertyWriter44._internalSettings;
        beanPropertyWriter40._internalSettings = objMap57;
        beanPropertyWriter31._internalSettings = objMap57;
        beanPropertyWriter21._internalSettings = objMap57;
        beanPropertyWriter20._internalSettings = objMap57;
        beanPropertyWriter10._internalSettings = objMap57;
        beanPropertyWriter0._internalSettings = objMap57;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(typeSerializer5);
        org.junit.Assert.assertNull(annotatedMember6);
        org.junit.Assert.assertNull(annotatedMember7);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNull(objMap15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(propertyName26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(serializableString28);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(propertyName37);
        org.junit.Assert.assertNull(objJsonSerializer38);
        org.junit.Assert.assertNotNull(beanPropertyWriter40);
        org.junit.Assert.assertNull(typeSerializer41);
        org.junit.Assert.assertNull(javaType45);
        org.junit.Assert.assertNull(annotatedMember46);
        org.junit.Assert.assertNull(javaType49);
        org.junit.Assert.assertNull(javaType50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(objJsonSerializer54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(javaType56);
        org.junit.Assert.assertNotNull(objMap57);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        java.lang.Object obj5 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 0.0f);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = beanPropertyWriter0.getTypeSerializer();
        java.lang.reflect.Field field8 = null;
        beanPropertyWriter0._field = field8;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        beanPropertyWriter0.setNonTrivialBaseType(javaType13);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(typeSerializer3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(typeSerializer6);
        org.junit.Assert.assertNull(typeSerializer7);
        org.junit.Assert.assertNull(propertySerializerMap10);
        org.junit.Assert.assertNull(objJsonSerializer11);
        org.junit.Assert.assertNull(objJsonSerializer12);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        java.lang.Object obj4 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = null;
        beanPropertyWriter0.assignSerializer(objJsonSerializer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter0.unwrappingWriter(nameTransformer7);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType10 = beanPropertyWriter9._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray11 = beanPropertyWriter9._includeInViews;
        java.lang.Class<?>[] wildcardClassArray12 = beanPropertyWriter9.getViews();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        beanPropertyWriter9._typeSerializer = typeSerializer13;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector15 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value16 = beanPropertyWriter9.findFormatOverrides(annotationIntrospector15);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata17 = beanPropertyWriter9.getMetadata();
        java.lang.Object obj18 = beanPropertyWriter0.getInternalSetting((java.lang.Object) propertyMetadata17);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor20 = null;
        beanPropertyWriter19.depositSchemaProperty(jsonObjectFormatVisitor20);
        boolean boolean22 = beanPropertyWriter19.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter19);
        java.lang.reflect.Field field24 = beanPropertyWriter19._field;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter25 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType26 = beanPropertyWriter25._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType27 = beanPropertyWriter25._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember28 = beanPropertyWriter25._member;
        java.lang.Class<?>[] wildcardClassArray29 = beanPropertyWriter25.getViews();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType31 = beanPropertyWriter30._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor32 = null;
        beanPropertyWriter30.depositSchemaProperty(jsonObjectFormatVisitor32);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer34 = beanPropertyWriter30._nullSerializer;
        com.fasterxml.jackson.databind.JavaType javaType35 = beanPropertyWriter30._nonTrivialBaseType;
        java.lang.Object obj36 = beanPropertyWriter19.setInternalSetting((java.lang.Object) beanPropertyWriter25, (java.lang.Object) beanPropertyWriter30);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType38 = beanPropertyWriter37._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType39 = beanPropertyWriter37._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember40 = beanPropertyWriter37._member;
        com.fasterxml.jackson.databind.PropertyName propertyName41 = beanPropertyWriter37._wrapperName;
        java.lang.Object obj42 = beanPropertyWriter25.getInternalSetting((java.lang.Object) beanPropertyWriter37);
        java.lang.Object obj43 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter37);
        com.fasterxml.jackson.databind.PropertyName propertyName44 = beanPropertyWriter37.getWrapperName();
        com.fasterxml.jackson.databind.PropertyName propertyName45 = beanPropertyWriter37.getWrapperName();
        java.lang.reflect.Method method46 = null;
        beanPropertyWriter37._accessorMethod = method46;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(typeSerializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(wildcardClassArray11);
        org.junit.Assert.assertNull(wildcardClassArray12);
        org.junit.Assert.assertNull(value16);
        org.junit.Assert.assertNull(propertyMetadata17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(field24);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNull(javaType27);
        org.junit.Assert.assertNull(annotatedMember28);
        org.junit.Assert.assertNull(wildcardClassArray29);
        org.junit.Assert.assertNull(javaType31);
        org.junit.Assert.assertNull(objJsonSerializer34);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(javaType38);
        org.junit.Assert.assertNull(javaType39);
        org.junit.Assert.assertNull(annotatedMember40);
        org.junit.Assert.assertNull(propertyName41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(propertyName44);
        org.junit.Assert.assertNull(propertyName45);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        java.lang.Object obj5 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 0.0f);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = beanPropertyWriter0.getTypeSerializer();
        boolean boolean8 = beanPropertyWriter0.isVirtual();
        java.lang.Object obj9 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = beanPropertyWriter0.getMember();
        boolean boolean11 = beanPropertyWriter0.isUnwrapping();
        java.lang.Class<?>[] wildcardClassArray12 = beanPropertyWriter0.getViews();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(typeSerializer3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(typeSerializer6);
        org.junit.Assert.assertNull(typeSerializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(annotatedMember10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardClassArray12);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        java.lang.Object obj4 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.core.io.SerializedString serializedString5 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString5);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass8 = beanPropertyWriter7.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = beanPropertyWriter7.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = beanPropertyWriter7._typeSerializer;
        java.lang.Object obj12 = beanPropertyWriter7.removeInternalSetting((java.lang.Object) 0.0f);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = beanPropertyWriter7.getTypeSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = beanPropertyWriter7.getTypeSerializer();
        com.fasterxml.jackson.databind.util.Annotations annotations15 = beanPropertyWriter7._contextAnnotations;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = beanPropertyWriter7.unwrappingWriter(nameTransformer16);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = beanPropertyWriter7.getSerializer();
        java.lang.Object obj19 = beanPropertyWriter6.removeInternalSetting((java.lang.Object) beanPropertyWriter7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter21 = beanPropertyWriter6.rename(nameTransformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(typeSerializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(annotatedMember9);
        org.junit.Assert.assertNull(typeSerializer10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(typeSerializer13);
        org.junit.Assert.assertNull(typeSerializer14);
        org.junit.Assert.assertNull(annotations15);
        org.junit.Assert.assertNotNull(beanPropertyWriter17);
        org.junit.Assert.assertNull(objJsonSerializer18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        java.lang.Object obj5 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 0.0f);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean7 = beanPropertyWriter6.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = beanPropertyWriter6._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = beanPropertyWriter6._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = beanPropertyWriter6.unwrappingWriter(nameTransformer10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap12 = beanPropertyWriter11._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = null;
        beanPropertyWriter11.assignNullSerializer(objJsonSerializer13);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean16 = beanPropertyWriter15.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName17 = beanPropertyWriter15._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = beanPropertyWriter15._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = beanPropertyWriter15.unwrappingWriter(nameTransformer19);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = beanPropertyWriter15.unwrappingWriter(nameTransformer21);
        java.lang.Object obj23 = beanPropertyWriter0.setInternalSetting((java.lang.Object) objJsonSerializer13, (java.lang.Object) beanPropertyWriter22);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap24 = beanPropertyWriter0._dynamicSerializers;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(typeSerializer3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(beanPropertyWriter11);
        org.junit.Assert.assertNull(propertySerializerMap12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(propertyName17);
        org.junit.Assert.assertNull(objJsonSerializer18);
        org.junit.Assert.assertNotNull(beanPropertyWriter20);
        org.junit.Assert.assertNotNull(beanPropertyWriter22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(propertySerializerMap24);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap2 = beanPropertyWriter0._internalSettings;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) '4');
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType5;
        boolean boolean7 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType8;
        boolean boolean10 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = beanPropertyWriter0.unwrappingWriter(nameTransformer11);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter13._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray15 = beanPropertyWriter13._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap16 = null;
        beanPropertyWriter13._internalSettings = objMap16;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap18 = beanPropertyWriter13._dynamicSerializers;
        boolean boolean19 = beanPropertyWriter13.hasNullSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter20._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray22 = beanPropertyWriter20._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = null;
        beanPropertyWriter20._serializer = objJsonSerializer23;
        java.lang.Object obj26 = beanPropertyWriter20.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata27 = beanPropertyWriter20._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType29 = beanPropertyWriter28._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray30 = beanPropertyWriter28._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap31 = null;
        beanPropertyWriter28._internalSettings = objMap31;
        java.lang.Object obj33 = beanPropertyWriter20.removeInternalSetting((java.lang.Object) beanPropertyWriter28);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter28);
        java.lang.Object obj35 = beanPropertyWriter13.removeInternalSetting((java.lang.Object) beanPropertyWriter34);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType37 = beanPropertyWriter36._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember38 = beanPropertyWriter36.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter40 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType41 = beanPropertyWriter40._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType42 = beanPropertyWriter40._nonTrivialBaseType;
        java.lang.Object obj44 = beanPropertyWriter40.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean45 = beanPropertyWriter40._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer46 = beanPropertyWriter40._serializer;
        java.lang.Object obj47 = beanPropertyWriter36.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter40);
        com.fasterxml.jackson.databind.JavaType javaType48 = beanPropertyWriter40._cfgSerializationType;
        java.lang.Object obj49 = beanPropertyWriter40._suppressableValue;
        java.lang.Object obj50 = beanPropertyWriter13.getInternalSetting((java.lang.Object) beanPropertyWriter40);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap51 = beanPropertyWriter13._dynamicSerializers;
        java.lang.Object obj52 = beanPropertyWriter12.removeInternalSetting((java.lang.Object) beanPropertyWriter13);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer53 = beanPropertyWriter13.getTypeSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter54 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType55 = beanPropertyWriter54._cfgSerializationType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer56 = null;
        beanPropertyWriter54._typeSerializer = typeSerializer56;
        com.fasterxml.jackson.annotation.JsonFormat.Value value58 = beanPropertyWriter54._format;
        java.lang.reflect.Method method59 = beanPropertyWriter54._accessorMethod;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer60 = null;
        beanPropertyWriter54.assignTypeSerializer(typeSerializer60);
        java.lang.Object obj62 = beanPropertyWriter13.getInternalSetting((java.lang.Object) beanPropertyWriter54);
        com.fasterxml.jackson.databind.JavaType javaType63 = null;
        beanPropertyWriter54._nonTrivialBaseType = javaType63;
        com.fasterxml.jackson.databind.JavaType javaType65 = null;
        beanPropertyWriter54.setNonTrivialBaseType(javaType65);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer67 = beanPropertyWriter54._nullSerializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter68 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean69 = beanPropertyWriter68.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName70 = beanPropertyWriter68._wrapperName;
        com.fasterxml.jackson.databind.JavaType javaType71 = null;
        beanPropertyWriter68.setNonTrivialBaseType(javaType71);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor73 = null;
        beanPropertyWriter68.depositSchemaProperty(jsonObjectFormatVisitor73);
        boolean boolean75 = beanPropertyWriter68.willSuppressNulls();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter76 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass77 = beanPropertyWriter76.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember78 = beanPropertyWriter76.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer79 = beanPropertyWriter76._typeSerializer;
        boolean boolean80 = beanPropertyWriter76.willSuppressNulls();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer81 = null;
        beanPropertyWriter76._typeSerializer = typeSerializer81;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap83 = null;
        beanPropertyWriter76._dynamicSerializers = propertySerializerMap83;
        java.lang.Object obj85 = beanPropertyWriter54.setInternalSetting((java.lang.Object) beanPropertyWriter68, (java.lang.Object) beanPropertyWriter76);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter86 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter76);
        com.fasterxml.jackson.databind.PropertyName propertyName87 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter88 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter86, propertyName87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objMap2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(beanPropertyWriter12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(wildcardClassArray15);
        org.junit.Assert.assertNull(propertySerializerMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(wildcardClassArray22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(propertyMetadata27);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNull(wildcardClassArray30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(javaType37);
        org.junit.Assert.assertNull(annotatedMember38);
        org.junit.Assert.assertNull(javaType41);
        org.junit.Assert.assertNull(javaType42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(objJsonSerializer46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(javaType48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(propertySerializerMap51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(typeSerializer53);
        org.junit.Assert.assertNull(javaType55);
        org.junit.Assert.assertNull(value58);
        org.junit.Assert.assertNull(method59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(objJsonSerializer67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(propertyName70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(wildcardClass77);
        org.junit.Assert.assertNull(annotatedMember78);
        org.junit.Assert.assertNull(typeSerializer79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap2 = beanPropertyWriter0._internalSettings;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) '4');
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType5;
        boolean boolean7 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType8;
        boolean boolean10 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = beanPropertyWriter0.unwrappingWriter(nameTransformer11);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter13._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray15 = beanPropertyWriter13._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap16 = null;
        beanPropertyWriter13._internalSettings = objMap16;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap18 = beanPropertyWriter13._dynamicSerializers;
        boolean boolean19 = beanPropertyWriter13.hasNullSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter20._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray22 = beanPropertyWriter20._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = null;
        beanPropertyWriter20._serializer = objJsonSerializer23;
        java.lang.Object obj26 = beanPropertyWriter20.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata27 = beanPropertyWriter20._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType29 = beanPropertyWriter28._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray30 = beanPropertyWriter28._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap31 = null;
        beanPropertyWriter28._internalSettings = objMap31;
        java.lang.Object obj33 = beanPropertyWriter20.removeInternalSetting((java.lang.Object) beanPropertyWriter28);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter28);
        java.lang.Object obj35 = beanPropertyWriter13.removeInternalSetting((java.lang.Object) beanPropertyWriter34);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType37 = beanPropertyWriter36._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember38 = beanPropertyWriter36.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter40 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType41 = beanPropertyWriter40._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType42 = beanPropertyWriter40._nonTrivialBaseType;
        java.lang.Object obj44 = beanPropertyWriter40.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean45 = beanPropertyWriter40._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer46 = beanPropertyWriter40._serializer;
        java.lang.Object obj47 = beanPropertyWriter36.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter40);
        com.fasterxml.jackson.databind.JavaType javaType48 = beanPropertyWriter40._cfgSerializationType;
        java.lang.Object obj49 = beanPropertyWriter40._suppressableValue;
        java.lang.Object obj50 = beanPropertyWriter13.getInternalSetting((java.lang.Object) beanPropertyWriter40);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap51 = beanPropertyWriter13._dynamicSerializers;
        java.lang.Object obj52 = beanPropertyWriter12.removeInternalSetting((java.lang.Object) beanPropertyWriter13);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer53 = beanPropertyWriter13.getTypeSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter54 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType55 = beanPropertyWriter54._cfgSerializationType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer56 = null;
        beanPropertyWriter54._typeSerializer = typeSerializer56;
        com.fasterxml.jackson.annotation.JsonFormat.Value value58 = beanPropertyWriter54._format;
        java.lang.reflect.Method method59 = beanPropertyWriter54._accessorMethod;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer60 = null;
        beanPropertyWriter54.assignTypeSerializer(typeSerializer60);
        java.lang.Object obj62 = beanPropertyWriter13.getInternalSetting((java.lang.Object) beanPropertyWriter54);
        com.fasterxml.jackson.databind.JavaType javaType63 = null;
        beanPropertyWriter54._nonTrivialBaseType = javaType63;
        com.fasterxml.jackson.databind.JavaType javaType65 = null;
        beanPropertyWriter54.setNonTrivialBaseType(javaType65);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer67 = beanPropertyWriter54._nullSerializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter68 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean69 = beanPropertyWriter68.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName70 = beanPropertyWriter68._wrapperName;
        com.fasterxml.jackson.databind.JavaType javaType71 = null;
        beanPropertyWriter68.setNonTrivialBaseType(javaType71);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor73 = null;
        beanPropertyWriter68.depositSchemaProperty(jsonObjectFormatVisitor73);
        boolean boolean75 = beanPropertyWriter68.willSuppressNulls();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter76 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass77 = beanPropertyWriter76.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember78 = beanPropertyWriter76.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer79 = beanPropertyWriter76._typeSerializer;
        boolean boolean80 = beanPropertyWriter76.willSuppressNulls();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer81 = null;
        beanPropertyWriter76._typeSerializer = typeSerializer81;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap83 = null;
        beanPropertyWriter76._dynamicSerializers = propertySerializerMap83;
        java.lang.Object obj85 = beanPropertyWriter54.setInternalSetting((java.lang.Object) beanPropertyWriter68, (java.lang.Object) beanPropertyWriter76);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter86 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter76);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer87 = beanPropertyWriter86.getSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objMap2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(beanPropertyWriter12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(wildcardClassArray15);
        org.junit.Assert.assertNull(propertySerializerMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(wildcardClassArray22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(propertyMetadata27);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNull(wildcardClassArray30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(javaType37);
        org.junit.Assert.assertNull(annotatedMember38);
        org.junit.Assert.assertNull(javaType41);
        org.junit.Assert.assertNull(javaType42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(objJsonSerializer46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(javaType48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(propertySerializerMap51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(typeSerializer53);
        org.junit.Assert.assertNull(javaType55);
        org.junit.Assert.assertNull(value58);
        org.junit.Assert.assertNull(method59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(objJsonSerializer67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(propertyName70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(wildcardClass77);
        org.junit.Assert.assertNull(annotatedMember78);
        org.junit.Assert.assertNull(typeSerializer79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNull(objJsonSerializer87);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        java.lang.Object obj4 = beanPropertyWriter0._suppressableValue;
        java.lang.reflect.Method method5 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = null;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap6;
        java.lang.Object obj8 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter0._declaredType;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(typeSerializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._serializer = objJsonSerializer3;
        java.lang.Object obj6 = beanPropertyWriter0.getInternalSetting((java.lang.Object) 1.0d);
        boolean boolean7 = beanPropertyWriter0.isVirtual();
        boolean boolean8 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = null;
        beanPropertyWriter0.assignSerializer(objJsonSerializer9);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata11 = beanPropertyWriter0._metadata;
        java.lang.Object obj12 = beanPropertyWriter0.readResolve();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(propertyMetadata11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector13 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value14 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector13);
        com.fasterxml.jackson.databind.JavaType javaType15 = beanPropertyWriter0.getType();
        java.lang.Object obj16 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember17 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.core.io.SerializedString serializedString19 = beanPropertyWriter0._name;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(value14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(annotatedMember17);
        org.junit.Assert.assertNull(objJsonSerializer18);
        org.junit.Assert.assertNull(serializedString19);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        java.lang.reflect.Field field2 = null;
        beanPropertyWriter0._field = field2;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap4 = null;
        beanPropertyWriter0._internalSettings = objMap4;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer6;
        com.fasterxml.jackson.core.io.SerializedString serializedString8 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString8);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = null;
        beanPropertyWriter0._serializer = objJsonSerializer10;
        boolean boolean12 = beanPropertyWriter0.isUnwrapping();
        java.lang.reflect.Type type13 = beanPropertyWriter0.getGenericPropertyType();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer14);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap16 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.PropertyName propertyName17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = beanPropertyWriter0.wouldConflictWithName(propertyName17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNull(objMap16);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._serializer = objJsonSerializer3;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = beanPropertyWriter0._nullSerializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = beanPropertyWriter6.getTypeSerializer();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(objJsonSerializer5);
        org.junit.Assert.assertNull(typeSerializer7);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer8;
        com.fasterxml.jackson.databind.JavaType javaType10 = beanPropertyWriter0._declaredType;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer5);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter7._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray9 = beanPropertyWriter7._includeInViews;
        java.lang.Class<?>[] wildcardClassArray10 = beanPropertyWriter7.getViews();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = null;
        beanPropertyWriter7._typeSerializer = typeSerializer11;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        beanPropertyWriter7._nonTrivialBaseType = javaType13;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType16 = beanPropertyWriter15._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray17 = beanPropertyWriter15._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap18 = null;
        beanPropertyWriter15._internalSettings = objMap18;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter15);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap21 = beanPropertyWriter15._dynamicSerializers;
        java.lang.Class<?>[] wildcardClassArray22 = beanPropertyWriter15.getViews();
        com.fasterxml.jackson.core.io.SerializedString serializedString23 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter15, serializedString23);
        com.fasterxml.jackson.annotation.JsonFormat.Value value25 = beanPropertyWriter24._format;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter26 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass27 = beanPropertyWriter26.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember28 = beanPropertyWriter26.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer29 = beanPropertyWriter26._typeSerializer;
        java.lang.Object obj30 = beanPropertyWriter26._suppressableValue;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata31 = beanPropertyWriter26.getMetadata();
        java.lang.Object obj32 = beanPropertyWriter24.removeInternalSetting((java.lang.Object) beanPropertyWriter26);
        java.lang.Object obj33 = beanPropertyWriter0.setInternalSetting((java.lang.Object) beanPropertyWriter7, (java.lang.Object) beanPropertyWriter26);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter35 = beanPropertyWriter0.rename(nameTransformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertNull(wildcardClassArray10);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNull(wildcardClassArray17);
        org.junit.Assert.assertNull(propertySerializerMap21);
        org.junit.Assert.assertNull(wildcardClassArray22);
        org.junit.Assert.assertNull(value25);
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertNull(annotatedMember28);
        org.junit.Assert.assertNull(typeSerializer29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(propertyMetadata31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer6);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap8 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter0._declaredType;
        boolean boolean10 = beanPropertyWriter0.hasNullSerializer();
        java.lang.Class<?>[] wildcardClassArray11 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = beanPropertyWriter0.getMember();
        java.lang.Object obj13 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType15 = beanPropertyWriter14._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType16 = beanPropertyWriter14._nonTrivialBaseType;
        java.lang.Object obj18 = beanPropertyWriter14.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = beanPropertyWriter14._typeSerializer;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember20 = beanPropertyWriter14._member;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata21 = beanPropertyWriter14.getMetadata();
        java.lang.Object obj22 = beanPropertyWriter0.setInternalSetting(obj13, (java.lang.Object) beanPropertyWriter14);
        java.lang.reflect.Method method23 = beanPropertyWriter0._accessorMethod;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(annotatedMember4);
        org.junit.Assert.assertNull(typeSerializer5);
        org.junit.Assert.assertNull(objMap8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardClassArray11);
        org.junit.Assert.assertNull(annotatedMember12);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(typeSerializer19);
        org.junit.Assert.assertNull(annotatedMember20);
        org.junit.Assert.assertNull(propertyMetadata21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata3 = beanPropertyWriter0.getMetadata();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = beanPropertyWriter0.getSerializer();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0.getType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = beanPropertyWriter0.getMember();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(propertyMetadata3);
        org.junit.Assert.assertNull(objJsonSerializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(annotatedMember6);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = beanPropertyWriter5._dynamicSerializers;
        com.fasterxml.jackson.databind.util.Annotations annotations7 = beanPropertyWriter5._contextAnnotations;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        beanPropertyWriter5._typeSerializer = typeSerializer8;
        boolean boolean10 = beanPropertyWriter5.willSuppressNulls();
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter5._cfgSerializationType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean13 = beanPropertyWriter12.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName14 = beanPropertyWriter12._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = beanPropertyWriter12._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = beanPropertyWriter12.unwrappingWriter(nameTransformer16);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer18 = beanPropertyWriter17.getTypeSerializer();
        com.fasterxml.jackson.core.io.SerializedString serializedString19 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter17, serializedString19);
        java.lang.Object obj22 = beanPropertyWriter20.getInternalSetting((java.lang.Object) 10.0f);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType24 = beanPropertyWriter23._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray25 = beanPropertyWriter23._includeInViews;
        java.lang.Class<?>[] wildcardClassArray26 = beanPropertyWriter23.getViews();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer27 = null;
        beanPropertyWriter23._typeSerializer = typeSerializer27;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector29 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value30 = beanPropertyWriter23.findFormatOverrides(annotationIntrospector29);
        com.fasterxml.jackson.annotation.JsonFormat.Value value31 = beanPropertyWriter23._format;
        beanPropertyWriter20._format = value31;
        com.fasterxml.jackson.databind.JavaType javaType33 = beanPropertyWriter20._cfgSerializationType;
        com.fasterxml.jackson.core.SerializableString serializableString34 = beanPropertyWriter20.getSerializedName();
        com.fasterxml.jackson.databind.JavaType javaType35 = beanPropertyWriter20.getType();
        com.fasterxml.jackson.databind.JavaType javaType36 = beanPropertyWriter20.getSerializationType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter5.serializeAsElement((java.lang.Object) beanPropertyWriter20, jsonGenerator37, serializerProvider38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(propertySerializerMap6);
        org.junit.Assert.assertNull(annotations7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(objJsonSerializer15);
        org.junit.Assert.assertNotNull(beanPropertyWriter17);
        org.junit.Assert.assertNull(typeSerializer18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(wildcardClassArray25);
        org.junit.Assert.assertNull(wildcardClassArray26);
        org.junit.Assert.assertNull(value30);
        org.junit.Assert.assertNotNull(value31);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNull(serializableString34);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertNull(javaType36);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor2 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor2);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata4 = beanPropertyWriter0.getMetadata();
        java.lang.Class<?>[] wildcardClassArray5 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(propertyMetadata4);
        org.junit.Assert.assertNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        boolean boolean3 = beanPropertyWriter0.isVirtual();
        java.lang.Class<?>[] wildcardClassArray4 = beanPropertyWriter0.getViews();
        boolean boolean5 = beanPropertyWriter0.isUnwrapping();
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0.getSerializationType();
        java.lang.Class<?>[] wildcardClassArray7 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        beanPropertyWriter0.setNonTrivialBaseType(javaType8);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter10._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray12 = beanPropertyWriter10._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap13 = null;
        beanPropertyWriter10._internalSettings = objMap13;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter10);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType17 = beanPropertyWriter16._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray18 = beanPropertyWriter16._includeInViews;
        boolean boolean19 = beanPropertyWriter16.isVirtual();
        java.lang.Class<?>[] wildcardClassArray20 = beanPropertyWriter16.getViews();
        boolean boolean21 = beanPropertyWriter16.isUnwrapping();
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter16._declaredType;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        beanPropertyWriter16._nonTrivialBaseType = javaType23;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter25 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType26 = beanPropertyWriter25._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray27 = beanPropertyWriter25._includeInViews;
        java.lang.Class<?>[] wildcardClassArray28 = beanPropertyWriter25.getViews();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer29 = null;
        beanPropertyWriter25._typeSerializer = typeSerializer29;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap31 = null;
        beanPropertyWriter25._dynamicSerializers = propertySerializerMap31;
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        beanPropertyWriter25._nonTrivialBaseType = javaType33;
        com.fasterxml.jackson.annotation.JsonFormat.Value value35 = beanPropertyWriter25._format;
        com.fasterxml.jackson.databind.util.Annotations annotations36 = beanPropertyWriter25._contextAnnotations;
        java.lang.Object obj37 = beanPropertyWriter15.setInternalSetting((java.lang.Object) javaType23, (java.lang.Object) beanPropertyWriter25);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector38 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value39 = beanPropertyWriter25.findFormatOverrides(annotationIntrospector38);
        java.lang.reflect.Method method40 = null;
        beanPropertyWriter25._accessorMethod = method40;
        com.fasterxml.jackson.annotation.JsonFormat.Value value42 = beanPropertyWriter25._format;
        beanPropertyWriter0._format = value42;
        boolean boolean44 = beanPropertyWriter0.isVirtual();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardClassArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(wildcardClassArray7);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(wildcardClassArray12);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(wildcardClassArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNull(wildcardClassArray27);
        org.junit.Assert.assertNull(wildcardClassArray28);
        org.junit.Assert.assertNull(value35);
        org.junit.Assert.assertNull(annotations36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(value39);
        org.junit.Assert.assertNotNull(value42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer1 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer1);
        java.lang.Object obj3 = beanPropertyWriter0._suppressableValue;
        java.lang.Class<?> wildcardClass4 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString5 = beanPropertyWriter0._name;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer6);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter8._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor10 = null;
        beanPropertyWriter8.depositSchemaProperty(jsonObjectFormatVisitor10);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean13 = beanPropertyWriter12.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName14 = beanPropertyWriter12._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = beanPropertyWriter12._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = beanPropertyWriter12.unwrappingWriter(nameTransformer16);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer18 = beanPropertyWriter17.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        beanPropertyWriter17.setNonTrivialBaseType(javaType19);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter21._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember23 = beanPropertyWriter21.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter25 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType26 = beanPropertyWriter25._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType27 = beanPropertyWriter25._nonTrivialBaseType;
        java.lang.Object obj29 = beanPropertyWriter25.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean30 = beanPropertyWriter25._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer31 = beanPropertyWriter25._serializer;
        java.lang.Object obj32 = beanPropertyWriter21.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter25);
        com.fasterxml.jackson.databind.JavaType javaType33 = beanPropertyWriter21._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap34 = beanPropertyWriter21._internalSettings;
        beanPropertyWriter17._internalSettings = objMap34;
        beanPropertyWriter8._internalSettings = objMap34;
        java.lang.reflect.Field field37 = null;
        beanPropertyWriter8._field = field37;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType40 = beanPropertyWriter39._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember41 = beanPropertyWriter39.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter43 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType44 = beanPropertyWriter43._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType45 = beanPropertyWriter43._nonTrivialBaseType;
        java.lang.Object obj47 = beanPropertyWriter43.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean48 = beanPropertyWriter43._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer49 = beanPropertyWriter43._serializer;
        java.lang.Object obj50 = beanPropertyWriter39.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter43);
        com.fasterxml.jackson.databind.JavaType javaType51 = beanPropertyWriter39._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap52 = beanPropertyWriter39._internalSettings;
        java.lang.reflect.Method method53 = beanPropertyWriter39._accessorMethod;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata54 = beanPropertyWriter39.getMetadata();
        java.lang.Object obj55 = beanPropertyWriter0.setInternalSetting((java.lang.Object) field37, (java.lang.Object) propertyMetadata54);
        boolean boolean56 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.databind.JavaType javaType57 = null;
        beanPropertyWriter0.setNonTrivialBaseType(javaType57);
        com.fasterxml.jackson.databind.JavaType javaType59 = beanPropertyWriter0._declaredType;
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(serializedString5);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNull(objJsonSerializer15);
        org.junit.Assert.assertNotNull(beanPropertyWriter17);
        org.junit.Assert.assertNull(typeSerializer18);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(annotatedMember23);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNull(javaType27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(objJsonSerializer31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNotNull(objMap34);
        org.junit.Assert.assertNull(javaType40);
        org.junit.Assert.assertNull(annotatedMember41);
        org.junit.Assert.assertNull(javaType44);
        org.junit.Assert.assertNull(javaType45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(objJsonSerializer49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(javaType51);
        org.junit.Assert.assertNotNull(objMap52);
        org.junit.Assert.assertNull(method53);
        org.junit.Assert.assertNull(propertyMetadata54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(javaType59);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap2 = beanPropertyWriter0._internalSettings;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) '4');
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = beanPropertyWriter0._dynamicSerializers;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap6 = beanPropertyWriter0._internalSettings;
        boolean boolean7 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value9 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector8);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer10;
        boolean boolean12 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.util.Annotations annotations13 = beanPropertyWriter0._contextAnnotations;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objMap2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(propertySerializerMap5);
        org.junit.Assert.assertNull(objMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(value9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotations13);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor1 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor1);
        boolean boolean3 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        boolean boolean5 = beanPropertyWriter0.hasSerializer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer2;
        java.lang.Class<?> wildcardClass4 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType5;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        boolean boolean12 = beanPropertyWriter4.isVirtual();
        boolean boolean13 = beanPropertyWriter4.hasSerializer();
        java.lang.reflect.Method method14 = beanPropertyWriter4._accessorMethod;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = beanPropertyWriter4.unwrappingWriter(nameTransformer15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = beanPropertyWriter16.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(beanPropertyWriter16);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor1 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor1);
        boolean boolean3 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        java.lang.reflect.Field field5 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = beanPropertyWriter0.getWrapperName();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter7._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor9 = null;
        beanPropertyWriter7.depositSchemaProperty(jsonObjectFormatVisitor9);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean12 = beanPropertyWriter11.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName13 = beanPropertyWriter11._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = beanPropertyWriter11._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = beanPropertyWriter11.unwrappingWriter(nameTransformer15);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer17 = beanPropertyWriter16.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        beanPropertyWriter16.setNonTrivialBaseType(javaType18);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter20._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember22 = beanPropertyWriter20.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType25 = beanPropertyWriter24._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType26 = beanPropertyWriter24._nonTrivialBaseType;
        java.lang.Object obj28 = beanPropertyWriter24.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean29 = beanPropertyWriter24._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = beanPropertyWriter24._serializer;
        java.lang.Object obj31 = beanPropertyWriter20.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter24);
        com.fasterxml.jackson.databind.JavaType javaType32 = beanPropertyWriter20._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap33 = beanPropertyWriter20._internalSettings;
        beanPropertyWriter16._internalSettings = objMap33;
        beanPropertyWriter7._internalSettings = objMap33;
        beanPropertyWriter0._internalSettings = objMap33;
        boolean boolean37 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.util.Annotations annotations38 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(propertyName13);
        org.junit.Assert.assertNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(beanPropertyWriter16);
        org.junit.Assert.assertNull(typeSerializer17);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(annotatedMember22);
        org.junit.Assert.assertNull(javaType25);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(objJsonSerializer30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNotNull(objMap33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(annotations38);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean5 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = beanPropertyWriter0._serializer;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap7 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.core.io.SerializedString serializedString8 = beanPropertyWriter0._name;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objJsonSerializer6);
        org.junit.Assert.assertNull(objMap7);
        org.junit.Assert.assertNull(serializedString8);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._serializer = objJsonSerializer3;
        java.lang.Object obj6 = beanPropertyWriter0.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = beanPropertyWriter0.getTypeSerializer();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap9 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer10;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata12 = beanPropertyWriter0._metadata;
        boolean boolean13 = beanPropertyWriter0.hasNullSerializer();
        boolean boolean14 = beanPropertyWriter0.hasSerializer();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(propertySerializerMap7);
        org.junit.Assert.assertNull(typeSerializer8);
        org.junit.Assert.assertNull(objMap9);
        org.junit.Assert.assertNull(propertyMetadata12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor1 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor1);
        boolean boolean3 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.core.SerializableString serializableString5 = beanPropertyWriter0.getSerializedName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedMember4);
        org.junit.Assert.assertNull(serializableString5);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor2 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor2);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        java.lang.reflect.Field field8 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType10 = beanPropertyWriter0._declaredType;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType11;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertNull(field8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap2 = beanPropertyWriter0._internalSettings;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) '4');
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = beanPropertyWriter0._dynamicSerializers;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap6 = beanPropertyWriter0._internalSettings;
        boolean boolean7 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value9 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector8);
        com.fasterxml.jackson.annotation.JsonFormat.Value value10 = beanPropertyWriter0._format;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType11;
        java.lang.Object obj13 = beanPropertyWriter0._suppressableValue;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objMap2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(propertySerializerMap5);
        org.junit.Assert.assertNull(objMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(value9);
        org.junit.Assert.assertNotNull(value10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value7 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector6);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass9 = beanPropertyWriter8.getRawSerializationType();
        java.lang.reflect.Field field10 = null;
        beanPropertyWriter8._field = field10;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap12 = null;
        beanPropertyWriter8._internalSettings = objMap12;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata14 = beanPropertyWriter8.getMetadata();
        java.lang.Object obj15 = beanPropertyWriter8._suppressableValue;
        java.lang.Object obj16 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter8);
        java.lang.Class<?> wildcardClass17 = beanPropertyWriter0.getRawSerializationType();
        java.lang.reflect.Field field18 = null;
        beanPropertyWriter0._field = field18;
        java.lang.reflect.Field field20 = null;
        beanPropertyWriter0._field = field20;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = null;
        beanPropertyWriter0._serializer = objJsonSerializer22;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNull(value7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(propertyMetadata14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(wildcardClass17);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.core.io.SerializedString serializedString3 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString3);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor6 = null;
        beanPropertyWriter5.depositSchemaProperty(jsonObjectFormatVisitor6);
        boolean boolean8 = beanPropertyWriter5.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter10._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter10._nonTrivialBaseType;
        java.lang.Object obj14 = beanPropertyWriter10.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName15 = beanPropertyWriter10._wrapperName;
        boolean boolean16 = beanPropertyWriter10._suppressNulls;
        com.fasterxml.jackson.core.SerializableString serializableString17 = beanPropertyWriter10.getSerializedName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer18 = null;
        beanPropertyWriter10.assignTypeSerializer(typeSerializer18);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter20._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor22 = null;
        beanPropertyWriter20.depositSchemaProperty(jsonObjectFormatVisitor22);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean25 = beanPropertyWriter24.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName26 = beanPropertyWriter24._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer27 = beanPropertyWriter24._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = beanPropertyWriter24.unwrappingWriter(nameTransformer28);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer30 = beanPropertyWriter29.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        beanPropertyWriter29.setNonTrivialBaseType(javaType31);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType34 = beanPropertyWriter33._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember35 = beanPropertyWriter33.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType38 = beanPropertyWriter37._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType39 = beanPropertyWriter37._nonTrivialBaseType;
        java.lang.Object obj41 = beanPropertyWriter37.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean42 = beanPropertyWriter37._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer43 = beanPropertyWriter37._serializer;
        java.lang.Object obj44 = beanPropertyWriter33.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter37);
        com.fasterxml.jackson.databind.JavaType javaType45 = beanPropertyWriter33._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap46 = beanPropertyWriter33._internalSettings;
        beanPropertyWriter29._internalSettings = objMap46;
        beanPropertyWriter20._internalSettings = objMap46;
        beanPropertyWriter10._internalSettings = objMap46;
        beanPropertyWriter9._internalSettings = objMap46;
        beanPropertyWriter4._internalSettings = objMap46;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(propertyName15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(serializableString17);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(propertyName26);
        org.junit.Assert.assertNull(objJsonSerializer27);
        org.junit.Assert.assertNotNull(beanPropertyWriter29);
        org.junit.Assert.assertNull(typeSerializer30);
        org.junit.Assert.assertNull(javaType34);
        org.junit.Assert.assertNull(annotatedMember35);
        org.junit.Assert.assertNull(javaType38);
        org.junit.Assert.assertNull(javaType39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(objJsonSerializer43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(javaType45);
        org.junit.Assert.assertNotNull(objMap46);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer3;
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = null;
        beanPropertyWriter0._format = value5;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata7 = beanPropertyWriter0.getMetadata();
        java.lang.reflect.Type type8 = beanPropertyWriter0.getGenericPropertyType();
        java.lang.reflect.Field field9 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.depositSchemaProperty(objectNode10, serializerProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(propertyMetadata7);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNull(field9);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer1 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter2 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor3 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor3);
        boolean boolean5 = beanPropertyWriter0.hasSerializer();
        boolean boolean6 = beanPropertyWriter0.isUnwrapping();
        java.lang.Object obj7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.serializeAsField(obj7, jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(typeSerializer1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = beanPropertyWriter0._dynamicSerializers;
        java.lang.Class<?>[] wildcardClassArray7 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = null;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap8;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = null;
        beanPropertyWriter0._serializer = objJsonSerializer10;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(propertySerializerMap6);
        org.junit.Assert.assertNull(wildcardClassArray7);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0.getTypeSerializer();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap6 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.annotation.JsonFormat.Value value7 = beanPropertyWriter0._format;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass10 = beanPropertyWriter9.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter9._nonTrivialBaseType;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata12 = beanPropertyWriter9._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter13._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray15 = beanPropertyWriter13._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = null;
        beanPropertyWriter13._serializer = objJsonSerializer16;
        java.lang.Object obj19 = beanPropertyWriter13.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata20 = beanPropertyWriter13._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter21._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray23 = beanPropertyWriter21._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap24 = null;
        beanPropertyWriter21._internalSettings = objMap24;
        java.lang.Object obj26 = beanPropertyWriter13.removeInternalSetting((java.lang.Object) beanPropertyWriter21);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer27 = beanPropertyWriter21._nullSerializer;
        java.lang.Object obj28 = beanPropertyWriter21.readResolve();
        java.lang.Class<?>[] wildcardClassArray29 = beanPropertyWriter21.getViews();
        java.lang.Object obj30 = beanPropertyWriter0.setInternalSetting((java.lang.Object) beanPropertyWriter9, (java.lang.Object) wildcardClassArray29);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter31 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer32 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter33 = beanPropertyWriter0.unwrappingWriter(nameTransformer32);
        boolean boolean34 = beanPropertyWriter0.isUnwrapping();
        com.fasterxml.jackson.core.io.SerializedString serializedString35 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString35);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType38 = beanPropertyWriter37._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray39 = beanPropertyWriter37._includeInViews;
        boolean boolean40 = beanPropertyWriter37.isVirtual();
        java.lang.Class<?>[] wildcardClassArray41 = beanPropertyWriter37.getViews();
        boolean boolean42 = beanPropertyWriter37.isUnwrapping();
        com.fasterxml.jackson.databind.JavaType javaType43 = beanPropertyWriter37.getSerializationType();
        java.lang.Class<?>[] wildcardClassArray44 = beanPropertyWriter37.getViews();
        com.fasterxml.jackson.databind.util.Annotations annotations45 = beanPropertyWriter37._contextAnnotations;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap46 = null;
        beanPropertyWriter37._dynamicSerializers = propertySerializerMap46;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator48 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.serializeAsPlaceholder((java.lang.Object) beanPropertyWriter37, jsonGenerator48, serializerProvider49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(annotatedMember4);
        org.junit.Assert.assertNull(typeSerializer5);
        org.junit.Assert.assertNull(objMap6);
        org.junit.Assert.assertNull(value7);
        org.junit.Assert.assertNull(annotatedMember8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(propertyMetadata12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(wildcardClassArray15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(propertyMetadata20);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(wildcardClassArray23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(objJsonSerializer27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(wildcardClassArray29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(beanPropertyWriter33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(javaType38);
        org.junit.Assert.assertNull(wildcardClassArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(wildcardClassArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(javaType43);
        org.junit.Assert.assertNull(wildcardClassArray44);
        org.junit.Assert.assertNull(annotations45);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer12 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer12);
        java.lang.reflect.Field field14 = null;
        beanPropertyWriter0._field = field14;
        boolean boolean16 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer17 = beanPropertyWriter0._typeSerializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = beanPropertyWriter0.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(typeSerializer17);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = beanPropertyWriter0._dynamicSerializers;
        java.lang.Class<?>[] wildcardClassArray7 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = null;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap8;
        java.lang.reflect.Method method10 = null;
        beanPropertyWriter0._accessorMethod = method10;
        java.lang.reflect.Method method12 = null;
        beanPropertyWriter0._accessorMethod = method12;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap14 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType16 = beanPropertyWriter15._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember17 = beanPropertyWriter15.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter18 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass19 = beanPropertyWriter18.getRawSerializationType();
        java.lang.reflect.Field field20 = null;
        beanPropertyWriter18._field = field20;
        java.lang.reflect.Field field22 = beanPropertyWriter18._field;
        java.lang.Object obj23 = beanPropertyWriter15.removeInternalSetting((java.lang.Object) beanPropertyWriter18);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter18);
        java.lang.Class<?>[] wildcardClassArray25 = beanPropertyWriter24.getViews();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter26 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass27 = beanPropertyWriter26.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember28 = beanPropertyWriter26.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer29 = beanPropertyWriter26._typeSerializer;
        boolean boolean30 = beanPropertyWriter26.willSuppressNulls();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer31 = null;
        beanPropertyWriter26._typeSerializer = typeSerializer31;
        java.lang.reflect.Method method33 = beanPropertyWriter26._accessorMethod;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType35 = beanPropertyWriter34._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray36 = beanPropertyWriter34._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap37 = null;
        beanPropertyWriter34._internalSettings = objMap37;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap39 = beanPropertyWriter34._dynamicSerializers;
        boolean boolean40 = beanPropertyWriter34.hasNullSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter41 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType42 = beanPropertyWriter41._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray43 = beanPropertyWriter41._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer44 = null;
        beanPropertyWriter41._serializer = objJsonSerializer44;
        java.lang.Object obj47 = beanPropertyWriter41.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata48 = beanPropertyWriter41._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter49 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType50 = beanPropertyWriter49._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray51 = beanPropertyWriter49._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap52 = null;
        beanPropertyWriter49._internalSettings = objMap52;
        java.lang.Object obj54 = beanPropertyWriter41.removeInternalSetting((java.lang.Object) beanPropertyWriter49);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter55 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter49);
        java.lang.Object obj56 = beanPropertyWriter34.removeInternalSetting((java.lang.Object) beanPropertyWriter55);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter57 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean58 = beanPropertyWriter57.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName59 = beanPropertyWriter57._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer60 = beanPropertyWriter57._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer61 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter62 = beanPropertyWriter57.unwrappingWriter(nameTransformer61);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer63 = beanPropertyWriter62.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType64 = null;
        beanPropertyWriter62.setNonTrivialBaseType(javaType64);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter66 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType67 = beanPropertyWriter66._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember68 = beanPropertyWriter66.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter70 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType71 = beanPropertyWriter70._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType72 = beanPropertyWriter70._nonTrivialBaseType;
        java.lang.Object obj74 = beanPropertyWriter70.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean75 = beanPropertyWriter70._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer76 = beanPropertyWriter70._serializer;
        java.lang.Object obj77 = beanPropertyWriter66.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter70);
        com.fasterxml.jackson.databind.JavaType javaType78 = beanPropertyWriter66._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap79 = beanPropertyWriter66._internalSettings;
        beanPropertyWriter62._internalSettings = objMap79;
        beanPropertyWriter34._internalSettings = objMap79;
        beanPropertyWriter26._internalSettings = objMap79;
        beanPropertyWriter24._internalSettings = objMap79;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter84 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass85 = beanPropertyWriter84.getRawSerializationType();
        java.lang.reflect.Field field86 = null;
        beanPropertyWriter84._field = field86;
        boolean boolean88 = beanPropertyWriter84.isUnwrapping();
        boolean boolean89 = beanPropertyWriter84.hasNullSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer90 = null;
        beanPropertyWriter84._typeSerializer = typeSerializer90;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer92 = beanPropertyWriter84.getSerializer();
        java.lang.Object obj93 = beanPropertyWriter0.setInternalSetting((java.lang.Object) objMap79, (java.lang.Object) objJsonSerializer92);
        com.fasterxml.jackson.core.io.SerializedString serializedString94 = beanPropertyWriter0._name;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(propertySerializerMap6);
        org.junit.Assert.assertNull(wildcardClassArray7);
        org.junit.Assert.assertNull(objMap14);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNull(annotatedMember17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNull(field22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(wildcardClassArray25);
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertNull(annotatedMember28);
        org.junit.Assert.assertNull(typeSerializer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertNull(wildcardClassArray36);
        org.junit.Assert.assertNull(propertySerializerMap39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(javaType42);
        org.junit.Assert.assertNull(wildcardClassArray43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(propertyMetadata48);
        org.junit.Assert.assertNull(javaType50);
        org.junit.Assert.assertNull(wildcardClassArray51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(propertyName59);
        org.junit.Assert.assertNull(objJsonSerializer60);
        org.junit.Assert.assertNotNull(beanPropertyWriter62);
        org.junit.Assert.assertNull(typeSerializer63);
        org.junit.Assert.assertNull(javaType67);
        org.junit.Assert.assertNull(annotatedMember68);
        org.junit.Assert.assertNull(javaType71);
        org.junit.Assert.assertNull(javaType72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(objJsonSerializer76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(javaType78);
        org.junit.Assert.assertNotNull(objMap79);
        org.junit.Assert.assertNull(wildcardClass85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(objJsonSerializer92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNull(serializedString94);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        beanPropertyWriter0.setNonTrivialBaseType(javaType3);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = null;
        beanPropertyWriter0._serializer = objJsonSerializer5;
        com.fasterxml.jackson.databind.util.Annotations annotations7 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer8;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter10._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter10._nonTrivialBaseType;
        java.lang.Object obj14 = beanPropertyWriter10.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName15 = beanPropertyWriter10._wrapperName;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector16 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value17 = beanPropertyWriter10.findFormatOverrides(annotationIntrospector16);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata18 = beanPropertyWriter10.getMetadata();
        java.lang.Class<?> wildcardClass19 = beanPropertyWriter10.getRawSerializationType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter20._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter20._nonTrivialBaseType;
        java.lang.Object obj24 = beanPropertyWriter20.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean25 = beanPropertyWriter20._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer26 = beanPropertyWriter20._serializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType28 = beanPropertyWriter27._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember29 = beanPropertyWriter27.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter31 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType32 = beanPropertyWriter31._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType33 = beanPropertyWriter31._nonTrivialBaseType;
        java.lang.Object obj35 = beanPropertyWriter31.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean36 = beanPropertyWriter31._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer37 = beanPropertyWriter31._serializer;
        java.lang.Object obj38 = beanPropertyWriter27.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter31);
        com.fasterxml.jackson.databind.JavaType javaType39 = beanPropertyWriter27._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap40 = beanPropertyWriter27._internalSettings;
        beanPropertyWriter20._internalSettings = objMap40;
        com.fasterxml.jackson.databind.PropertyName propertyName42 = beanPropertyWriter20._wrapperName;
        java.lang.Object obj43 = beanPropertyWriter0.setInternalSetting((java.lang.Object) beanPropertyWriter10, (java.lang.Object) beanPropertyWriter20);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata44 = beanPropertyWriter20._metadata;
        java.lang.Object obj45 = beanPropertyWriter20.readResolve();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(annotations7);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(propertyName15);
        org.junit.Assert.assertNull(value17);
        org.junit.Assert.assertNull(propertyMetadata18);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(objJsonSerializer26);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertNull(annotatedMember29);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(objJsonSerializer37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(javaType39);
        org.junit.Assert.assertNotNull(objMap40);
        org.junit.Assert.assertNull(propertyName42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(propertyMetadata44);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean5 = beanPropertyWriter0._suppressNulls;
        java.lang.reflect.Field field6 = null;
        beanPropertyWriter0._field = field6;
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter0.getType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean10 = beanPropertyWriter9.isVirtual();
        java.lang.reflect.Field field11 = beanPropertyWriter9._field;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = beanPropertyWriter9.unwrappingWriter(nameTransformer12);
        java.lang.Object obj14 = beanPropertyWriter0.getInternalSetting((java.lang.Object) nameTransformer12);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType16 = beanPropertyWriter15._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType17 = beanPropertyWriter15._nonTrivialBaseType;
        java.lang.Object obj19 = beanPropertyWriter15.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean20 = beanPropertyWriter15._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = beanPropertyWriter15._serializer;
        com.fasterxml.jackson.annotation.JsonFormat.Value value22 = null;
        beanPropertyWriter15._format = value22;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value25 = beanPropertyWriter15.findFormatOverrides(annotationIntrospector24);
        java.lang.Object obj26 = beanPropertyWriter0.getInternalSetting((java.lang.Object) value25);
        java.lang.reflect.Method method27 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.core.io.SerializedString serializedString28 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = beanPropertyWriter0.isRequired();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(field11);
        org.junit.Assert.assertNotNull(beanPropertyWriter13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(objJsonSerializer21);
        org.junit.Assert.assertNull(value25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter0._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap13 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = beanPropertyWriter0.getMember();
        java.lang.Object obj15 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = beanPropertyWriter0.unwrappingWriter(nameTransformer16);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(objMap13);
        org.junit.Assert.assertNull(annotatedMember14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(beanPropertyWriter17);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0._wrapperName;
        boolean boolean6 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.core.SerializableString serializableString7 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata8 = beanPropertyWriter0._metadata;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata9 = beanPropertyWriter0._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter10._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter10._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = beanPropertyWriter10._member;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = null;
        beanPropertyWriter10.assignTypeSerializer(typeSerializer14);
        com.fasterxml.jackson.core.SerializableString serializableString16 = beanPropertyWriter10.getSerializedName();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector17 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value18 = beanPropertyWriter10.findFormatOverrides(annotationIntrospector17);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType20 = beanPropertyWriter19._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember21 = beanPropertyWriter19.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType24 = beanPropertyWriter23._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType25 = beanPropertyWriter23._nonTrivialBaseType;
        java.lang.Object obj27 = beanPropertyWriter23.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean28 = beanPropertyWriter23._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer29 = beanPropertyWriter23._serializer;
        java.lang.Object obj30 = beanPropertyWriter19.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter23);
        com.fasterxml.jackson.databind.JavaType javaType31 = beanPropertyWriter19._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap32 = beanPropertyWriter19._internalSettings;
        beanPropertyWriter10._internalSettings = objMap32;
        beanPropertyWriter0._internalSettings = objMap32;
        com.fasterxml.jackson.core.SerializableString serializableString35 = beanPropertyWriter0.getSerializedName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = beanPropertyWriter0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(serializableString7);
        org.junit.Assert.assertNull(propertyMetadata8);
        org.junit.Assert.assertNull(propertyMetadata9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(annotatedMember13);
        org.junit.Assert.assertNull(serializableString16);
        org.junit.Assert.assertNull(value18);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNull(annotatedMember21);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(javaType25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(objJsonSerializer29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(javaType31);
        org.junit.Assert.assertNotNull(objMap32);
        org.junit.Assert.assertNull(serializableString35);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = beanPropertyWriter5.getTypeSerializer();
        com.fasterxml.jackson.core.io.SerializedString serializedString7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5, serializedString7);
        java.lang.Object obj10 = beanPropertyWriter8.getInternalSetting((java.lang.Object) 10.0f);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = beanPropertyWriter8._typeSerializer;
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter8._cfgSerializationType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        beanPropertyWriter8.assignTypeSerializer(typeSerializer13);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        beanPropertyWriter8.setNonTrivialBaseType(javaType15);
        boolean boolean17 = beanPropertyWriter8._suppressNulls;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(typeSerializer6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(typeSerializer11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._serializer = objJsonSerializer3;
        java.lang.Object obj6 = beanPropertyWriter0.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = beanPropertyWriter0.getTypeSerializer();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap9 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer10;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata12 = beanPropertyWriter0._metadata;
        java.lang.Class<?> wildcardClass13 = beanPropertyWriter0.getClass();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(propertySerializerMap7);
        org.junit.Assert.assertNull(typeSerializer8);
        org.junit.Assert.assertNull(objMap9);
        org.junit.Assert.assertNull(propertyMetadata12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._serializer = objJsonSerializer3;
        java.lang.Object obj6 = beanPropertyWriter0.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = beanPropertyWriter0.getTypeSerializer();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap9 = beanPropertyWriter0._internalSettings;
        java.lang.Class<?>[] wildcardClassArray10 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.core.io.SerializedString serializedString11 = beanPropertyWriter0._name;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer12);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer14);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer16 = beanPropertyWriter0._typeSerializer;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(propertySerializerMap7);
        org.junit.Assert.assertNull(typeSerializer8);
        org.junit.Assert.assertNull(objMap9);
        org.junit.Assert.assertNull(wildcardClassArray10);
        org.junit.Assert.assertNull(serializedString11);
        org.junit.Assert.assertNull(typeSerializer16);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        boolean boolean12 = beanPropertyWriter4.isVirtual();
        boolean boolean13 = beanPropertyWriter4.hasSerializer();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap14 = beanPropertyWriter4._internalSettings;
        java.lang.Class<?> wildcardClass15 = beanPropertyWriter4.getRawSerializationType();
        java.lang.Class<?>[] wildcardClassArray16 = beanPropertyWriter4._includeInViews;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata17 = beanPropertyWriter4.getMetadata();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objMap14);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClassArray16);
        org.junit.Assert.assertNull(propertyMetadata17);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter5.getType();
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter5._cfgSerializationType;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value9 = beanPropertyWriter5.findFormatOverrides(annotationIntrospector8);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        beanPropertyWriter10.setNonTrivialBaseType(javaType11);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = beanPropertyWriter10._typeSerializer;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(value9);
        org.junit.Assert.assertNull(typeSerializer13);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer1 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer1);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = beanPropertyWriter0._internalSettings;
        java.lang.reflect.Method method4 = null;
        beanPropertyWriter0._accessorMethod = method4;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter6._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray8 = beanPropertyWriter6._includeInViews;
        java.lang.Class<?>[] wildcardClassArray9 = beanPropertyWriter6.getViews();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        beanPropertyWriter6._typeSerializer = typeSerializer10;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap12 = null;
        beanPropertyWriter6._dynamicSerializers = propertySerializerMap12;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter6);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = beanPropertyWriter6.getSerializer();
        com.fasterxml.jackson.databind.PropertyName propertyName16 = beanPropertyWriter6.getWrapperName();
        com.fasterxml.jackson.databind.JavaType javaType17 = beanPropertyWriter6._cfgSerializationType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter18 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType19 = beanPropertyWriter18._cfgSerializationType;
        java.lang.reflect.Field field20 = beanPropertyWriter18._field;
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter18.getSerializationType();
        boolean boolean22 = beanPropertyWriter18._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType23 = beanPropertyWriter18.getType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType25 = beanPropertyWriter24._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray26 = beanPropertyWriter24._includeInViews;
        java.lang.Class<?>[] wildcardClassArray27 = beanPropertyWriter24.getViews();
        com.fasterxml.jackson.core.SerializableString serializableString28 = beanPropertyWriter24.getSerializedName();
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = beanPropertyWriter24._name;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType31 = beanPropertyWriter30._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType32 = beanPropertyWriter30._nonTrivialBaseType;
        java.lang.Object obj34 = beanPropertyWriter30.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName35 = beanPropertyWriter30._wrapperName;
        boolean boolean36 = beanPropertyWriter30._suppressNulls;
        com.fasterxml.jackson.core.SerializableString serializableString37 = beanPropertyWriter30.getSerializedName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer38 = null;
        beanPropertyWriter30.assignTypeSerializer(typeSerializer38);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter40 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType41 = beanPropertyWriter40._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor42 = null;
        beanPropertyWriter40.depositSchemaProperty(jsonObjectFormatVisitor42);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter44 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean45 = beanPropertyWriter44.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName46 = beanPropertyWriter44._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer47 = beanPropertyWriter44._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer48 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter49 = beanPropertyWriter44.unwrappingWriter(nameTransformer48);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer50 = beanPropertyWriter49.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType51 = null;
        beanPropertyWriter49.setNonTrivialBaseType(javaType51);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter53 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType54 = beanPropertyWriter53._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember55 = beanPropertyWriter53.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter57 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType58 = beanPropertyWriter57._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType59 = beanPropertyWriter57._nonTrivialBaseType;
        java.lang.Object obj61 = beanPropertyWriter57.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean62 = beanPropertyWriter57._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer63 = beanPropertyWriter57._serializer;
        java.lang.Object obj64 = beanPropertyWriter53.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter57);
        com.fasterxml.jackson.databind.JavaType javaType65 = beanPropertyWriter53._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap66 = beanPropertyWriter53._internalSettings;
        beanPropertyWriter49._internalSettings = objMap66;
        beanPropertyWriter40._internalSettings = objMap66;
        beanPropertyWriter30._internalSettings = objMap66;
        beanPropertyWriter24._internalSettings = objMap66;
        beanPropertyWriter18._internalSettings = objMap66;
        beanPropertyWriter6._internalSettings = objMap66;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator73 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider74 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.serializeAsPlaceholder((java.lang.Object) objMap66, jsonGenerator73, serializerProvider74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(wildcardClassArray8);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertNull(objJsonSerializer15);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNull(field20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNull(javaType25);
        org.junit.Assert.assertNull(wildcardClassArray26);
        org.junit.Assert.assertNull(wildcardClassArray27);
        org.junit.Assert.assertNull(serializableString28);
        org.junit.Assert.assertNull(serializedString29);
        org.junit.Assert.assertNull(javaType31);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(propertyName35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(serializableString37);
        org.junit.Assert.assertNull(javaType41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(propertyName46);
        org.junit.Assert.assertNull(objJsonSerializer47);
        org.junit.Assert.assertNotNull(beanPropertyWriter49);
        org.junit.Assert.assertNull(typeSerializer50);
        org.junit.Assert.assertNull(javaType54);
        org.junit.Assert.assertNull(annotatedMember55);
        org.junit.Assert.assertNull(javaType58);
        org.junit.Assert.assertNull(javaType59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(objJsonSerializer63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(javaType65);
        org.junit.Assert.assertNotNull(objMap66);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        boolean boolean3 = beanPropertyWriter0.isVirtual();
        java.lang.Class<?>[] wildcardClassArray4 = beanPropertyWriter0.getViews();
        boolean boolean5 = beanPropertyWriter0.isUnwrapping();
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0.getSerializationType();
        java.lang.Class<?>[] wildcardClassArray7 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        beanPropertyWriter0.setNonTrivialBaseType(javaType8);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = beanPropertyWriter0.getMember();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName11 = beanPropertyWriter0.getFullName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardClassArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(wildcardClassArray7);
        org.junit.Assert.assertNull(annotatedMember10);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer7);
        java.lang.reflect.Method method9 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = beanPropertyWriter0.unwrappingWriter(nameTransformer11);
        com.fasterxml.jackson.databind.PropertyName propertyName13 = beanPropertyWriter12.getWrapperName();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType15 = beanPropertyWriter14._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType16 = beanPropertyWriter14._nonTrivialBaseType;
        java.lang.Object obj18 = beanPropertyWriter14.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean19 = beanPropertyWriter14._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = beanPropertyWriter14._serializer;
        com.fasterxml.jackson.annotation.JsonFormat.Value value21 = null;
        beanPropertyWriter14._format = value21;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember23 = beanPropertyWriter14._member;
        java.lang.Object obj24 = beanPropertyWriter14._suppressableValue;
        java.lang.Class<?>[] wildcardClassArray25 = beanPropertyWriter14._includeInViews;
        com.fasterxml.jackson.core.io.SerializedString serializedString26 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter14, serializedString26);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType29 = beanPropertyWriter28._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray30 = beanPropertyWriter28._includeInViews;
        java.lang.Class<?>[] wildcardClassArray31 = beanPropertyWriter28.getViews();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer32 = null;
        beanPropertyWriter28._typeSerializer = typeSerializer32;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer34 = null;
        beanPropertyWriter28.assignTypeSerializer(typeSerializer34);
        com.fasterxml.jackson.databind.util.Annotations annotations36 = beanPropertyWriter28._contextAnnotations;
        java.lang.Object obj37 = beanPropertyWriter27.getInternalSetting((java.lang.Object) beanPropertyWriter28);
        java.lang.Class<?> wildcardClass38 = beanPropertyWriter27.getRawSerializationType();
        java.lang.Object obj39 = beanPropertyWriter12.removeInternalSetting((java.lang.Object) wildcardClass38);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(propertySerializerMap10);
        org.junit.Assert.assertNotNull(beanPropertyWriter12);
        org.junit.Assert.assertNull(propertyName13);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(objJsonSerializer20);
        org.junit.Assert.assertNull(annotatedMember23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(wildcardClassArray25);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNull(wildcardClassArray30);
        org.junit.Assert.assertNull(wildcardClassArray31);
        org.junit.Assert.assertNull(annotations36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(wildcardClass38);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = beanPropertyWriter0._dynamicSerializers;
        java.lang.Class<?>[] wildcardClassArray7 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = null;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap8;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter10._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter10._nonTrivialBaseType;
        java.lang.Object obj14 = beanPropertyWriter10.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean15 = beanPropertyWriter10._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = beanPropertyWriter10._serializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType18 = beanPropertyWriter17._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember19 = beanPropertyWriter17.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter21._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType23 = beanPropertyWriter21._nonTrivialBaseType;
        java.lang.Object obj25 = beanPropertyWriter21.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean26 = beanPropertyWriter21._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer27 = beanPropertyWriter21._serializer;
        java.lang.Object obj28 = beanPropertyWriter17.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter21);
        com.fasterxml.jackson.databind.JavaType javaType29 = beanPropertyWriter17._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap30 = beanPropertyWriter17._internalSettings;
        beanPropertyWriter10._internalSettings = objMap30;
        beanPropertyWriter0._internalSettings = objMap30;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass34 = beanPropertyWriter33.getRawSerializationType();
        java.lang.reflect.Field field35 = null;
        beanPropertyWriter33._field = field35;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap37 = null;
        beanPropertyWriter33._internalSettings = objMap37;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer39 = null;
        beanPropertyWriter33._nullSerializer = objJsonSerializer39;
        com.fasterxml.jackson.core.io.SerializedString serializedString41 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter42 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter33, serializedString41);
        com.fasterxml.jackson.databind.util.Annotations annotations43 = beanPropertyWriter42._contextAnnotations;
        java.lang.Object obj44 = beanPropertyWriter42.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap45 = beanPropertyWriter42._dynamicSerializers;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap45;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer47 = beanPropertyWriter0._serializer;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(propertySerializerMap6);
        org.junit.Assert.assertNull(wildcardClassArray7);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objJsonSerializer16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(annotatedMember19);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(objJsonSerializer27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNotNull(objMap30);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNull(annotations43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(propertySerializerMap45);
        org.junit.Assert.assertNull(objJsonSerializer47);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean5 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter0.unwrappingWriter(nameTransformer7);
        boolean boolean9 = beanPropertyWriter0.isUnwrapping();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter0._nullSerializer;
        boolean boolean11 = beanPropertyWriter0.isUnwrapping();
        java.lang.Class<?> wildcardClass12 = beanPropertyWriter0.getRawSerializationType();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardClass12);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        java.lang.Object obj4 = beanPropertyWriter0._suppressableValue;
        java.lang.reflect.Method method5 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = null;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap6;
        java.lang.reflect.Type type8 = beanPropertyWriter0.getGenericPropertyType();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata9 = beanPropertyWriter0.getMetadata();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(typeSerializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNull(propertyMetadata9);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.annotation.JsonFormat.Value value6 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.NO_FORMAT;
        beanPropertyWriter0._format = value6;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value10 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        beanPropertyWriter0.setNonTrivialBaseType(javaType11);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNotNull(value6);
        org.junit.Assert.assertNull(propertySerializerMap8);
        org.junit.Assert.assertNull(value10);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = beanPropertyWriter0._typeSerializer;
        java.lang.Object obj8 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass10 = beanPropertyWriter9.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember11 = beanPropertyWriter9.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer12 = beanPropertyWriter9._typeSerializer;
        java.lang.Object obj14 = beanPropertyWriter9.removeInternalSetting((java.lang.Object) 0.0f);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = beanPropertyWriter9.getTypeSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer16 = beanPropertyWriter9.getTypeSerializer();
        com.fasterxml.jackson.databind.util.Annotations annotations17 = beanPropertyWriter9._contextAnnotations;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter19 = beanPropertyWriter9.unwrappingWriter(nameTransformer18);
        boolean boolean20 = beanPropertyWriter19.hasSerializer();
        com.fasterxml.jackson.core.io.SerializedString serializedString21 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter19, serializedString21);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType24 = beanPropertyWriter23._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor25 = null;
        beanPropertyWriter23.depositSchemaProperty(jsonObjectFormatVisitor25);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer27 = null;
        beanPropertyWriter23.assignTypeSerializer(typeSerializer27);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter30 = beanPropertyWriter23.unwrappingWriter(nameTransformer29);
        boolean boolean31 = beanPropertyWriter30.isVirtual();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = null;
        beanPropertyWriter30._nullSerializer = objJsonSerializer32;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata34 = beanPropertyWriter30.getMetadata();
        com.fasterxml.jackson.databind.JavaType javaType35 = null;
        beanPropertyWriter30._nonTrivialBaseType = javaType35;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata37 = beanPropertyWriter30.getMetadata();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor40 = null;
        beanPropertyWriter39.depositSchemaProperty(jsonObjectFormatVisitor40);
        boolean boolean42 = beanPropertyWriter39.hasSerializer();
        java.lang.reflect.Field field43 = beanPropertyWriter39._field;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter44 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType45 = beanPropertyWriter44._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType46 = beanPropertyWriter44._nonTrivialBaseType;
        java.lang.Object obj48 = beanPropertyWriter44.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName49 = beanPropertyWriter44._wrapperName;
        com.fasterxml.jackson.annotation.JsonFormat.Value value50 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.NO_FORMAT;
        beanPropertyWriter44._format = value50;
        beanPropertyWriter39._format = value50;
        beanPropertyWriter38._format = value50;
        beanPropertyWriter30._format = value50;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter55 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor56 = null;
        beanPropertyWriter55.depositSchemaProperty(jsonObjectFormatVisitor56);
        boolean boolean58 = beanPropertyWriter55.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter59 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter55);
        com.fasterxml.jackson.annotation.JsonFormat.Value value60 = beanPropertyWriter59._format;
        com.fasterxml.jackson.core.io.SerializedString serializedString61 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter62 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter59, serializedString61);
        java.lang.Object obj63 = beanPropertyWriter22.setInternalSetting((java.lang.Object) value50, (java.lang.Object) serializedString61);
        beanPropertyWriter0._format = value50;
        com.fasterxml.jackson.databind.util.Annotations annotations65 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType66 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType66;
        java.lang.reflect.Field field68 = null;
        beanPropertyWriter0._field = field68;
        com.fasterxml.jackson.databind.JavaType javaType70 = beanPropertyWriter0.getType();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotatedMember3);
        org.junit.Assert.assertNull(annotatedMember6);
        org.junit.Assert.assertNull(typeSerializer7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(annotatedMember11);
        org.junit.Assert.assertNull(typeSerializer12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(typeSerializer15);
        org.junit.Assert.assertNull(typeSerializer16);
        org.junit.Assert.assertNull(annotations17);
        org.junit.Assert.assertNotNull(beanPropertyWriter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNotNull(beanPropertyWriter30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(propertyMetadata34);
        org.junit.Assert.assertNull(propertyMetadata37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(field43);
        org.junit.Assert.assertNull(javaType45);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(propertyName49);
        org.junit.Assert.assertNotNull(value50);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(value60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(annotations65);
        org.junit.Assert.assertNull(javaType70);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        java.lang.reflect.Field field2 = null;
        beanPropertyWriter0._field = field2;
        java.lang.reflect.Field field4 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer5;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata7 = beanPropertyWriter0._metadata;
        java.lang.reflect.Method method8 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor10 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor10);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer12);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        beanPropertyWriter14.assignTypeSerializer(typeSerializer15);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap17 = beanPropertyWriter14._internalSettings;
        boolean boolean18 = beanPropertyWriter14.hasSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer19 = beanPropertyWriter14._nullSerializer;
        boolean boolean20 = beanPropertyWriter14.hasNullSerializer();
        java.lang.reflect.Type type21 = beanPropertyWriter14.getGenericPropertyType();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer22 = beanPropertyWriter14.getTypeSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.serializeAsElement((java.lang.Object) typeSerializer22, jsonGenerator23, serializerProvider24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(field4);
        org.junit.Assert.assertNull(propertyMetadata7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNull(objMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(objJsonSerializer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(type21);
        org.junit.Assert.assertNull(typeSerializer22);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._serializer = objJsonSerializer3;
        java.lang.Object obj6 = beanPropertyWriter0.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata7 = beanPropertyWriter0._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter8._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray10 = beanPropertyWriter8._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap11 = null;
        beanPropertyWriter8._internalSettings = objMap11;
        java.lang.Object obj13 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter8);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter8);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = beanPropertyWriter14._nullSerializer;
        boolean boolean16 = beanPropertyWriter14._suppressNulls;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap17 = null;
        beanPropertyWriter14._dynamicSerializers = propertySerializerMap17;
        com.fasterxml.jackson.databind.PropertyName propertyName19 = beanPropertyWriter14.getWrapperName();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(propertyMetadata7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(wildcardClassArray10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(objJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(propertyName19);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer1 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer1);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = beanPropertyWriter0._internalSettings;
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = beanPropertyWriter0._nullSerializer;
        boolean boolean6 = beanPropertyWriter0.hasNullSerializer();
        java.lang.reflect.Type type7 = beanPropertyWriter0.getGenericPropertyType();
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter0.getSerializationType();
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor2 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor2);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        boolean boolean8 = beanPropertyWriter7.isVirtual();
        com.fasterxml.jackson.core.io.SerializedString serializedString9 = beanPropertyWriter7._name;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter7._serializer;
        java.lang.Object obj11 = beanPropertyWriter7._suppressableValue;
        com.fasterxml.jackson.core.io.SerializedString serializedString12 = beanPropertyWriter7._name;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(serializedString9);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(serializedString12);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter6._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter6._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = beanPropertyWriter6._member;
        boolean boolean10 = beanPropertyWriter6.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter6);
        boolean boolean12 = beanPropertyWriter11.willSuppressNulls();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter13._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray15 = beanPropertyWriter13._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap16 = null;
        beanPropertyWriter13._internalSettings = objMap16;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap18 = beanPropertyWriter13._dynamicSerializers;
        boolean boolean19 = beanPropertyWriter13.hasNullSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter20._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray22 = beanPropertyWriter20._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = null;
        beanPropertyWriter20._serializer = objJsonSerializer23;
        java.lang.Object obj26 = beanPropertyWriter20.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata27 = beanPropertyWriter20._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType29 = beanPropertyWriter28._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray30 = beanPropertyWriter28._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap31 = null;
        beanPropertyWriter28._internalSettings = objMap31;
        java.lang.Object obj33 = beanPropertyWriter20.removeInternalSetting((java.lang.Object) beanPropertyWriter28);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter28);
        java.lang.Object obj35 = beanPropertyWriter13.removeInternalSetting((java.lang.Object) beanPropertyWriter34);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType37 = beanPropertyWriter36._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember38 = beanPropertyWriter36.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter40 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType41 = beanPropertyWriter40._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType42 = beanPropertyWriter40._nonTrivialBaseType;
        java.lang.Object obj44 = beanPropertyWriter40.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean45 = beanPropertyWriter40._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer46 = beanPropertyWriter40._serializer;
        java.lang.Object obj47 = beanPropertyWriter36.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter40);
        com.fasterxml.jackson.databind.JavaType javaType48 = beanPropertyWriter40._cfgSerializationType;
        java.lang.Object obj49 = beanPropertyWriter40._suppressableValue;
        java.lang.Object obj50 = beanPropertyWriter13.getInternalSetting((java.lang.Object) beanPropertyWriter40);
        com.fasterxml.jackson.databind.JavaType javaType51 = beanPropertyWriter13.getType();
        java.lang.Object obj52 = beanPropertyWriter0.setInternalSetting((java.lang.Object) boolean12, (java.lang.Object) beanPropertyWriter13);
        boolean boolean53 = beanPropertyWriter0.hasNullSerializer();
        java.lang.reflect.Type type54 = beanPropertyWriter0.getGenericPropertyType();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(annotatedMember9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(wildcardClassArray15);
        org.junit.Assert.assertNull(propertySerializerMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(wildcardClassArray22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(propertyMetadata27);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNull(wildcardClassArray30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(javaType37);
        org.junit.Assert.assertNull(annotatedMember38);
        org.junit.Assert.assertNull(javaType41);
        org.junit.Assert.assertNull(javaType42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(objJsonSerializer46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(javaType48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(javaType51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(type54);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._serializer = objJsonSerializer3;
        java.lang.Object obj6 = beanPropertyWriter0.getInternalSetting((java.lang.Object) 1.0d);
        java.lang.Object obj7 = beanPropertyWriter0._suppressableValue;
        java.lang.reflect.Type type8 = beanPropertyWriter0.getGenericPropertyType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = beanPropertyWriter0._dynamicSerializers;
        boolean boolean10 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter11._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType13 = beanPropertyWriter11._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = null;
        beanPropertyWriter11._nullSerializer = objJsonSerializer14;
        java.lang.Object obj17 = beanPropertyWriter11.getInternalSetting((java.lang.Object) (short) 0);
        java.lang.reflect.Type type18 = beanPropertyWriter11.getGenericPropertyType();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = null;
        beanPropertyWriter11.assignTypeSerializer(typeSerializer19);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter11);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata22 = beanPropertyWriter21._metadata;
        com.fasterxml.jackson.core.io.SerializedString serializedString23 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter21, serializedString23);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter26 = beanPropertyWriter24.unwrappingWriter(nameTransformer25);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer27 = beanPropertyWriter26._nullSerializer;
        java.lang.Object obj28 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) objJsonSerializer27);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType30 = beanPropertyWriter29._cfgSerializationType;
        java.lang.reflect.Field field31 = beanPropertyWriter29._field;
        java.lang.Class<?>[] wildcardClassArray32 = beanPropertyWriter29._includeInViews;
        java.lang.Class<?>[] wildcardClassArray33 = beanPropertyWriter29.getViews();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.serializeAsPlaceholder((java.lang.Object) beanPropertyWriter29, jsonGenerator34, serializerProvider35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNull(propertySerializerMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(type18);
        org.junit.Assert.assertNull(propertyMetadata22);
        org.junit.Assert.assertNotNull(beanPropertyWriter26);
        org.junit.Assert.assertNull(objJsonSerializer27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(javaType30);
        org.junit.Assert.assertNull(field31);
        org.junit.Assert.assertNull(wildcardClassArray32);
        org.junit.Assert.assertNull(wildcardClassArray33);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer4;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7.isVirtual();
        java.lang.reflect.Field field9 = beanPropertyWriter7._field;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = beanPropertyWriter7.unwrappingWriter(nameTransformer10);
        java.lang.reflect.Method method12 = null;
        beanPropertyWriter11._accessorMethod = method12;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata14 = beanPropertyWriter11.getMetadata();
        com.fasterxml.jackson.core.io.SerializedString serializedString15 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter11, serializedString15);
        java.lang.Object obj17 = beanPropertyWriter11._suppressableValue;
        com.fasterxml.jackson.databind.JavaType javaType18 = beanPropertyWriter11._cfgSerializationType;
        java.lang.Object obj19 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) javaType18);
        java.lang.reflect.Method method20 = null;
        beanPropertyWriter0._accessorMethod = method20;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(annotatedMember6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(field9);
        org.junit.Assert.assertNotNull(beanPropertyWriter11);
        org.junit.Assert.assertNull(propertyMetadata14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer12 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer12);
        java.lang.reflect.Field field14 = null;
        beanPropertyWriter0._field = field14;
        boolean boolean16 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Field field17 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector18 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value19 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector18);
        boolean boolean20 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = beanPropertyWriter0._nullSerializer;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = beanPropertyWriter0._nullSerializer;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0._depositSchemaProperty(objectNode23, jsonNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(field17);
        org.junit.Assert.assertNull(value19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(objJsonSerializer21);
        org.junit.Assert.assertNull(objJsonSerializer22);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer4);
        com.fasterxml.jackson.core.SerializableString serializableString6 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = beanPropertyWriter0.rename(nameTransformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotatedMember3);
        org.junit.Assert.assertNull(serializableString6);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        java.lang.reflect.Field field2 = null;
        beanPropertyWriter0._field = field2;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap4 = null;
        beanPropertyWriter0._internalSettings = objMap4;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer6;
        com.fasterxml.jackson.core.io.SerializedString serializedString8 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString8);
        com.fasterxml.jackson.databind.util.Annotations annotations10 = beanPropertyWriter9._contextAnnotations;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember11 = beanPropertyWriter9._member;
        com.fasterxml.jackson.core.io.SerializedString serializedString12 = beanPropertyWriter9._name;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(annotations10);
        org.junit.Assert.assertNull(annotatedMember11);
        org.junit.Assert.assertNull(serializedString12);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer7);
        java.lang.reflect.Method method9 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = beanPropertyWriter0.unwrappingWriter(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = beanPropertyWriter12.getRawSerializationType();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = null;
        beanPropertyWriter12._typeSerializer = typeSerializer14;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean17 = beanPropertyWriter16.isVirtual();
        java.lang.reflect.Field field18 = beanPropertyWriter16._field;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = beanPropertyWriter16.unwrappingWriter(nameTransformer19);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = null;
        beanPropertyWriter16._nullSerializer = objJsonSerializer21;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer23 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter24 = beanPropertyWriter16.unwrappingWriter(nameTransformer23);
        com.fasterxml.jackson.core.SerializableString serializableString25 = beanPropertyWriter16.getSerializedName();
        java.lang.Object obj26 = beanPropertyWriter16.readResolve();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType28 = beanPropertyWriter27._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType29 = beanPropertyWriter27._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember30 = beanPropertyWriter27._member;
        com.fasterxml.jackson.databind.PropertyName propertyName31 = beanPropertyWriter27._wrapperName;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType33 = beanPropertyWriter32._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray34 = beanPropertyWriter32._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer35 = null;
        beanPropertyWriter32._serializer = objJsonSerializer35;
        java.lang.Object obj38 = beanPropertyWriter32.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap39 = beanPropertyWriter32._dynamicSerializers;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer40 = beanPropertyWriter32.getTypeSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter41 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean42 = beanPropertyWriter41.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName43 = beanPropertyWriter41._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer44 = beanPropertyWriter41._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer45 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter46 = beanPropertyWriter41.unwrappingWriter(nameTransformer45);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer47 = beanPropertyWriter41._serializer;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap48 = null;
        beanPropertyWriter41._dynamicSerializers = propertySerializerMap48;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter50 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor51 = null;
        beanPropertyWriter50.depositSchemaProperty(jsonObjectFormatVisitor51);
        boolean boolean53 = beanPropertyWriter50.hasSerializer();
        java.lang.reflect.Field field54 = beanPropertyWriter50._field;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer55 = null;
        beanPropertyWriter50._typeSerializer = typeSerializer55;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter57 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass58 = beanPropertyWriter57.getRawSerializationType();
        java.lang.reflect.Field field59 = null;
        beanPropertyWriter57._field = field59;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap61 = null;
        beanPropertyWriter57._internalSettings = objMap61;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer63 = null;
        beanPropertyWriter57._nullSerializer = objJsonSerializer63;
        com.fasterxml.jackson.annotation.JsonFormat.Value value65 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.NO_FORMAT;
        beanPropertyWriter57._format = value65;
        beanPropertyWriter50._format = value65;
        beanPropertyWriter41._format = value65;
        beanPropertyWriter32._format = value65;
        beanPropertyWriter27._format = value65;
        beanPropertyWriter16._format = value65;
        beanPropertyWriter12._format = value65;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(propertySerializerMap10);
        org.junit.Assert.assertNotNull(beanPropertyWriter12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(field18);
        org.junit.Assert.assertNotNull(beanPropertyWriter20);
        org.junit.Assert.assertNotNull(beanPropertyWriter24);
        org.junit.Assert.assertNull(serializableString25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNull(annotatedMember30);
        org.junit.Assert.assertNull(propertyName31);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNull(wildcardClassArray34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(propertySerializerMap39);
        org.junit.Assert.assertNull(typeSerializer40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(propertyName43);
        org.junit.Assert.assertNull(objJsonSerializer44);
        org.junit.Assert.assertNotNull(beanPropertyWriter46);
        org.junit.Assert.assertNull(objJsonSerializer47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(field54);
        org.junit.Assert.assertNull(wildcardClass58);
        org.junit.Assert.assertNotNull(value65);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.lang.Class<?>[] wildcardClassArray3 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor6 = null;
        beanPropertyWriter4.depositSchemaProperty(jsonObjectFormatVisitor6);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        beanPropertyWriter4.assignTypeSerializer(typeSerializer8);
        java.lang.Object obj10 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) typeSerializer8);
        java.lang.reflect.Type type11 = beanPropertyWriter0.getGenericPropertyType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType13 = beanPropertyWriter12._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray14 = beanPropertyWriter12._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap15 = null;
        beanPropertyWriter12._internalSettings = objMap15;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter12);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap18 = beanPropertyWriter12._dynamicSerializers;
        java.lang.Class<?>[] wildcardClassArray19 = beanPropertyWriter12.getViews();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter20._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray22 = beanPropertyWriter20._includeInViews;
        boolean boolean23 = beanPropertyWriter20.isVirtual();
        java.lang.Object obj24 = beanPropertyWriter12.getInternalSetting((java.lang.Object) beanPropertyWriter20);
        java.lang.Object obj25 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter20);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor26 = null;
        beanPropertyWriter20.depositSchemaProperty(jsonObjectFormatVisitor26);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = beanPropertyWriter20.unwrappingWriter(nameTransformer28);
        java.lang.Class<?>[] wildcardClassArray30 = beanPropertyWriter20._includeInViews;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter31 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType32 = beanPropertyWriter31._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember33 = beanPropertyWriter31.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType36 = beanPropertyWriter35._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType37 = beanPropertyWriter35._nonTrivialBaseType;
        java.lang.Object obj39 = beanPropertyWriter35.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean40 = beanPropertyWriter35._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer41 = beanPropertyWriter35._serializer;
        java.lang.Object obj42 = beanPropertyWriter31.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter35);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer43 = null;
        beanPropertyWriter31.assignTypeSerializer(typeSerializer43);
        java.lang.reflect.Field field45 = null;
        beanPropertyWriter31._field = field45;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap47 = null;
        beanPropertyWriter31._dynamicSerializers = propertySerializerMap47;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap49 = beanPropertyWriter31._internalSettings;
        beanPropertyWriter20._internalSettings = objMap49;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassArray3);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(wildcardClassArray14);
        org.junit.Assert.assertNull(propertySerializerMap18);
        org.junit.Assert.assertNull(wildcardClassArray19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(wildcardClassArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(beanPropertyWriter29);
        org.junit.Assert.assertNull(wildcardClassArray30);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNull(annotatedMember33);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNull(javaType37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(objJsonSerializer41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objMap49);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter0.unwrappingWriter(nameTransformer7);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(annotatedMember4);
        org.junit.Assert.assertNull(typeSerializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = beanPropertyWriter0._dynamicSerializers;
        java.lang.Class<?>[] wildcardClassArray7 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = null;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap8;
        java.lang.reflect.Method method10 = null;
        beanPropertyWriter0._accessorMethod = method10;
        java.lang.reflect.Method method12 = null;
        beanPropertyWriter0._accessorMethod = method12;
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata15 = beanPropertyWriter0.getMetadata();
        com.fasterxml.jackson.databind.PropertyName propertyName16 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.core.io.SerializedString serializedString17 = beanPropertyWriter0._name;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer18 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer18);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(propertySerializerMap6);
        org.junit.Assert.assertNull(wildcardClassArray7);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(propertyMetadata15);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNull(serializedString17);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter4._cfgSerializationType;
        java.lang.Object obj13 = beanPropertyWriter4._suppressableValue;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass15 = beanPropertyWriter14.getRawSerializationType();
        java.lang.reflect.Field field16 = null;
        beanPropertyWriter14._field = field16;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap18 = null;
        beanPropertyWriter14._internalSettings = objMap18;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = null;
        beanPropertyWriter14._nullSerializer = objJsonSerializer20;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap22 = beanPropertyWriter14._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean24 = beanPropertyWriter23.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName25 = beanPropertyWriter23._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer26 = beanPropertyWriter23._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = beanPropertyWriter23.unwrappingWriter(nameTransformer27);
        boolean boolean29 = beanPropertyWriter28.isUnwrapping();
        boolean boolean30 = beanPropertyWriter28.hasSerializer();
        java.lang.Object obj31 = beanPropertyWriter4.setInternalSetting((java.lang.Object) propertySerializerMap22, (java.lang.Object) beanPropertyWriter28);
        com.fasterxml.jackson.core.io.SerializedString serializedString32 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter28, serializedString32);
        boolean boolean34 = beanPropertyWriter33._suppressNulls;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter33);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(propertySerializerMap22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(propertyName25);
        org.junit.Assert.assertNull(objJsonSerializer26);
        org.junit.Assert.assertNotNull(beanPropertyWriter28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = beanPropertyWriter5.getTypeSerializer();
        java.lang.reflect.Field field7 = beanPropertyWriter5._field;
        java.lang.Object obj8 = beanPropertyWriter5._suppressableValue;
        java.lang.Object obj9 = beanPropertyWriter5.readResolve();
        boolean boolean10 = beanPropertyWriter5.isUnwrapping();
        java.lang.reflect.Field field11 = beanPropertyWriter5._field;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor13 = null;
        beanPropertyWriter12.depositSchemaProperty(jsonObjectFormatVisitor13);
        boolean boolean15 = beanPropertyWriter12.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter12);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType18 = beanPropertyWriter17._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType19 = beanPropertyWriter17._nonTrivialBaseType;
        java.lang.Object obj21 = beanPropertyWriter17.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName22 = beanPropertyWriter17._wrapperName;
        boolean boolean23 = beanPropertyWriter17._suppressNulls;
        com.fasterxml.jackson.core.SerializableString serializableString24 = beanPropertyWriter17.getSerializedName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer25 = null;
        beanPropertyWriter17.assignTypeSerializer(typeSerializer25);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType28 = beanPropertyWriter27._cfgSerializationType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor29 = null;
        beanPropertyWriter27.depositSchemaProperty(jsonObjectFormatVisitor29);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter31 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean32 = beanPropertyWriter31.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName33 = beanPropertyWriter31._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer34 = beanPropertyWriter31._serializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer35 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter36 = beanPropertyWriter31.unwrappingWriter(nameTransformer35);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer37 = beanPropertyWriter36.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType38 = null;
        beanPropertyWriter36.setNonTrivialBaseType(javaType38);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter40 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType41 = beanPropertyWriter40._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember42 = beanPropertyWriter40.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter44 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType45 = beanPropertyWriter44._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType46 = beanPropertyWriter44._nonTrivialBaseType;
        java.lang.Object obj48 = beanPropertyWriter44.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean49 = beanPropertyWriter44._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer50 = beanPropertyWriter44._serializer;
        java.lang.Object obj51 = beanPropertyWriter40.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter44);
        com.fasterxml.jackson.databind.JavaType javaType52 = beanPropertyWriter40._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap53 = beanPropertyWriter40._internalSettings;
        beanPropertyWriter36._internalSettings = objMap53;
        beanPropertyWriter27._internalSettings = objMap53;
        beanPropertyWriter17._internalSettings = objMap53;
        beanPropertyWriter16._internalSettings = objMap53;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider59 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter5.serializeAsElement((java.lang.Object) beanPropertyWriter16, jsonGenerator58, serializerProvider59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(typeSerializer6);
        org.junit.Assert.assertNull(field7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(field11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(propertyName22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(serializableString24);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(propertyName33);
        org.junit.Assert.assertNull(objJsonSerializer34);
        org.junit.Assert.assertNotNull(beanPropertyWriter36);
        org.junit.Assert.assertNull(typeSerializer37);
        org.junit.Assert.assertNull(javaType41);
        org.junit.Assert.assertNull(annotatedMember42);
        org.junit.Assert.assertNull(javaType45);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(objJsonSerializer50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(javaType52);
        org.junit.Assert.assertNotNull(objMap53);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass14 = beanPropertyWriter13.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = beanPropertyWriter13.getMember();
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter13, serializedString16);
        com.fasterxml.jackson.databind.JavaType javaType18 = beanPropertyWriter13._declaredType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer19 = null;
        beanPropertyWriter13.assignSerializer(objJsonSerializer19);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter21._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray23 = beanPropertyWriter21._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap24 = null;
        beanPropertyWriter21._internalSettings = objMap24;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer26 = null;
        beanPropertyWriter21.assignTypeSerializer(typeSerializer26);
        java.lang.reflect.Field field28 = beanPropertyWriter21._field;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType30 = beanPropertyWriter29._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType31 = beanPropertyWriter29._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType32 = beanPropertyWriter29._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember33 = beanPropertyWriter29._member;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer34 = beanPropertyWriter29.getTypeSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer35 = null;
        beanPropertyWriter29.assignNullSerializer(objJsonSerializer35);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer37 = null;
        beanPropertyWriter29.assignNullSerializer(objJsonSerializer37);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType40 = beanPropertyWriter39._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray41 = beanPropertyWriter39._includeInViews;
        boolean boolean42 = beanPropertyWriter39.isVirtual();
        java.lang.Class<?>[] wildcardClassArray43 = beanPropertyWriter39.getViews();
        com.fasterxml.jackson.databind.JavaType javaType44 = beanPropertyWriter39._declaredType;
        com.fasterxml.jackson.databind.util.Annotations annotations45 = beanPropertyWriter39._contextAnnotations;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter46 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType47 = beanPropertyWriter46._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType48 = beanPropertyWriter46._nonTrivialBaseType;
        java.lang.Object obj50 = beanPropertyWriter46.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName51 = beanPropertyWriter46._wrapperName;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector52 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value53 = beanPropertyWriter46.findFormatOverrides(annotationIntrospector52);
        java.lang.Class<?>[] wildcardClassArray54 = beanPropertyWriter46.getViews();
        java.lang.Object obj55 = beanPropertyWriter39.getInternalSetting((java.lang.Object) beanPropertyWriter46);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter56 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType57 = beanPropertyWriter56._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray58 = beanPropertyWriter56._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer59 = null;
        beanPropertyWriter56._serializer = objJsonSerializer59;
        java.lang.Object obj62 = beanPropertyWriter56.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata63 = beanPropertyWriter56._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter64 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType65 = beanPropertyWriter64._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray66 = beanPropertyWriter64._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap67 = null;
        beanPropertyWriter64._internalSettings = objMap67;
        java.lang.Object obj69 = beanPropertyWriter56.removeInternalSetting((java.lang.Object) beanPropertyWriter64);
        com.fasterxml.jackson.annotation.JsonFormat.Value value70 = beanPropertyWriter64._format;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter71 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor72 = null;
        beanPropertyWriter71.depositSchemaProperty(jsonObjectFormatVisitor72);
        boolean boolean74 = beanPropertyWriter71.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter75 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter71);
        java.lang.reflect.Field field76 = beanPropertyWriter71._field;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter77 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass78 = beanPropertyWriter77.getRawSerializationType();
        java.lang.reflect.Field field79 = null;
        beanPropertyWriter77._field = field79;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap81 = null;
        beanPropertyWriter77._internalSettings = objMap81;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer83 = null;
        beanPropertyWriter77._nullSerializer = objJsonSerializer83;
        com.fasterxml.jackson.annotation.JsonFormat.Value value85 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.NO_FORMAT;
        beanPropertyWriter77._format = value85;
        beanPropertyWriter71._format = value85;
        beanPropertyWriter64._format = value85;
        beanPropertyWriter46._format = value85;
        beanPropertyWriter29._format = value85;
        beanPropertyWriter21._format = value85;
        beanPropertyWriter13._format = value85;
        beanPropertyWriter0._format = value85;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(annotatedMember12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(annotatedMember15);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(wildcardClassArray23);
        org.junit.Assert.assertNull(field28);
        org.junit.Assert.assertNull(javaType30);
        org.junit.Assert.assertNull(javaType31);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNull(annotatedMember33);
        org.junit.Assert.assertNull(typeSerializer34);
        org.junit.Assert.assertNull(javaType40);
        org.junit.Assert.assertNull(wildcardClassArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(wildcardClassArray43);
        org.junit.Assert.assertNull(javaType44);
        org.junit.Assert.assertNull(annotations45);
        org.junit.Assert.assertNull(javaType47);
        org.junit.Assert.assertNull(javaType48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(propertyName51);
        org.junit.Assert.assertNull(value53);
        org.junit.Assert.assertNull(wildcardClassArray54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(javaType57);
        org.junit.Assert.assertNull(wildcardClassArray58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(propertyMetadata63);
        org.junit.Assert.assertNull(javaType65);
        org.junit.Assert.assertNull(wildcardClassArray66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(value70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(field76);
        org.junit.Assert.assertNull(wildcardClass78);
        org.junit.Assert.assertNotNull(value85);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter4._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter4.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean9 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter4._serializer;
        java.lang.Object obj11 = beanPropertyWriter0.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter4);
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector13 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value14 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector13);
        com.fasterxml.jackson.databind.JavaType javaType15 = beanPropertyWriter0.getType();
        com.fasterxml.jackson.databind.JavaType javaType16 = beanPropertyWriter0.getType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap17 = null;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap17;
        com.fasterxml.jackson.databind.JavaType javaType19 = beanPropertyWriter0.getType();
        boolean boolean20 = beanPropertyWriter0._suppressNulls;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(annotatedMember2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(value14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = beanPropertyWriter0.unwrappingWriter(nameTransformer5);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = beanPropertyWriter0._wrapperName;
        boolean boolean8 = beanPropertyWriter0.isVirtual();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(beanPropertyWriter6);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean5 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.annotation.JsonFormat.Value value7 = null;
        beanPropertyWriter0._format = value7;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = beanPropertyWriter0._member;
        java.lang.Object obj10 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer12);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        beanPropertyWriter14.assignTypeSerializer(typeSerializer15);
        java.lang.Object obj17 = beanPropertyWriter14._suppressableValue;
        java.lang.Class<?> wildcardClass18 = beanPropertyWriter14.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType19 = beanPropertyWriter14.getType();
        com.fasterxml.jackson.core.io.SerializedString serializedString20 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter14, serializedString20);
        java.lang.Object obj22 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) serializedString20);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer23 = beanPropertyWriter0.getTypeSerializer();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objJsonSerializer6);
        org.junit.Assert.assertNull(annotatedMember9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(typeSerializer23);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor1 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor1);
        boolean boolean3 = beanPropertyWriter0.hasSerializer();
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        java.lang.reflect.Field field2 = null;
        beanPropertyWriter0._field = field2;
        java.lang.reflect.Field field4 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata6 = beanPropertyWriter0.getMetadata();
        java.lang.Object obj7 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = beanPropertyWriter0.unwrappingWriter(nameTransformer9);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = beanPropertyWriter0._nullSerializer;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(field4);
        org.junit.Assert.assertNull(annotatedMember5);
        org.junit.Assert.assertNull(propertyMetadata6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(beanPropertyWriter10);
        org.junit.Assert.assertNull(objJsonSerializer11);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.core.io.SerializedString serializedString5 = beanPropertyWriter0._name;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotatedMember3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(serializedString5);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        java.lang.reflect.Field field2 = null;
        beanPropertyWriter0._field = field2;
        boolean boolean4 = beanPropertyWriter0.isUnwrapping();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter5._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray7 = beanPropertyWriter5._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter5._serializer = objJsonSerializer8;
        java.lang.Object obj11 = beanPropertyWriter5.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata12 = beanPropertyWriter5._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter13._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray15 = beanPropertyWriter13._includeInViews;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap16 = null;
        beanPropertyWriter13._internalSettings = objMap16;
        java.lang.Object obj18 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) beanPropertyWriter13);
        java.lang.Object obj19 = beanPropertyWriter0.removeInternalSetting(obj18);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap20 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer21 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer21;
        boolean boolean23 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.JavaType javaType24 = beanPropertyWriter0._declaredType;
        java.lang.reflect.Field field25 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.JavaType javaType26 = beanPropertyWriter0._cfgSerializationType;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(wildcardClassArray7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(propertyMetadata12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(wildcardClassArray15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(objMap20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(field25);
        org.junit.Assert.assertNull(javaType26);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = null;
        beanPropertyWriter0._serializer = objJsonSerializer3;
        java.lang.Object obj6 = beanPropertyWriter0.getInternalSetting((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.core.io.SerializedString serializedString8 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString8);
        java.lang.reflect.Type type10 = beanPropertyWriter9.getGenericPropertyType();
        boolean boolean11 = beanPropertyWriter9.isUnwrapping();
        java.lang.Class<?> wildcardClass12 = beanPropertyWriter9.getRawSerializationType();
        java.lang.reflect.Method method13 = beanPropertyWriter9._accessorMethod;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(propertySerializerMap7);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(method13);
    }
}

