package com.fasterxml.jackson.databind.ser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = beanPropertyWriter0.toString();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = beanPropertyWriter0.toString();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = beanPropertyWriter0.toString();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0._wrapperName;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName6 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.reflect.Method method3 = beanPropertyWriter0._accessorMethod;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = beanPropertyWriter0.getName();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        java.lang.Class<?>[] wildcardClassArray4 = beanPropertyWriter0.getViews();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = beanPropertyWriter0.getName();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        boolean boolean3 = beanPropertyWriter0.isVirtual();
        java.lang.Class<?>[] wildcardClassArray4 = beanPropertyWriter0.getViews();
        boolean boolean5 = beanPropertyWriter0.isUnwrapping();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass6 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0._member;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = beanPropertyWriter0.toString();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj8 = beanPropertyWriter0.get((java.lang.Object) (short) 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean5 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = beanPropertyWriter0._serializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = beanPropertyWriter0.toString();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = beanPropertyWriter0._nullSerializer;
        boolean boolean5 = beanPropertyWriter0._suppressNulls;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = beanPropertyWriter0.getName();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName16 = beanPropertyWriter4.getFullName();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = beanPropertyWriter0.toString();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass5 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = beanPropertyWriter0.toString();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        boolean boolean4 = beanPropertyWriter0.willSuppressNulls();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = beanPropertyWriter0.toString();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        java.lang.Object obj5 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 0.0f);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = beanPropertyWriter0.getTypeSerializer();
        boolean boolean8 = beanPropertyWriter0.isVirtual();
        java.lang.Object obj9 = beanPropertyWriter0.readResolve();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = beanPropertyWriter0._serializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName4 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = beanPropertyWriter0._wrapperName;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter2 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        java.lang.reflect.Type type3 = beanPropertyWriter2.getGenericPropertyType();
        boolean boolean4 = beanPropertyWriter2.hasSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass5 = beanPropertyWriter2.getPropertyType();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata4 = beanPropertyWriter0._metadata;
        boolean boolean5 = beanPropertyWriter0.hasNullSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        java.lang.reflect.Type type6 = beanPropertyWriter0.getGenericPropertyType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = beanPropertyWriter0.getName();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        boolean boolean3 = beanPropertyWriter0.isVirtual();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        java.lang.reflect.Field field2 = beanPropertyWriter0._field;
        com.fasterxml.jackson.annotation.JsonFormat.Value value3 = beanPropertyWriter0._format;
        java.lang.Class<?>[] wildcardClassArray4 = beanPropertyWriter0.getViews();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = beanPropertyWriter0.getName();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0.getTypeSerializer();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap6 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.annotation.JsonFormat.Value value7 = beanPropertyWriter0._format;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass8 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.reflect.Method method3 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = beanPropertyWriter0.getWrapperName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0._typeSerializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0._typeSerializer;
        boolean boolean6 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter7._cfgSerializationType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter7);
        java.lang.Object obj10 = beanPropertyWriter0.getInternalSetting((java.lang.Object) beanPropertyWriter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass11 = beanPropertyWriter9.getPropertyType();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.reflect.Method method3 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = beanPropertyWriter0.getWrapperName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = beanPropertyWriter0.toString();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.annotation.JsonFormat.Value value6 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.NO_FORMAT;
        beanPropertyWriter0._format = value6;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter2 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        java.lang.reflect.Type type3 = beanPropertyWriter2.getGenericPropertyType();
        boolean boolean4 = beanPropertyWriter2._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter2._declaredType;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = beanPropertyWriter2.toString();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean5 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter7._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = beanPropertyWriter7.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter11._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType13 = beanPropertyWriter11._nonTrivialBaseType;
        java.lang.Object obj15 = beanPropertyWriter11.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean16 = beanPropertyWriter11._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = beanPropertyWriter11._serializer;
        java.lang.Object obj18 = beanPropertyWriter7.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter11);
        com.fasterxml.jackson.databind.JavaType javaType19 = beanPropertyWriter7._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap20 = beanPropertyWriter7._internalSettings;
        beanPropertyWriter0._internalSettings = objMap20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName22 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName4 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.lang.Class<?>[] wildcardClassArray3 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = beanPropertyWriter0._wrapperName;
        boolean boolean5 = beanPropertyWriter0.isVirtual();
        boolean boolean6 = beanPropertyWriter0.isUnwrapping();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata7 = beanPropertyWriter0._metadata;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata3 = beanPropertyWriter0._metadata;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata4 = beanPropertyWriter0._metadata;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass5 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean5 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter7._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = beanPropertyWriter7.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter11._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType13 = beanPropertyWriter11._nonTrivialBaseType;
        java.lang.Object obj15 = beanPropertyWriter11.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean16 = beanPropertyWriter11._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = beanPropertyWriter11._serializer;
        java.lang.Object obj18 = beanPropertyWriter7.setInternalSetting((java.lang.Object) 1, (java.lang.Object) beanPropertyWriter11);
        com.fasterxml.jackson.databind.JavaType javaType19 = beanPropertyWriter7._nonTrivialBaseType;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap20 = beanPropertyWriter7._internalSettings;
        beanPropertyWriter0._internalSettings = objMap20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass22 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata5 = beanPropertyWriter0._metadata;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap6 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = beanPropertyWriter0._member;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = beanPropertyWriter0.toString();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata5 = beanPropertyWriter0._metadata;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap6 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = beanPropertyWriter0._member;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = beanPropertyWriter0.getName();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
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
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.annotation.JsonFormat.Value value16 = beanPropertyWriter0._format;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType18 = beanPropertyWriter17._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType19 = beanPropertyWriter17._nonTrivialBaseType;
        java.lang.Object obj21 = beanPropertyWriter17.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName22 = beanPropertyWriter17._wrapperName;
        boolean boolean23 = beanPropertyWriter17._suppressNulls;
        com.fasterxml.jackson.core.SerializableString serializableString24 = beanPropertyWriter17.getSerializedName();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer25 = beanPropertyWriter17.getSerializer();
        java.lang.Object obj26 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass27 = beanPropertyWriter17.getPropertyType();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata3 = beanPropertyWriter0.getMetadata();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = beanPropertyWriter0.getSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata5 = beanPropertyWriter0._metadata;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap6 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = beanPropertyWriter0._member;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap2 = beanPropertyWriter0._internalSettings;
        java.lang.Class<?>[] wildcardClassArray3 = beanPropertyWriter0._includeInViews;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?>[] wildcardClassArray5 = beanPropertyWriter4.getViews();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata6 = beanPropertyWriter4.getMetadata();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj7 = beanPropertyWriter0.get((java.lang.Object) beanPropertyWriter4);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        boolean boolean3 = beanPropertyWriter0.isVirtual();
        java.lang.Class<?>[] wildcardClassArray4 = beanPropertyWriter0.getViews();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass5 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.reflect.Field field2 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = beanPropertyWriter0.getSerializer();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = beanPropertyWriter0.getMember();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = beanPropertyWriter0.toString();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = beanPropertyWriter0.toString();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata4 = beanPropertyWriter0._metadata;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = beanPropertyWriter0._nullSerializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        java.lang.reflect.Type type6 = beanPropertyWriter0.getGenericPropertyType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap7 = beanPropertyWriter0._internalSettings;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName8 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
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
        java.lang.reflect.Method method14 = beanPropertyWriter0._accessorMethod;
        boolean boolean15 = beanPropertyWriter0.isUnwrapping();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName16 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0._typeSerializer;
        boolean boolean6 = beanPropertyWriter0.hasSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass7 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        java.lang.reflect.Field field2 = beanPropertyWriter0._field;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName13 = beanPropertyWriter4.getFullName();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
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
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = beanPropertyWriter0._nullSerializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName16 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = beanPropertyWriter0.getName();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
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
        com.fasterxml.jackson.databind.PropertyName propertyName16 = beanPropertyWriter4.getWrapperName();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType18 = beanPropertyWriter17._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType19 = beanPropertyWriter17._nonTrivialBaseType;
        java.lang.Object obj21 = beanPropertyWriter17.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata22 = beanPropertyWriter17._metadata;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj23 = beanPropertyWriter4.get((java.lang.Object) beanPropertyWriter17);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter2 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer1 = beanPropertyWriter0.getTypeSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.reflect.Field field2 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0.getSerializationType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName4 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.lang.Class<?>[] wildcardClassArray3 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.PropertyName propertyName4 = beanPropertyWriter0._wrapperName;
        boolean boolean5 = beanPropertyWriter0.isVirtual();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = beanPropertyWriter0.toString();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName3 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0.getType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap4 = beanPropertyWriter0._internalSettings;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass5 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Class<?>[] wildcardClassArray2 = beanPropertyWriter0._includeInViews;
        java.lang.Class<?>[] wildcardClassArray3 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = beanPropertyWriter0.getSerializer();
        com.fasterxml.jackson.core.SerializableString serializableString5 = beanPropertyWriter0.getSerializedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass6 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0.getTypeSerializer();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap6 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.annotation.JsonFormat.Value value7 = beanPropertyWriter0._format;
        boolean boolean8 = beanPropertyWriter0.hasSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = beanPropertyWriter0.toString();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.core.io.SerializedString serializedString5 = beanPropertyWriter0._name;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = beanPropertyWriter0.getTypeSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = beanPropertyWriter0.toString();
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0._member;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
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
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.annotation.JsonFormat.Value value16 = beanPropertyWriter0._format;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType18 = beanPropertyWriter17._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType19 = beanPropertyWriter17._nonTrivialBaseType;
        java.lang.Object obj21 = beanPropertyWriter17.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.PropertyName propertyName22 = beanPropertyWriter17._wrapperName;
        boolean boolean23 = beanPropertyWriter17._suppressNulls;
        com.fasterxml.jackson.core.SerializableString serializableString24 = beanPropertyWriter17.getSerializedName();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer25 = beanPropertyWriter17.getSerializer();
        java.lang.Object obj26 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter17);
        boolean boolean27 = beanPropertyWriter0.hasSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = beanPropertyWriter0.toString();
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter2 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        java.lang.reflect.Type type3 = beanPropertyWriter2.getGenericPropertyType();
        boolean boolean4 = beanPropertyWriter2._suppressNulls;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = beanPropertyWriter2.getName();
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0._typeSerializer;
        boolean boolean6 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter7._cfgSerializationType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter7);
        java.lang.Object obj10 = beanPropertyWriter0.getInternalSetting((java.lang.Object) beanPropertyWriter9);
        boolean boolean11 = beanPropertyWriter9._suppressNulls;
        java.lang.Object obj12 = beanPropertyWriter9._suppressableValue;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata13 = beanPropertyWriter9._metadata;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName14 = beanPropertyWriter9.getFullName();
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?>[] wildcardClassArray1 = beanPropertyWriter0.getViews();
        boolean boolean2 = beanPropertyWriter0.hasSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = beanPropertyWriter0.getName();
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.reflect.Field field2 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0.getSerializationType();
        boolean boolean4 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0._cfgSerializationType;
        boolean boolean6 = beanPropertyWriter0.hasSerializer();
        java.lang.Class<?>[] wildcardClassArray7 = beanPropertyWriter0.getViews();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass8 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType4 = beanPropertyWriter3._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter3._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = beanPropertyWriter3._member;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata7 = beanPropertyWriter3._metadata;
        com.fasterxml.jackson.core.SerializableString serializableString8 = beanPropertyWriter3.getSerializedName();
        java.lang.Object obj9 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter3);
        com.fasterxml.jackson.core.SerializableString serializableString10 = beanPropertyWriter0.getSerializedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = beanPropertyWriter0._nullSerializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass16 = beanPropertyWriter4.getPropertyType();
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.reflect.Field field2 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = beanPropertyWriter0.getSerializer();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = beanPropertyWriter0.getMember();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName6 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.isVirtual();
        java.lang.reflect.Field field2 = beanPropertyWriter0._field;
        com.fasterxml.jackson.annotation.JsonFormat.Value value3 = beanPropertyWriter0._format;
        java.lang.Class<?>[] wildcardClassArray4 = beanPropertyWriter0.getViews();
        java.lang.Class<?> wildcardClass5 = beanPropertyWriter0.getRawSerializationType();
        java.lang.Class<?> wildcardClass6 = beanPropertyWriter0.getRawSerializationType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = beanPropertyWriter0.getName();
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType4 = beanPropertyWriter3._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter3._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = beanPropertyWriter3._member;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata7 = beanPropertyWriter3._metadata;
        com.fasterxml.jackson.core.SerializableString serializableString8 = beanPropertyWriter3.getSerializedName();
        java.lang.Object obj9 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter3);
        com.fasterxml.jackson.core.SerializableString serializableString10 = beanPropertyWriter0.getSerializedName();
        boolean boolean11 = beanPropertyWriter0.isVirtual();
        java.lang.Class<?>[] wildcardClassArray12 = beanPropertyWriter0._includeInViews;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
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
        com.fasterxml.jackson.annotation.JsonFormat.Value value13 = beanPropertyWriter0._format;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = beanPropertyWriter0._wrapperName;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName4 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = beanPropertyWriter0._nullSerializer;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = beanPropertyWriter0.getSerializer();
        boolean boolean8 = beanPropertyWriter0.hasSerializer();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap9 = beanPropertyWriter0._internalSettings;
        java.lang.reflect.Field field10 = beanPropertyWriter0._field;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass11 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
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
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = beanPropertyWriter0._member;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = beanPropertyWriter0.getName();
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        java.lang.Object obj5 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 0.0f);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = beanPropertyWriter0.getTypeSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName8 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0._member;
        java.lang.Object obj5 = beanPropertyWriter0._suppressableValue;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap6 = beanPropertyWriter0._internalSettings;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = beanPropertyWriter0.getName();
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType4 = beanPropertyWriter3._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter3._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = beanPropertyWriter3._member;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata7 = beanPropertyWriter3._metadata;
        com.fasterxml.jackson.core.SerializableString serializableString8 = beanPropertyWriter3.getSerializedName();
        java.lang.Object obj9 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter3);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = beanPropertyWriter3._dynamicSerializers;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = beanPropertyWriter3.isRequired();
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = beanPropertyWriter0._member;
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Class<?> wildcardClass1 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.reflect.Method method3 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = beanPropertyWriter0.getWrapperName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0._typeSerializer;
        boolean boolean6 = beanPropertyWriter0.hasNullSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = beanPropertyWriter0.getName();
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        java.lang.reflect.Field field2 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0.getSerializationType();
        boolean boolean4 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName6 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter2 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        java.lang.reflect.Type type3 = beanPropertyWriter2.getGenericPropertyType();
        boolean boolean4 = beanPropertyWriter2._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter2._declaredType;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = beanPropertyWriter2._dynamicSerializers;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName7 = beanPropertyWriter2.getFullName();
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        boolean boolean5 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = beanPropertyWriter0._serializer;
        boolean boolean7 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = beanPropertyWriter0._wrapperName;
        java.lang.reflect.Type type9 = beanPropertyWriter0.getGenericPropertyType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JavaType javaType1 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj4 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0._typeSerializer;
        com.fasterxml.jackson.annotation.JsonFormat.Value value6 = beanPropertyWriter0._format;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = beanPropertyWriter0.toString();
    }
}

