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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass4 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass4 = invocationMatcherList3.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
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

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass6 = invocationMatcherList5.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass5 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass7 = invocationMatcherList6.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass8 = invocationMatcherList7.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass6 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass7 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass10 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass10 = invocationMatcherList9.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass9 = invocationMatcherList8.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass8 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass9 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass5 = invocationMatcherList4.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass12 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass11 = invocationMatcherList10.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass12 = invocationMatcherList11.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass14 = invocationMatcherList13.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.List<org.mockito.internal.invocation.Invocation> invocationList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList1 = org.mockito.internal.invocation.InvocationMatcher.createFrom(invocationList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass15 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass16 = invocationMatcherList15.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass14 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass13 = invocationMatcherList12.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass16 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass18 = invocationMatcherList17.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass17 = invocationMatcherList16.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass13 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass18 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass19 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass17 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass11 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass20 = invocationMatcherList19.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass19 = invocationMatcherList18.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass23 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass22 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass15 = invocationMatcherList14.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass23 = invocationMatcherList22.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass20 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass24 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass22 = invocationMatcherList21.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass25 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass26 = invocationMatcherList25.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass24 = invocationMatcherList23.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass26 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass21 = invocationMatcherList20.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass25 = invocationMatcherList24.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass27 = invocationMatcherList26.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass27 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass30 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass29 = invocationMatcherList28.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass21 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass29 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass28 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass28 = invocationMatcherList27.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList30 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList31 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList32 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass33 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(invocationMatcherList30);
        org.junit.Assert.assertNotNull(invocationMatcherList31);
        org.junit.Assert.assertNotNull(invocationMatcherList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList30 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList31 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList32 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass33 = invocationMatcherList32.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(invocationMatcherList30);
        org.junit.Assert.assertNotNull(invocationMatcherList31);
        org.junit.Assert.assertNotNull(invocationMatcherList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass30 = invocationMatcherList29.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList30 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass31 = invocationMatcherList30.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(invocationMatcherList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList30 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList31 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass32 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(invocationMatcherList30);
        org.junit.Assert.assertNotNull(invocationMatcherList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList30 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass31 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(invocationMatcherList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList30 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList31 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList32 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList33 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList34 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList35 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass36 = invocationMatcherList35.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(invocationMatcherList30);
        org.junit.Assert.assertNotNull(invocationMatcherList31);
        org.junit.Assert.assertNotNull(invocationMatcherList32);
        org.junit.Assert.assertNotNull(invocationMatcherList33);
        org.junit.Assert.assertNotNull(invocationMatcherList34);
        org.junit.Assert.assertNotNull(invocationMatcherList35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList30 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList31 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList32 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList33 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList34 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList35 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass36 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(invocationMatcherList30);
        org.junit.Assert.assertNotNull(invocationMatcherList31);
        org.junit.Assert.assertNotNull(invocationMatcherList32);
        org.junit.Assert.assertNotNull(invocationMatcherList33);
        org.junit.Assert.assertNotNull(invocationMatcherList34);
        org.junit.Assert.assertNotNull(invocationMatcherList35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList30 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList31 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass32 = invocationMatcherList31.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(invocationMatcherList30);
        org.junit.Assert.assertNotNull(invocationMatcherList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList30 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList31 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList32 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList33 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass34 = invocationList1.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(invocationMatcherList30);
        org.junit.Assert.assertNotNull(invocationMatcherList31);
        org.junit.Assert.assertNotNull(invocationMatcherList32);
        org.junit.Assert.assertNotNull(invocationMatcherList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList30 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList31 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList32 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList33 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList34 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList35 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList36 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList37 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(invocationMatcherList30);
        org.junit.Assert.assertNotNull(invocationMatcherList31);
        org.junit.Assert.assertNotNull(invocationMatcherList32);
        org.junit.Assert.assertNotNull(invocationMatcherList33);
        org.junit.Assert.assertNotNull(invocationMatcherList34);
        org.junit.Assert.assertNotNull(invocationMatcherList35);
        org.junit.Assert.assertNotNull(invocationMatcherList36);
        org.junit.Assert.assertNotNull(invocationMatcherList37);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList30 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList31 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList32 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList33 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass34 = invocationMatcherList33.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(invocationMatcherList30);
        org.junit.Assert.assertNotNull(invocationMatcherList31);
        org.junit.Assert.assertNotNull(invocationMatcherList32);
        org.junit.Assert.assertNotNull(invocationMatcherList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.mockito.internal.invocation.Invocation[] invocationArray0 = new org.mockito.internal.invocation.Invocation[] {};
        java.util.ArrayList<org.mockito.internal.invocation.Invocation> invocationList1 = new java.util.ArrayList<org.mockito.internal.invocation.Invocation>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.invocation.Invocation>) invocationList1, invocationArray0);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList3 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList5 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList6 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList7 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList8 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList9 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList10 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList11 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList12 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList13 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList14 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList16 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList17 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList18 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList19 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList20 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList21 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList22 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList23 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList24 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList25 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList26 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList28 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList29 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList30 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList31 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList32 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList33 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList34 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList35 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList36 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.internal.invocation.Invocation>) invocationList1);
        java.lang.Class<?> wildcardClass37 = invocationMatcherList36.getClass();
        org.junit.Assert.assertNotNull(invocationArray0);
        org.junit.Assert.assertArrayEquals(invocationArray0, new org.mockito.internal.invocation.Invocation[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(invocationMatcherList3);
        org.junit.Assert.assertNotNull(invocationMatcherList4);
        org.junit.Assert.assertNotNull(invocationMatcherList5);
        org.junit.Assert.assertNotNull(invocationMatcherList6);
        org.junit.Assert.assertNotNull(invocationMatcherList7);
        org.junit.Assert.assertNotNull(invocationMatcherList8);
        org.junit.Assert.assertNotNull(invocationMatcherList9);
        org.junit.Assert.assertNotNull(invocationMatcherList10);
        org.junit.Assert.assertNotNull(invocationMatcherList11);
        org.junit.Assert.assertNotNull(invocationMatcherList12);
        org.junit.Assert.assertNotNull(invocationMatcherList13);
        org.junit.Assert.assertNotNull(invocationMatcherList14);
        org.junit.Assert.assertNotNull(invocationMatcherList15);
        org.junit.Assert.assertNotNull(invocationMatcherList16);
        org.junit.Assert.assertNotNull(invocationMatcherList17);
        org.junit.Assert.assertNotNull(invocationMatcherList18);
        org.junit.Assert.assertNotNull(invocationMatcherList19);
        org.junit.Assert.assertNotNull(invocationMatcherList20);
        org.junit.Assert.assertNotNull(invocationMatcherList21);
        org.junit.Assert.assertNotNull(invocationMatcherList22);
        org.junit.Assert.assertNotNull(invocationMatcherList23);
        org.junit.Assert.assertNotNull(invocationMatcherList24);
        org.junit.Assert.assertNotNull(invocationMatcherList25);
        org.junit.Assert.assertNotNull(invocationMatcherList26);
        org.junit.Assert.assertNotNull(invocationMatcherList27);
        org.junit.Assert.assertNotNull(invocationMatcherList28);
        org.junit.Assert.assertNotNull(invocationMatcherList29);
        org.junit.Assert.assertNotNull(invocationMatcherList30);
        org.junit.Assert.assertNotNull(invocationMatcherList31);
        org.junit.Assert.assertNotNull(invocationMatcherList32);
        org.junit.Assert.assertNotNull(invocationMatcherList33);
        org.junit.Assert.assertNotNull(invocationMatcherList34);
        org.junit.Assert.assertNotNull(invocationMatcherList35);
        org.junit.Assert.assertNotNull(invocationMatcherList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }
}

