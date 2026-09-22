package org.mockito.internal.configuration;

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.Class<?> wildcardClass1 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = obj3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.annotation.Annotation annotation7 = null;
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = spyAnnotationEngine0.createMockFor(annotation7, field8);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        org.mockito.internal.configuration.SpyAnnotationEngine spyAnnotationEngine0 = new org.mockito.internal.configuration.SpyAnnotationEngine();
        java.lang.annotation.Annotation annotation1 = null;
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = spyAnnotationEngine0.createMockFor(annotation1, field2);
        java.lang.annotation.Annotation annotation4 = null;
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = spyAnnotationEngine0.createMockFor(annotation4, field5);
        java.lang.Class<?> wildcardClass7 = spyAnnotationEngine0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

