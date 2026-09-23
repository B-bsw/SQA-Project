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
        com.google.gson.TypeAdapter<java.net.InetAddress> inetAddressTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.INET_ADDRESS;
        org.junit.Assert.assertNotNull(inetAddressTypeAdapter0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.LONG;
        java.lang.Class<?> wildcardClass1 = numberTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.google.gson.TypeAdapter<java.lang.String> strTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.STRING;
        org.junit.Assert.assertNotNull(strTypeAdapter0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.NUMBER_FACTORY;
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.google.gson.TypeAdapter<java.lang.Boolean> booleanTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BOOLEAN_AS_STRING;
        org.junit.Assert.assertNotNull(booleanTypeAdapter0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.NUMBER;
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.google.gson.TypeAdapter<java.util.Locale> localeTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.LOCALE;
        org.junit.Assert.assertNotNull(localeTypeAdapter0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.INET_ADDRESS_FACTORY;
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.CALENDAR_FACTORY;
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.google.gson.TypeAdapter<java.lang.StringBuffer> stringBufferTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.STRING_BUFFER;
        org.junit.Assert.assertNotNull(stringBufferTypeAdapter0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.INTEGER_FACTORY;
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.google.gson.TypeAdapter<java.net.URI> uRITypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.URI;
        org.junit.Assert.assertNotNull(uRITypeAdapter0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.google.gson.TypeAdapter<java.lang.Boolean> booleanTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BOOLEAN;
        org.junit.Assert.assertNotNull(booleanTypeAdapter0);
    }
}

