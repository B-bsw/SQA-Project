package com.fasterxml.jackson.databind.introspect;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
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
            java.lang.String str11 = jacksonAnnotationIntrospector1.findPropertyDescription(annotated10);
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
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector0.findKeySerializer(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
        org.junit.Assert.assertNotNull(propertyName8);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector1.findFilterId(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember1 = null;
        java.lang.String str2 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember1);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        java.lang.String str4 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector0.findKeyDeserializer(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jacksonAnnotationIntrospector1.findDeserializer(annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector1._constructNoTypeResolverBuilder();
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector1.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = null;
        java.lang.String str6 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember5);
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = jacksonAnnotationIntrospector1.findPropertiesToIgnore(annotated11, true);
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
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jacksonAnnotationIntrospector0.findKeyDeserializer(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = jacksonAnnotationIntrospector1._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector1.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector1.findDeserializationKeyType(annotated5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jacksonAnnotationIntrospector0.findSerializer(annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
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
            java.lang.Boolean boolean12 = jacksonAnnotationIntrospector1.findSerializationSortAlphabetically(annotated11);
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
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector1.findDeserializationKeyType(annotated7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector2);
        org.junit.Assert.assertNotNull(version3);
        org.junit.Assert.assertNotNull(propertyName6);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.core.Version version2 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0.findWrapperName(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = null;
        java.lang.String str9 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertNotNull(propertyName5);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector1);
        com.fasterxml.jackson.core.Version version3 = jacksonAnnotationIntrospector1.version();
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector1._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector1.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector1._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = jacksonAnnotationIntrospector1.findSerializationPropertyOrder(annotatedClass10);
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
}

