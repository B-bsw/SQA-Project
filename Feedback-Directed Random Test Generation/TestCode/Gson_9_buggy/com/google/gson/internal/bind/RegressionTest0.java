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
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.LOCALE_FACTORY;
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.INTEGER;
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.google.gson.TypeAdapter<java.net.URI> uRITypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.URI;
        org.junit.Assert.assertNotNull(uRITypeAdapter0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.gson.TypeAdapter<com.google.gson.JsonElement> jsonElementTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT;
        org.junit.Assert.assertNotNull(jsonElementTypeAdapter0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.google.gson.TypeAdapter<java.util.Locale> localeTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.LOCALE;
        org.junit.Assert.assertNotNull(localeTypeAdapter0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicBoolean> atomicBooleanTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_BOOLEAN;
        org.junit.Assert.assertNotNull(atomicBooleanTypeAdapter0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicIntegerArray> atomicIntegerArrayTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_ARRAY;
        org.junit.Assert.assertNotNull(atomicIntegerArrayTypeAdapter0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.gson.TypeAdapter<java.lang.Boolean> booleanTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BOOLEAN_AS_STRING;
        org.junit.Assert.assertNotNull(booleanTypeAdapter0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.gson.TypeAdapter<java.net.InetAddress> inetAddressTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.INET_ADDRESS;
        org.junit.Assert.assertNotNull(inetAddressTypeAdapter0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.google.gson.TypeAdapter<java.math.BigDecimal> bigDecimalTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BIG_DECIMAL;
        org.junit.Assert.assertNotNull(bigDecimalTypeAdapter0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.google.gson.TypeAdapter<java.util.UUID> uUIDTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.UUID;
        org.junit.Assert.assertNotNull(uUIDTypeAdapter0);
    }
}

