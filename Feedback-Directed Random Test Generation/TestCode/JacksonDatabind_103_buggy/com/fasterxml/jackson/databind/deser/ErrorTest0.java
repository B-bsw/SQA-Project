package com.fasterxml.jackson.databind.deser;

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
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = impl1.isUnknownTypeSerializer(objJsonSerializer2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = impl1.getTypeFactory();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale2 = impl1.getLocale();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = impl0.getTypeFactory();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = impl0.hasSerializationFeatures((int) (byte) -1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone3 = impl0.getTimeZone();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = impl0.getTypeFactory();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = impl0.getTypeFactory();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone2 = impl0.getTimeZone();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale3 = defaultSerializerProvider2.getLocale();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = impl1.getAnnotationIntrospector();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = impl1.canOverrideAccessModifiers();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = defaultSerializerProvider2.getAnnotationIntrospector();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        java.lang.Class<?> wildcardClass3 = defaultSerializerProvider2.getActiveView();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = defaultSerializerProvider2.getConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = defaultSerializerProvider2.hasSerializationFeatures((int) (byte) -1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = impl0.getAnnotationIntrospector();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = impl0.getDefaultNullKeySerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = impl0.getTypeFactory();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl1.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone3 = impl1.getTimeZone();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "java.lang.Short[?]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale5 = impl0.getLocale();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        java.lang.Class<?> wildcardClass3 = impl0.getActiveView();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = impl0.getAnnotationIntrospector();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl1.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = impl1.canOverrideAccessModifiers();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = impl0.getDefaultNullKeySerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = impl0.hasSerializationFeatures(16);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale3 = impl0.getLocale();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        java.lang.Class<?> wildcardClass3 = defaultSerializerProvider2.getActiveView();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = defaultSerializerProvider2.getGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = defaultSerializerProvider2.canOverrideAccessModifiers();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        int int3 = defaultSerializerProvider2.cachedSerializersCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = defaultSerializerProvider2.getTypeFactory();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = impl1.getDefaultNullValueSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale3 = impl1.getLocale();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = impl0.getTypeFactory();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider5 = impl0.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale6 = defaultSerializerProvider5.getLocale();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl1.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = impl1.getAnnotationIntrospector();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider3 = impl0.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale4 = defaultSerializerProvider3.getLocale();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = impl0.getConfig();
        com.fasterxml.jackson.databind.cfg.MapperConfig<?> wildcardMapperConfig5 = impl0.getConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = impl0.canOverrideAccessModifiers();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = impl0.getAnnotationIntrospector();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        java.lang.Class<?> wildcardClass3 = defaultSerializerProvider2.getActiveView();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = defaultSerializerProvider2.canOverrideAccessModifiers();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider4 = impl0.copy();
        java.lang.Class<?> wildcardClass5 = defaultSerializerProvider4.getSerializationView();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = defaultSerializerProvider4.isUnknownTypeSerializer(objJsonSerializer6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone4 = impl0.getTimeZone();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider5 = impl0.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = defaultSerializerProvider5.getAnnotationIntrospector();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        impl0.flushCachedSerializers();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl0.getDefaultNullKeySerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = impl0.getTypeFactory();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator1 = impl0.getGenerator();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl2);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = impl3.getDefaultNullValueSerializer();
        impl0.setDefaultKeySerializer(objJsonSerializer4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale6 = impl0.getLocale();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator1 = impl0.getGenerator();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone3 = impl0.getTimeZone();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider3 = impl0.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone4 = defaultSerializerProvider3.getTimeZone();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl1.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = defaultSerializerProvider2.canOverrideAccessModifiers();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider4 = impl0.copy();
        java.lang.Class<?> wildcardClass5 = defaultSerializerProvider4.getSerializationView();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = defaultSerializerProvider4.getAnnotationIntrospector();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = impl1.getDefaultNullValueSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = impl1.getGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale4 = impl1.getLocale();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = com.fasterxml.jackson.databind.JsonMappingException.from((com.fasterxml.jackson.databind.SerializerProvider) impl0, "java.lang.Short[?]");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider5 = impl0.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = defaultSerializerProvider5.getTypeFactory();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = impl1.canOverrideAccessModifiers();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone2 = defaultSerializerProvider1.getTimeZone();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        java.lang.Class<?> wildcardClass3 = defaultSerializerProvider2.getActiveView();
        java.lang.String str4 = com.fasterxml.jackson.databind.util.ClassUtil.nullOrToString((java.lang.Object) defaultSerializerProvider2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = defaultSerializerProvider2.getTypeFactory();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = impl0.getGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = impl0.getTypeFactory();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = impl0.getDefaultNullKeySerializer();
        int int4 = impl0.cachedSerializersCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone5 = impl0.getTimeZone();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        int int3 = defaultSerializerProvider2.cachedSerializersCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = defaultSerializerProvider2.hasSerializationFeatures(5);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider4 = impl0.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = defaultSerializerProvider4.getDefaultNullKeySerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = defaultSerializerProvider4.getAnnotationIntrospector();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = impl0.getAnnotationIntrospector();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = impl0.getGenerator();
        impl0.flushCachedSerializers();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale5 = impl0.getLocale();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider1 = impl0.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = defaultSerializerProvider1.getDefaultNullKeySerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = defaultSerializerProvider1.hasSerializationFeatures((int) '#');
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl0.copy();
        int int3 = defaultSerializerProvider2.cachedSerializersCount();
        java.lang.Class<?> wildcardClass4 = defaultSerializerProvider2.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider5 = defaultSerializerProvider2.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = defaultSerializerProvider5.getTypeFactory();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl1.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone3 = defaultSerializerProvider2.getTimeZone();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider4 = impl0.copy();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = defaultSerializerProvider4.getDefaultNullKeySerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = defaultSerializerProvider4.canOverrideAccessModifiers();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(impl0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = impl1.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = impl1.getAnnotationIntrospector();
    }
}

