package com.fasterxml.jackson.databind.introspect;

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
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        java.lang.Boolean boolean2 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        java.lang.Class<?> wildcardClass4 = jacksonAnnotationIntrospector0.findSerializationType(annotated3);
        boolean boolean5 = jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap6 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap7 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include10 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include11 = jacksonAnnotationIntrospector8.findSerializationInclusion(annotated9, include10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector8.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector8._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector16 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        java.lang.Class<?> wildcardClass19 = jacksonAnnotationIntrospector8.findDeserializationContentType(annotated17, javaType18);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection20 = jacksonAnnotationIntrospector8.allIntrospectors();
        com.fasterxml.jackson.core.Version version21 = jacksonAnnotationIntrospector8.version();
        java.lang.Object obj22 = jacksonAnnotationIntrospector8.readResolve();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty24 = jacksonAnnotationIntrospector8.findReferenceType(annotatedMember23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNull(include11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNotNull(propertyName15);
        org.junit.Assert.assertNotNull(annotationIntrospector16);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection20);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        java.lang.Boolean boolean2 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        java.lang.Class<?> wildcardClass4 = jacksonAnnotationIntrospector0.findSerializationType(annotated3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include10 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include11 = jacksonAnnotationIntrospector8.findSerializationInclusion(annotated9, include10);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = null;
        java.lang.String str13 = jacksonAnnotationIntrospector8.findImplicitPropertyName(annotatedMember12);
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        java.lang.Class<?> wildcardClass16 = jacksonAnnotationIntrospector8.findSerializationKeyType(annotated14, javaType15);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector17 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated18 = null;
        java.lang.String[] strArray19 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated18);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(include11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(annotationIntrospector17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap1 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        java.lang.String[] strArray4 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated3);
        java.lang.Object obj5 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        java.lang.Boolean boolean8 = jacksonAnnotationIntrospector6.findIgnoreUnknownProperties(annotatedClass7);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector10 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector6, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap11 = jacksonAnnotationIntrospector9._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass13 = null;
        java.lang.Boolean boolean14 = jacksonAnnotationIntrospector12.findIgnoreUnknownProperties(annotatedClass13);
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include16 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include17 = jacksonAnnotationIntrospector12.findSerializationInclusionForContent(annotated15, include16);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass19 = null;
        java.lang.Boolean boolean20 = jacksonAnnotationIntrospector18.findIgnoreUnknownProperties(annotatedClass19);
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        java.lang.Class<?> wildcardClass22 = jacksonAnnotationIntrospector18.findSerializationType(annotated21);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector23 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector12, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector18);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap24 = jacksonAnnotationIntrospector18._annotationsInside;
        jacksonAnnotationIntrospector9._annotationsInside = wildcardClassLRUMap24;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap24;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector28 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.Annotated annotated29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo30 = jacksonAnnotationIntrospector0.findObjectIdInfo(annotated29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassLRUMap1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(annotationIntrospector10);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap11);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(include17);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertNotNull(annotationIntrospector23);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap24);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector28);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include3 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated1, include2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        java.lang.Object obj6 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include9 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include10 = jacksonAnnotationIntrospector7.findSerializationInclusion(annotated8, include9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector7.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector7._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include16 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include17 = jacksonAnnotationIntrospector7.findSerializationInclusionForContent(annotated15, include16);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap18 = jacksonAnnotationIntrospector7._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap18;
        com.fasterxml.jackson.core.Version version20 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector22 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector24 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection25 = jacksonAnnotationIntrospector24.allIntrospectors();
        com.fasterxml.jackson.core.Version version26 = jacksonAnnotationIntrospector24.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated27 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include28 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include29 = jacksonAnnotationIntrospector24.findSerializationInclusionForContent(annotated27, include28);
        com.fasterxml.jackson.databind.introspect.Annotated annotated30 = null;
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        java.lang.Class<?> wildcardClass32 = jacksonAnnotationIntrospector24.findSerializationContentType(annotated30, javaType31);
        org.junit.Assert.assertNull(include3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(include10);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(propertyName14);
        org.junit.Assert.assertNull(include17);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap18);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector22);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector24);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection25);
        org.junit.Assert.assertNotNull(version26);
        org.junit.Assert.assertNull(include29);
        org.junit.Assert.assertNull(wildcardClass32);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include3 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated1, include2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findSerializationType(annotated4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated6, javaType7);
        java.lang.Object obj9 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        java.lang.Boolean boolean11 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass10);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass12 = null;
        java.lang.Boolean boolean13 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass12);
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector0.findWrapperName(annotated14);
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector0._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated19 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName20 = jacksonAnnotationIntrospector0.findWrapperName(annotated19);
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean22 = jacksonAnnotationIntrospector0.findMergeInfo(annotated21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(include3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(propertyName15);
        org.junit.Assert.assertNotNull(propertyName18);
        org.junit.Assert.assertNull(propertyName20);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include3 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated1, include2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0._findConstructorName(annotated8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        java.lang.String[] strArray11 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        java.lang.String[] strArray13 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated12);
        org.junit.Assert.assertNull(include3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include3 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated1, include2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findSerializationType(annotated4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated6, javaType7);
        java.lang.Object obj9 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass10 = null;
        java.lang.Boolean boolean11 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection12 = jacksonAnnotationIntrospector0.allIntrospectors();
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = true;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        java.lang.String str16 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember15);
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = jacksonAnnotationIntrospector0.hasAnyGetterAnnotation(annotatedMethod17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(include3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include3 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated1, include2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = null;
        java.lang.String str5 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember4);
        java.lang.Object obj6 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include9 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include10 = jacksonAnnotationIntrospector7.findSerializationInclusion(annotated8, include9);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector7.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector7._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include16 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include17 = jacksonAnnotationIntrospector7.findSerializationInclusionForContent(annotated15, include16);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap18 = jacksonAnnotationIntrospector7._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap18;
        com.fasterxml.jackson.core.Version version20 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector22 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector24 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.Annotated annotated25 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include26 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include27 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated25, include26);
        com.fasterxml.jackson.databind.introspect.Annotated annotated28 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include29 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include30 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated28, include29);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember31 = null;
        java.lang.String str32 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember31);
        com.fasterxml.jackson.databind.introspect.Annotated annotated33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int34 = jacksonAnnotationIntrospector0.findPropertyIndex(annotated33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(include3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(include10);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
        org.junit.Assert.assertNotNull(propertyName14);
        org.junit.Assert.assertNull(include17);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap18);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector22);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector24);
        org.junit.Assert.assertNull(include27);
        org.junit.Assert.assertNull(include30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap1 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass3 = null;
        java.lang.Boolean boolean4 = jacksonAnnotationIntrospector2.findIgnoreUnknownProperties(annotatedClass3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        java.lang.Class<?> wildcardClass6 = jacksonAnnotationIntrospector2.findSerializationType(annotated5);
        boolean boolean7 = jacksonAnnotationIntrospector2._cfgConstructorPropertiesImpliesCreator;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap8 = jacksonAnnotationIntrospector2._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include11 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include12 = jacksonAnnotationIntrospector9.findSerializationInclusion(annotated10, include11);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector9.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector9._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include18 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include19 = jacksonAnnotationIntrospector9.findSerializationInclusionForContent(annotated17, include18);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap20 = jacksonAnnotationIntrospector9._annotationsInside;
        jacksonAnnotationIntrospector2._annotationsInside = wildcardClassLRUMap20;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap20;
        com.fasterxml.jackson.databind.PropertyName propertyName25 = jacksonAnnotationIntrospector0._propertyName("", "hi!");
        org.junit.Assert.assertNotNull(wildcardClassLRUMap1);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap8);
        org.junit.Assert.assertNull(include12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(propertyName16);
        org.junit.Assert.assertNull(include19);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap20);
        org.junit.Assert.assertNotNull(propertyName25);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        java.lang.Boolean boolean2 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector3);
        java.lang.Object obj5 = jacksonAnnotationIntrospector3.readResolve();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector3.findSerializationType(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector3.findSerializationType(annotated8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        java.lang.String[] strArray12 = jacksonAnnotationIntrospector3.findPropertiesToIgnore(annotated10, true);
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        java.lang.Class<?> wildcardClass15 = jacksonAnnotationIntrospector3.findSerializationKeyType(annotated13, javaType14);
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        java.lang.Class<?> wildcardClass18 = jacksonAnnotationIntrospector3.findDeserializationKeyType(annotated16, javaType17);
        java.lang.Object obj19 = jacksonAnnotationIntrospector3.readResolve();
        com.fasterxml.jackson.core.Version version20 = jacksonAnnotationIntrospector3.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        java.lang.Class<?> wildcardClass23 = jacksonAnnotationIntrospector3.findDeserializationType(annotated21, javaType22);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(annotationIntrospector4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertNull(wildcardClass23);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap1 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection3 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap4 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jacksonAnnotationIntrospector0.hasAnySetterAnnotation(annotatedMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassLRUMap1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection3);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include3 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated1, include2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findSerializationType(annotated4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated6, javaType7);
        java.lang.Object obj9 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        java.lang.String[] strArray12 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated10, false);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include15 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include16 = jacksonAnnotationIntrospector13.findSerializationInclusion(annotated14, include15);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection17 = jacksonAnnotationIntrospector13.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName20 = jacksonAnnotationIntrospector13._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include22 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include23 = jacksonAnnotationIntrospector13.findSerializationInclusionForContent(annotated21, include22);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap24 = jacksonAnnotationIntrospector13._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap24;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector27 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.databind.introspect.Annotated annotated28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        java.lang.Class<?> wildcardClass30 = jacksonAnnotationIntrospector27.findSerializationContentType(annotated28, javaType29);
        com.fasterxml.jackson.databind.introspect.Annotated annotated31 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName32 = jacksonAnnotationIntrospector27.findWrapperName(annotated31);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector34 = jacksonAnnotationIntrospector27.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember35 = null;
        java.lang.String str36 = jacksonAnnotationIntrospector34.findImplicitPropertyName(annotatedMember35);
        com.fasterxml.jackson.databind.introspect.Annotated annotated37 = null;
        java.lang.String[] strArray38 = jacksonAnnotationIntrospector34.findPropertiesToIgnore(annotated37);
        org.junit.Assert.assertNull(include3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(include16);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection17);
        org.junit.Assert.assertNotNull(propertyName20);
        org.junit.Assert.assertNull(include23);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap24);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector27);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertNull(propertyName32);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(strArray38);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include3 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated1, include2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        boolean boolean9 = jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        java.lang.Class<?> wildcardClass14 = jacksonAnnotationIntrospector0.findSerializationType(annotated13);
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector0._findConstructorName(annotated15);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(include3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(propertyName12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(propertyName16);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0._findConstructorName(annotated1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include4 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include5 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated3, include4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.PropertyName> propertyNameList7 = jacksonAnnotationIntrospector0.findPropertyAliases(annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNull(include5);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        java.lang.Boolean boolean2 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector3);
        java.lang.Object obj5 = jacksonAnnotationIntrospector3.readResolve();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector3.findSerializationType(annotated6);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass8 = null;
        java.lang.Boolean boolean9 = jacksonAnnotationIntrospector3.findIgnoreUnknownProperties(annotatedClass8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        java.lang.String[] strArray11 = jacksonAnnotationIntrospector3.findPropertiesToIgnore(annotated10);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName13 = jacksonAnnotationIntrospector3.findWrapperName(annotated12);
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonCreator.Mode mode15 = jacksonAnnotationIntrospector3.findCreatorBinding(annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(annotationIntrospector4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(propertyName13);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        java.lang.Boolean boolean2 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector3);
        java.lang.Object obj5 = jacksonAnnotationIntrospector3.readResolve();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        java.lang.Class<?> wildcardClass7 = jacksonAnnotationIntrospector3.findSerializationType(annotated6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        java.lang.Class<?> wildcardClass9 = jacksonAnnotationIntrospector3.findSerializationType(annotated8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        java.lang.Class<?> wildcardClass12 = jacksonAnnotationIntrospector3.findSerializationKeyType(annotated10, javaType11);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder13 = jacksonAnnotationIntrospector3._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include15 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include16 = jacksonAnnotationIntrospector3.findSerializationInclusion(annotated14, include15);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember17 = null;
        java.lang.String str18 = jacksonAnnotationIntrospector3.findImplicitPropertyName(annotatedMember17);
        com.fasterxml.jackson.databind.introspect.Annotated annotated19 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include20 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include21 = jacksonAnnotationIntrospector3.findSerializationInclusion(annotated19, include20);
        com.fasterxml.jackson.databind.introspect.Annotated annotated22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        java.lang.Class<?> wildcardClass24 = jacksonAnnotationIntrospector3.findDeserializationContentType(annotated22, javaType23);
        com.fasterxml.jackson.databind.introspect.Annotated annotated25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = jacksonAnnotationIntrospector3.findSerializer(annotated25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(annotationIntrospector4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder13);
        org.junit.Assert.assertNull(include16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(include21);
        org.junit.Assert.assertNull(wildcardClass24);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        java.lang.Boolean boolean2 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include4 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include5 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated3, include4);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        java.lang.Boolean boolean8 = jacksonAnnotationIntrospector6.findIgnoreUnknownProperties(annotatedClass7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        java.lang.Class<?> wildcardClass10 = jacksonAnnotationIntrospector6.findSerializationType(annotated9);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder12 = jacksonAnnotationIntrospector6._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.PropertyName propertyName15 = jacksonAnnotationIntrospector6._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        java.lang.Class<?> wildcardClass18 = jacksonAnnotationIntrospector6.findDeserializationType(annotated16, javaType17);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector20 = jacksonAnnotationIntrospector6.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        java.lang.String[] strArray22 = jacksonAnnotationIntrospector6.findPropertiesToIgnore(annotated21);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass23 = null;
        java.lang.Boolean boolean24 = jacksonAnnotationIntrospector6.findIgnoreUnknownProperties(annotatedClass23);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap25 = jacksonAnnotationIntrospector6._annotationsInside;
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(include5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(annotationIntrospector11);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder12);
        org.junit.Assert.assertNotNull(propertyName15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap25);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap1 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        java.lang.Class<?> wildcardClass4 = jacksonAnnotationIntrospector0.findSerializationKeyType(annotated2, javaType3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        java.lang.String[] strArray6 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._findConstructorName(annotated7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jacksonAnnotationIntrospector0._isIgnorable(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassLRUMap1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(propertyName8);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        java.lang.Boolean boolean2 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        java.lang.Class<?> wildcardClass4 = jacksonAnnotationIntrospector0.findSerializationType(annotated3);
        boolean boolean5 = jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include7 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include8 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated6, include7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0.findWrapperName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo12 = jacksonAnnotationIntrospector0.findObjectIdInfo(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(include8);
        org.junit.Assert.assertNull(propertyName10);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        java.lang.Boolean boolean2 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include4 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include5 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated3, include4);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        java.lang.Boolean boolean8 = jacksonAnnotationIntrospector6.findIgnoreUnknownProperties(annotatedClass7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        java.lang.Class<?> wildcardClass10 = jacksonAnnotationIntrospector6.findSerializationType(annotated9);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        java.lang.Class<?> wildcardClass14 = jacksonAnnotationIntrospector0.findDeserializationType(annotated12, javaType13);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = true;
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include18 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include19 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated17, include18);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap20 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass21 = null;
        java.lang.Boolean boolean22 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass21);
        com.fasterxml.jackson.databind.introspect.Annotated annotated23 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        java.lang.Class<?> wildcardClass25 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated23, javaType24);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(include5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(annotationIntrospector11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(include19);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap20);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(wildcardClass25);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include3 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated1, include2);
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        java.lang.Class<?> wildcardClass5 = jacksonAnnotationIntrospector0.findSerializationType(annotated4);
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        java.lang.Class<?> wildcardClass8 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated6, javaType7);
        java.lang.Object obj9 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        java.lang.String[] strArray12 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated10, false);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include15 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include16 = jacksonAnnotationIntrospector13.findSerializationInclusion(annotated14, include15);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection17 = jacksonAnnotationIntrospector13.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName20 = jacksonAnnotationIntrospector13._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include22 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include23 = jacksonAnnotationIntrospector13.findSerializationInclusionForContent(annotated21, include22);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap24 = jacksonAnnotationIntrospector13._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap24;
        java.lang.Object obj26 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass27 = null;
        java.lang.Boolean boolean28 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass27);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector31 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated32 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include33 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include34 = jacksonAnnotationIntrospector31.findSerializationInclusion(annotated32, include33);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection35 = jacksonAnnotationIntrospector31.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName38 = jacksonAnnotationIntrospector31._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder39 = jacksonAnnotationIntrospector31._constructNoTypeResolverBuilder();
        boolean boolean40 = jacksonAnnotationIntrospector31._cfgConstructorPropertiesImpliesCreator;
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder41 = jacksonAnnotationIntrospector31._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated42 = null;
        com.fasterxml.jackson.databind.JavaType javaType43 = null;
        java.lang.Class<?> wildcardClass44 = jacksonAnnotationIntrospector31.findSerializationKeyType(annotated42, javaType43);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap45 = jacksonAnnotationIntrospector31._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap45;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray48 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(include3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(include16);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection17);
        org.junit.Assert.assertNotNull(propertyName20);
        org.junit.Assert.assertNull(include23);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(include34);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection35);
        org.junit.Assert.assertNotNull(propertyName38);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder41);
        org.junit.Assert.assertNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap45);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        java.lang.Boolean boolean2 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include4 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include5 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotated3, include4);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        java.lang.Boolean boolean8 = jacksonAnnotationIntrospector6.findIgnoreUnknownProperties(annotatedClass7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        java.lang.Class<?> wildcardClass10 = jacksonAnnotationIntrospector6.findSerializationType(annotated9);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector6);
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        java.lang.Class<?> wildcardClass14 = jacksonAnnotationIntrospector6.findSerializationKeyType(annotated12, javaType13);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection15 = jacksonAnnotationIntrospector6.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        java.lang.Class<?> wildcardClass17 = jacksonAnnotationIntrospector6.findSerializationType(annotated16);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated19 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include20 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include21 = jacksonAnnotationIntrospector18.findSerializationInclusion(annotated19, include20);
        com.fasterxml.jackson.databind.introspect.Annotated annotated22 = null;
        java.lang.Class<?> wildcardClass23 = jacksonAnnotationIntrospector18.findSerializationType(annotated22);
        com.fasterxml.jackson.databind.introspect.Annotated annotated24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        java.lang.Class<?> wildcardClass26 = jacksonAnnotationIntrospector18.findSerializationContentType(annotated24, javaType25);
        java.lang.Object obj27 = jacksonAnnotationIntrospector18.readResolve();
        com.fasterxml.jackson.databind.introspect.Annotated annotated28 = null;
        java.lang.String[] strArray30 = jacksonAnnotationIntrospector18.findPropertiesToIgnore(annotated28, false);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember31 = null;
        java.lang.String str32 = jacksonAnnotationIntrospector18.findImplicitPropertyName(annotatedMember31);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector33 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector6, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector18);
        com.fasterxml.jackson.databind.introspect.Annotated annotated34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int35 = jacksonAnnotationIntrospector6.findPropertyIndex(annotated34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(include5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(annotationIntrospector11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection15);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNull(include21);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(annotationIntrospector33);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap1 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        java.lang.String[] strArray4 = jacksonAnnotationIntrospector0.findPropertiesToIgnore(annotated3);
        java.lang.Object obj5 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass7 = null;
        java.lang.Boolean boolean8 = jacksonAnnotationIntrospector6.findIgnoreUnknownProperties(annotatedClass7);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector10 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector6, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector9);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap11 = jacksonAnnotationIntrospector9._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass13 = null;
        java.lang.Boolean boolean14 = jacksonAnnotationIntrospector12.findIgnoreUnknownProperties(annotatedClass13);
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include16 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include17 = jacksonAnnotationIntrospector12.findSerializationInclusionForContent(annotated15, include16);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass19 = null;
        java.lang.Boolean boolean20 = jacksonAnnotationIntrospector18.findIgnoreUnknownProperties(annotatedClass19);
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        java.lang.Class<?> wildcardClass22 = jacksonAnnotationIntrospector18.findSerializationType(annotated21);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector23 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector12, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector18);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap24 = jacksonAnnotationIntrospector18._annotationsInside;
        jacksonAnnotationIntrospector9._annotationsInside = wildcardClassLRUMap24;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap24;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector28 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector30 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean32 = jacksonAnnotationIntrospector30.hasRequiredMarker(annotatedMember31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassLRUMap1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(annotationIntrospector10);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap11);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(include17);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertNotNull(annotationIntrospector23);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap24);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector28);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector30);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass1 = null;
        java.lang.Boolean boolean2 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector3);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector3.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        java.lang.String[] strArray8 = jacksonAnnotationIntrospector3.findPropertiesToIgnore(annotated6, true);
        com.fasterxml.jackson.databind.PropertyName propertyName11 = jacksonAnnotationIntrospector3._propertyName("", "");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass13 = null;
        java.lang.Boolean boolean14 = jacksonAnnotationIntrospector12.findIgnoreUnknownProperties(annotatedClass13);
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        java.lang.Class<?> wildcardClass16 = jacksonAnnotationIntrospector12.findSerializationType(annotated15);
        com.fasterxml.jackson.databind.PropertyName propertyName19 = jacksonAnnotationIntrospector12._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include22 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include23 = jacksonAnnotationIntrospector20.findSerializationInclusion(annotated21, include22);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember24 = null;
        java.lang.String str25 = jacksonAnnotationIntrospector20.findImplicitPropertyName(annotatedMember24);
        com.fasterxml.jackson.databind.introspect.Annotated annotated26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = null;
        java.lang.Class<?> wildcardClass28 = jacksonAnnotationIntrospector20.findSerializationKeyType(annotated26, javaType27);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector29 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector12, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector20);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector31 = jacksonAnnotationIntrospector20.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass32 = null;
        java.lang.Boolean boolean33 = jacksonAnnotationIntrospector31.findIgnoreUnknownProperties(annotatedClass32);
        com.fasterxml.jackson.databind.introspect.Annotated annotated34 = null;
        java.lang.Class<?> wildcardClass35 = jacksonAnnotationIntrospector31.findSerializationType(annotated34);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder36 = jacksonAnnotationIntrospector31._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector37 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector3, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector31);
        com.fasterxml.jackson.databind.introspect.Annotated annotated38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = jacksonAnnotationIntrospector3.findKeyDeserializer(annotated38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(annotationIntrospector4);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(propertyName11);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyName19);
        org.junit.Assert.assertNull(include23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNotNull(annotationIntrospector29);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector31);
        org.junit.Assert.assertNull(boolean33);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder36);
        org.junit.Assert.assertNotNull(annotationIntrospector37);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include3 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotated1, include2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection4 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        boolean boolean9 = jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        java.lang.Object obj13 = jacksonAnnotationIntrospector0.readResolve();
        java.lang.Object obj14 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder15 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        java.lang.Class<?> wildcardClass18 = jacksonAnnotationIntrospector0.findSerializationContentType(annotated16, javaType17);
        com.fasterxml.jackson.databind.introspect.Annotated annotated19 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName20 = jacksonAnnotationIntrospector0.findWrapperName(annotated19);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = jacksonAnnotationIntrospector0.findValueInstantiator(annotatedClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(include3);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(propertyName12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(propertyName20);
    }
}

