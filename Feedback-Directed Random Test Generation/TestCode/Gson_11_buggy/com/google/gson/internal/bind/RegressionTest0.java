package com.google.gson.internal.bind;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.TIMESTAMP_FACTORY;
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.google.gson.TypeAdapter<java.math.BigInteger> bigIntegerTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BIG_INTEGER;
        org.junit.Assert.assertNotNull(bigIntegerTypeAdapter0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.FLOAT;
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.BYTE_FACTORY;
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.CHARACTER_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.SHORT;
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.LOCALE_FACTORY;
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.BIT_SET_FACTORY;
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.google.gson.TypeAdapter<java.lang.StringBuilder> stringBuilderTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.STRING_BUILDER;
        org.junit.Assert.assertNotNull(stringBuilderTypeAdapter0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.google.gson.TypeAdapter<java.lang.Character> charTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.CHARACTER;
        org.junit.Assert.assertNotNull(charTypeAdapter0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.google.gson.TypeAdapter<java.lang.Boolean> booleanTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BOOLEAN;
        org.junit.Assert.assertNotNull(booleanTypeAdapter0);
    }
}

