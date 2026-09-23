package com.fasterxml.jackson.databind.introspect;

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
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector3, annotationIntrospector4);
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray6 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { annotationIntrospector3 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList7 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList7, annotationIntrospectorArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = annotationIntrospector2.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(annotationIntrospector5);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray6);
        org.junit.Assert.assertArrayEquals(annotationIntrospectorArray6, new com.fasterxml.jackson.databind.AnnotationIntrospector[] { null });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = annotationIntrospector0.allIntrospectors();
        java.lang.Class<?> wildcardClass4 = annotationIntrospectorCollection3.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector3, annotationIntrospector4);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector1, annotationIntrospector4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = annotationIntrospector6.allIntrospectors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(annotationIntrospector5);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = annotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = annotationIntrospector0.findWrapperName(annotated4);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = annotationIntrospector6.findWrapperName(annotated7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = annotationIntrospector6.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = annotationIntrospector6.allIntrospectors();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = annotationIntrospector0.allIntrospectors(annotationIntrospectorCollection10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector3, annotationIntrospector4);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector1, annotationIntrospector4);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = annotationIntrospector7.allIntrospectors();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = annotationIntrospector6.allIntrospectors(annotationIntrospectorCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(annotationIntrospector5);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(annotationIntrospector7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList2 = jacksonAnnotationIntrospector0.findSubtypes(annotated1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean2 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty2 = jacksonAnnotationIntrospector0.findReferenceType(annotatedMember1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findNameForSerialization(annotated1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray2 = jacksonAnnotationIntrospector0.findViews(annotated1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo5 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated3, objectIdInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = jacksonAnnotationIntrospector1.findSerializationSortAlphabetically(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = jacksonAnnotationIntrospector0.findKeyDeserializer(annotated1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = jacksonAnnotationIntrospector0.findSerializationKeyType(annotated1, javaType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findNameForDeserialization(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty4 = jacksonAnnotationIntrospector1.findReferenceType(annotatedMember3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = jacksonAnnotationIntrospector0.findDeserializationType(annotated1, javaType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = jacksonAnnotationIntrospector1.findPropertiesToIgnore(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        java.lang.Class<?> wildcardClass3 = jacksonAnnotationIntrospector1.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = jacksonAnnotationIntrospector1.findPropertyDefaultValue(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonCreator.Mode mode5 = jacksonAnnotationIntrospector1.findCreatorBinding(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = jacksonAnnotationIntrospector1.findPropertiesToIgnore(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = jacksonAnnotationIntrospector0.findFilterId(annotatedClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jacksonAnnotationIntrospector1.findTypeName(annotatedClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jacksonAnnotationIntrospector1.hasIgnoreMarker(annotatedMember4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector1.findFilterId(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = jacksonAnnotationIntrospector0.findSerializationType(annotated1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo2 = jacksonAnnotationIntrospector0.findObjectIdInfo(annotated1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = annotationIntrospector0.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = annotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = annotationIntrospector5.findWrapperName(annotated6);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = annotationIntrospector5.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = annotationIntrospector5.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector5);
        java.lang.Class<?> wildcardClass12 = annotationIntrospector11.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(annotationIntrospector5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(annotationIntrospector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jacksonAnnotationIntrospector1.hasCreatorAnnotation(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access4 = jacksonAnnotationIntrospector1.findPropertyAccess(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findNameForSerialization(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = annotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = annotationIntrospector0.findWrapperName(annotated4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = annotationIntrospector0.findWrapperName(annotated6);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = annotationIntrospector0.allIntrospectors();
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findSerializer(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector1.findNullSerializer(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = jacksonAnnotationIntrospector0.isIgnorableType(annotatedClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = annotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = annotationIntrospector0.findWrapperName(annotated4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = propertyName5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
        org.junit.Assert.assertNull(propertyName5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing5 = jacksonAnnotationIntrospector1.findSerializationTyping(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = jacksonAnnotationIntrospector0.findSerializationType(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo4 = jacksonAnnotationIntrospector0.findObjectIdInfo(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = jacksonAnnotationIntrospector1.isTypeId(annotatedMember3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = jacksonAnnotationIntrospector0.hasAsValueAnnotation(annotatedMethod1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo5 = jacksonAnnotationIntrospector1.findObjectIdInfo(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector1.findDeserializationContentType(annotated6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector1.findNameForDeserialization(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector1.findSerializationType(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo4 = jacksonAnnotationIntrospector1.findObjectIdInfo(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = annotationIntrospector3.findWrapperName(annotated4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = annotationIntrospector3.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector7 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector3);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = annotationIntrospector7.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = annotationIntrospector9.findWrapperName(annotated10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = annotationIntrospector9.allIntrospectors();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = annotationIntrospector7.allIntrospectors(annotationIntrospectorCollection12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
        org.junit.Assert.assertNotNull(annotationIntrospector7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(annotationIntrospector9);
        org.junit.Assert.assertNull(propertyName11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findDeserializationContentConverter(annotatedMember7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector1.findSerializer(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findSerializationConverter(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector1.findContentDeserializer(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = jacksonAnnotationIntrospector0.findContentSerializer(annotated1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jacksonAnnotationIntrospector1.hasAnySetterAnnotation(annotatedMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = annotationIntrospector0.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = annotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = annotationIntrospector5.findWrapperName(annotated6);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = annotationIntrospector5.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = annotationIntrospector5.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector5);
        java.lang.Class<?> wildcardClass12 = annotationIntrospector0.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(annotationIntrospector5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(annotationIntrospector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jacksonAnnotationIntrospector1.hasAnyGetterAnnotation(annotatedMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access7 = jacksonAnnotationIntrospector1.findPropertyAccess(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonFormat.Value value4 = jacksonAnnotationIntrospector1.findFormat(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findDeserializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector1.findDeserializer(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = jacksonAnnotationIntrospector0._isIgnorable(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jacksonAnnotationIntrospector0.findDeserializationConverter(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean5 = jacksonAnnotationIntrospector1.findSerializationSortAlphabetically(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector1.findSerializationType(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findNullSerializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray7 = jacksonAnnotationIntrospector1.findViews(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList6 = jacksonAnnotationIntrospector1.findSubtypes(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findSerializationContentConverter(annotatedMember3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = jacksonAnnotationIntrospector0.findPropertyDescription(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty7 = jacksonAnnotationIntrospector1.findReferenceType(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector1.findDeserializationKeyType(annotated6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = jacksonAnnotationIntrospector0.findDeserializationKeyType(annotated1, javaType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value8 = jacksonAnnotationIntrospector1.findPropertyInclusion(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jacksonAnnotationIntrospector1.hasAnySetterAnnotation(annotatedMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include7 = jacksonAnnotationIntrospector1.findSerializationInclusionForContent(annotated5, include6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jacksonAnnotationIntrospector1._isIgnorable(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = jacksonAnnotationIntrospector1.findPropertiesToIgnore(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList8 = jacksonAnnotationIntrospector1.findSubtypes(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = jacksonAnnotationIntrospector0.hasAnySetterAnnotation(annotatedMethod1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector1.findDeserializationContentType(annotated5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jacksonAnnotationIntrospector1.hasAnyGetterAnnotation(annotatedMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jacksonAnnotationIntrospector1.hasCreatorAnnotation(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector1.findPOJOBuilder(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = annotationIntrospector0.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = annotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = annotationIntrospector5.findWrapperName(annotated6);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = annotationIntrospector5.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = annotationIntrospector5.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector5);
        java.lang.Class<?> wildcardClass12 = annotationIntrospector5.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(annotationIntrospector5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(annotationIntrospector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = annotationIntrospector0.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = annotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = annotationIntrospector5.findWrapperName(annotated6);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = annotationIntrospector5.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = annotationIntrospector5.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName13 = annotationIntrospector11.findWrapperName(annotated12);
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(annotationIntrospector5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(annotationIntrospector11);
        org.junit.Assert.assertNull(propertyName13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = jacksonAnnotationIntrospector0.findDeserializationContentConverter(annotatedMember1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector1.findPOJOBuilder(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = jacksonAnnotationIntrospector0.findPOJOBuilder(annotatedClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector1.findFilterId(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findNamingStrategy(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jacksonAnnotationIntrospector0.findSerializer(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector1.findSerializationContentConverter(annotatedMember8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = annotationIntrospector2.findWrapperName(annotated3);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = annotationIntrospector2.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = annotationIntrospector2.allIntrospectors();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value10 = jacksonAnnotationIntrospector1.findPropertyInclusion(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = jacksonAnnotationIntrospector0.findPOJOBuilder(annotatedClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jacksonAnnotationIntrospector1.hasIgnoreMarker(annotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jacksonAnnotationIntrospector1._isIgnorable(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean3 = jacksonAnnotationIntrospector0.hasRequiredMarker(annotatedMember2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector1.findKeySerializer(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jacksonAnnotationIntrospector1.findPropertyDefaultValue(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int10 = jacksonAnnotationIntrospector1.findPropertyIndex(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findKeyDeserializer(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1.findNameForDeserialization(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector1.findDeserializationContentConverter(annotatedMember8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector1.findInjectableValueId(annotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty5 = jacksonAnnotationIntrospector0.findReferenceType(annotatedMember4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = jacksonAnnotationIntrospector0.hasRequiredMarker(annotatedMember3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include6 = jacksonAnnotationIntrospector1.findSerializationInclusion(annotated4, include5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        java.lang.Class<?> wildcardClass6 = jacksonAnnotationIntrospector1.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector1._findFilterId(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        java.lang.Class<?> wildcardClass2 = stdTypeResolverBuilder1.getClass();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector1.findContentSerializer(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector1.findDeserializationType(annotated7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean5 = jacksonAnnotationIntrospector1.hasRequiredMarker(annotatedMember4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector1.findNullSerializer(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = jacksonAnnotationIntrospector1.findIgnoreUnknownProperties(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        java.lang.annotation.Annotation annotation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jacksonAnnotationIntrospector1.isAnnotationBundle(annotation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector1.findNameForDeserialization(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jacksonAnnotationIntrospector1.findDeserializationContentType(annotated9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean3 = jacksonAnnotationIntrospector0.findSerializationSortAlphabetically(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector0.findFilterId(annotatedClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector1.findDeserializationContentConverter(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector1.findNameForSerialization(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jacksonAnnotationIntrospector0.hasCreatorAnnotation(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = jacksonAnnotationIntrospector0.hasIgnoreMarker(annotatedMember2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = jacksonAnnotationIntrospector0.findSerializationType(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jacksonAnnotationIntrospector0._isIgnorable(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value5 = jacksonAnnotationIntrospector0.findPropertyInclusion(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        java.lang.annotation.Annotation annotation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jacksonAnnotationIntrospector1.isAnnotationBundle(annotation3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = jacksonAnnotationIntrospector1.findIgnoreUnknownProperties(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = jacksonAnnotationIntrospector1.findSerializationPropertyOrder(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findDeserializationContentConverter(annotatedMember3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = jacksonAnnotationIntrospector0.findUnwrappingNameTransformer(annotatedMember2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector1.findSerializationKeyType(annotated10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector1.findNullSerializer(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector1.findSerializationConverter(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector1.allIntrospectors(annotationIntrospectorCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = jacksonAnnotationIntrospector1.findSerializationSortAlphabetically(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo4 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated2, objectIdInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access4 = jacksonAnnotationIntrospector0.findPropertyAccess(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findNameForSerialization(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean5 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jacksonAnnotationIntrospector1.findPOJOBuilder(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0._findFilterId(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector1.findSerializationContentConverter(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = jacksonAnnotationIntrospector0.findSerializationKeyType(annotated2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean3 = jacksonAnnotationIntrospector0.isIgnorableType(annotatedClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = jacksonAnnotationIntrospector0.findDeserializationConverter(annotated1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jacksonAnnotationIntrospector1.findSerializationKeyType(annotated4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector1.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jacksonAnnotationIntrospector0.hasAnyGetterAnnotation(annotatedMethod3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector1.findSerializer(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector1.findDeserializationType(annotated7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jacksonAnnotationIntrospector1.hasIgnoreMarker(annotatedMember5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findFilterId(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector1.findSerializationConverter(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value3 = jacksonAnnotationIntrospector0.findPropertyInclusion(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findSerializer(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value2 = jacksonAnnotationIntrospector0.findPropertyInclusion(annotated1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findValueInstantiator(annotatedClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findRootName(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonCreator.Mode mode9 = jacksonAnnotationIntrospector1.findCreatorBinding(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findKeyDeserializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector1.findSerializationContentType(annotated5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1.findNameForSerialization(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector1.findNullSerializer(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = annotationIntrospector1.findWrapperName(annotated2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = annotationIntrospector1.allIntrospectors();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = annotationIntrospector0.allIntrospectors(annotationIntrospectorCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNull(propertyName3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value8 = jacksonAnnotationIntrospector1.findPropertyInclusion(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector1.findNamingStrategy(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo7 = jacksonAnnotationIntrospector1.findObjectReferenceInfo(annotated5, objectIdInfo6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector1.findNameForSerialization(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector1.findValueInstantiator(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector1.findDeserializationType(annotated10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        java.lang.annotation.Annotation annotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jacksonAnnotationIntrospector1.isAnnotationBundle(annotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector1.findContentSerializer(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = jacksonAnnotationIntrospector1.findUnwrappingNameTransformer(annotatedMember4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = jacksonAnnotationIntrospector0.findSerializer(annotated1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = jacksonAnnotationIntrospector1.findSerializationPropertyOrder(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = annotationIntrospector0.allIntrospectors();
        java.lang.Class<?> wildcardClass4 = annotationIntrospector0.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean7 = jacksonAnnotationIntrospector1.hasRequiredMarker(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0._findFilterId(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = jacksonAnnotationIntrospector1.findSerializationSortAlphabetically(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jacksonAnnotationIntrospector1._isIgnorable(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList4 = jacksonAnnotationIntrospector1.findSubtypes(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector1.findSerializationContentType(annotated7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jacksonAnnotationIntrospector1.findPropertyDefaultValue(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = jacksonAnnotationIntrospector1.findPropertiesToIgnore(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int3 = jacksonAnnotationIntrospector0.findPropertyIndex(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector2.version();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector2._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector2._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jacksonAnnotationIntrospector2.findSerializationType(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNotNull(annotationIntrospector9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = jacksonAnnotationIntrospector1.findSerializationSortAlphabetically(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = annotationIntrospector2.allIntrospectors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include4 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated2, include3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = jacksonAnnotationIntrospector1.findPropertiesToIgnore(annotated4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jacksonAnnotationIntrospector0.findFilterId(annotatedClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector1.findFilterId(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include7 = jacksonAnnotationIntrospector1.findSerializationInclusion(annotated5, include6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty3 = jacksonAnnotationIntrospector0.findReferenceType(annotatedMember2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jacksonAnnotationIntrospector1.hasAnySetterAnnotation(annotatedMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findSerializationKeyType(annotated3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jacksonAnnotationIntrospector1.findDeserializationKeyType(annotated4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector1.findSerializer(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jacksonAnnotationIntrospector1.hasAnyGetterAnnotation(annotatedMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonFormat.Value value9 = jacksonAnnotationIntrospector1.findFormat(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector2.version();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector2._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector2._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector2.findValueInstantiator(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNotNull(annotationIntrospector9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray8 = jacksonAnnotationIntrospector1.findViews(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector1.findRootName(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector2.version();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector2._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector2._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector2.findRootName(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNotNull(annotationIntrospector9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector1.findPOJOBuilder(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = jacksonAnnotationIntrospector1.allIntrospectors(annotationIntrospectorCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray6 = jacksonAnnotationIntrospector1.findViews(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include11 = jacksonAnnotationIntrospector1.findSerializationInclusionForContent(annotated9, include10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1.findNameForSerialization(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector1.findRootName(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty8 = jacksonAnnotationIntrospector1.findReferenceType(annotatedMember7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = annotationIntrospector3.findWrapperName(annotated4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = annotationIntrospector3.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector7 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = annotationIntrospector0.findWrapperName(annotated8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = annotationIntrospector0.allIntrospectors();
        java.lang.Class<?> wildcardClass11 = annotationIntrospector0.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
        org.junit.Assert.assertNotNull(annotationIntrospector7);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = jacksonAnnotationIntrospector1.hasRequiredMarker(annotatedMember10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = jacksonAnnotationIntrospector1.findSerializationContentType(annotated11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector0.findSerializer(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector1.findDeserializationKeyType(annotated10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jacksonAnnotationIntrospector1.hasAnySetterAnnotation(annotatedMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector1.findDeserializationType(annotated3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findFilterId(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName3 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jacksonAnnotationIntrospector1.hasCreatorAnnotation(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector1.findContentDeserializer(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector1.findContentDeserializer(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = jacksonAnnotationIntrospector0.findPOJOBuilder(annotatedClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector1.findDeserializationContentConverter(annotatedMember5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean7 = jacksonAnnotationIntrospector1.isIgnorableType(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector2.version();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector2._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector2._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray11 = jacksonAnnotationIntrospector2.findViews(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNotNull(annotationIntrospector9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jacksonAnnotationIntrospector1.findPropertyDescription(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jacksonAnnotationIntrospector0.hasAsValueAnnotation(annotatedMethod3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = jacksonAnnotationIntrospector1.findContentDeserializer(annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findSerializationConverter(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value7 = jacksonAnnotationIntrospector1.findPropertyInclusion(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector0.findKeyDeserializer(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList10 = jacksonAnnotationIntrospector1.findSubtypes(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = jacksonAnnotationIntrospector1.hasAnySetterAnnotation(annotatedMethod12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean7 = jacksonAnnotationIntrospector1.findIgnoreUnknownProperties(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList7 = jacksonAnnotationIntrospector1.findSubtypes(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector2.version();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector2._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector2._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jacksonAnnotationIntrospector2.hasAnyGetterAnnotation(annotatedMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNotNull(annotationIntrospector9);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findContentDeserializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector3, annotationIntrospector4);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector1, annotationIntrospector4);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = annotationIntrospector7.findWrapperName(annotated8);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = annotationIntrospector10.findWrapperName(annotated11);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = annotationIntrospector10.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector14 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector7, annotationIntrospector10);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector15 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector4, annotationIntrospector10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = annotationIntrospector10.allIntrospectors();
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(annotationIntrospector5);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(annotationIntrospector7);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(annotationIntrospector10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(annotationIntrospector14);
        org.junit.Assert.assertNotNull(annotationIntrospector15);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = jacksonAnnotationIntrospector1.findSerializationType(annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = jacksonAnnotationIntrospector1.hasRequiredMarker(annotatedMember10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonCreator.Mode mode8 = jacksonAnnotationIntrospector1.findCreatorBinding(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jacksonAnnotationIntrospector0.hasIgnoreMarker(annotatedMember3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jacksonAnnotationIntrospector1._isIgnorable(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector1.findNamingStrategy(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value8 = jacksonAnnotationIntrospector1.findPOJOBuilderConfig(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo8 = jacksonAnnotationIntrospector1.findObjectReferenceInfo(annotated6, objectIdInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = jacksonAnnotationIntrospector1.findPropertiesToIgnore(annotated3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jacksonAnnotationIntrospector0.findDeserializationContentConverter(annotatedMember2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector2.version();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector2._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector2._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = jacksonAnnotationIntrospector2.findPropertiesToIgnore(annotated10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNotNull(annotationIntrospector9);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = annotationIntrospector3.findWrapperName(annotated4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = annotationIntrospector3.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector7 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector1, annotationIntrospector3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName9 = annotationIntrospector7.findWrapperName(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
        org.junit.Assert.assertNotNull(annotationIntrospector7);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jacksonAnnotationIntrospector0.findDeserializationContentConverter(annotatedMember2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findDeserializationContentType(annotated3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jacksonAnnotationIntrospector1.findDeserializationType(annotated4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = jacksonAnnotationIntrospector1.findUnwrappingNameTransformer(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector1.findDeserializer(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector1.hasAnyGetterAnnotation(annotatedMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo4 = jacksonAnnotationIntrospector0.findObjectIdInfo(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jacksonAnnotationIntrospector1.findPOJOBuilder(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jacksonAnnotationIntrospector1.findSerializationType(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1._findFilterId(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector1.findFilterId(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = annotationIntrospector0.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = annotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = annotationIntrospector5.findWrapperName(annotated6);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = annotationIntrospector5.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = annotationIntrospector5.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = annotationIntrospector11.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector15 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector14);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder16 = jacksonAnnotationIntrospector14._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection17 = jacksonAnnotationIntrospector14.allIntrospectors();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection18 = annotationIntrospector11.allIntrospectors(annotationIntrospectorCollection17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(annotationIntrospector5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(annotationIntrospector11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(annotationIntrospector15);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder16);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection17);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector2.version();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector2._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector2._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jacksonAnnotationIntrospector2._isIgnorable(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNotNull(annotationIntrospector9);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector1.findDeserializationType(annotated6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = jacksonAnnotationIntrospector1.findPropertiesToIgnore(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector1.findNullSerializer(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findNameForDeserialization(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean12 = jacksonAnnotationIntrospector1.isIgnorableType(annotatedClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray10 = jacksonAnnotationIntrospector1.findViews(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = jacksonAnnotationIntrospector1.findIgnoreUnknownProperties(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = jacksonAnnotationIntrospector1.isIgnorableType(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector2.version();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector2._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector2._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector2.findDeserializationType(annotated10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNotNull(annotationIntrospector9);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access4 = jacksonAnnotationIntrospector0.findPropertyAccess(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findRootName(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findSerializationContentConverter(annotatedMember7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jacksonAnnotationIntrospector1.findDeserializationType(annotated4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean12 = jacksonAnnotationIntrospector1.isTypeId(annotatedMember11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = annotationIntrospector3.findWrapperName(annotated4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = annotationIntrospector3.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector7 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector1, annotationIntrospector3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = annotationIntrospector7.allIntrospectors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
        org.junit.Assert.assertNotNull(annotationIntrospector7);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findFilterId(annotatedClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector1.findInjectableValueId(annotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access11 = jacksonAnnotationIntrospector1.findPropertyAccess(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1.findNameForDeserialization(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jacksonAnnotationIntrospector1._isIgnorable(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector2.version();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector2._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector2._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing11 = jacksonAnnotationIntrospector2.findSerializationTyping(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNotNull(annotationIntrospector9);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = jacksonAnnotationIntrospector1.findKeySerializer(annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = jacksonAnnotationIntrospector1.findIgnoreUnknownProperties(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = jacksonAnnotationIntrospector0.hasAsValueAnnotation(annotatedMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = jacksonAnnotationIntrospector0.findDeserializationContentType(annotated1, javaType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jacksonAnnotationIntrospector0.findNullSerializer(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector2.version();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector2._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector2._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = annotationIntrospector9.allIntrospectors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNotNull(annotationIntrospector9);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = annotationIntrospector3.findWrapperName(annotated4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = annotationIntrospector3.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector7 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = annotationIntrospector0.findWrapperName(annotated8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = annotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName13 = annotationIntrospector11.findWrapperName(annotated12);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector14 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = annotationIntrospector14.findWrapperName(annotated15);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection17 = annotationIntrospector14.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector18 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector11, annotationIntrospector14);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector19 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated20 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName21 = annotationIntrospector19.findWrapperName(annotated20);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated23 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName24 = annotationIntrospector22.findWrapperName(annotated23);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection25 = annotationIntrospector22.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector26 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector19, annotationIntrospector22);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector18, annotationIntrospector26);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection28 = annotationIntrospector26.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection29 = annotationIntrospector0.allIntrospectors(annotationIntrospectorCollection28);
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
        org.junit.Assert.assertNotNull(annotationIntrospector7);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(annotationIntrospector11);
        org.junit.Assert.assertNull(propertyName13);
        org.junit.Assert.assertNotNull(annotationIntrospector14);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection17);
        org.junit.Assert.assertNotNull(annotationIntrospector18);
        org.junit.Assert.assertNotNull(annotationIntrospector19);
        org.junit.Assert.assertNull(propertyName21);
        org.junit.Assert.assertNotNull(annotationIntrospector22);
        org.junit.Assert.assertNull(propertyName24);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection25);
        org.junit.Assert.assertNotNull(annotationIntrospector26);
        org.junit.Assert.assertNotNull(annotationIntrospector27);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection28);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection29);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo11 = jacksonAnnotationIntrospector1.findObjectReferenceInfo(annotated9, objectIdInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jacksonAnnotationIntrospector1.findPropertyDefaultValue(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value9 = jacksonAnnotationIntrospector1.findPOJOBuilderConfig(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing11 = jacksonAnnotationIntrospector1.findSerializationTyping(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = jacksonAnnotationIntrospector1.findPropertiesToIgnore(annotated6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = jacksonAnnotationIntrospector1.findUnwrappingNameTransformer(annotatedMember12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = jacksonAnnotationIntrospector1.findDeserializationType(annotated12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonCreator.Mode mode4 = jacksonAnnotationIntrospector0.findCreatorBinding(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonFormat.Value value13 = jacksonAnnotationIntrospector1.findFormat(annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector1.findSerializationKeyType(annotated6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = annotationIntrospector3.findWrapperName(annotated4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = annotationIntrospector3.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector7 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector3);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = annotationIntrospector8.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName13 = annotationIntrospector11.findWrapperName(annotated12);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection14 = annotationIntrospector11.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector15 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector8, annotationIntrospector11);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector16 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector7, annotationIntrospector15);
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = annotationIntrospector16.findWrapperName(annotated17);
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
        org.junit.Assert.assertNotNull(annotationIntrospector7);
        org.junit.Assert.assertNotNull(annotationIntrospector8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(annotationIntrospector11);
        org.junit.Assert.assertNull(propertyName13);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection14);
        org.junit.Assert.assertNotNull(annotationIntrospector15);
        org.junit.Assert.assertNotNull(annotationIntrospector16);
        org.junit.Assert.assertNull(propertyName18);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = jacksonAnnotationIntrospector0.findDeserializationType(annotated2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findContentSerializer(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector1.findSerializationKeyType(annotated10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jacksonAnnotationIntrospector1._isIgnorable(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector1.findValueInstantiator(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo8 = jacksonAnnotationIntrospector1.findObjectReferenceInfo(annotated6, objectIdInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = jacksonAnnotationIntrospector1.findKeySerializer(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jacksonAnnotationIntrospector1.hasAsValueAnnotation(annotatedMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector1.findFilterId(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = jacksonAnnotationIntrospector1.findPropertiesToIgnore(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector1._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include17 = jacksonAnnotationIntrospector1.findSerializationInclusion(annotated15, include16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(propertyName14);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector1.findFilterId(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo11 = jacksonAnnotationIntrospector1.findObjectIdInfo(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector1.findWrapperName(annotated11);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jacksonAnnotationIntrospector1.hasIgnoreMarker(annotatedMember13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNull(propertyName12);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing12 = jacksonAnnotationIntrospector1.findSerializationTyping(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = jacksonAnnotationIntrospector0.isIgnorableType(annotatedClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value11 = jacksonAnnotationIntrospector1.findPropertyInclusion(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = jacksonAnnotationIntrospector0.findDeserializationContentType(annotated2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value4 = jacksonAnnotationIntrospector0.findPOJOBuilderConfig(annotatedClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jacksonAnnotationIntrospector0.hasAnyGetterAnnotation(annotatedMethod3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector1.findSerializationContentType(annotated3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jacksonAnnotationIntrospector1.findDeserializationType(annotated9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing4 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jacksonAnnotationIntrospector1.hasAsValueAnnotation(annotatedMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = jacksonAnnotationIntrospector1.findSerializationPropertyOrder(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = annotationIntrospector3.findWrapperName(annotated4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = annotationIntrospector3.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector7 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = annotationIntrospector0.findWrapperName(annotated8);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = annotationIntrospector0.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = annotationIntrospector0.allIntrospectors();
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
        org.junit.Assert.assertNotNull(annotationIntrospector7);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector1.findWrapperName(annotated10);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = jacksonAnnotationIntrospector1.findValueInstantiator(annotatedClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
        org.junit.Assert.assertNull(propertyName11);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jacksonAnnotationIntrospector1.hasAsValueAnnotation(annotatedMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection2 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findNameForDeserialization(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection2);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector1._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jacksonAnnotationIntrospector1._isIgnorable(annotated15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(propertyName14);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jacksonAnnotationIntrospector1.findPropertyDefaultValue(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0.findRootName(annotatedClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jacksonAnnotationIntrospector1.hasAnySetterAnnotation(annotatedMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = jacksonAnnotationIntrospector1.findSerializationPropertyOrder(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jacksonAnnotationIntrospector1.hasAnyGetterAnnotation(annotatedMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector1.findDeserializationContentType(annotated5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include6 = jacksonAnnotationIntrospector1.findSerializationInclusionForContent(annotated4, include5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = jacksonAnnotationIntrospector1.findPropertiesToIgnore(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jacksonAnnotationIntrospector1.hasIgnoreMarker(annotatedMember8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = jacksonAnnotationIntrospector1.isTypeId(annotatedMember5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findNullSerializer(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing2 = jacksonAnnotationIntrospector0.findSerializationTyping(annotated1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector1._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = jacksonAnnotationIntrospector1.findDeserializationContentType(annotated15, javaType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(propertyName14);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.core.Version version4 = jacksonAnnotationIntrospector2.version();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector2._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector2._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector2.findSerializationConverter(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNotNull(annotationIntrospector9);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector1.findSerializationContentType(annotated10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jacksonAnnotationIntrospector1.hasAsValueAnnotation(annotatedMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector1.findDeserializationContentConverter(annotatedMember8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value3 = jacksonAnnotationIntrospector0.findPOJOBuilderConfig(annotatedClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include6 = jacksonAnnotationIntrospector1.findSerializationInclusion(annotated4, include5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findSerializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing6 = jacksonAnnotationIntrospector1.findSerializationTyping(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector1.findRootName(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector1.findNameForDeserialization(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jacksonAnnotationIntrospector0._isIgnorable(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector1.findNameForSerialization(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jacksonAnnotationIntrospector0.hasAsValueAnnotation(annotatedMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = jacksonAnnotationIntrospector0.findUnwrappingNameTransformer(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonCreator.Mode mode4 = jacksonAnnotationIntrospector0.findCreatorBinding(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jacksonAnnotationIntrospector0.hasAnySetterAnnotation(annotatedMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = jacksonAnnotationIntrospector1.findIgnoreUnknownProperties(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = jacksonAnnotationIntrospector1.isTypeId(annotatedMember7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jacksonAnnotationIntrospector1.findPropertyDefaultValue(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector1._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = jacksonAnnotationIntrospector1.findSerializer(annotated15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(propertyName14);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jacksonAnnotationIntrospector1.findPropertyDefaultValue(annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector1._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = jacksonAnnotationIntrospector1.findKeySerializer(annotated15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(propertyName14);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing10 = jacksonAnnotationIntrospector1.findSerializationTyping(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector1.findSerializer(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector1.findValueInstantiator(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection2 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findFilterId(annotatedClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection2);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = jacksonAnnotationIntrospector0.isIgnorableType(annotatedClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jacksonAnnotationIntrospector1._isIgnorable(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jacksonAnnotationIntrospector1.findTypeName(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo10 = jacksonAnnotationIntrospector1.findObjectReferenceInfo(annotated8, objectIdInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo5 = jacksonAnnotationIntrospector1.findObjectReferenceInfo(annotated3, objectIdInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector1._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = jacksonAnnotationIntrospector1.findSerializationContentType(annotated15, javaType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(propertyName14);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector0.findSerializationKeyType(annotated6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector1._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jacksonAnnotationIntrospector1.hasIgnoreMarker(annotatedMember15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(propertyName14);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector1.findFilterId(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector1.findDeserializationConverter(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector0.findInjectableValueId(annotatedMember4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean5 = jacksonAnnotationIntrospector1.isTypeId(annotatedMember4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection2 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection2);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray6 = jacksonAnnotationIntrospector1.findViews(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection2 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jacksonAnnotationIntrospector0.hasAsValueAnnotation(annotatedMethod3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection2);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection2 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findDeserializationKeyType(annotated3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection2);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector1._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = jacksonAnnotationIntrospector1.findDeserializationKeyType(annotated15, javaType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(propertyName14);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector3, annotationIntrospector4);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector1, annotationIntrospector4);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = annotationIntrospector7.findWrapperName(annotated8);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = annotationIntrospector10.findWrapperName(annotated11);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = annotationIntrospector10.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector14 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector7, annotationIntrospector10);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector15 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector4, annotationIntrospector10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName17 = annotationIntrospector10.findWrapperName(annotated16);
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(annotationIntrospector5);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(annotationIntrospector7);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(annotationIntrospector10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(annotationIntrospector14);
        org.junit.Assert.assertNotNull(annotationIntrospector15);
        org.junit.Assert.assertNull(propertyName17);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findInjectableValueId(annotatedMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing8 = jacksonAnnotationIntrospector1.findSerializationTyping(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector1.findContentSerializer(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jacksonAnnotationIntrospector0.hasIgnoreMarker(annotatedMember3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector1.findInjectableValueId(annotatedMember4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        java.lang.annotation.Annotation annotation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jacksonAnnotationIntrospector1.isAnnotationBundle(annotation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray11 = jacksonAnnotationIntrospector1.findViews(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector1.findDeserializationContentType(annotated10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findKeySerializer(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value11 = jacksonAnnotationIntrospector1.findPOJOBuilderConfig(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector1.findNullSerializer(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jacksonAnnotationIntrospector0.findFilterId(annotatedClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jacksonAnnotationIntrospector1.hasAsValueAnnotation(annotatedMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector1.findSerializationContentType(annotated10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0.findNameForSerialization(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findContentDeserializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = jacksonAnnotationIntrospector1.findDeserializationType(annotated11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector1.findKeyDeserializer(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector1._findFilterId(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findSerializationContentConverter(annotatedMember7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = jacksonAnnotationIntrospector0.findSerializationType(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = jacksonAnnotationIntrospector1.findSerializationSortAlphabetically(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = jacksonAnnotationIntrospector1.findDeserializationConverter(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector1.findDeserializationKeyType(annotated10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = jacksonAnnotationIntrospector1.findSerializationPropertyOrder(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findDeserializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = jacksonAnnotationIntrospector1.hasAnyGetterAnnotation(annotatedMethod12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(propertyName11);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector1.findWrapperName(annotated11);
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonProperty.Access access14 = jacksonAnnotationIntrospector1.findPropertyAccess(annotated13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNull(propertyName12);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version1 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo3 = jacksonAnnotationIntrospector0.findObjectIdInfo(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1.findRootName(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection7 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = jacksonAnnotationIntrospector1.isIgnorableType(annotatedClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection7);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0.findSerializationConverter(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector1.findWrapperName(annotated10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Include include14 = jacksonAnnotationIntrospector1.findSerializationInclusionForContent(annotated12, include13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
        org.junit.Assert.assertNull(propertyName11);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findFilterId(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.lang.annotation.Annotation annotation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jacksonAnnotationIntrospector1.isAnnotationBundle(annotation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonFormat.Value value11 = jacksonAnnotationIntrospector1.findFormat(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo5 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated3, objectIdInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = jacksonAnnotationIntrospector1.findSerializationPropertyOrder(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = jacksonAnnotationIntrospector1.findSerializationPropertyOrder(annotatedClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonFormat.Value value10 = jacksonAnnotationIntrospector1.findFormat(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jacksonAnnotationIntrospector0.findKeyDeserializer(annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector1._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray14 = jacksonAnnotationIntrospector1.findViews(annotated13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
        org.junit.Assert.assertNotNull(propertyName12);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = jacksonAnnotationIntrospector1.findSerializationSortAlphabetically(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = jacksonAnnotationIntrospector1.findUnwrappingNameTransformer(annotatedMember10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jacksonAnnotationIntrospector1.hasAnyGetterAnnotation(annotatedMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector1.findDeserializer(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector1.findWrapperName(annotated11);
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector1.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = jacksonAnnotationIntrospector1.findPropertiesToIgnore(annotated15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNull(propertyName14);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jacksonAnnotationIntrospector1.findPropertyDescription(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findNullSerializer(annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jacksonAnnotationIntrospector0._findFilterId(annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
        org.junit.Assert.assertNull(propertyName7);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector1._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector1.findNameForSerialization(annotated15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(propertyName14);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector1.findKeySerializer(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector1.findWrapperName(annotated11);
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector1.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = jacksonAnnotationIntrospector1.findSerializationConverter(annotated15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNull(propertyName14);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = jacksonAnnotationIntrospector1.findPropertiesToIgnore(annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray7 = jacksonAnnotationIntrospector0.findViews(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1.findNameForDeserialization(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jacksonAnnotationIntrospector1.findDeserializationContentConverter(annotatedMember10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector1.findWrapperName(annotated11);
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = jacksonAnnotationIntrospector1.findDeserializer(annotated13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNull(propertyName12);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jacksonAnnotationIntrospector0.findNamingStrategy(annotatedClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector1._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = jacksonAnnotationIntrospector1.findUnwrappingNameTransformer(annotatedMember10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findSerializationConverter(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember10 = null;
        java.lang.String str11 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember10);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = jacksonAnnotationIntrospector1.findFilterId(annotatedClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1.findRootName(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo6 = jacksonAnnotationIntrospector1.findObjectIdInfo(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jacksonAnnotationIntrospector1.hasAnySetterAnnotation(annotatedMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector1.findRootName(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int10 = jacksonAnnotationIntrospector1.findPropertyIndex(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection9 = jacksonAnnotationIntrospector1.allIntrospectors();
        java.lang.Class<?> wildcardClass10 = jacksonAnnotationIntrospector1.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = annotationIntrospector0.findWrapperName(annotated1);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = annotationIntrospector0.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = annotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = annotationIntrospector5.findWrapperName(annotated6);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = annotationIntrospector5.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = annotationIntrospector5.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector5);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = annotationIntrospector5.allIntrospectors();
        java.lang.Class<?> wildcardClass13 = annotationIntrospectorCollection12.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector0);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(annotationIntrospector5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(annotationIntrospector11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jacksonAnnotationIntrospector0.findContentDeserializer(annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonCreator.Mode mode6 = jacksonAnnotationIntrospector1.findCreatorBinding(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.core.Version version5 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector1.findSerializationConverter(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jacksonAnnotationIntrospector0.findSerializationKeyType(annotated4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value value12 = jacksonAnnotationIntrospector1.findPropertyInclusion(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = jacksonAnnotationIntrospector1.findSerializationContentConverter(annotatedMember11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector1.findSerializationConverter(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector1.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector1.findWrapperName(annotated11);
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector1.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean16 = jacksonAnnotationIntrospector1.hasRequiredMarker(annotatedMember15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNull(propertyName14);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector1.findRootName(annotatedClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(propertyName9);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        com.fasterxml.jackson.core.Version version10 = jacksonAnnotationIntrospector1.version();
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
        org.junit.Assert.assertNotNull(version10);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jacksonAnnotationIntrospector1.findInjectableValueId(annotatedMember7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName5 = annotationIntrospector3.findWrapperName(annotated4);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection6 = annotationIntrospector3.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector7 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector1, annotationIntrospector3);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection8 = annotationIntrospector3.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = annotationIntrospector9.findWrapperName(annotated10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = annotationIntrospector9.allIntrospectors();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = annotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector14 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = annotationIntrospector14.findWrapperName(annotated15);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection17 = annotationIntrospector14.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated18 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName19 = annotationIntrospector14.findWrapperName(annotated18);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector20 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector9, annotationIntrospector14);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection21 = annotationIntrospector20.allIntrospectors();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector22 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(annotationIntrospector3, annotationIntrospector20);
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(annotationIntrospector3);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection6);
        org.junit.Assert.assertNotNull(annotationIntrospector7);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection8);
        org.junit.Assert.assertNotNull(annotationIntrospector9);
        org.junit.Assert.assertNull(propertyName11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(annotationIntrospector14);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection17);
        org.junit.Assert.assertNull(propertyName19);
        org.junit.Assert.assertNotNull(annotationIntrospector20);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection21);
        org.junit.Assert.assertNotNull(annotationIntrospector22);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findFilterId(annotatedClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("", "");
        java.lang.Class<?> wildcardClass10 = jacksonAnnotationIntrospector1.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
        org.junit.Assert.assertNotNull(propertyName9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

