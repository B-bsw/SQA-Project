package com.fasterxml.jackson.databind.type;

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
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = typeFactory0.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType6 = collectionLikeType4.withContentValueHandler((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.ClassStack classStack1 = null;
        java.lang.reflect.GenericArrayType genericArrayType2 = null;
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean4 = simpleType3.isContainerType();
        java.lang.Class<?> wildcardClass5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType7 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType3, javaType6);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = simpleType3.getBindings();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._fromArrayType(classStack1, genericArrayType2, typeBindings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeBindings8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = typeFactory0.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.JavaType javaType0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.StringBuilder stringBuilder1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder2 = javaType0.getErasedSignature(stringBuilder1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaType0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isEnumType();
        java.lang.String str2 = simpleType0.toCanonical();
        boolean boolean3 = simpleType0.isPrimitive();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.Enum" + "'", str2, "java.lang.Enum");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.containedType((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = javaType3.isInterface();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        org.junit.Assert.assertNotNull(typeBindings0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean2 = simpleType1.isThrowable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withContentType((com.fasterxml.jackson.databind.JavaType) simpleType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Simple types have no content types; can not call withContentType()");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        java.lang.StringBuilder stringBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder6 = collectionLikeType4.getErasedSignature(stringBuilder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getReferencedType();
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder3 = simpleType0.getErasedSignature(stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList1 = simpleType0.getInterfaces();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleType0.serializeWithType(jsonGenerator2, serializerProvider3, typeSerializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaTypeList1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = collectionLikeType4.withTypeHandler((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        java.lang.Class<?> wildcardClass3 = simpleType0.getClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getReferencedType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = javaType1.useStaticType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = collectionLikeType4.getBindings();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType6 = collectionLikeType4.withStaticTyping();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeFactory0.classForName("[collection-like type; class long, contains null]", true, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [collection-like type; class long, contains null]");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        java.lang.String str5 = collectionLikeType4.toString();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        // The following exception was thrown during execution in test generation
        try {
            collectionLikeType4.serialize(jsonGenerator6, serializerProvider7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[collection-like type; class long, contains null]" + "'", str5, "[collection-like type; class long, contains null]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings1 = simpleType0.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.getSuperClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = javaType2.isAbstract();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(typeBindings1);
        org.junit.Assert.assertNull(javaType2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getReferencedType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = javaType1.hasGenericTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.databind.JavaType javaType0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.String str1 = javaType0.toCanonical();
        org.junit.Assert.assertNotNull(javaType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.Object" + "'", str1, "java.lang.Object");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = simpleType0.getBindings();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleType0.serializeWithType(jsonGenerator3, serializerProvider4, typeSerializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(typeBindings2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = collectionLikeType4.getBindings();
        boolean boolean6 = collectionLikeType4.isTrueCollectionType();
        boolean boolean7 = collectionLikeType4.isContainerType();
        java.lang.StringBuilder stringBuilder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder9 = collectionLikeType4.getErasedSignature(stringBuilder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType4 = javaType2.withContentValueHandler((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Simple types have no content types; can not call withContenValueHandler()");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isEnumType();
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.getContentType();
        boolean boolean3 = simpleType0.isInterface();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = simpleType0.getTypeHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(genericDeclaration2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        java.lang.String str5 = collectionLikeType4.toString();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            collectionLikeType4.serializeWithType(jsonGenerator6, serializerProvider7, typeSerializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[collection-like type; class long, contains null]" + "'", str5, "[collection-like type; class long, contains null]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = collectionLikeType4.getContentValueHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.databind.JavaType javaType0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType1 = javaType0.getReferencedType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType3 = javaType1.containedTypeOrUnknown((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaType0);
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isPrimitive();
        java.lang.String str2 = simpleType0.toCanonical();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.Enum" + "'", str2, "java.lang.Enum");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.getSuperClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = collectionLikeType4.getBindings();
        boolean boolean6 = collectionLikeType4.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionLikeType4.getContentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement8 = javaType7.getValueHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getReferencedType();
        boolean boolean2 = simpleType0.isAbstract();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.getReferencedType();
        boolean boolean4 = simpleType0.isThrowable();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType5 = collectionLikeType4.withStaticTyping();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isEnumType();
        java.lang.String str2 = simpleType0.toCanonical();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray3 = simpleType0.getTypeHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.Enum" + "'", str2, "java.lang.Enum");
        org.junit.Assert.assertNull(javaTypeArray3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList2 = simpleType0.getInterfaces();
        java.lang.Class<?> wildcardClass3 = javaTypeList2.getClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaTypeList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isPrimitive();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleType0.serialize(jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList1 = simpleType0.getInterfaces();
        boolean boolean2 = simpleType0.isJavaLangObject();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList3 = simpleType0.getInterfaces();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList4 = simpleType0.getInterfaces();
        boolean boolean5 = simpleType0.hasContentType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaTypeList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(javaTypeList3);
        org.junit.Assert.assertNotNull(javaTypeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        boolean boolean1 = simpleType0.isEnumType();
        boolean boolean2 = simpleType0.isReferenceType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isPrimitive();
        boolean boolean2 = simpleType0.isThrowable();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        java.lang.String str1 = simpleType0.getErasedSignature();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ljava/lang/String;" + "'", str1, "Ljava/lang/String;");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        java.lang.Class<?> wildcardClass1 = simpleType0.getRawClass();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList2 = simpleType0.getInterfaces();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(javaTypeList2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        java.lang.String str1 = simpleType0.toCanonical();
        boolean boolean2 = simpleType0.hasHandlers();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.Enum" + "'", str1, "java.lang.Enum");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        java.util.Collection<com.fasterxml.jackson.databind.JavaType> javaTypeCollection1 = simpleType0.getValueHandler();
        java.lang.String str2 = simpleType0.getTypeName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaTypeCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[simple type, class java.lang.Comparable]" + "'", str2, "[simple type, class java.lang.Comparable]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getReferencedType();
        boolean boolean2 = simpleType0.isThrowable();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = collectionLikeType4.getBindings();
        boolean boolean6 = collectionLikeType4.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionLikeType4.getContentType();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType9 = collectionLikeType4.withValueHandler(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        boolean boolean1 = simpleType0.isEnumType();
        boolean boolean2 = simpleType0.isThrowable();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getReferencedType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList2 = simpleType0.getInterfaces();
        boolean boolean3 = simpleType0.isPrimitive();
        java.lang.String str4 = simpleType0.getTypeName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(javaTypeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[simple type, class java.lang.Enum]" + "'", str4, "[simple type, class java.lang.Enum]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.databind.JavaType javaType0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType0);
        boolean boolean2 = javaType0.isConcrete();
        org.junit.Assert.assertNotNull(javaType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str6 = simpleType0.containedTypeName(0);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = simpleType0.getBindings();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = simpleType0.getBindings();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(typeBindings7);
        org.junit.Assert.assertNotNull(typeBindings8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str5 = simpleType0.toCanonical();
        com.fasterxml.jackson.databind.JavaType javaType6 = simpleType0.getReferencedType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = javaType6.getContentTypeHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeFactory0.findClass("long<java.lang.Object>");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: long<java.lang.Object>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str5 = simpleType0.toCanonical();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList6 = simpleType0.getInterfaces();
        java.lang.Class<?> wildcardClass7 = javaTypeList6.getClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
        org.junit.Assert.assertNotNull(javaTypeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getReferencedType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList2 = simpleType0.getInterfaces();
        boolean boolean3 = simpleType0.isArrayType();
        com.fasterxml.jackson.databind.JavaType javaType5 = simpleType0.containedType((int) (byte) 100);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(javaTypeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList2 = simpleType0.getInterfaces();
        boolean boolean3 = simpleType0.hasGenericTypes();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaTypeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.String str1 = simpleType0.toCanonical();
        boolean boolean2 = simpleType0.isThrowable();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "long" + "'", str1, "long");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = collectionLikeType4.getContentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = javaType5.getContentValueHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) 'a');
        java.lang.reflect.Type type3 = simpleType0.getValueHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = collectionLikeType4.getBindings();
        boolean boolean6 = collectionLikeType4.isEnumType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isEnumType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        boolean boolean5 = simpleType0.isPrimitive();
        com.fasterxml.jackson.databind.JsonSerializable jsonSerializable6 = simpleType0.getValueHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonSerializable6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        java.lang.String str5 = collectionLikeType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = collectionLikeType4.getContentTypeHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[collection-like type; class long, contains null]" + "'", str5, "[collection-like type; class long, contains null]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        java.lang.String str1 = simpleType0.toCanonical();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = simpleType2.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType2.getSuperClass();
        boolean boolean5 = simpleType2.hasValueHandler();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType6 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, (com.fasterxml.jackson.databind.JavaType) simpleType2);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            collectionLikeType6.serializeWithType(jsonGenerator7, serializerProvider8, typeSerializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.Enum" + "'", str1, "java.lang.Enum");
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.containedType(1);
        java.lang.String str5 = simpleType0.containedTypeName((int) (byte) 1);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isConcrete();
        java.lang.String str2 = simpleType0.getGenericSignature();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList3 = simpleType0.getInterfaces();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ljava/lang/Enum;" + "'", str2, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(javaTypeList3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        com.fasterxml.jackson.databind.JavaType javaType5 = simpleType0.getKeyType();
        com.fasterxml.jackson.databind.JavaType javaType6 = simpleType0.withStaticTyping();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(javaType6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        boolean boolean1 = simpleType0.isEnumType();
        java.lang.String str3 = simpleType0.containedTypeName(100);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = simpleType0.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType0.containedTypeOrUnknown((int) (short) 10);
        com.fasterxml.jackson.databind.JavaType javaType6 = simpleType0.containedTypeOrUnknown((-1));
        boolean boolean7 = simpleType0.isThrowable();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isEnumType();
        java.util.Collection<com.fasterxml.jackson.databind.JavaType> javaTypeCollection2 = simpleType0.getTypeHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaTypeCollection2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings1 = simpleType0.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.getSuperClass();
        java.lang.Class<?> wildcardClass3 = simpleType0.getRawClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(typeBindings1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.type.TypeParser typeParser2 = typeFactory1._parser;
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeFactory1.classForName("[simple type, class java.lang.Object]", false, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [simple type, class java/lang/Object]");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeParser2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isFinal();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.containedType((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = javaType3.isEnumType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        java.lang.String str1 = simpleType0.toCanonical();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = simpleType2.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType2.getSuperClass();
        boolean boolean5 = simpleType2.hasValueHandler();
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType6 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, (com.fasterxml.jackson.databind.JavaType) simpleType2);
        java.lang.Class<?> wildcardClass7 = simpleType2.getParameterSource();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = simpleType2.getTypeHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.Enum" + "'", str1, "java.lang.Enum");
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(typeBindings3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(typeFactory8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.containedType((int) (short) 1);
        boolean boolean4 = simpleType0.isMapLikeType();
        boolean boolean5 = simpleType0.isMapLikeType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.type.ClassStack classStack2 = null;
        java.lang.reflect.ParameterizedType parameterizedType3 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory1._fromParamType(classStack2, parameterizedType3, typeBindings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.String str1 = simpleType0.toString();
        boolean boolean2 = simpleType0.isAbstract();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[simple type, class long]" + "'", str1, "[simple type, class long]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getReferencedType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList2 = simpleType0.getInterfaces();
        boolean boolean3 = simpleType0.isPrimitive();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings4 = simpleType0.getBindings();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(javaTypeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(typeBindings4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getReferencedType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = javaType1.isFinal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        java.lang.String str5 = collectionLikeType4.toString();
        boolean boolean6 = collectionLikeType4.useStaticType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[collection-like type; class long, contains null]" + "'", str5, "[collection-like type; class long, contains null]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = simpleType0.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType0.containedTypeOrUnknown((int) (short) 10);
        boolean boolean5 = javaType4.hasGenericTypes();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.containedType(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList4 = javaType3.getInterfaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        java.lang.Object obj1 = simpleType0.getContentTypeHandler();
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType3 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType2);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = collectionLikeType4.getBindings();
        boolean boolean6 = collectionLikeType4.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionLikeType4.getContentType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = collectionLikeType4.hasHandlers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.containedTypeOrUnknown((int) '4');
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.getSuperClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType4 = javaType3.getReferencedType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        java.lang.Class<?> wildcardClass1 = simpleType0.getRawClass();
        boolean boolean2 = simpleType0.isCollectionLikeType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isEnumType();
        java.lang.String str2 = simpleType0.getTypeName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[simple type, class java.lang.Enum]" + "'", str2, "[simple type, class java.lang.Enum]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isThrowable();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.containedTypeOrUnknown((int) (short) 100);
        java.lang.StringBuilder stringBuilder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder5 = javaType3.getErasedSignature(stringBuilder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getReferencedType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleType0.serialize(jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str5 = simpleType0.toCanonical();
        boolean boolean6 = simpleType0.isConcrete();
        java.lang.String str7 = simpleType0.getGenericSignature();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "J;" + "'", str7, "J;");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        boolean boolean5 = simpleType0.isPrimitive();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str5 = simpleType0.toCanonical();
        java.lang.String str7 = simpleType0.containedTypeName(0);
        boolean boolean8 = simpleType0.isArrayType();
        boolean boolean9 = simpleType0.isFinal();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str5 = simpleType0.toCanonical();
        boolean boolean6 = simpleType0.isConcrete();
        com.fasterxml.jackson.core.type.ResolvedType resolvedType7 = simpleType0.getValueHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(resolvedType7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getReferencedType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList2 = simpleType0.getInterfaces();
        com.fasterxml.jackson.databind.type.MapLikeType mapLikeType3 = simpleType0.getTypeHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(javaTypeList2);
        org.junit.Assert.assertNull(mapLikeType3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isEnumType();
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.getSuperClass();
        boolean boolean3 = simpleType0.isContainerType();
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str5 = simpleType0.getErasedSignature();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList6 = simpleType0.getInterfaces();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ljava/lang/Enum;" + "'", str5, "Ljava/lang/Enum;");
        org.junit.Assert.assertNotNull(javaTypeList6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = collectionLikeType4.getContentType();
        com.fasterxml.jackson.databind.JavaType javaType6 = collectionLikeType4._elementType;
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.reflect.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isFinal();
        boolean boolean2 = simpleType0.hasValueHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isEnumType();
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.getSuperClass();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList4 = simpleType0.getInterfaces();
        boolean boolean5 = simpleType0.isThrowable();
        boolean boolean6 = simpleType0.isThrowable();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(javaTypeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = collectionLikeType4.getContentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = javaType5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = simpleType0.getBindings();
        java.lang.String str4 = simpleType0.containedTypeName((int) (byte) 10);
        boolean boolean5 = simpleType0.hasHandlers();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str5 = simpleType0.toCanonical();
        int int6 = simpleType0.containedTypeCount();
        java.lang.Object obj7 = simpleType0.getContentTypeHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str6 = simpleType0.containedTypeName(0);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = simpleType0.getBindings();
        int int8 = simpleType0.containedTypeCount();
        boolean boolean9 = simpleType0.isContainerType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(typeBindings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.getContentType();
        boolean boolean4 = simpleType0.isPrimitive();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.containedType((int) (byte) 0);
        boolean boolean3 = simpleType0.isContainerType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0, typeParser3, typeModifierArray5, classLoader6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory7.constructFromCanonical("Lcom/fasterxml/jackson/databind/type/TypeFactory;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'Lcom/fasterxml/jackson/databind/type/TypeFactory;' (remaining: ''): Can not locate class 'Lcom/fasterxml/jackson/databind/type/TypeFactory;', problem: Lcom/fasterxml/jackson/databind/type/TypeFactory;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        com.fasterxml.jackson.databind.JavaType javaType5 = simpleType0.getKeyType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = javaType5.hasGenericTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str5 = simpleType0.toCanonical();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList6 = simpleType0.getInterfaces();
        boolean boolean7 = simpleType0.isInterface();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
        org.junit.Assert.assertNotNull(javaTypeList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        boolean boolean5 = simpleType0.isPrimitive();
        java.lang.String str6 = simpleType0.toString();
        com.fasterxml.jackson.databind.JavaType javaType8 = simpleType0.containedType((int) (byte) 10);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[simple type, class long]" + "'", str6, "[simple type, class long]");
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        boolean boolean1 = simpleType0.isEnumType();
        boolean boolean2 = simpleType0.hasGenericTypes();
        java.lang.Class<?> wildcardClass3 = simpleType0.getParameterSource();
        java.lang.String str4 = simpleType0.toCanonical();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "boolean" + "'", str4, "boolean");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getReferencedType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList2 = simpleType0.getInterfaces();
        boolean boolean3 = simpleType0.isArrayType();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList4 = simpleType0.getInterfaces();
        java.lang.Class<?> wildcardClass5 = javaTypeList4.getClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(javaTypeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(javaTypeList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isEnumType();
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.getSuperClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = javaType2.isJavaLangObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = collectionLikeType4.getBindings();
        boolean boolean6 = collectionLikeType4.isTrueCollectionType();
        java.lang.String str8 = collectionLikeType4.containedTypeName((int) (short) 10);
        java.lang.String str9 = collectionLikeType4.toString();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[collection-like type; class long, contains null]" + "'", str9, "[collection-like type; class long, contains null]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        java.lang.String str1 = simpleType0.toCanonical();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.containedType((int) '#');
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.Enum" + "'", str1, "java.lang.Enum");
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeFactory0.findClass("J<J;J;>;");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: J<J;J;>;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isEnumType();
        boolean boolean2 = simpleType0.isArrayType();
        boolean boolean3 = simpleType0.hasGenericTypes();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str5 = simpleType0.toCanonical();
        java.lang.String str7 = simpleType0.containedTypeName(0);
        boolean boolean8 = simpleType0.isArrayType();
        java.lang.StringBuilder stringBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = simpleType0.getErasedSignature(stringBuilder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isThrowable();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.containedTypeOrUnknown((int) (short) 100);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings4 = simpleType0.getBindings();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeBindings4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isThrowable();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.containedTypeOrUnknown((int) (short) 100);
        java.lang.String str4 = simpleType0.toCanonical();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = simpleType0.getBindings();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "long" + "'", str4, "long");
        org.junit.Assert.assertNotNull(typeBindings5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isEnumType();
        boolean boolean2 = simpleType0.isThrowable();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.withValueHandler((java.lang.Object) 'a');
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.getContentType();
        java.lang.Class<?> wildcardClass4 = simpleType0.getRawClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.String str1 = simpleType0.toCanonical();
        java.lang.String str2 = simpleType0.toCanonical();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "long" + "'", str1, "long");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = simpleType0.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType0.containedTypeOrUnknown((int) (short) 10);
        com.fasterxml.jackson.databind.JavaType javaType6 = simpleType0.containedTypeOrUnknown((-1));
        boolean boolean7 = javaType6.hasValueHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = collectionLikeType4.getBindings();
        boolean boolean6 = collectionLikeType4.isTrueCollectionType();
        boolean boolean7 = collectionLikeType4.useStaticType();
        com.fasterxml.jackson.databind.JavaType javaType8 = collectionLikeType4.getSuperClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = javaType8.getTypeHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = collectionLikeType4.getBindings();
        boolean boolean6 = collectionLikeType4.isTrueCollectionType();
        java.lang.String str7 = collectionLikeType4.getTypeName();
        com.fasterxml.jackson.databind.JavaType javaType8 = collectionLikeType4.getContentType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[collection-like type; class long, contains null]" + "'", str7, "[collection-like type; class long, contains null]");
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        boolean boolean5 = simpleType0.isPrimitive();
        java.lang.Object obj6 = simpleType0.getContentValueHandler();
        boolean boolean7 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType8 = simpleType0.getKeyType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str5 = simpleType0.toCanonical();
        boolean boolean6 = simpleType0.isConcrete();
        boolean boolean7 = simpleType0.isMapLikeType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = collectionLikeType4.getBindings();
        boolean boolean6 = collectionLikeType4.isTrueCollectionType();
        boolean boolean7 = collectionLikeType4.isContainerType();
        java.lang.String str8 = collectionLikeType4.toString();
        com.fasterxml.jackson.databind.JavaType javaType10 = collectionLikeType4.containedType((-1));
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[collection-like type; class long, contains null]" + "'", str8, "[collection-like type; class long, contains null]");
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        java.util.Collection<com.fasterxml.jackson.databind.JavaType> javaTypeCollection1 = simpleType0.getValueHandler();
        boolean boolean2 = simpleType0.isArrayType();
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType0.containedTypeOrUnknown((int) (short) -1);
        java.lang.StringBuilder stringBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder6 = javaType4.getGenericSignature(stringBuilder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaTypeCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(javaType4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = collectionLikeType4.getBindings();
        boolean boolean6 = collectionLikeType4.isTrueCollectionType();
        boolean boolean7 = collectionLikeType4.useStaticType();
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionLikeType4.containedType((int) 'a');
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) collectionLikeType4);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.JavaType javaType1 = simpleType0.getSuperClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = collectionLikeType4.getBindings();
        boolean boolean6 = collectionLikeType4.isTrueCollectionType();
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionLikeType4.getContentType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType8 = collectionLikeType4.withStaticTyping();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isThrowable();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.containedTypeOrUnknown((int) (short) 100);
        boolean boolean4 = simpleType0.hasValueHandler();
        boolean boolean5 = simpleType0.isContainerType();
        java.lang.String str6 = simpleType0.toCanonical();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long" + "'", str6, "long");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str5 = simpleType0.toCanonical();
        java.lang.String str7 = simpleType0.containedTypeName(0);
        java.lang.Object obj8 = simpleType0.getContentValueHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        boolean boolean5 = simpleType0.isPrimitive();
        java.lang.StringBuilder stringBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder7 = simpleType0.getGenericSignature(stringBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        java.lang.String str5 = collectionLikeType4.toString();
        java.lang.Class<?> wildcardClass6 = collectionLikeType4.getParameterSource();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[collection-like type; class long, contains null]" + "'", str5, "[collection-like type; class long, contains null]");
        org.junit.Assert.assertNull(wildcardClass6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList1 = simpleType0.getInterfaces();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = simpleType0.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.getSuperClass();
        java.lang.StringBuilder stringBuilder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder5 = javaType3.getErasedSignature(stringBuilder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaTypeList1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.type.TypeParser typeParser2 = typeFactory1._parser;
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory1.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory1.withModifier(typeModifier5);
        org.junit.Assert.assertNotNull(typeParser2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        java.lang.String str5 = collectionLikeType4.toString();
        boolean boolean6 = collectionLikeType4.isCollectionLikeType();
        java.lang.String str7 = collectionLikeType4.toCanonical();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[collection-like type; class long, contains null]" + "'", str5, "[collection-like type; class long, contains null]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "long" + "'", str7, "long");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = simpleType0.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType0.containedTypeOrUnknown((int) (short) 10);
        com.fasterxml.jackson.databind.JavaType javaType6 = simpleType0.containedType((int) ' ');
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = simpleType0.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType0.containedTypeOrUnknown((int) (short) 10);
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList5 = simpleType0.getInterfaces();
        int int6 = simpleType0.containedTypeCount();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaTypeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = collectionLikeType4.getBindings();
        boolean boolean6 = collectionLikeType4.isTrueCollectionType();
        boolean boolean7 = collectionLikeType4.useStaticType();
        com.fasterxml.jackson.databind.JavaType javaType8 = collectionLikeType4.getSuperClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType9 = collectionLikeType4.withStaticTyping();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeBindings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean1 = simpleType0.isCollectionLikeType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = simpleType0.getBindings();
        com.fasterxml.jackson.databind.type.TypeBase typeBase3 = simpleType0.getValueHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeBase3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNull(typeBase3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.String str1 = simpleType0.toString();
        java.lang.Object obj2 = simpleType0.getContentTypeHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[simple type, class long]" + "'", str1, "[simple type, class long]");
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isEnumType();
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.getSuperClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.getKeyType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass4 = typeFactory0.classForName("java.lang.Object");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.containedTypeOrUnknown((int) '4');
        java.lang.Class<?> wildcardClass3 = simpleType0.getRawClass();
        java.lang.String str4 = simpleType0.getTypeName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[simple type, class java.lang.Class]" + "'", str4, "[simple type, class java.lang.Class]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        boolean boolean1 = simpleType0.isEnumType();
        boolean boolean2 = simpleType0.hasGenericTypes();
        java.lang.Class<?> wildcardClass3 = simpleType0.getParameterSource();
        boolean boolean4 = simpleType0.isInterface();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.type.TypeParser typeParser2 = typeFactory1._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory1.withCache(objLRUMap3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeFactory4.findClass("[simple type, class java.lang.Object]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [simple type, class java/lang/Object]");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeParser2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        int int1 = simpleType0.containedTypeCount();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str5 = simpleType0.toCanonical();
        boolean boolean6 = simpleType0.isConcrete();
        java.lang.Class<?> wildcardClass7 = simpleType0.getClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList1 = simpleType0.getInterfaces();
        java.lang.String str2 = simpleType0.getErasedSignature();
        boolean boolean3 = simpleType0.hasGenericTypes();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaTypeList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ljava/lang/Enum;" + "'", str2, "Ljava/lang/Enum;");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = simpleType0.withStaticTyping();
        java.lang.CharSequence charSequence6 = javaType5.getTypeHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.containedType((int) (short) 1);
        boolean boolean4 = simpleType0.isMapLikeType();
        boolean boolean5 = simpleType0.isReferenceType();
        java.lang.Class<?> wildcardClass6 = simpleType0.getParameterSource();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardClass6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0, typeParser3, typeModifierArray5, classLoader6);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap8 = typeFactory7._typeCache;
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(objLRUMap8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = collectionLikeType4.getContentType();
        java.lang.String str6 = collectionLikeType4.getTypeName();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[collection-like type; class long, contains null]" + "'", str6, "[collection-like type; class long, contains null]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings1 = simpleType0.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.getSuperClass();
        boolean boolean3 = simpleType0.hasValueHandler();
        com.fasterxml.jackson.databind.JavaType javaType4 = simpleType0.getContentType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(typeBindings1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.containedType((int) (short) 1);
        boolean boolean4 = simpleType0.isMapLikeType();
        java.lang.Object obj5 = simpleType0.getContentTypeHandler();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.containedType((int) (short) 1);
        com.fasterxml.jackson.databind.JavaType javaType5 = simpleType0.withValueHandler((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass6 = javaType5.getClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        boolean boolean1 = simpleType0.isEnumType();
        java.lang.String str2 = simpleType0.toCanonical();
        java.lang.String str3 = simpleType0.toCanonical();
        int int4 = simpleType0.containedTypeCount();
        boolean boolean5 = simpleType0.isMapLikeType();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.Enum" + "'", str2, "java.lang.Enum");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.Enum" + "'", str3, "java.lang.Enum");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList1 = simpleType0.getInterfaces();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = simpleType0.getBindings();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.getSuperClass();
        java.lang.StringBuilder stringBuilder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder5 = simpleType0.getGenericSignature(stringBuilder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaTypeList1);
        org.junit.Assert.assertNotNull(typeBindings2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        com.fasterxml.jackson.databind.JavaType javaType2 = simpleType0.containedTypeOrUnknown((int) '4');
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.getSuperClass();
        int int4 = simpleType0.containedTypeCount();
        java.lang.Object obj5 = simpleType0.getContentValueHandler();
        boolean boolean6 = simpleType0.isConcrete();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(javaType2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType4 = new com.fasterxml.jackson.databind.type.CollectionLikeType((com.fasterxml.jackson.databind.type.TypeBase) simpleType0, javaType3);
        com.fasterxml.jackson.databind.JavaType javaType6 = simpleType0.containedType((int) (byte) 10);
        java.lang.Object obj7 = simpleType0.getContentValueHandler();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleType0.serialize(jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        boolean boolean1 = simpleType0.isContainerType();
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleType0.withTypeHandler((java.lang.Object) 10);
        int int4 = simpleType0.containedTypeCount();
        java.lang.String str5 = simpleType0.toCanonical();
        java.lang.String str7 = simpleType0.containedTypeName(100);
        java.lang.String str8 = simpleType0.getGenericSignature();
        java.lang.String str10 = simpleType0.containedTypeName((int) (byte) 10);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "J;" + "'", str8, "J;");
        org.junit.Assert.assertNull(str10);
    }
}

