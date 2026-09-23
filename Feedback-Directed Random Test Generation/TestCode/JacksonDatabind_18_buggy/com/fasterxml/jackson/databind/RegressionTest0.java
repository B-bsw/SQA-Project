package com.fasterxml.jackson.databind;

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
        com.fasterxml.jackson.databind.MappingIterator<?> wildcardItor0 = com.fasterxml.jackson.databind.MappingIterator.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = wildcardItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.databind.MappingIterator<?> wildcardItor0 = com.fasterxml.jackson.databind.MappingIterator.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = wildcardItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.MappingIterator<?> wildcardItor0 = com.fasterxml.jackson.databind.MappingIterator.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = wildcardItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.databind.MappingIterator<?> wildcardItor0 = com.fasterxml.jackson.databind.MappingIterator.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = wildcardItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.MappingIterator<?> wildcardItor0 = com.fasterxml.jackson.databind.MappingIterator.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = wildcardItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.MappingIterator<?> wildcardItor0 = com.fasterxml.jackson.databind.MappingIterator.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = wildcardItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.CharSequence> charSequenceItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.MappingIterator<?> wildcardItor0 = com.fasterxml.jackson.databind.MappingIterator.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = wildcardItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardClassItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Closeable> closeableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = closeableItor0.getClass();
        org.junit.Assert.assertNotNull(closeableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.MappingIterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.MappingIterator<?> wildcardItor0 = com.fasterxml.jackson.databind.MappingIterator.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = wildcardItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardClassItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.MappingIterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.MappingIterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.CharSequence> charSequenceItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.databind.MappingIterator<?> wildcardItor0 = com.fasterxml.jackson.databind.MappingIterator.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = wildcardItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardClassItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.MappingIterator<?> wildcardItor0 = com.fasterxml.jackson.databind.MappingIterator.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = wildcardItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strComparableItor0.getClass();
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Serializable> serializableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = serializableItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Serializable> serializableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = serializableItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.String> strItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strItor0.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Closeable> closeableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = closeableItor0.getClass();
        org.junit.Assert.assertNotNull(closeableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.CharSequence> charSequenceItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.AutoCloseable> autoCloseableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = autoCloseableItor0.getClass();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.String> strItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strItor0.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.databind.MappingIterator<java.util.Iterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Closeable> closeableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = closeableItor0.getClass();
        org.junit.Assert.assertNotNull(closeableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardClassItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.CharSequence> charSequenceItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.AutoCloseable> autoCloseableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = autoCloseableItor0.getClass();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.Type> typeItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = typeItor0.getClass();
        org.junit.Assert.assertNotNull(typeItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.MappingIterator<?> wildcardItor0 = com.fasterxml.jackson.databind.MappingIterator.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = wildcardItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.Type> typeItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = typeItor0.getClass();
        org.junit.Assert.assertNotNull(typeItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.String> strItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strItor0.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.MappingIterator<java.util.Iterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardClassItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.String> strItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strItor0.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.MappingIterator<java.util.Iterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strComparableItor0.getClass();
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.Type> typeItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = typeItor0.getClass();
        org.junit.Assert.assertNotNull(typeItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.CharSequence> charSequenceItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.Type> typeItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = typeItor0.getClass();
        org.junit.Assert.assertNotNull(typeItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Serializable> serializableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = serializableItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.MappingIterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.String> strItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strItor0.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.MappingIterator<?> wildcardItor0 = com.fasterxml.jackson.databind.MappingIterator.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = wildcardItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Closeable> closeableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = closeableItor0.getClass();
        org.junit.Assert.assertNotNull(closeableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.CharSequence> charSequenceItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Serializable> serializableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = serializableItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.CharSequence> charSequenceItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.Type> typeItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = typeItor0.getClass();
        org.junit.Assert.assertNotNull(typeItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strComparableItor0.getClass();
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardClassItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strComparableItor0.getClass();
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.MappingIterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.MappingIterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.String> strItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strItor0.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strComparableItor0.getClass();
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.Type> typeItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = typeItor0.getClass();
        org.junit.Assert.assertNotNull(typeItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.MappingIterator<?> wildcardItor0 = com.fasterxml.jackson.databind.MappingIterator.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = wildcardItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strComparableItor0.getClass();
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.AutoCloseable> autoCloseableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = autoCloseableItor0.getClass();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Serializable> serializableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = serializableItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strComparableItor0.getClass();
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.Type> typeItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = typeItor0.getClass();
        org.junit.Assert.assertNotNull(typeItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardClassItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.CharSequence> charSequenceItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Closeable> closeableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = closeableItor0.getClass();
        org.junit.Assert.assertNotNull(closeableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.MappingIterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardClassItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.CharSequence> charSequenceItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.String> strItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strItor0.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Closeable> closeableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = closeableItor0.getClass();
        org.junit.Assert.assertNotNull(closeableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.AutoCloseable> autoCloseableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = autoCloseableItor0.getClass();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.MappingIterator<java.util.Iterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Closeable> closeableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = closeableItor0.getClass();
        org.junit.Assert.assertNotNull(closeableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Closeable> closeableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = closeableItor0.getClass();
        org.junit.Assert.assertNotNull(closeableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.MappingIterator<java.util.Iterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Serializable> serializableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = serializableItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.String> strItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strItor0.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strComparableItor0.getClass();
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Serializable> serializableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = serializableItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Serializable> serializableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = serializableItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.MappingIterator<java.util.Iterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.MappingIterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Closeable> closeableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = closeableItor0.getClass();
        org.junit.Assert.assertNotNull(closeableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.AutoCloseable> autoCloseableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = autoCloseableItor0.getClass();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.databind.MappingIterator<java.util.Iterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.Type> typeItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = typeItor0.getClass();
        org.junit.Assert.assertNotNull(typeItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Closeable> closeableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = closeableItor0.getClass();
        org.junit.Assert.assertNotNull(closeableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.MappingIterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardClassItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.AutoCloseable> autoCloseableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = autoCloseableItor0.getClass();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.MappingIterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.String> strItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strItor0.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardClassItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.String> strItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strItor0.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Serializable> serializableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = serializableItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strComparableItor0.getClass();
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.AutoCloseable> autoCloseableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = autoCloseableItor0.getClass();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Serializable> serializableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = serializableItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Serializable> serializableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = serializableItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.AutoCloseable> autoCloseableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = autoCloseableItor0.getClass();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.MappingIterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.Type> typeItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = typeItor0.getClass();
        org.junit.Assert.assertNotNull(typeItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.Type> typeItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = typeItor0.getClass();
        org.junit.Assert.assertNotNull(typeItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.databind.MappingIterator<java.util.Iterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.MappingIterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.Type> typeItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = typeItor0.getClass();
        org.junit.Assert.assertNotNull(typeItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.CharSequence> charSequenceItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.databind.MappingIterator<java.util.Iterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.String> strItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strItor0.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.databind.MappingIterator<java.util.Iterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardClassItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.String> strItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strItor0.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.CharSequence> charSequenceItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.databind.MappingIterator<java.util.Iterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.MappingIterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.AutoCloseable> autoCloseableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = autoCloseableItor0.getClass();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.databind.MappingIterator<java.util.Iterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strComparableItor0.getClass();
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.Type> typeItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = typeItor0.getClass();
        org.junit.Assert.assertNotNull(typeItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Closeable> closeableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = closeableItor0.getClass();
        org.junit.Assert.assertNotNull(closeableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Closeable> closeableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = closeableItor0.getClass();
        org.junit.Assert.assertNotNull(closeableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.AutoCloseable> autoCloseableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = autoCloseableItor0.getClass();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardClassItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.CharSequence> charSequenceItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.AutoCloseable> autoCloseableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = autoCloseableItor0.getClass();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.CharSequence> charSequenceItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.fasterxml.jackson.databind.MappingIterator<java.util.Iterator<?>> wildcardItorItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.Type> typeItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = typeItor0.getClass();
        org.junit.Assert.assertNotNull(typeItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.String> strItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strItor0.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Closeable> closeableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = closeableItor0.getClass();
        org.junit.Assert.assertNotNull(closeableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Serializable> serializableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = serializableItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strComparableItor0.getClass();
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.fasterxml.jackson.databind.MappingIterator<java.io.Serializable> serializableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = serializableItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strComparableItor0.getClass();
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = strComparableItor0.getClass();
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Class<?>> wildcardClassItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = wildcardClassItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.AutoCloseable> autoCloseableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = autoCloseableItor0.getClass();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.fasterxml.jackson.databind.MappingIterator<java.lang.AutoCloseable> autoCloseableItor0 = com.fasterxml.jackson.databind.MappingIterator.emptyIterator();
        java.lang.Class<?> wildcardClass1 = autoCloseableItor0.getClass();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

