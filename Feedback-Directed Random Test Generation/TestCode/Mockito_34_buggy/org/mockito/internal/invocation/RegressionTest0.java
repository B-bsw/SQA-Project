package org.mockito.internal.invocation;

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
        org.mockito.internal.invocation.Invocation invocation0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.InvocationMatcher invocationMatcher1 = new org.mockito.internal.invocation.InvocationMatcher(invocation0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.mockito.internal.invocation.Invocation invocation0 = null;
        org.hamcrest.Matcher[] matcherArray1 = new org.hamcrest.Matcher[] {};
        java.util.ArrayList<org.hamcrest.Matcher> matcherList2 = new java.util.ArrayList<org.hamcrest.Matcher>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.hamcrest.Matcher>) matcherList2, matcherArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.InvocationMatcher invocationMatcher4 = new org.mockito.internal.invocation.InvocationMatcher(invocation0, (java.util.List<org.hamcrest.Matcher>) matcherList2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertArrayEquals(matcherArray1, new org.hamcrest.Matcher[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.mockito.internal.invocation.Invocation invocation0 = null;
        java.util.List<org.hamcrest.Matcher> matcherList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.InvocationMatcher invocationMatcher2 = new org.mockito.internal.invocation.InvocationMatcher(invocation0, matcherList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

