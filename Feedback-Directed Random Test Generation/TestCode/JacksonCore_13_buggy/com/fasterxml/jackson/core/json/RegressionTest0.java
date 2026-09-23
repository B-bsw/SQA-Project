package com.fasterxml.jackson.core.json;

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
        int int0 = com.fasterxml.jackson.core.base.GeneratorBase.SURR1_LAST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 56319 + "'", int0 == 56319);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        int int0 = com.fasterxml.jackson.core.base.GeneratorBase.SURR2_LAST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 57343 + "'", int0 == 57343);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        int int0 = com.fasterxml.jackson.core.base.GeneratorBase.SURR1_FIRST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 55296 + "'", int0 == 55296);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        int int0 = com.fasterxml.jackson.core.base.GeneratorBase.SURR2_FIRST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 56320 + "'", int0 == 56320);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        int[] intArray0 = com.fasterxml.jackson.core.json.JsonGeneratorImpl.sOutputEscapes;
        java.lang.Class<?> wildcardClass1 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

