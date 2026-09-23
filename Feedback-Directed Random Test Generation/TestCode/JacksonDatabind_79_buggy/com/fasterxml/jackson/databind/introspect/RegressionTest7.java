package com.fasterxml.jackson.databind.introspect;

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
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray10 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector9 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList11 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11, annotationIntrospectorArray10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector8.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap14 = jacksonAnnotationIntrospector8._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap14;
        com.fasterxml.jackson.core.Version version16 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder18 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector20 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap21 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.Annotated annotated22 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName23 = jacksonAnnotationIntrospector0.findWrapperName(annotated22);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector25 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.Annotated annotated26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = jacksonAnnotationIntrospector0._isIgnorable(annotated26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap14);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder18);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector20);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap21);
        org.junit.Assert.assertNull(propertyName23);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector25);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray10 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector9 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList11 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11, annotationIntrospectorArray10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector8.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11);
        jacksonAnnotationIntrospector8._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = jacksonAnnotationIntrospector8.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.core.Version version18 = jacksonAnnotationIntrospector8.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector19 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector8);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder20 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember21 = null;
        java.lang.String str22 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember21);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated24 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName25 = jacksonAnnotationIntrospector0._findConstructorName(annotated24);
        boolean boolean26 = jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator;
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection27 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = jacksonAnnotationIntrospector0.findSerializer(annotated28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector17);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(annotationIntrospector19);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNull(propertyName25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection27);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector0.findWrapperName(annotated8);
        com.fasterxml.jackson.core.Version version10 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray13 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector12 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList14 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList14, annotationIntrospectorArray13);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector11.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList14);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap17 = jacksonAnnotationIntrospector11._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap17;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector20 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember21 = null;
        java.lang.String str22 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember21);
        com.fasterxml.jackson.databind.introspect.Annotated annotated23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = jacksonAnnotationIntrospector0.findPropertyDescription(annotated23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap17);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray10 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector9 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList11 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11, annotationIntrospectorArray10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector8.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap14 = jacksonAnnotationIntrospector8._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap14;
        com.fasterxml.jackson.core.Version version16 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName20 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName22 = jacksonAnnotationIntrospector0._findConstructorName(annotated21);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder24 = jacksonAnnotationIntrospector23._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector23);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember26 = null;
        java.lang.String str27 = jacksonAnnotationIntrospector23.findImplicitPropertyName(annotatedMember26);
        com.fasterxml.jackson.databind.PropertyName propertyName30 = jacksonAnnotationIntrospector23._propertyName("hi!", "");
        jacksonAnnotationIntrospector23._cfgConstructorPropertiesImpliesCreator = true;
        com.fasterxml.jackson.core.Version version33 = jacksonAnnotationIntrospector23.version();
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap14);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(propertyName20);
        org.junit.Assert.assertNull(propertyName22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder24);
        org.junit.Assert.assertNotNull(annotationIntrospector25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(propertyName30);
        org.junit.Assert.assertNotNull(version33);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap6 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector10 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector10._findConstructorName(annotated11);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray15 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList16 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList16, annotationIntrospectorArray15);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection18 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList16);
        jacksonAnnotationIntrospector13._cfgConstructorPropertiesImpliesCreator = false;
        jacksonAnnotationIntrospector13._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.Annotated annotated23 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName24 = jacksonAnnotationIntrospector13._findConstructorName(annotated23);
        jacksonAnnotationIntrospector13._cfgConstructorPropertiesImpliesCreator = true;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector10, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.Annotated annotated28 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName29 = jacksonAnnotationIntrospector13.findWrapperName(annotated28);
        boolean boolean30 = jacksonAnnotationIntrospector13._cfgConstructorPropertiesImpliesCreator;
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder31 = jacksonAnnotationIntrospector13._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray33 = jacksonAnnotationIntrospector13.findPropertiesToIgnore(annotated32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector8);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection18);
        org.junit.Assert.assertNull(propertyName24);
        org.junit.Assert.assertNotNull(annotationIntrospector27);
        org.junit.Assert.assertNull(propertyName29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder31);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector0.findWrapperName(annotated11);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = jacksonAnnotationIntrospector0.findDeserializer(annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(propertyName10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        java.lang.String str10 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember9);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray13 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector12 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList14 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList14, annotationIntrospectorArray13);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection16 = jacksonAnnotationIntrospector11.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList14);
        jacksonAnnotationIntrospector11._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector20 = jacksonAnnotationIntrospector11.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.core.Version version21 = jacksonAnnotationIntrospector20.version();
        com.fasterxml.jackson.databind.PropertyName propertyName24 = jacksonAnnotationIntrospector20._propertyName("", "");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder25 = jacksonAnnotationIntrospector20._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector26 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector20);
        java.lang.Object obj27 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder28 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.lang.Object obj29 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.introspect.Annotated annotated30 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName31 = jacksonAnnotationIntrospector0.findWrapperName(annotated30);
        com.fasterxml.jackson.databind.introspect.Annotated annotated32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList33 = jacksonAnnotationIntrospector0.findSubtypes(annotated32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection16);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector20);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNotNull(propertyName24);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder25);
        org.junit.Assert.assertNotNull(annotationIntrospector26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(propertyName31);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray10 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector9 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList11 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11, annotationIntrospectorArray10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector8.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap14 = jacksonAnnotationIntrospector8._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap14;
        com.fasterxml.jackson.core.Version version16 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder18 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector20 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector21 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector22 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray23 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector22 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList24 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList24, annotationIntrospectorArray23);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection26 = jacksonAnnotationIntrospector21.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList24);
        com.fasterxml.jackson.core.Version version27 = jacksonAnnotationIntrospector21.version();
        java.lang.Object obj28 = jacksonAnnotationIntrospector21.readResolve();
        jacksonAnnotationIntrospector21._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector31 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector21);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector32 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector33 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray34 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector33 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList35 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList35, annotationIntrospectorArray34);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection37 = jacksonAnnotationIntrospector32.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList35);
        jacksonAnnotationIntrospector32._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector40 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector41 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray42 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector41 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList43 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList43, annotationIntrospectorArray42);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection45 = jacksonAnnotationIntrospector40.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList43);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap46 = jacksonAnnotationIntrospector40._annotationsInside;
        jacksonAnnotationIntrospector32._annotationsInside = wildcardClassLRUMap46;
        jacksonAnnotationIntrospector21._annotationsInside = wildcardClassLRUMap46;
        boolean boolean49 = jacksonAnnotationIntrospector21._cfgConstructorPropertiesImpliesCreator;
        com.fasterxml.jackson.databind.introspect.Annotated annotated50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = jacksonAnnotationIntrospector21.findKeyDeserializer(annotated50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap14);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder18);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector20);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection26);
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(annotationIntrospector31);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection37);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection45);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray10 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector9 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList11 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11, annotationIntrospectorArray10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector8.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap14 = jacksonAnnotationIntrospector8._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap14;
        com.fasterxml.jackson.core.Version version16 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName20 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName22 = jacksonAnnotationIntrospector0._findConstructorName(annotated21);
        com.fasterxml.jackson.core.Version version23 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector24 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector25 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray26 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector25 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList27 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList27, annotationIntrospectorArray26);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection29 = jacksonAnnotationIntrospector24.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList27);
        jacksonAnnotationIntrospector24._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector32 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector33 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray34 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector33 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList35 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList35, annotationIntrospectorArray34);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection37 = jacksonAnnotationIntrospector32.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList35);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap38 = jacksonAnnotationIntrospector32._annotationsInside;
        jacksonAnnotationIntrospector24._annotationsInside = wildcardClassLRUMap38;
        com.fasterxml.jackson.core.Version version40 = jacksonAnnotationIntrospector24.version();
        com.fasterxml.jackson.core.Version version41 = jacksonAnnotationIntrospector24.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder42 = jacksonAnnotationIntrospector24._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap43 = jacksonAnnotationIntrospector24._annotationsInside;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector44 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector24);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember45 = null;
        java.lang.String str46 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember45);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap47 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.PropertyName propertyName50 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = jacksonAnnotationIntrospector0.hasAnyGetterAnnotation(annotatedMethod51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap14);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(propertyName20);
        org.junit.Assert.assertNull(propertyName22);
        org.junit.Assert.assertNotNull(version23);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection29);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection37);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap38);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder42);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap43);
        org.junit.Assert.assertNotNull(annotationIntrospector44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap47);
        org.junit.Assert.assertNotNull(propertyName50);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap8 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = jacksonAnnotationIntrospector0.isTypeId(annotatedMember9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap8);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        java.lang.Object obj6 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.core.Version version7 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version8 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = jacksonAnnotationIntrospector0.findSerializationPropertyOrder(annotatedClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(version8);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection14 = jacksonAnnotationIntrospector13.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = jacksonAnnotationIntrospector13.findPropertyDescription(annotated15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector13);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection14);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector10 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray11 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector10 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList12 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList12, annotationIntrospectorArray11);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection14 = jacksonAnnotationIntrospector9.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList12);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection15 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection14);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        boolean boolean18 = jacksonAnnotationIntrospector17._cfgConstructorPropertiesImpliesCreator;
        jacksonAnnotationIntrospector17._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap21 = jacksonAnnotationIntrospector17._annotationsInside;
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder22 = jacksonAnnotationIntrospector17._constructNoTypeResolverBuilder();
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector8);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection14);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection15);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap21);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder22);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap6 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap9 = jacksonAnnotationIntrospector8._annotationsInside;
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector8._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector12 = jacksonAnnotationIntrospector8.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray15 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList16 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList16, annotationIntrospectorArray15);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection18 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList16);
        jacksonAnnotationIntrospector13._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector22 = jacksonAnnotationIntrospector13.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder23 = jacksonAnnotationIntrospector13._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap24 = jacksonAnnotationIntrospector13._annotationsInside;
        jacksonAnnotationIntrospector13._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector12, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap28 = jacksonAnnotationIntrospector12._annotationsInside;
        com.fasterxml.jackson.databind.introspect.Annotated annotated29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = jacksonAnnotationIntrospector12._isIgnorable(annotated29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector8);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector12);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection18);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector22);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder23);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap24);
        org.junit.Assert.assertNotNull(annotationIntrospector27);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap28);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        java.lang.Object obj6 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.core.Version version7 = jacksonAnnotationIntrospector0.version();
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection11 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonCreator.Mode mode13 = jacksonAnnotationIntrospector0.findCreatorBinding(annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection11);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap6 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector10 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector10._findConstructorName(annotated11);
        boolean boolean13 = jacksonAnnotationIntrospector10._cfgConstructorPropertiesImpliesCreator;
        java.lang.Object obj14 = jacksonAnnotationIntrospector10.readResolve();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection15 = jacksonAnnotationIntrospector10.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = jacksonAnnotationIntrospector10.findSerializationPropertyOrder(annotatedClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector8);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection15);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jacksonAnnotationIntrospector8.findSerializationConverter(annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector8);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap11 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray14 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector13 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList15 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList15, annotationIntrospectorArray14);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection17 = jacksonAnnotationIntrospector12.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList15);
        jacksonAnnotationIntrospector12._cfgConstructorPropertiesImpliesCreator = false;
        jacksonAnnotationIntrospector12._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.Annotated annotated22 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName23 = jacksonAnnotationIntrospector12._findConstructorName(annotated22);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector12);
        com.fasterxml.jackson.databind.introspect.Annotated annotated25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = jacksonAnnotationIntrospector12.hasCreatorAnnotation(annotated25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap11);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection17);
        org.junit.Assert.assertNull(propertyName23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonCreator.Mode mode15 = jacksonAnnotationIntrospector0.findCreatorBinding(annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = true;
        boolean boolean4 = jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator;
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName6 = jacksonAnnotationIntrospector0._findConstructorName(annotated5);
        com.fasterxml.jackson.core.Version version7 = jacksonAnnotationIntrospector0.version();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertNotNull(version7);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap11 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray14 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector13 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList15 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList15, annotationIntrospectorArray14);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection17 = jacksonAnnotationIntrospector12.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList15);
        jacksonAnnotationIntrospector12._cfgConstructorPropertiesImpliesCreator = false;
        jacksonAnnotationIntrospector12._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.Annotated annotated22 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName23 = jacksonAnnotationIntrospector12._findConstructorName(annotated22);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector12);
        com.fasterxml.jackson.databind.introspect.Annotated annotated25 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo27 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated25, objectIdInfo26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap11);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection17);
        org.junit.Assert.assertNull(propertyName23);
        org.junit.Assert.assertNotNull(annotationIntrospector24);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap6 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector10 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector10._findConstructorName(annotated11);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray15 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList16 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList16, annotationIntrospectorArray15);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection18 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList16);
        jacksonAnnotationIntrospector13._cfgConstructorPropertiesImpliesCreator = false;
        jacksonAnnotationIntrospector13._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.Annotated annotated23 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName24 = jacksonAnnotationIntrospector13._findConstructorName(annotated23);
        jacksonAnnotationIntrospector13._cfgConstructorPropertiesImpliesCreator = true;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector10, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.Annotated annotated28 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName29 = jacksonAnnotationIntrospector13.findWrapperName(annotated28);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap30 = jacksonAnnotationIntrospector13._annotationsInside;
        com.fasterxml.jackson.databind.introspect.Annotated annotated31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = jacksonAnnotationIntrospector13.findKeySerializer(annotated31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector8);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection18);
        org.junit.Assert.assertNull(propertyName24);
        org.junit.Assert.assertNotNull(annotationIntrospector27);
        org.junit.Assert.assertNull(propertyName29);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap30);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector0.findWrapperName(annotated11);
        com.fasterxml.jackson.core.Version version13 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap14 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector0.findRootName(annotatedClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap14);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray10 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector9 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList11 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11, annotationIntrospectorArray10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector8.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap14 = jacksonAnnotationIntrospector8._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap14;
        com.fasterxml.jackson.core.Version version16 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder18 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector20 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap21 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.Annotated annotated22 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName23 = jacksonAnnotationIntrospector0.findWrapperName(annotated22);
        com.fasterxml.jackson.databind.introspect.Annotated annotated24 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName25 = jacksonAnnotationIntrospector0._findConstructorName(annotated24);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceProperty27 = jacksonAnnotationIntrospector0.findReferenceType(annotatedMember26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap14);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder18);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector20);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap21);
        org.junit.Assert.assertNull(propertyName23);
        org.junit.Assert.assertNull(propertyName25);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray10 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector9 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList11 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11, annotationIntrospectorArray10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector8.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11);
        jacksonAnnotationIntrospector8._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = jacksonAnnotationIntrospector8.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.core.Version version18 = jacksonAnnotationIntrospector8.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector19 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector8);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder20 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder21 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.core.Version version24 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector25 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray27 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector26 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList28 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList28, annotationIntrospectorArray27);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection30 = jacksonAnnotationIntrospector25.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList28);
        com.fasterxml.jackson.core.Version version31 = jacksonAnnotationIntrospector25.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector33 = jacksonAnnotationIntrospector25.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector34 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector35 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray36 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector35 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList37 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList37, annotationIntrospectorArray36);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection39 = jacksonAnnotationIntrospector34.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList37);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection40 = jacksonAnnotationIntrospector25.allIntrospectors(annotationIntrospectorCollection39);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection41 = jacksonAnnotationIntrospector0.allIntrospectors(annotationIntrospectorCollection39);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector43 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection44 = jacksonAnnotationIntrospector0.allIntrospectors();
        com.fasterxml.jackson.core.Version version45 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated46 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo47 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo48 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotated46, objectIdInfo47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector17);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(annotationIntrospector19);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder20);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder21);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection30);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector33);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection39);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection40);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection41);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector43);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection44);
        org.junit.Assert.assertNotNull(version45);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray10 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector9 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList11 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11, annotationIntrospectorArray10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector8.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11);
        jacksonAnnotationIntrospector8._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = jacksonAnnotationIntrospector8.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.core.Version version18 = jacksonAnnotationIntrospector8.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector19 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector8);
        com.fasterxml.jackson.databind.introspect.Annotated annotated20 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName21 = jacksonAnnotationIntrospector8.findWrapperName(annotated20);
        com.fasterxml.jackson.databind.PropertyName propertyName24 = jacksonAnnotationIntrospector8._propertyName("", "");
        java.lang.annotation.Annotation annotation25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = jacksonAnnotationIntrospector8.isAnnotationBundle(annotation25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector17);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(annotationIntrospector19);
        org.junit.Assert.assertNull(propertyName21);
        org.junit.Assert.assertNotNull(propertyName24);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        jacksonAnnotationIntrospector8._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray12 = jacksonAnnotationIntrospector8.findViews(annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector8);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray10 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector9 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList11 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11, annotationIntrospectorArray10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector8.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap14 = jacksonAnnotationIntrospector8._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap14;
        com.fasterxml.jackson.core.Version version16 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName20 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName22 = jacksonAnnotationIntrospector0._findConstructorName(annotated21);
        com.fasterxml.jackson.core.Version version23 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector24 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector25 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray26 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector25 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList27 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList27, annotationIntrospectorArray26);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection29 = jacksonAnnotationIntrospector24.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList27);
        jacksonAnnotationIntrospector24._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector32 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector33 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray34 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector33 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList35 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList35, annotationIntrospectorArray34);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection37 = jacksonAnnotationIntrospector32.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList35);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap38 = jacksonAnnotationIntrospector32._annotationsInside;
        jacksonAnnotationIntrospector24._annotationsInside = wildcardClassLRUMap38;
        com.fasterxml.jackson.core.Version version40 = jacksonAnnotationIntrospector24.version();
        com.fasterxml.jackson.core.Version version41 = jacksonAnnotationIntrospector24.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder42 = jacksonAnnotationIntrospector24._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap43 = jacksonAnnotationIntrospector24._annotationsInside;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector44 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector24);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember45 = null;
        java.lang.String str46 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember45);
        com.fasterxml.jackson.databind.introspect.Annotated annotated47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray48 = jacksonAnnotationIntrospector0.findViews(annotated47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap14);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(propertyName20);
        org.junit.Assert.assertNull(propertyName22);
        org.junit.Assert.assertNotNull(version23);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection29);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection37);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap38);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder42);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap43);
        org.junit.Assert.assertNotNull(annotationIntrospector44);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = jacksonAnnotationIntrospector0._findConstructorName(annotated7);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector10 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray11 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector10 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList12 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList12, annotationIntrospectorArray11);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection14 = jacksonAnnotationIntrospector9.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList12);
        jacksonAnnotationIntrospector9._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = jacksonAnnotationIntrospector9.findWrapperName(annotated17);
        com.fasterxml.jackson.core.Version version19 = jacksonAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector21 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray22 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector21 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList23 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList23, annotationIntrospectorArray22);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection25 = jacksonAnnotationIntrospector20.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList23);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap26 = jacksonAnnotationIntrospector20._annotationsInside;
        jacksonAnnotationIntrospector9._annotationsInside = wildcardClassLRUMap26;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap26;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector30 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.Annotated annotated31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = jacksonAnnotationIntrospector30.hasCreatorAnnotation(annotated31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection14);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection25);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap26);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector30);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap6 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector10 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector10._findConstructorName(annotated11);
        boolean boolean13 = jacksonAnnotationIntrospector10._cfgConstructorPropertiesImpliesCreator;
        java.lang.Object obj14 = jacksonAnnotationIntrospector10.readResolve();
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection15 = jacksonAnnotationIntrospector10.allIntrospectors();
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int17 = jacksonAnnotationIntrospector10.findPropertyIndex(annotated16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector8);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection15);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap11 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName13 = jacksonAnnotationIntrospector0._findConstructorName(annotated12);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = jacksonAnnotationIntrospector0.findPOJOBuilder(annotatedClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap11);
        org.junit.Assert.assertNull(propertyName13);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray10 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector9 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList11 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11, annotationIntrospectorArray10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector8.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11);
        jacksonAnnotationIntrospector8._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector17 = jacksonAnnotationIntrospector8.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.core.Version version18 = jacksonAnnotationIntrospector8.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector19 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector8);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder20 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember21 = null;
        java.lang.String str22 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember21);
        boolean boolean23 = jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator;
        boolean boolean24 = jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator;
        com.fasterxml.jackson.databind.introspect.Annotated annotated25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = jacksonAnnotationIntrospector0.findSerializationConverter(annotated25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector17);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(annotationIntrospector19);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap6 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector10 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder12 = jacksonAnnotationIntrospector11._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = jacksonAnnotationIntrospector11.findWrapperName(annotated13);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector15 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector10, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector11);
        java.lang.Object obj16 = jacksonAnnotationIntrospector11.readResolve();
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean18 = jacksonAnnotationIntrospector11.findSerializationSortAlphabetically(annotated17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector8);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder12);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNotNull(annotationIntrospector15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap6 = jacksonAnnotationIntrospector0._annotationsInside;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector10 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector10._findConstructorName(annotated11);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray15 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList16 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList16, annotationIntrospectorArray15);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection18 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList16);
        jacksonAnnotationIntrospector13._cfgConstructorPropertiesImpliesCreator = false;
        jacksonAnnotationIntrospector13._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.Annotated annotated23 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName24 = jacksonAnnotationIntrospector13._findConstructorName(annotated23);
        jacksonAnnotationIntrospector13._cfgConstructorPropertiesImpliesCreator = true;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector10, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector13);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember28 = null;
        java.lang.String str29 = jacksonAnnotationIntrospector10.findImplicitPropertyName(annotatedMember28);
        com.fasterxml.jackson.databind.introspect.Annotated annotated30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = jacksonAnnotationIntrospector10.findDeserializationConverter(annotated30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap6);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector8);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection18);
        org.junit.Assert.assertNull(propertyName24);
        org.junit.Assert.assertNotNull(annotationIntrospector27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        java.lang.Object obj7 = jacksonAnnotationIntrospector0.readResolve();
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector0.findWrapperName(annotated11);
        java.lang.Class<?> wildcardClass13 = jacksonAnnotationIntrospector0.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = true;
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector5 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = jacksonAnnotationIntrospector5._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = jacksonAnnotationIntrospector5._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = jacksonAnnotationIntrospector5.findWrapperName(annotated8);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector10 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector5);
        boolean boolean11 = jacksonAnnotationIntrospector5._cfgConstructorPropertiesImpliesCreator;
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName13 = jacksonAnnotationIntrospector5._findConstructorName(annotated12);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = jacksonAnnotationIntrospector5.findPOJOBuilder(annotatedClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(annotationIntrospector10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(propertyName13);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray10 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector9 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList11 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11, annotationIntrospectorArray10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector8.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap14 = jacksonAnnotationIntrospector8._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap14;
        com.fasterxml.jackson.core.Version version16 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.PropertyName propertyName20 = jacksonAnnotationIntrospector0._propertyName("hi!", "");
        com.fasterxml.jackson.databind.introspect.Annotated annotated21 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName22 = jacksonAnnotationIntrospector0._findConstructorName(annotated21);
        com.fasterxml.jackson.core.Version version23 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector24 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector25 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray26 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector25 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList27 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList27, annotationIntrospectorArray26);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection29 = jacksonAnnotationIntrospector24.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList27);
        jacksonAnnotationIntrospector24._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector32 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector33 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray34 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector33 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList35 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList35, annotationIntrospectorArray34);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection37 = jacksonAnnotationIntrospector32.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList35);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap38 = jacksonAnnotationIntrospector32._annotationsInside;
        jacksonAnnotationIntrospector24._annotationsInside = wildcardClassLRUMap38;
        com.fasterxml.jackson.core.Version version40 = jacksonAnnotationIntrospector24.version();
        com.fasterxml.jackson.core.Version version41 = jacksonAnnotationIntrospector24.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder42 = jacksonAnnotationIntrospector24._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap43 = jacksonAnnotationIntrospector24._annotationsInside;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector44 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector24);
        com.fasterxml.jackson.databind.introspect.Annotated annotated45 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName46 = jacksonAnnotationIntrospector24._findConstructorName(annotated45);
        com.fasterxml.jackson.core.Version version47 = jacksonAnnotationIntrospector24.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember48 = null;
        java.lang.String str49 = jacksonAnnotationIntrospector24.findImplicitPropertyName(annotatedMember48);
        com.fasterxml.jackson.databind.introspect.Annotated annotated50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = jacksonAnnotationIntrospector24.findDeserializer(annotated50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap14);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(propertyName20);
        org.junit.Assert.assertNull(propertyName22);
        org.junit.Assert.assertNotNull(version23);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection29);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection37);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap38);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder42);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap43);
        org.junit.Assert.assertNotNull(annotationIntrospector44);
        org.junit.Assert.assertNull(propertyName46);
        org.junit.Assert.assertNotNull(version47);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = null;
        java.lang.String str10 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector0._findConstructorName(annotated11);
        java.lang.Object obj13 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.PropertyName propertyName16 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        java.lang.Object obj17 = jacksonAnnotationIntrospector0.readResolve();
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(propertyName16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        com.fasterxml.jackson.core.Version version6 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember7 = null;
        java.lang.String str8 = jacksonAnnotationIntrospector0.findImplicitPropertyName(annotatedMember7);
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = jacksonAnnotationIntrospector0._findConstructorName(annotated9);
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = jacksonAnnotationIntrospector0.findWrapperName(annotated11);
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = jacksonAnnotationIntrospector0.findSerializationType(annotated13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNull(propertyName12);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder1 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = jacksonAnnotationIntrospector0.findWrapperName(annotated3);
        com.fasterxml.jackson.databind.PropertyName propertyName7 = jacksonAnnotationIntrospector0._propertyName("hi!", "hi!");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray10 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector9 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList11 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11, annotationIntrospectorArray10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector8.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11);
        jacksonAnnotationIntrospector8._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName17 = jacksonAnnotationIntrospector8.findWrapperName(annotated16);
        com.fasterxml.jackson.core.Version version18 = jacksonAnnotationIntrospector8.version();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray21 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector20 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList22 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList22, annotationIntrospectorArray21);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection24 = jacksonAnnotationIntrospector19.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList22);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap25 = jacksonAnnotationIntrospector19._annotationsInside;
        jacksonAnnotationIntrospector8._annotationsInside = wildcardClassLRUMap25;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector8);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean29 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(propertyName7);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNull(propertyName17);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection24);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap25);
        org.junit.Assert.assertNotNull(annotationIntrospector27);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        java.lang.Object obj11 = jacksonAnnotationIntrospector0.readResolve();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder12 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector9);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder12);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.Annotated annotated1 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = jacksonAnnotationIntrospector0.findWrapperName(annotated1);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector5 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray7 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector6 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList8 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList8, annotationIntrospectorArray7);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection10 = jacksonAnnotationIntrospector5.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList8);
        jacksonAnnotationIntrospector5._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray15 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector14 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList16 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList16, annotationIntrospectorArray15);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection18 = jacksonAnnotationIntrospector13.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList16);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap19 = jacksonAnnotationIntrospector13._annotationsInside;
        jacksonAnnotationIntrospector5._annotationsInside = wildcardClassLRUMap19;
        com.fasterxml.jackson.core.Version version21 = jacksonAnnotationIntrospector5.version();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector22 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector5);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean24 = jacksonAnnotationIntrospector0.findIgnoreUnknownProperties(annotatedClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector4);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection10);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection18);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap19);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNotNull(annotationIntrospector22);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray2 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector1 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList3 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3, annotationIntrospectorArray2);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection5 = jacksonAnnotationIntrospector0.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList3);
        jacksonAnnotationIntrospector0._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray10 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector9 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList11 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11, annotationIntrospectorArray10);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection13 = jacksonAnnotationIntrospector8.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList11);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap14 = jacksonAnnotationIntrospector8._annotationsInside;
        jacksonAnnotationIntrospector0._annotationsInside = wildcardClassLRUMap14;
        com.fasterxml.jackson.core.Version version16 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.core.Version version17 = jacksonAnnotationIntrospector0.version();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder18 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector20 = jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector21 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector22 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray23 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector22 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList24 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList24, annotationIntrospectorArray23);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection26 = jacksonAnnotationIntrospector21.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList24);
        com.fasterxml.jackson.core.Version version27 = jacksonAnnotationIntrospector21.version();
        java.lang.Object obj28 = jacksonAnnotationIntrospector21.readResolve();
        jacksonAnnotationIntrospector21._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector31 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector0, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector21);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector32 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector33 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        com.fasterxml.jackson.databind.AnnotationIntrospector[] annotationIntrospectorArray34 = new com.fasterxml.jackson.databind.AnnotationIntrospector[] { jacksonAnnotationIntrospector33 };
        java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorList35 = new java.util.ArrayList<com.fasterxml.jackson.databind.AnnotationIntrospector>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList35, annotationIntrospectorArray34);
        java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector> annotationIntrospectorCollection37 = jacksonAnnotationIntrospector32.allIntrospectors((java.util.Collection<com.fasterxml.jackson.databind.AnnotationIntrospector>) annotationIntrospectorList35);
        jacksonAnnotationIntrospector32._cfgConstructorPropertiesImpliesCreator = false;
        com.fasterxml.jackson.databind.PropertyName propertyName42 = jacksonAnnotationIntrospector32._propertyName("hi!", "");
        com.fasterxml.jackson.databind.PropertyName propertyName45 = jacksonAnnotationIntrospector32._propertyName("hi!", "");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector46 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector21, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonAnnotationIntrospector32);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder47 = jacksonAnnotationIntrospector32._constructNoTypeResolverBuilder();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, java.lang.Boolean> wildcardClassLRUMap48 = jacksonAnnotationIntrospector32._annotationsInside;
        com.fasterxml.jackson.core.Version version49 = jacksonAnnotationIntrospector32.version();
        org.junit.Assert.assertNotNull(annotationIntrospectorArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection5);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection13);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap14);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder18);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector20);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection26);
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(annotationIntrospector31);
        org.junit.Assert.assertNotNull(annotationIntrospectorArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(annotationIntrospectorCollection37);
        org.junit.Assert.assertNotNull(propertyName42);
        org.junit.Assert.assertNotNull(propertyName45);
        org.junit.Assert.assertNotNull(annotationIntrospector46);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder47);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap48);
        org.junit.Assert.assertNotNull(version49);
    }
}

