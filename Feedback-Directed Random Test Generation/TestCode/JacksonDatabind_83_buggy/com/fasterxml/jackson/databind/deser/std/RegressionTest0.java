package com.fasterxml.jackson.databind.deser.std;

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
        int int0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.STD_URL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.STD_CHARSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.STD_PATTERN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.STD_FILE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.STD_CLASS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.STD_TIME_ZONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.STD_URI;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        int int0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.STD_INET_ADDRESS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int int0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.STD_STRING_BUILDER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Class<?>[] wildcardClassArray0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.types();
        java.lang.Class<?> wildcardClass1 = wildcardClassArray0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertArrayEquals(wildcardClassArray0, new java.lang.Class[] { java.io.File.class, java.net.URL.class, java.net.URI.class, java.lang.Class.class, com.fasterxml.jackson.databind.JavaType.class, java.util.Currency.class, java.util.regex.Pattern.class, java.util.Locale.class, java.nio.charset.Charset.class, java.util.TimeZone.class, java.net.InetAddress.class, java.net.InetSocketAddress.class, java.lang.StringBuilder.class });
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.Class<?>[] wildcardClassArray0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.types();
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertArrayEquals(wildcardClassArray0, new java.lang.Class[] { java.io.File.class, java.net.URL.class, java.net.URI.class, java.lang.Class.class, com.fasterxml.jackson.databind.JavaType.class, java.util.Currency.class, java.util.regex.Pattern.class, java.util.Locale.class, java.nio.charset.Charset.class, java.util.TimeZone.class, java.net.InetAddress.class, java.net.InetSocketAddress.class, java.lang.StringBuilder.class });
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int int0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.STD_JAVA_TYPE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        int int0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.STD_LOCALE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int int0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.STD_CURRENCY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }
}

