package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", false, javaType9);
        java.lang.String str11 = asPropertyTypeDeserializer10.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = asPropertyTypeDeserializer10.forProperty(beanProperty12);
        java.lang.String str14 = asPropertyTypeDeserializer10.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer10, beanProperty15);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as17 = asPropertyTypeDeserializer10.getTypeInclusion();
        java.lang.String str18 = asPropertyTypeDeserializer10.toString();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver19 = asPropertyTypeDeserializer10.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as20 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", true, javaType4, as20);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as22 = asPropertyTypeDeserializer21.getTypeInclusion();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(typeDeserializer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str14, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str18, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(typeIdResolver19);
        org.junit.Assert.assertTrue("'" + as20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as22 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as22.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver7 = asPropertyTypeDeserializer5.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5._inclusion;
        java.lang.Class<?> wildcardClass9 = asPropertyTypeDeserializer5.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as10 = asPropertyTypeDeserializer5.getTypeInclusion();
        java.lang.Class<?> wildcardClass11 = asPropertyTypeDeserializer5.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty12);
        java.lang.String str14 = asPropertyTypeDeserializer5.getPropertyName();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as15 = asPropertyTypeDeserializer5._inclusion;
        java.lang.String str16 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = asPropertyTypeDeserializer5._deserializeTypedUsingDefaultImpl(jsonParser17, deserializationContext18, tokenBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver7);
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + as10 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as10.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str14, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str16, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        java.lang.String str9 = asPropertyTypeDeserializer6.getPropertyName();
        java.lang.Class<?> wildcardClass10 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver13 = asPropertyTypeDeserializer6.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer6._inclusion;
        java.lang.Class<?> wildcardClass15 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = asPropertyTypeDeserializer6.forProperty(beanProperty16);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver18 = asPropertyTypeDeserializer6.getTypeIdResolver();
        java.lang.String str19 = asPropertyTypeDeserializer6.getPropertyName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(as11);
        org.junit.Assert.assertNull(as12);
        org.junit.Assert.assertNull(typeIdResolver13);
        org.junit.Assert.assertNull(as14);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeDeserializer17);
        org.junit.Assert.assertNull(typeIdResolver18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        java.lang.String str9 = asPropertyTypeDeserializer6.getPropertyName();
        java.lang.Class<?> wildcardClass10 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver13 = asPropertyTypeDeserializer6.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer6._inclusion;
        java.lang.Class<?> wildcardClass15 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty16);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as18 = asPropertyTypeDeserializer6.getTypeInclusion();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(as11);
        org.junit.Assert.assertNull(as12);
        org.junit.Assert.assertNull(typeIdResolver13);
        org.junit.Assert.assertNull(as14);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(as18);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver17 = asPropertyTypeDeserializer15.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as18 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = asPropertyTypeDeserializer15.forProperty(beanProperty19);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as21 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer22 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", true, javaType9, as21);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4, as21);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as24 = asPropertyTypeDeserializer23.getTypeInclusion();
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = asPropertyTypeDeserializer23.deserializeTypedFromObject(jsonParser25, deserializationContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver17);
        org.junit.Assert.assertTrue("'" + as18 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as18.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer20);
        org.junit.Assert.assertTrue("'" + as21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as24 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as24.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = asPropertyTypeDeserializer5.forProperty(beanProperty6);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver8 = asPropertyTypeDeserializer5.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver10 = asPropertyTypeDeserializer5.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty12);
        java.lang.String str14 = asPropertyTypeDeserializer13.toString();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver15 = asPropertyTypeDeserializer13.getTypeIdResolver();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = asPropertyTypeDeserializer13._deserializeTypedForId(jsonParser16, deserializationContext17, tokenBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDeserializer7);
        org.junit.Assert.assertNull(typeIdResolver8);
        org.junit.Assert.assertTrue("'" + as9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver10);
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str14, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(typeIdResolver15);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer8.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver10 = asPropertyTypeDeserializer8.getTypeIdResolver();
        java.lang.String str11 = asPropertyTypeDeserializer8.getPropertyName();
        java.lang.String str12 = asPropertyTypeDeserializer8.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer8._inclusion;
        java.lang.String str14 = asPropertyTypeDeserializer8.getPropertyName();
        org.junit.Assert.assertNull(as9);
        org.junit.Assert.assertNull(typeIdResolver10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str12, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(as13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "", true, javaType9, as16);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer18 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4, as16);
        java.lang.Class<?> wildcardClass19 = asPropertyTypeDeserializer18.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as20 = asPropertyTypeDeserializer18._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as21 = asPropertyTypeDeserializer18.getTypeInclusion();
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + as20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = asPropertyTypeDeserializer5.forProperty(beanProperty6);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty9);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = asPropertyTypeDeserializer5.getTypeIdResolver();
        java.lang.Class<?> wildcardClass12 = asPropertyTypeDeserializer5.getDefaultImpl();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = asPropertyTypeDeserializer5.deserializeTypedFromScalar(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDeserializer7);
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver11);
        org.junit.Assert.assertNull(wildcardClass12);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver7 = asPropertyTypeDeserializer6.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer6.getTypeInclusion();
        java.lang.String str9 = asPropertyTypeDeserializer6.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty10);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver12 = asPropertyTypeDeserializer6.getTypeIdResolver();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = asPropertyTypeDeserializer6.deserializeTypedFromObject(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(typeIdResolver7);
        org.junit.Assert.assertNull(as8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str9, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(typeIdResolver12);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver16 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType15, typeIdResolver16, "hi!", false, javaType19);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as21 = asPropertyTypeDeserializer20.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty22 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer20, beanProperty22);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as24 = asPropertyTypeDeserializer23.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "", true, javaType14, as24);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer26 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "", false, javaType9, as24);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4, as24);
        com.fasterxml.jackson.databind.BeanProperty beanProperty28 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer29 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer27, beanProperty28);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = asPropertyTypeDeserializer27.deserializeTypedFromArray(jsonParser30, deserializationContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as24 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as24.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver16 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType15, typeIdResolver16, "hi!", false, javaType19);
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer22 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer20, beanProperty21);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as23 = asPropertyTypeDeserializer20._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer24 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType14, as23);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType9, as23);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer26 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4, as23);
        java.lang.String str27 = asPropertyTypeDeserializer26.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty28 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer29 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer26, beanProperty28);
        org.junit.Assert.assertTrue("'" + as23 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as23.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5._inclusion;
        java.lang.Class<?> wildcardClass7 = asPropertyTypeDeserializer5.getDefaultImpl();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = asPropertyTypeDeserializer5._deserializeTypedUsingDefaultImpl(jsonParser8, deserializationContext9, tokenBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        java.lang.String str7 = asPropertyTypeDeserializer6.getPropertyName();
        java.lang.String str8 = asPropertyTypeDeserializer6.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = asPropertyTypeDeserializer6.forProperty(beanProperty9);
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer6._inclusion;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(typeDeserializer10);
        org.junit.Assert.assertNull(as13);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver7 = asPropertyTypeDeserializer5.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5._inclusion;
        java.lang.String str9 = asPropertyTypeDeserializer5.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty10);
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer11, beanProperty12);
        java.lang.String str14 = asPropertyTypeDeserializer11.getPropertyName();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as15 = asPropertyTypeDeserializer11._inclusion;
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver7);
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str9, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str14, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver16 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType15, typeIdResolver16, "hi!", true, javaType19);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as21 = asPropertyTypeDeserializer20.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer22 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "hi!", false, javaType14, as21);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "", false, javaType9, as21);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as24 = asPropertyTypeDeserializer23.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4, as24);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext27 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = asPropertyTypeDeserializer25._deserializeTypedUsingDefaultImpl(jsonParser26, deserializationContext27, tokenBuffer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as24 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as24.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", false, javaType9);
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer10, beanProperty11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = asPropertyTypeDeserializer10.forProperty(beanProperty14);
        java.lang.String str16 = asPropertyTypeDeserializer10.toString();
        java.lang.Class<?> wildcardClass17 = asPropertyTypeDeserializer10.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as18 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer19 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4, as18);
        java.lang.Class<?> wildcardClass20 = asPropertyTypeDeserializer19.getDefaultImpl();
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str16, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + as18 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as18.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass20);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = asPropertyTypeDeserializer6.forProperty(beanProperty7);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver9 = asPropertyTypeDeserializer6.getTypeIdResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = asPropertyTypeDeserializer6.baseTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDeserializer8);
        org.junit.Assert.assertNull(typeIdResolver9);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as7 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5._inclusion;
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "hi!", true, javaType14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as17 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as18 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as19 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as20 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "", false, javaType9, as20);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as22 = asPropertyTypeDeserializer21._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", false, javaType4, as22);
        java.lang.Class<?> wildcardClass24 = asPropertyTypeDeserializer23.getClass();
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as18 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as18.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as19 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as19.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as22 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as22.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", false, javaType9);
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer10, beanProperty11);
        java.lang.Class<?> wildcardClass13 = asPropertyTypeDeserializer10.getDefaultImpl();
        java.lang.String str14 = asPropertyTypeDeserializer10.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as15 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4, as15);
        java.lang.Class<?> wildcardClass17 = asPropertyTypeDeserializer16.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty18 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer19 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer16, beanProperty18);
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer19, beanProperty20);
        com.fasterxml.jackson.databind.BeanProperty beanProperty22 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer23 = asPropertyTypeDeserializer19.forProperty(beanProperty22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = asPropertyTypeDeserializer19.deserializeTypedFromScalar(jsonParser24, deserializationContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str14, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(typeDeserializer23);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty7);
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty9);
        java.lang.String str11 = asPropertyTypeDeserializer10.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer10, beanProperty12);
        java.lang.Class<?> wildcardClass14 = asPropertyTypeDeserializer10.getClass();
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "hi!", false, javaType14);
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = asPropertyTypeDeserializer15.forProperty(beanProperty16);
        java.lang.String str18 = asPropertyTypeDeserializer15.getPropertyName();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as19 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType9, as19);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as21 = asPropertyTypeDeserializer20.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty22 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer23 = asPropertyTypeDeserializer20.forProperty(beanProperty22);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as24 = asPropertyTypeDeserializer20._inclusion;
        java.lang.String str25 = asPropertyTypeDeserializer20.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty26 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = asPropertyTypeDeserializer20.forProperty(beanProperty26);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as28 = asPropertyTypeDeserializer20.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer29 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", true, javaType4, as28);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as30 = asPropertyTypeDeserializer29._inclusion;
        org.junit.Assert.assertNotNull(typeDeserializer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + as19 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as19.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer23);
        org.junit.Assert.assertTrue("'" + as24 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as24.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str25, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNotNull(typeDeserializer27);
        org.junit.Assert.assertTrue("'" + as28 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as28.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as30 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as30.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver7 = asPropertyTypeDeserializer6.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer6.getTypeInclusion();
        java.lang.String str9 = asPropertyTypeDeserializer6.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty10);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver12 = asPropertyTypeDeserializer6.getTypeIdResolver();
        com.fasterxml.jackson.databind.BeanProperty beanProperty13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = asPropertyTypeDeserializer6.forProperty(beanProperty13);
        java.lang.String str15 = asPropertyTypeDeserializer6.getPropertyName();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer6.getTypeInclusion();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = asPropertyTypeDeserializer6._deserializeTypedForId(jsonParser17, deserializationContext18, tokenBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(typeIdResolver7);
        org.junit.Assert.assertNull(as8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str9, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(typeIdResolver12);
        org.junit.Assert.assertNotNull(typeDeserializer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(as16);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        java.lang.String str9 = asPropertyTypeDeserializer6.getPropertyName();
        java.lang.Class<?> wildcardClass10 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer6._inclusion;
        java.lang.Class<?> wildcardClass12 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver13 = asPropertyTypeDeserializer6.getTypeIdResolver();
        java.lang.Class<?> wildcardClass14 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty15);
        com.fasterxml.jackson.databind.BeanProperty beanProperty17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = asPropertyTypeDeserializer6.forProperty(beanProperty17);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(as11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(typeIdResolver13);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(typeDeserializer18);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", false, javaType9);
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer10, beanProperty11);
        java.lang.Class<?> wildcardClass13 = asPropertyTypeDeserializer10.getDefaultImpl();
        java.lang.String str14 = asPropertyTypeDeserializer10.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as15 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4, as15);
        java.lang.String str17 = asPropertyTypeDeserializer16.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty18 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer19 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer16, beanProperty18);
        java.lang.String str20 = asPropertyTypeDeserializer19.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer22 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer19, beanProperty21);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = asPropertyTypeDeserializer19.deserializeTypedFromScalar(jsonParser23, deserializationContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str14, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str17, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str20, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5._inclusion;
        java.lang.String str7 = asPropertyTypeDeserializer5.toString();
        java.lang.String str8 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = asPropertyTypeDeserializer5.forProperty(beanProperty10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = asPropertyTypeDeserializer5._deserializeTypedUsingDefaultImpl(jsonParser12, deserializationContext13, tokenBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str7, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str8, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer11);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", true, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as7 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = asPropertyTypeDeserializer5.forProperty(beanProperty10);
        java.lang.String str12 = asPropertyTypeDeserializer5.toString();
        java.lang.Class<?> wildcardClass13 = asPropertyTypeDeserializer5.getDefaultImpl();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = asPropertyTypeDeserializer5.deserializeTypedFromScalar(jsonParser14, deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str12, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(wildcardClass13);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", true, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer12.getTypeInclusion();
        java.lang.String str14 = asPropertyTypeDeserializer12.getPropertyName();
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer7 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty6);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = asPropertyTypeDeserializer5.forProperty(beanProperty9);
        java.lang.String str11 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty12);
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty14);
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = asPropertyTypeDeserializer5.forProperty(beanProperty16);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = asPropertyTypeDeserializer5.deserializeTypedFromArray(jsonParser18, deserializationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNotNull(typeDeserializer17);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", false, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer10, beanProperty12);
        java.lang.Class<?> wildcardClass14 = asPropertyTypeDeserializer13.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer13, beanProperty15);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as17 = asPropertyTypeDeserializer13.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as18 = asPropertyTypeDeserializer13.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer19 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", false, javaType4, as18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as20 = asPropertyTypeDeserializer19.getTypeInclusion();
        java.lang.Class<?> wildcardClass21 = asPropertyTypeDeserializer19.getDefaultImpl();
        java.lang.Class<?> wildcardClass22 = asPropertyTypeDeserializer19.getDefaultImpl();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver23 = asPropertyTypeDeserializer19.getTypeIdResolver();
        com.fasterxml.jackson.core.JsonParser jsonParser24 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = asPropertyTypeDeserializer19._deserializeTypedUsingDefaultImpl(jsonParser24, deserializationContext25, tokenBuffer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + as17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as18 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as18.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertNull(typeIdResolver23);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer8.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer8, beanProperty10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = asPropertyTypeDeserializer8.deserializeTypedFromObject(jsonParser12, deserializationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as7 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer6.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = asPropertyTypeDeserializer6.forProperty(beanProperty9);
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = asPropertyTypeDeserializer6.forProperty(beanProperty11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = asPropertyTypeDeserializer6.deserializeTypedFromObject(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(as7);
        org.junit.Assert.assertNull(as8);
        org.junit.Assert.assertNotNull(typeDeserializer10);
        org.junit.Assert.assertNotNull(typeDeserializer12);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer8.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer8, beanProperty10);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer8.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer8.getTypeInclusion();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = asPropertyTypeDeserializer8._deserializeTypedUsingDefaultImpl(jsonParser14, deserializationContext15, tokenBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        java.lang.String str9 = asPropertyTypeDeserializer6.getPropertyName();
        java.lang.Class<?> wildcardClass10 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver13 = asPropertyTypeDeserializer6.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer6._inclusion;
        java.lang.Class<?> wildcardClass15 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty16);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as18 = asPropertyTypeDeserializer17._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer17, beanProperty19);
        java.lang.String str21 = asPropertyTypeDeserializer20.getPropertyName();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = asPropertyTypeDeserializer20.deserializeTypedFromObject(jsonParser22, deserializationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(as11);
        org.junit.Assert.assertNull(as12);
        org.junit.Assert.assertNull(typeIdResolver13);
        org.junit.Assert.assertNull(as14);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(as18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        java.lang.String str9 = asPropertyTypeDeserializer6.getPropertyName();
        java.lang.Class<?> wildcardClass10 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver13 = asPropertyTypeDeserializer6.getTypeIdResolver();
        java.lang.String str14 = asPropertyTypeDeserializer6.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty15);
        java.lang.Class<?> wildcardClass17 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver18 = asPropertyTypeDeserializer6.getTypeIdResolver();
        java.lang.String str19 = asPropertyTypeDeserializer6.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer21 = asPropertyTypeDeserializer6.forProperty(beanProperty20);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as22 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer24 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty23);
        java.lang.Class<?> wildcardClass25 = asPropertyTypeDeserializer24.getDefaultImpl();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(as11);
        org.junit.Assert.assertNull(as12);
        org.junit.Assert.assertNull(typeIdResolver13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str14, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNull(typeIdResolver18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(typeDeserializer21);
        org.junit.Assert.assertNull(as22);
        org.junit.Assert.assertNull(wildcardClass25);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver16 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver21 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType20, typeIdResolver21, "hi!", false, javaType24);
        java.lang.String str26 = asPropertyTypeDeserializer25.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty27 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer28 = asPropertyTypeDeserializer25.forProperty(beanProperty27);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as29 = asPropertyTypeDeserializer25.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer30 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType15, typeIdResolver16, "", false, javaType19, as29);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer31 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType14, as29);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer32 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "", false, javaType9, as29);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer33 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", true, javaType4, as29);
        com.fasterxml.jackson.databind.BeanProperty beanProperty34 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer35 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer33, beanProperty34);
        com.fasterxml.jackson.core.JsonParser jsonParser36 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = asPropertyTypeDeserializer35._deserializeTypedUsingDefaultImpl(jsonParser36, deserializationContext37, tokenBuffer38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(typeDeserializer28);
        org.junit.Assert.assertTrue("'" + as29 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as29.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", false, javaType9);
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = asPropertyTypeDeserializer10.forProperty(beanProperty11);
        java.lang.String str13 = asPropertyTypeDeserializer10.getPropertyName();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4, as14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = asPropertyTypeDeserializer15.forProperty(beanProperty17);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as19 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as20 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as21 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = asPropertyTypeDeserializer15.deserializeTypedFromObject(jsonParser22, deserializationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDeserializer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + as14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer18);
        org.junit.Assert.assertTrue("'" + as19 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as19.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver16 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver21 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType20, typeIdResolver21, "hi!", true, javaType24);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as26 = asPropertyTypeDeserializer25.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType15, typeIdResolver16, "hi!", false, javaType19, as26);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer28 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "", false, javaType14, as26);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as29 = asPropertyTypeDeserializer28.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer30 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "", true, javaType9, as29);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer31 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4, as29);
        org.junit.Assert.assertTrue("'" + as26 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as26.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as29 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as29.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "hi!", true, javaType14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "", true, javaType9, as16);
        com.fasterxml.jackson.databind.BeanProperty beanProperty18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = asPropertyTypeDeserializer17.forProperty(beanProperty18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as20 = asPropertyTypeDeserializer17.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", false, javaType4, as20);
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer19);
        org.junit.Assert.assertTrue("'" + as20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        java.lang.Class<?> wildcardClass7 = asPropertyTypeDeserializer6.getDefaultImpl();
        java.lang.Class<?> wildcardClass8 = asPropertyTypeDeserializer6.getDefaultImpl();
        java.lang.Class<?> wildcardClass9 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = asPropertyTypeDeserializer6.forProperty(beanProperty10);
        java.lang.Class<?> wildcardClass12 = asPropertyTypeDeserializer6.getDefaultImpl();
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeDeserializer11);
        org.junit.Assert.assertNull(wildcardClass12);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        java.lang.String str9 = asPropertyTypeDeserializer6.getPropertyName();
        java.lang.Class<?> wildcardClass10 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver13 = asPropertyTypeDeserializer6.getTypeIdResolver();
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty14);
        java.lang.Class<?> wildcardClass16 = asPropertyTypeDeserializer15.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty17 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer18 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer15, beanProperty17);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(as11);
        org.junit.Assert.assertNull(as12);
        org.junit.Assert.assertNull(typeIdResolver13);
        org.junit.Assert.assertNull(wildcardClass16);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "hi!", false, javaType14);
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer15, beanProperty16);
        java.lang.Class<?> wildcardClass18 = asPropertyTypeDeserializer15.getDefaultImpl();
        java.lang.String str19 = asPropertyTypeDeserializer15.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as20 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType9, as20);
        java.lang.Class<?> wildcardClass22 = asPropertyTypeDeserializer21.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as23 = asPropertyTypeDeserializer21.getTypeInclusion();
        java.lang.Class<?> wildcardClass24 = asPropertyTypeDeserializer21.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as25 = asPropertyTypeDeserializer21.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer26 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", false, javaType4, as25);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as27 = asPropertyTypeDeserializer26.getTypeInclusion();
        java.lang.String str28 = asPropertyTypeDeserializer26.getPropertyName();
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str19, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + as23 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as23.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + as25 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as25.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as27 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as27.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer7 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty6);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5._inclusion;
        java.lang.String str9 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as10 = asPropertyTypeDeserializer5.getTypeInclusion();
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str9, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as10 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as10.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty7);
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = asPropertyTypeDeserializer5.forProperty(beanProperty9);
        java.lang.String str11 = asPropertyTypeDeserializer5.getPropertyName();
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver16 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType15, typeIdResolver16, "hi!", true, javaType19);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as21 = asPropertyTypeDeserializer20.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as22 = asPropertyTypeDeserializer20._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as23 = asPropertyTypeDeserializer20._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as24 = asPropertyTypeDeserializer20.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty25 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer26 = asPropertyTypeDeserializer20.forProperty(beanProperty25);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as27 = asPropertyTypeDeserializer20.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer28 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType14, as27);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as29 = asPropertyTypeDeserializer28.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer30 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "", true, javaType9, as29);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer31 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as29);
        org.junit.Assert.assertTrue("'" + as21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as22 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as22.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as23 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as23.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as24 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as24.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer26);
        org.junit.Assert.assertTrue("'" + as27 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as27.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as29 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as29.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType9);
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = asPropertyTypeDeserializer10.forProperty(beanProperty11);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver13 = asPropertyTypeDeserializer10.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4, as14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer15.getTypeInclusion();
        org.junit.Assert.assertNotNull(typeDeserializer12);
        org.junit.Assert.assertNull(typeIdResolver13);
        org.junit.Assert.assertTrue("'" + as14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        java.lang.String str6 = asPropertyTypeDeserializer5.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = asPropertyTypeDeserializer5.forProperty(beanProperty7);
        java.lang.String str9 = asPropertyTypeDeserializer5.toString();
        java.lang.Class<?> wildcardClass10 = asPropertyTypeDeserializer5.getDefaultImpl();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = asPropertyTypeDeserializer5.getTypeIdResolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(typeDeserializer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str9, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(typeIdResolver11);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer7 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty6);
        java.lang.Class<?> wildcardClass8 = asPropertyTypeDeserializer5.getDefaultImpl();
        java.lang.String str9 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as10 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer5.getTypeInclusion();
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str9, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as10 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as10.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver12 = asPropertyTypeDeserializer10.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer10._inclusion;
        java.lang.Class<?> wildcardClass14 = asPropertyTypeDeserializer10.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer10, beanProperty15);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as17 = asPropertyTypeDeserializer16._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer18 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4, as17);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as19 = asPropertyTypeDeserializer18.getTypeInclusion();
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver12);
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + as17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as19 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as19.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", true, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer12.getTypeInclusion();
        java.lang.Class<?> wildcardClass14 = asPropertyTypeDeserializer12.getDefaultImpl();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = asPropertyTypeDeserializer12._deserializeTypedForId(jsonParser15, deserializationContext16, tokenBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass14);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", true, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4, as11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer12.getTypeInclusion();
        java.lang.String str14 = asPropertyTypeDeserializer12.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer12, beanProperty15);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as17 = asPropertyTypeDeserializer16.getTypeInclusion();
        java.lang.String str18 = asPropertyTypeDeserializer16.getPropertyName();
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str14, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "hi!", true, javaType14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as17 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer18 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "", false, javaType9, as17);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer19 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4, as17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = asPropertyTypeDeserializer19.baseTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver7 = asPropertyTypeDeserializer5.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5._inclusion;
        java.lang.Class<?> wildcardClass9 = asPropertyTypeDeserializer5.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty10);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer11._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer11.getTypeInclusion();
        java.lang.String str14 = asPropertyTypeDeserializer11.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer11, beanProperty15);
        java.lang.String str17 = asPropertyTypeDeserializer11.getPropertyName();
        java.lang.Class<?> wildcardClass18 = asPropertyTypeDeserializer11.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = asPropertyTypeDeserializer11.forProperty(beanProperty19);
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver7);
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + as12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str14, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str17, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(typeDeserializer20);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver16 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType15, typeIdResolver16, "hi!", false, javaType19);
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer22 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer20, beanProperty21);
        java.lang.Class<?> wildcardClass23 = asPropertyTypeDeserializer20.getDefaultImpl();
        java.lang.String str24 = asPropertyTypeDeserializer20.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as25 = asPropertyTypeDeserializer20.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer26 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "", false, javaType14, as25);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType9, as25);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer28 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4, as25);
        com.fasterxml.jackson.databind.BeanProperty beanProperty29 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer30 = asPropertyTypeDeserializer28.forProperty(beanProperty29);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str24, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as25 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as25.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer30);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = asPropertyTypeDeserializer5.forProperty(beanProperty6);
        java.lang.String str8 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty9);
        java.lang.Class<?> wildcardClass11 = asPropertyTypeDeserializer10.getDefaultImpl();
        org.junit.Assert.assertNotNull(typeDeserializer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str8, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(wildcardClass11);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        java.lang.String str7 = asPropertyTypeDeserializer6.getPropertyName();
        java.lang.String str8 = asPropertyTypeDeserializer6.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = asPropertyTypeDeserializer6.forProperty(beanProperty9);
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer6.getTypeInclusion();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(typeDeserializer10);
        org.junit.Assert.assertNull(as13);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", false, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer10, beanProperty12);
        java.lang.Class<?> wildcardClass14 = asPropertyTypeDeserializer13.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer13, beanProperty15);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver17 = asPropertyTypeDeserializer13.getTypeIdResolver();
        com.fasterxml.jackson.databind.BeanProperty beanProperty18 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer19 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer13, beanProperty18);
        java.lang.Class<?> wildcardClass20 = asPropertyTypeDeserializer13.getDefaultImpl();
        java.lang.Class<?> wildcardClass21 = asPropertyTypeDeserializer13.getDefaultImpl();
        java.lang.String str22 = asPropertyTypeDeserializer13.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as23 = asPropertyTypeDeserializer13._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer24 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", false, javaType4, as23);
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(typeIdResolver17);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str22, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as23 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as23.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer6._inclusion;
        java.lang.Class<?> wildcardClass10 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver12 = asPropertyTypeDeserializer6.getTypeIdResolver();
        java.lang.Class<?> wildcardClass13 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver14 = asPropertyTypeDeserializer6.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as15 = asPropertyTypeDeserializer6.getTypeInclusion();
        java.lang.String str16 = asPropertyTypeDeserializer6.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty17 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer18 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty17);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = asPropertyTypeDeserializer18._deserializeTypedForId(jsonParser19, deserializationContext20, tokenBuffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(as9);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(as11);
        org.junit.Assert.assertNull(typeIdResolver12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(typeIdResolver14);
        org.junit.Assert.assertNull(as15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str16, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", true, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as7 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as10 = asPropertyTypeDeserializer5._inclusion;
        java.lang.Class<?> wildcardClass11 = asPropertyTypeDeserializer5.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = asPropertyTypeDeserializer5.forProperty(beanProperty12);
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = asPropertyTypeDeserializer15.deserializeTypedFromAny(jsonParser17, deserializationContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as10 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as10.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeDeserializer13);
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer7 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty6);
        java.lang.Class<?> wildcardClass8 = asPropertyTypeDeserializer5.getDefaultImpl();
        java.lang.String str9 = asPropertyTypeDeserializer5.toString();
        java.lang.String str10 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = asPropertyTypeDeserializer5.getTypeIdResolver();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty12);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = asPropertyTypeDeserializer5._deserializeTypedUsingDefaultImpl(jsonParser14, deserializationContext15, tokenBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str9, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str10, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(typeIdResolver11);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty7);
        java.lang.Class<?> wildcardClass9 = asPropertyTypeDeserializer8.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer8, beanProperty10);
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer8, beanProperty12);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver14 = asPropertyTypeDeserializer8.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as15 = asPropertyTypeDeserializer8._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer8, beanProperty16);
        com.fasterxml.jackson.databind.BeanProperty beanProperty18 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer19 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer17, beanProperty18);
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(typeIdResolver14);
        org.junit.Assert.assertTrue("'" + as15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4);
        java.lang.String str6 = asPropertyTypeDeserializer5.getPropertyName();
        java.lang.String str7 = asPropertyTypeDeserializer5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = asPropertyTypeDeserializer5.baseTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str7, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "hi!", false, javaType14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", true, javaType9, as16);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer18 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", false, javaType4, as16);
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer18, beanProperty19);
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer22 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer18, beanProperty21);
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", true, javaType4, as11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer12.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver14 = asPropertyTypeDeserializer12.getTypeIdResolver();
        java.lang.String str15 = asPropertyTypeDeserializer12.toString();
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str15, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as7 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer9 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty8);
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "hi!", false, javaType14);
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = asPropertyTypeDeserializer15.forProperty(beanProperty16);
        java.lang.String str18 = asPropertyTypeDeserializer15.getPropertyName();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as19 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType9, as19);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as21 = asPropertyTypeDeserializer20.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty22 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer23 = asPropertyTypeDeserializer20.forProperty(beanProperty22);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as24 = asPropertyTypeDeserializer20._inclusion;
        java.lang.String str25 = asPropertyTypeDeserializer20.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty26 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = asPropertyTypeDeserializer20.forProperty(beanProperty26);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as28 = asPropertyTypeDeserializer20.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer29 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", true, javaType4, as28);
        java.lang.Class<?> wildcardClass30 = as28.getClass();
        org.junit.Assert.assertNotNull(typeDeserializer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + as19 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as19.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer23);
        org.junit.Assert.assertTrue("'" + as24 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as24.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str25, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNotNull(typeDeserializer27);
        org.junit.Assert.assertTrue("'" + as28 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as28.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty7);
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = asPropertyTypeDeserializer8.forProperty(beanProperty9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer8.getTypeInclusion();
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer10);
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        java.lang.String str9 = asPropertyTypeDeserializer6.getPropertyName();
        java.lang.Class<?> wildcardClass10 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer6.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty12);
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = asPropertyTypeDeserializer15.deserializeTypedFromAny(jsonParser16, deserializationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(as11);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        java.lang.Class<?> wildcardClass7 = asPropertyTypeDeserializer6.getDefaultImpl();
        java.lang.Class<?> wildcardClass8 = asPropertyTypeDeserializer6.getDefaultImpl();
        java.lang.String str9 = asPropertyTypeDeserializer6.getPropertyName();
        java.lang.String str10 = asPropertyTypeDeserializer6.toString();
        java.lang.String str11 = asPropertyTypeDeserializer6.getPropertyName();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver13 = asPropertyTypeDeserializer6.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer6._inclusion;
        java.lang.String str15 = asPropertyTypeDeserializer6.getPropertyName();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver16 = asPropertyTypeDeserializer6.getTypeIdResolver();
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str10, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(as12);
        org.junit.Assert.assertNull(typeIdResolver13);
        org.junit.Assert.assertNull(as14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(typeIdResolver16);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer8.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer8, beanProperty10);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer8.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer8.getTypeInclusion();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = asPropertyTypeDeserializer8._deserializeTypedForId(jsonParser14, deserializationContext15, tokenBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = asPropertyTypeDeserializer5.forProperty(beanProperty6);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver8 = asPropertyTypeDeserializer5.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver10 = asPropertyTypeDeserializer5.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer5._inclusion;
        org.junit.Assert.assertNotNull(typeDeserializer7);
        org.junit.Assert.assertNull(typeIdResolver8);
        org.junit.Assert.assertTrue("'" + as9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver10);
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer7 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty6);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = asPropertyTypeDeserializer5.forProperty(beanProperty9);
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer12.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver14 = asPropertyTypeDeserializer12.getTypeIdResolver();
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer10);
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver14);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty7);
        java.lang.Class<?> wildcardClass9 = asPropertyTypeDeserializer8.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer8, beanProperty10);
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer8, beanProperty12);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = asPropertyTypeDeserializer8.deserializeTypedFromArray(jsonParser14, deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver16 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType15, typeIdResolver16, "hi!", false, javaType19);
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer22 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer20, beanProperty21);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as23 = asPropertyTypeDeserializer20._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer24 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType14, as23);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", false, javaType9, as23);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as26 = asPropertyTypeDeserializer25._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4, as26);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as28 = asPropertyTypeDeserializer27.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty29 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer30 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer27, beanProperty29);
        org.junit.Assert.assertTrue("'" + as23 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as23.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as26 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as26.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as28 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as28.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver12 = asPropertyTypeDeserializer10.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer14 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4, as13);
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = asPropertyTypeDeserializer14.forProperty(beanProperty15);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = asPropertyTypeDeserializer14.deserializeTypedFromAny(jsonParser17, deserializationContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver12);
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer16);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", true, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4, as14);
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5._inclusion;
        java.lang.String str7 = asPropertyTypeDeserializer5.getPropertyName();
        java.lang.Class<?> wildcardClass8 = asPropertyTypeDeserializer5.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty9);
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = asPropertyTypeDeserializer5.forProperty(beanProperty11);
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str7, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(typeDeserializer12);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        java.lang.String str9 = asPropertyTypeDeserializer6.getPropertyName();
        java.lang.Class<?> wildcardClass10 = asPropertyTypeDeserializer6.getDefaultImpl();
        java.lang.String str11 = asPropertyTypeDeserializer6.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty12);
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer13, beanProperty14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer13._inclusion;
        java.lang.String str17 = asPropertyTypeDeserializer13.getPropertyName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(as16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty13 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer14 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer10, beanProperty13);
        java.lang.String str15 = asPropertyTypeDeserializer10.getPropertyName();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as17 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer18 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4, as17);
        java.lang.String str19 = asPropertyTypeDeserializer18.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer21 = asPropertyTypeDeserializer18.forProperty(beanProperty20);
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str15, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str19, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNotNull(typeDeserializer21);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver12 = asPropertyTypeDeserializer10.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer10._inclusion;
        java.lang.Class<?> wildcardClass14 = asPropertyTypeDeserializer10.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as15 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", true, javaType4, as16);
        java.lang.String str18 = asPropertyTypeDeserializer17.toString();
        java.lang.Class<?> wildcardClass19 = asPropertyTypeDeserializer17.getDefaultImpl();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = asPropertyTypeDeserializer17._deserializeTypedForId(jsonParser20, deserializationContext21, tokenBuffer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver12);
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + as15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str18, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(wildcardClass19);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        java.lang.Class<?> wildcardClass7 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver8 = asPropertyTypeDeserializer6.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as10 = asPropertyTypeDeserializer6.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer6.getTypeInclusion();
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(typeIdResolver8);
        org.junit.Assert.assertNull(as9);
        org.junit.Assert.assertNull(as10);
        org.junit.Assert.assertNull(as11);
        org.junit.Assert.assertNull(as12);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver7 = asPropertyTypeDeserializer5.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5._inclusion;
        java.lang.String str9 = asPropertyTypeDeserializer5.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty10);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer11.getTypeInclusion();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = asPropertyTypeDeserializer11.deserializeTypedFromArray(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver7);
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str9, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        java.lang.String str6 = asPropertyTypeDeserializer5.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = asPropertyTypeDeserializer5.forProperty(beanProperty7);
        java.lang.String str9 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty10);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer5.getTypeInclusion();
        java.lang.String str13 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty14);
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty16);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver18 = asPropertyTypeDeserializer17.getTypeIdResolver();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = asPropertyTypeDeserializer17.deserializeTypedFromObject(jsonParser19, deserializationContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(typeDeserializer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str9, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str13, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(typeIdResolver18);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = asPropertyTypeDeserializer5.forProperty(beanProperty6);
        java.lang.String str8 = asPropertyTypeDeserializer5.getPropertyName();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver9 = asPropertyTypeDeserializer5.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as10 = asPropertyTypeDeserializer5.getTypeInclusion();
        java.lang.String str11 = asPropertyTypeDeserializer5.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty12);
        org.junit.Assert.assertNotNull(typeDeserializer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(typeIdResolver9);
        org.junit.Assert.assertTrue("'" + as10 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as10.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType14);
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = asPropertyTypeDeserializer15.forProperty(beanProperty16);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver18 = asPropertyTypeDeserializer15.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as19 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "", true, javaType9, as19);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as21 = asPropertyTypeDeserializer20._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer22 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4, as21);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = asPropertyTypeDeserializer22.deserializeTypedFromScalar(jsonParser23, deserializationContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDeserializer17);
        org.junit.Assert.assertNull(typeIdResolver18);
        org.junit.Assert.assertTrue("'" + as19 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as19.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver7 = asPropertyTypeDeserializer5.getTypeIdResolver();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer9 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty8);
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = asPropertyTypeDeserializer5.forProperty(beanProperty10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = asPropertyTypeDeserializer5.deserializeTypedFromObject(jsonParser12, deserializationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver7);
        org.junit.Assert.assertNotNull(typeDeserializer11);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver16 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver21 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType20, typeIdResolver21, "hi!", false, javaType24);
        com.fasterxml.jackson.databind.BeanProperty beanProperty26 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer25, beanProperty26);
        java.lang.Class<?> wildcardClass28 = asPropertyTypeDeserializer25.getDefaultImpl();
        java.lang.String str29 = asPropertyTypeDeserializer25.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as30 = asPropertyTypeDeserializer25._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty31 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer32 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer25, beanProperty31);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as33 = asPropertyTypeDeserializer25._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer34 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType15, typeIdResolver16, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType19, as33);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer35 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType14, as33);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer36 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType9, as33);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer37 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", true, javaType4, as33);
        java.lang.String str38 = asPropertyTypeDeserializer37.getPropertyName();
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str29, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as30 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as30.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as33 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as33.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer8.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer8, beanProperty10);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer8.getTypeInclusion();
        java.lang.String str13 = asPropertyTypeDeserializer8.getPropertyName();
        java.lang.Class<?> wildcardClass14 = asPropertyTypeDeserializer8.getDefaultImpl();
        java.lang.Class<?> wildcardClass15 = asPropertyTypeDeserializer8.getDefaultImpl();
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardClass15);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer6._inclusion;
        java.lang.Class<?> wildcardClass10 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer6._inclusion;
        java.lang.Class<?> wildcardClass12 = asPropertyTypeDeserializer6.getDefaultImpl();
        java.lang.Class<?> wildcardClass13 = asPropertyTypeDeserializer6.getClass();
        org.junit.Assert.assertNull(as9);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(as11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        java.lang.String str6 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as7 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5.getTypeInclusion();
        java.lang.Class<?> wildcardClass9 = asPropertyTypeDeserializer5.getDefaultImpl();
        java.lang.String str10 = asPropertyTypeDeserializer5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str10, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty7);
        java.lang.Class<?> wildcardClass9 = asPropertyTypeDeserializer8.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = asPropertyTypeDeserializer8.forProperty(beanProperty10);
        java.lang.String str12 = asPropertyTypeDeserializer8.getPropertyName();
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeDeserializer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer7 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty6);
        java.lang.Class<?> wildcardClass8 = asPropertyTypeDeserializer5.getDefaultImpl();
        java.lang.String str9 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as10 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty11);
        java.lang.Class<?> wildcardClass13 = asPropertyTypeDeserializer5.getDefaultImpl();
        java.lang.Class<?> wildcardClass14 = asPropertyTypeDeserializer5.getDefaultImpl();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver15 = asPropertyTypeDeserializer5.getTypeIdResolver();
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str9, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as10 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as10.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(typeIdResolver15);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        java.lang.Class<?> wildcardClass6 = asPropertyTypeDeserializer5.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as7 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = asPropertyTypeDeserializer5._deserializeTypedUsingDefaultImpl(jsonParser8, deserializationContext9, tokenBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + as7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "hi!", false, javaType14);
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = asPropertyTypeDeserializer15.forProperty(beanProperty16);
        java.lang.String str18 = asPropertyTypeDeserializer15.getPropertyName();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as19 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", false, javaType9, as19);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as19);
        java.lang.Class<?> wildcardClass22 = asPropertyTypeDeserializer21.getClass();
        org.junit.Assert.assertNotNull(typeDeserializer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + as19 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as19.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        java.lang.Class<?> wildcardClass7 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer6.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer6._inclusion;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = as9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(as8);
        org.junit.Assert.assertNull(as9);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", true, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4, as11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer12.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer12._inclusion;
        java.lang.String str15 = asPropertyTypeDeserializer12.getPropertyName();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer12.getTypeInclusion();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = asPropertyTypeDeserializer12.deserializeTypedFromScalar(jsonParser17, deserializationContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver7 = asPropertyTypeDeserializer5.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5._inclusion;
        java.lang.Class<?> wildcardClass9 = asPropertyTypeDeserializer5.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty10);
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty12);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as15 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = asPropertyTypeDeserializer5.forProperty(beanProperty16);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = asPropertyTypeDeserializer5.deserializeTypedFromArray(jsonParser18, deserializationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver7);
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + as14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer17);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10._inclusion;
        java.lang.String str12 = asPropertyTypeDeserializer10.toString();
        java.lang.String str13 = asPropertyTypeDeserializer10.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as15 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4, as15);
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver17 = asPropertyTypeDeserializer16.getTypeIdResolver();
        com.fasterxml.jackson.databind.BeanProperty beanProperty18 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer19 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer16, beanProperty18);
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str12, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str13, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver17);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", true, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4, as11);
        java.lang.String str13 = asPropertyTypeDeserializer12.getPropertyName();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer12._inclusion;
        java.lang.String str15 = asPropertyTypeDeserializer12.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer12, beanProperty16);
        com.fasterxml.jackson.databind.BeanProperty beanProperty18 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer19 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer12, beanProperty18);
        java.lang.Class<?> wildcardClass20 = asPropertyTypeDeserializer19.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer22 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer19, beanProperty21);
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + as14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str15, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(wildcardClass20);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as9 = asPropertyTypeDeserializer6.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = asPropertyTypeDeserializer6.forProperty(beanProperty10);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer6._inclusion;
        java.lang.String str14 = asPropertyTypeDeserializer6.getPropertyName();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver15 = asPropertyTypeDeserializer6.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer6._inclusion;
        java.lang.String str17 = asPropertyTypeDeserializer6.getPropertyName();
        java.lang.String str18 = asPropertyTypeDeserializer6.getPropertyName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = asPropertyTypeDeserializer6.baseTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(as9);
        org.junit.Assert.assertNotNull(typeDeserializer11);
        org.junit.Assert.assertNull(as12);
        org.junit.Assert.assertNull(as13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(typeIdResolver15);
        org.junit.Assert.assertNull(as16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", true, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as15 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", false, javaType4, as15);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as17 = asPropertyTypeDeserializer16.getTypeInclusion();
        java.lang.String str18 = asPropertyTypeDeserializer16.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer16, beanProperty19);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as21 = asPropertyTypeDeserializer20._inclusion;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = asPropertyTypeDeserializer20.deserializeTypedFromObject(jsonParser22, deserializationContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + as21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4);
        java.lang.String str6 = asPropertyTypeDeserializer5.toString();
        java.lang.String str7 = asPropertyTypeDeserializer5.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer9 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = asPropertyTypeDeserializer5.deserializeTypedFromArray(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", false, javaType4);
        java.lang.Class<?> wildcardClass6 = asPropertyTypeDeserializer5.getDefaultImpl();
        java.lang.Class<?> wildcardClass7 = asPropertyTypeDeserializer5.getDefaultImpl();
        java.lang.String str8 = asPropertyTypeDeserializer5.getPropertyName();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "hi!", true, javaType14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", false, javaType9, as16);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as18 = asPropertyTypeDeserializer17.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer19 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", true, javaType4, as18);
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer19, beanProperty20);
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as18 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as18.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5._inclusion;
        java.lang.String str7 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = asPropertyTypeDeserializer5.deserializeTypedFromAny(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str7, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        java.lang.String str9 = asPropertyTypeDeserializer6.getPropertyName();
        java.lang.Class<?> wildcardClass10 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer6._inclusion;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver13 = asPropertyTypeDeserializer6.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer6._inclusion;
        java.lang.Class<?> wildcardClass15 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = asPropertyTypeDeserializer6.forProperty(beanProperty16);
        java.lang.String str18 = asPropertyTypeDeserializer6.toString();
        java.lang.Class<?> wildcardClass19 = asPropertyTypeDeserializer6.getDefaultImpl();
        java.lang.String str20 = asPropertyTypeDeserializer6.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(as11);
        org.junit.Assert.assertNull(as12);
        org.junit.Assert.assertNull(typeIdResolver13);
        org.junit.Assert.assertNull(as14);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeDeserializer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str18, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str20, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        java.lang.String str6 = asPropertyTypeDeserializer5.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = asPropertyTypeDeserializer5.forProperty(beanProperty7);
        java.lang.String str9 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty10);
        java.lang.String str12 = asPropertyTypeDeserializer11.getPropertyName();
        java.lang.String str13 = asPropertyTypeDeserializer11.toString();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver14 = asPropertyTypeDeserializer11.getTypeIdResolver();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = asPropertyTypeDeserializer11.forProperty(beanProperty15);
        java.lang.Class<?> wildcardClass17 = asPropertyTypeDeserializer11.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as18 = asPropertyTypeDeserializer11.getTypeInclusion();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = asPropertyTypeDeserializer11.deserializeTypedFromArray(jsonParser19, deserializationContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(typeDeserializer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str9, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str13, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertNull(typeIdResolver14);
        org.junit.Assert.assertNotNull(typeDeserializer16);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + as18 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as18.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4);
        java.lang.String str6 = asPropertyTypeDeserializer5.toString();
        java.lang.String str7 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty9);
        java.lang.String str11 = asPropertyTypeDeserializer5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str7, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", false, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer13 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer10, beanProperty12);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer13.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer13, beanProperty15);
        java.lang.String str17 = asPropertyTypeDeserializer16.getPropertyName();
        java.lang.Class<?> wildcardClass18 = asPropertyTypeDeserializer16.getDefaultImpl();
        java.lang.String str19 = asPropertyTypeDeserializer16.toString();
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer16, beanProperty20);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as22 = asPropertyTypeDeserializer16.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", true, javaType4, as22);
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str19, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as22 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as22.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver16 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType15, typeIdResolver16, "hi!", false, javaType19);
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer22 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer20, beanProperty21);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as23 = asPropertyTypeDeserializer20._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer24 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType14, as23);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType9, as23);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer26 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", false, javaType4, as23);
        java.lang.Class<?> wildcardClass27 = asPropertyTypeDeserializer26.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as28 = asPropertyTypeDeserializer26.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver29 = asPropertyTypeDeserializer26.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as30 = asPropertyTypeDeserializer26._inclusion;
        org.junit.Assert.assertTrue("'" + as23 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as23.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + as28 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as28.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver29);
        org.junit.Assert.assertTrue("'" + as30 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as30.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", true, javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer10.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as13 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as14 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as15 = asPropertyTypeDeserializer10._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", false, javaType4, as15);
        java.lang.Class<?> wildcardClass17 = as15.getClass();
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "hi!", true, javaType14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as17 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as18 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as19 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as20 = asPropertyTypeDeserializer15._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "", false, javaType9, as20);
        com.fasterxml.jackson.databind.BeanProperty beanProperty22 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer21, beanProperty22);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as24 = asPropertyTypeDeserializer21.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4, as24);
        com.fasterxml.jackson.databind.BeanProperty beanProperty26 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = asPropertyTypeDeserializer25.forProperty(beanProperty26);
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as18 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as18.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as19 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as19.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as24 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as24.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer27);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        java.lang.Class<?> wildcardClass7 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver8 = asPropertyTypeDeserializer6.getTypeIdResolver();
        java.lang.Class<?> wildcardClass9 = asPropertyTypeDeserializer6.getDefaultImpl();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = asPropertyTypeDeserializer6._deserializeTypedForId(jsonParser10, deserializationContext11, tokenBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(typeIdResolver8);
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver16 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType15, typeIdResolver16, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType19);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as21 = asPropertyTypeDeserializer20._inclusion;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer22 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "", true, javaType14, as21);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "hi!", false, javaType9, as21);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer24 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", false, javaType4, as21);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as25 = asPropertyTypeDeserializer24.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty26 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer24, beanProperty26);
        com.fasterxml.jackson.core.JsonParser jsonParser28 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = asPropertyTypeDeserializer27.deserializeTypedFromScalar(jsonParser28, deserializationContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as25 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as25.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver11 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer15 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType10, typeIdResolver11, "hi!", false, javaType14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as16 = asPropertyTypeDeserializer15.getTypeInclusion();
        com.fasterxml.jackson.databind.BeanProperty beanProperty17 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer18 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer15, beanProperty17);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as19 = asPropertyTypeDeserializer18.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer20 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType5, typeIdResolver6, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType9, as19);
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4, as19);
        com.fasterxml.jackson.databind.BeanProperty beanProperty22 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer23 = asPropertyTypeDeserializer21.forProperty(beanProperty22);
        com.fasterxml.jackson.databind.BeanProperty beanProperty24 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer21, beanProperty24);
        com.fasterxml.jackson.databind.BeanProperty beanProperty26 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = asPropertyTypeDeserializer25.forProperty(beanProperty26);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as28 = asPropertyTypeDeserializer25._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty29 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer30 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer25, beanProperty29);
        com.fasterxml.jackson.databind.BeanProperty beanProperty31 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer32 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer30, beanProperty31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = asPropertyTypeDeserializer30.baseTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as19 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as19.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer23);
        org.junit.Assert.assertNotNull(typeDeserializer27);
        org.junit.Assert.assertTrue("'" + as28 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as28.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]", true, javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = asPropertyTypeDeserializer5.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver7 = asPropertyTypeDeserializer5.getTypeIdResolver();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5._inclusion;
        java.lang.Class<?> wildcardClass9 = asPropertyTypeDeserializer5.getDefaultImpl();
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer11 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty10);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty13 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer14 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty13);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as15 = asPropertyTypeDeserializer14.getTypeInclusion();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver16 = asPropertyTypeDeserializer14.getTypeIdResolver();
        org.junit.Assert.assertTrue("'" + as6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver7);
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + as12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertTrue("'" + as15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNull(typeIdResolver16);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = asPropertyTypeDeserializer5.forProperty(beanProperty6);
        java.lang.String str8 = asPropertyTypeDeserializer5.getPropertyName();
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver9 = asPropertyTypeDeserializer5.getTypeIdResolver();
        java.lang.String str10 = asPropertyTypeDeserializer5.getPropertyName();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as11 = asPropertyTypeDeserializer5.getTypeInclusion();
        java.lang.String str12 = asPropertyTypeDeserializer5.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty13 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer14 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty13);
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = asPropertyTypeDeserializer14.forProperty(beanProperty15);
        org.junit.Assert.assertNotNull(typeDeserializer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(typeIdResolver9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + as11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(typeDeserializer16);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer5 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "hi!", false, javaType4);
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer7 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty6);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as8 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = asPropertyTypeDeserializer5.forProperty(beanProperty9);
        java.lang.String str11 = asPropertyTypeDeserializer5.toString();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as12 = asPropertyTypeDeserializer5._inclusion;
        com.fasterxml.jackson.databind.BeanProperty beanProperty13 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer14 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer5, beanProperty13);
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = asPropertyTypeDeserializer14.forProperty(beanProperty15);
        java.lang.String str17 = asPropertyTypeDeserializer14.getPropertyName();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = asPropertyTypeDeserializer14.deserializeTypedFromArray(jsonParser18, deserializationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + as8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertTrue("'" + as12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY + "'", as12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
        org.junit.Assert.assertNotNull(typeDeserializer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver1 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer6 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(javaType0, typeIdResolver1, "", true, javaType4, as5);
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer8 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer6, beanProperty7);
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer10 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer8, beanProperty9);
        java.lang.String str11 = asPropertyTypeDeserializer10.toString();
        java.lang.String str12 = asPropertyTypeDeserializer10.getPropertyName();
        com.fasterxml.jackson.databind.BeanProperty beanProperty13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = asPropertyTypeDeserializer10.forProperty(beanProperty13);
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer10, beanProperty15);
        com.fasterxml.jackson.databind.BeanProperty beanProperty17 = null;
        com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer asPropertyTypeDeserializer18 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(asPropertyTypeDeserializer16, beanProperty17);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = asPropertyTypeDeserializer16.deserializeTypedFromScalar(jsonParser19, deserializationContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]" + "'", str11, "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(typeDeserializer14);
    }
}

