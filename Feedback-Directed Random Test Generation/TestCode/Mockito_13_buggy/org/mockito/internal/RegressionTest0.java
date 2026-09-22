package org.mockito.internal;

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
        org.mockito.internal.MockHandler<org.mockito.stubbing.VoidMethodStubbable<java.lang.Comparable<java.lang.String>>> strComparableVoidMethodStubbableMockHandler0 = new org.mockito.internal.MockHandler<org.mockito.stubbing.VoidMethodStubbable<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.mockito.internal.MockHandler<java.util.RandomAccess> randomAccessMockHandler0 = new org.mockito.internal.MockHandler<java.util.RandomAccess>();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress3 = strComparableMockHandler0.mockingProgress;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler4 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl5 = null;
        strComparableMockHandler4.invocationContainerImpl = invocationContainerImpl5;
        org.mockito.internal.invocation.MatchersBinder matchersBinder7 = strComparableMockHandler4.matchersBinder;
        strComparableMockHandler0.matchersBinder = matchersBinder7;
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(mockingProgress3);
        org.junit.Assert.assertNotNull(matchersBinder7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray1 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList2 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList2, answerArray1);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList2);
        org.mockito.internal.invocation.Invocation invocation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = strComparableMockHandler0.handle(invocation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(answerArray1);
        org.junit.Assert.assertArrayEquals(answerArray1, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler2 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray3 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList4 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList4, answerArray3);
        strComparableMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler8 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder9 = strComparableMockHandler8.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler10 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray11 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList12 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList12, answerArray11);
        strComparableMockHandler10.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList12);
        strComparableMockHandler8.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList12);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList12);
        org.mockito.internal.invocation.Invocation invocation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = strComparableMockHandler0.handle(invocation17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(answerArray3);
        org.junit.Assert.assertArrayEquals(answerArray3, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(matchersBinder9);
        org.junit.Assert.assertNotNull(answerArray11);
        org.junit.Assert.assertArrayEquals(answerArray11, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl1 = null;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl1;
        java.lang.Class<?> wildcardClass3 = strComparableMockHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress3 = strComparableMockHandler0.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = strComparableMockHandler0.getMockSettings();
        org.mockito.internal.MockHandler<org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>>> strComparableMockHandlerInterfaceMockHandler5 = new org.mockito.internal.MockHandler<org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>>>(mockSettingsImpl4);
        org.mockito.internal.MockHandler<java.lang.reflect.Type> typeMockHandler6 = new org.mockito.internal.MockHandler<java.lang.reflect.Type>(mockSettingsImpl4);
        org.mockito.internal.MockHandler<java.util.AbstractCollection<org.mockito.stubbing.Answer>> answerCollectionMockHandler7 = new org.mockito.internal.MockHandler<java.util.AbstractCollection<org.mockito.stubbing.Answer>>(mockSettingsImpl4);
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(mockingProgress3);
        org.junit.Assert.assertNotNull(mockSettingsImpl4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = strComparableMockHandler0.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder4 = strComparableMockHandler0.matchersBinder;
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl1 = null;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl1;
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = strComparableMockHandler0.getMockSettings();
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(mockSettingsImpl4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress3 = strComparableMockHandler0.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = strComparableMockHandler0.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler5 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray6 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList7 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList7, answerArray6);
        strComparableMockHandler5.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList7);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList7);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler11 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder12 = strComparableMockHandler11.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl13 = strComparableMockHandler11.invocationContainerImpl;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl13;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl15 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.invocation.Invocation invocation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = strComparableMockHandler0.handle(invocation16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(mockingProgress3);
        org.junit.Assert.assertNotNull(mockSettingsImpl4);
        org.junit.Assert.assertNotNull(answerArray6);
        org.junit.Assert.assertArrayEquals(answerArray6, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(matchersBinder12);
        org.junit.Assert.assertNotNull(invocationContainerImpl13);
        org.junit.Assert.assertNotNull(invocationContainerImpl15);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.progress.MockingProgress mockingProgress4 = strComparableMockHandler0.mockingProgress;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler5 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder6 = strComparableMockHandler5.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl7 = strComparableMockHandler5.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress8 = strComparableMockHandler5.mockingProgress;
        strComparableMockHandler0.mockingProgress = mockingProgress8;
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(mockingProgress4);
        org.junit.Assert.assertNotNull(matchersBinder6);
        org.junit.Assert.assertNotNull(invocationContainerImpl7);
        org.junit.Assert.assertNotNull(mockingProgress8);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler2 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray3 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList4 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList4, answerArray3);
        strComparableMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler8 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder9 = strComparableMockHandler8.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl10 = strComparableMockHandler8.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer11 = strComparableMockHandler8.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler12 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder13 = strComparableMockHandler12.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = strComparableMockHandler12.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress15 = strComparableMockHandler12.mockingProgress;
        strComparableMockHandler8.mockingProgress = mockingProgress15;
        strComparableMockHandler0.mockingProgress = mockingProgress15;
        org.mockito.internal.invocation.Invocation invocation18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = strComparableMockHandler0.handle(invocation18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(answerArray3);
        org.junit.Assert.assertArrayEquals(answerArray3, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(matchersBinder9);
        org.junit.Assert.assertNotNull(invocationContainerImpl10);
        org.junit.Assert.assertNotNull(invocationContainer11);
        org.junit.Assert.assertNotNull(matchersBinder13);
        org.junit.Assert.assertNotNull(invocationContainerImpl14);
        org.junit.Assert.assertNotNull(mockingProgress15);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray1 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList2 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList2, answerArray1);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList2);
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl5 = strComparableMockHandler0.invocationContainerImpl;
        org.junit.Assert.assertNotNull(answerArray1);
        org.junit.Assert.assertArrayEquals(answerArray1, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(invocationContainerImpl5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl3 = strComparableMockHandler0.invocationContainerImpl;
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(invocationContainerImpl3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.Invocation invocation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = strComparableMockHandler0.handle(invocation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.internal.MockHandlerInterface<java.lang.Iterable<org.mockito.stubbing.Answer>> answerIterableMockHandlerInterface0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandler<java.lang.Iterable<org.mockito.stubbing.Answer>> answerIterableMockHandler1 = new org.mockito.internal.MockHandler<java.lang.Iterable<org.mockito.stubbing.Answer>>(answerIterableMockHandlerInterface0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress3 = strComparableMockHandler0.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = strComparableMockHandler0.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler5 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder6 = strComparableMockHandler5.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl7 = strComparableMockHandler5.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress8 = strComparableMockHandler5.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl9 = strComparableMockHandler5.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler10 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray11 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList12 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList12, answerArray11);
        strComparableMockHandler10.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList12);
        strComparableMockHandler5.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList12);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler16 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder17 = strComparableMockHandler16.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl18 = strComparableMockHandler16.invocationContainerImpl;
        strComparableMockHandler5.invocationContainerImpl = invocationContainerImpl18;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl18;
        org.mockito.stubbing.VoidMethodStubbable<java.lang.Comparable<java.lang.String>> strComparableVoidMethodStubbable22 = strComparableMockHandler0.voidMethodStubbable((java.lang.Comparable<java.lang.String>) "");
        org.mockito.internal.progress.MockingProgress mockingProgress23 = strComparableMockHandler0.mockingProgress;
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(mockingProgress3);
        org.junit.Assert.assertNotNull(mockSettingsImpl4);
        org.junit.Assert.assertNotNull(matchersBinder6);
        org.junit.Assert.assertNotNull(invocationContainerImpl7);
        org.junit.Assert.assertNotNull(mockingProgress8);
        org.junit.Assert.assertNotNull(mockSettingsImpl9);
        org.junit.Assert.assertNotNull(answerArray11);
        org.junit.Assert.assertArrayEquals(answerArray11, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(matchersBinder17);
        org.junit.Assert.assertNotNull(invocationContainerImpl18);
        org.junit.Assert.assertNotNull(strComparableVoidMethodStubbable22);
        org.junit.Assert.assertNotNull(mockingProgress23);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = strComparableMockHandler0.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler4 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = strComparableMockHandler4.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl6 = strComparableMockHandler4.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress7 = strComparableMockHandler4.mockingProgress;
        strComparableMockHandler0.mockingProgress = mockingProgress7;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler9 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder10 = strComparableMockHandler9.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler11 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray12 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList13 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList13, answerArray12);
        strComparableMockHandler11.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler18 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder19 = strComparableMockHandler18.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler20 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray21 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList22 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList22, answerArray21);
        strComparableMockHandler20.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList22);
        strComparableMockHandler18.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList22);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler26 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder27 = strComparableMockHandler26.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler28 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray29 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList30 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList30, answerArray29);
        strComparableMockHandler28.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList30);
        strComparableMockHandler26.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList30);
        strComparableMockHandler18.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList30);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList30);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler36 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder37 = strComparableMockHandler36.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl38 = strComparableMockHandler36.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress39 = strComparableMockHandler36.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl40 = strComparableMockHandler36.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler41 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder42 = strComparableMockHandler41.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl43 = strComparableMockHandler41.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress44 = strComparableMockHandler41.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl45 = strComparableMockHandler41.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler46 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray47 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList48 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList48, answerArray47);
        strComparableMockHandler46.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList48);
        strComparableMockHandler41.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList48);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler52 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder53 = strComparableMockHandler52.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl54 = strComparableMockHandler52.invocationContainerImpl;
        strComparableMockHandler41.invocationContainerImpl = invocationContainerImpl54;
        strComparableMockHandler36.invocationContainerImpl = invocationContainerImpl54;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler57 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder58 = strComparableMockHandler57.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl59 = strComparableMockHandler57.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress60 = strComparableMockHandler57.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl61 = strComparableMockHandler57.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler62 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder63 = strComparableMockHandler62.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl64 = strComparableMockHandler62.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress65 = strComparableMockHandler62.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl66 = strComparableMockHandler62.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler67 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray68 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList69 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList69, answerArray68);
        strComparableMockHandler67.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList69);
        strComparableMockHandler62.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList69);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler73 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder74 = strComparableMockHandler73.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl75 = strComparableMockHandler73.invocationContainerImpl;
        strComparableMockHandler62.invocationContainerImpl = invocationContainerImpl75;
        strComparableMockHandler57.invocationContainerImpl = invocationContainerImpl75;
        strComparableMockHandler36.invocationContainerImpl = invocationContainerImpl75;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl75;
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(invocationContainerImpl6);
        org.junit.Assert.assertNotNull(mockingProgress7);
        org.junit.Assert.assertNotNull(matchersBinder10);
        org.junit.Assert.assertNotNull(answerArray12);
        org.junit.Assert.assertArrayEquals(answerArray12, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matchersBinder19);
        org.junit.Assert.assertNotNull(answerArray21);
        org.junit.Assert.assertArrayEquals(answerArray21, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(matchersBinder27);
        org.junit.Assert.assertNotNull(answerArray29);
        org.junit.Assert.assertArrayEquals(answerArray29, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(matchersBinder37);
        org.junit.Assert.assertNotNull(invocationContainerImpl38);
        org.junit.Assert.assertNotNull(mockingProgress39);
        org.junit.Assert.assertNotNull(mockSettingsImpl40);
        org.junit.Assert.assertNotNull(matchersBinder42);
        org.junit.Assert.assertNotNull(invocationContainerImpl43);
        org.junit.Assert.assertNotNull(mockingProgress44);
        org.junit.Assert.assertNotNull(mockSettingsImpl45);
        org.junit.Assert.assertNotNull(answerArray47);
        org.junit.Assert.assertArrayEquals(answerArray47, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(matchersBinder53);
        org.junit.Assert.assertNotNull(invocationContainerImpl54);
        org.junit.Assert.assertNotNull(matchersBinder58);
        org.junit.Assert.assertNotNull(invocationContainerImpl59);
        org.junit.Assert.assertNotNull(mockingProgress60);
        org.junit.Assert.assertNotNull(mockSettingsImpl61);
        org.junit.Assert.assertNotNull(matchersBinder63);
        org.junit.Assert.assertNotNull(invocationContainerImpl64);
        org.junit.Assert.assertNotNull(mockingProgress65);
        org.junit.Assert.assertNotNull(mockSettingsImpl66);
        org.junit.Assert.assertNotNull(answerArray68);
        org.junit.Assert.assertArrayEquals(answerArray68, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(matchersBinder74);
        org.junit.Assert.assertNotNull(invocationContainerImpl75);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler2 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray3 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList4 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList4, answerArray3);
        strComparableMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler8 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder9 = strComparableMockHandler8.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl10 = strComparableMockHandler8.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer11 = strComparableMockHandler8.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler12 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder13 = strComparableMockHandler12.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = strComparableMockHandler12.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress15 = strComparableMockHandler12.mockingProgress;
        strComparableMockHandler8.mockingProgress = mockingProgress15;
        strComparableMockHandler0.mockingProgress = mockingProgress15;
        org.mockito.internal.progress.MockingProgress mockingProgress18 = strComparableMockHandler0.mockingProgress;
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(answerArray3);
        org.junit.Assert.assertArrayEquals(answerArray3, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(matchersBinder9);
        org.junit.Assert.assertNotNull(invocationContainerImpl10);
        org.junit.Assert.assertNotNull(invocationContainer11);
        org.junit.Assert.assertNotNull(matchersBinder13);
        org.junit.Assert.assertNotNull(invocationContainerImpl14);
        org.junit.Assert.assertNotNull(mockingProgress15);
        org.junit.Assert.assertNotNull(mockingProgress18);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress3 = strComparableMockHandler0.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = strComparableMockHandler0.getMockSettings();
        org.mockito.internal.MockHandler<org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>>> strComparableMockHandlerInterfaceMockHandler5 = new org.mockito.internal.MockHandler<org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>>>(mockSettingsImpl4);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler6 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>(mockSettingsImpl4);
        org.mockito.internal.invocation.Invocation invocation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = strComparableMockHandler6.handle(invocation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(mockingProgress3);
        org.junit.Assert.assertNotNull(mockSettingsImpl4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = strComparableMockHandler0.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler4 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = strComparableMockHandler4.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl6 = strComparableMockHandler4.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress7 = strComparableMockHandler4.mockingProgress;
        strComparableMockHandler0.mockingProgress = mockingProgress7;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler9 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder10 = strComparableMockHandler9.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler11 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray12 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList13 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList13, answerArray12);
        strComparableMockHandler11.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler18 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder19 = strComparableMockHandler18.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl20 = strComparableMockHandler18.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress21 = strComparableMockHandler18.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl22 = strComparableMockHandler18.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler23 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray24 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList25 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList25, answerArray24);
        strComparableMockHandler23.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList25);
        strComparableMockHandler18.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList25);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler29 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder30 = strComparableMockHandler29.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl31 = strComparableMockHandler29.invocationContainerImpl;
        strComparableMockHandler18.invocationContainerImpl = invocationContainerImpl31;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl31;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler34 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder35 = strComparableMockHandler34.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl36 = strComparableMockHandler34.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer37 = strComparableMockHandler34.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler38 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder39 = strComparableMockHandler38.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl40 = strComparableMockHandler38.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress41 = strComparableMockHandler38.mockingProgress;
        strComparableMockHandler34.mockingProgress = mockingProgress41;
        strComparableMockHandler0.mockingProgress = mockingProgress41;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl44 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler45 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder46 = strComparableMockHandler45.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl47 = strComparableMockHandler45.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress48 = strComparableMockHandler45.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl49 = strComparableMockHandler45.getMockSettings();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl50 = strComparableMockHandler45.invocationContainerImpl;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl50;
        org.mockito.stubbing.VoidMethodStubbable<java.lang.Comparable<java.lang.String>> strComparableVoidMethodStubbable53 = strComparableMockHandler0.voidMethodStubbable((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(invocationContainerImpl6);
        org.junit.Assert.assertNotNull(mockingProgress7);
        org.junit.Assert.assertNotNull(matchersBinder10);
        org.junit.Assert.assertNotNull(answerArray12);
        org.junit.Assert.assertArrayEquals(answerArray12, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matchersBinder19);
        org.junit.Assert.assertNotNull(invocationContainerImpl20);
        org.junit.Assert.assertNotNull(mockingProgress21);
        org.junit.Assert.assertNotNull(mockSettingsImpl22);
        org.junit.Assert.assertNotNull(answerArray24);
        org.junit.Assert.assertArrayEquals(answerArray24, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(matchersBinder30);
        org.junit.Assert.assertNotNull(invocationContainerImpl31);
        org.junit.Assert.assertNotNull(matchersBinder35);
        org.junit.Assert.assertNotNull(invocationContainerImpl36);
        org.junit.Assert.assertNotNull(invocationContainer37);
        org.junit.Assert.assertNotNull(matchersBinder39);
        org.junit.Assert.assertNotNull(invocationContainerImpl40);
        org.junit.Assert.assertNotNull(mockingProgress41);
        org.junit.Assert.assertNotNull(invocationContainerImpl44);
        org.junit.Assert.assertNotNull(matchersBinder46);
        org.junit.Assert.assertNotNull(invocationContainerImpl47);
        org.junit.Assert.assertNotNull(mockingProgress48);
        org.junit.Assert.assertNotNull(mockSettingsImpl49);
        org.junit.Assert.assertNotNull(invocationContainerImpl50);
        org.junit.Assert.assertNotNull(strComparableVoidMethodStubbable53);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress3 = strComparableMockHandler0.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = strComparableMockHandler0.getMockSettings();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl5 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler6 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder7 = strComparableMockHandler6.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl8 = strComparableMockHandler6.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress9 = strComparableMockHandler6.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl10 = strComparableMockHandler6.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler11 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray12 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList13 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList13, answerArray12);
        strComparableMockHandler11.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler6.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler17 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder18 = strComparableMockHandler17.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl19 = strComparableMockHandler17.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer20 = strComparableMockHandler17.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler21 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder22 = strComparableMockHandler21.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl23 = strComparableMockHandler21.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress24 = strComparableMockHandler21.mockingProgress;
        strComparableMockHandler17.mockingProgress = mockingProgress24;
        strComparableMockHandler6.mockingProgress = mockingProgress24;
        strComparableMockHandler0.mockingProgress = mockingProgress24;
        java.lang.Class<?> wildcardClass28 = mockingProgress24.getClass();
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(mockingProgress3);
        org.junit.Assert.assertNotNull(mockSettingsImpl4);
        org.junit.Assert.assertNotNull(invocationContainerImpl5);
        org.junit.Assert.assertNotNull(matchersBinder7);
        org.junit.Assert.assertNotNull(invocationContainerImpl8);
        org.junit.Assert.assertNotNull(mockingProgress9);
        org.junit.Assert.assertNotNull(mockSettingsImpl10);
        org.junit.Assert.assertNotNull(answerArray12);
        org.junit.Assert.assertArrayEquals(answerArray12, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matchersBinder18);
        org.junit.Assert.assertNotNull(invocationContainerImpl19);
        org.junit.Assert.assertNotNull(invocationContainer20);
        org.junit.Assert.assertNotNull(matchersBinder22);
        org.junit.Assert.assertNotNull(invocationContainerImpl23);
        org.junit.Assert.assertNotNull(mockingProgress24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = strComparableMockHandler0.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler4 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = strComparableMockHandler4.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl6 = strComparableMockHandler4.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress7 = strComparableMockHandler4.mockingProgress;
        strComparableMockHandler0.mockingProgress = mockingProgress7;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler9 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder10 = strComparableMockHandler9.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler11 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray12 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList13 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList13, answerArray12);
        strComparableMockHandler11.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler18 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder19 = strComparableMockHandler18.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler20 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray21 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList22 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList22, answerArray21);
        strComparableMockHandler20.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList22);
        strComparableMockHandler18.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList22);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler26 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder27 = strComparableMockHandler26.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler28 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray29 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList30 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList30, answerArray29);
        strComparableMockHandler28.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList30);
        strComparableMockHandler26.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList30);
        strComparableMockHandler18.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList30);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList30);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler36 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder37 = strComparableMockHandler36.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler38 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray39 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList40 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList40, answerArray39);
        strComparableMockHandler38.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList40);
        strComparableMockHandler36.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList40);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler44 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder45 = strComparableMockHandler44.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler46 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray47 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList48 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList48, answerArray47);
        strComparableMockHandler46.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList48);
        strComparableMockHandler44.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList48);
        strComparableMockHandler36.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList48);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList48);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler54 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl55 = null;
        strComparableMockHandler54.invocationContainerImpl = invocationContainerImpl55;
        org.mockito.internal.invocation.MatchersBinder matchersBinder57 = strComparableMockHandler54.matchersBinder;
        strComparableMockHandler0.matchersBinder = matchersBinder57;
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(invocationContainerImpl6);
        org.junit.Assert.assertNotNull(mockingProgress7);
        org.junit.Assert.assertNotNull(matchersBinder10);
        org.junit.Assert.assertNotNull(answerArray12);
        org.junit.Assert.assertArrayEquals(answerArray12, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matchersBinder19);
        org.junit.Assert.assertNotNull(answerArray21);
        org.junit.Assert.assertArrayEquals(answerArray21, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(matchersBinder27);
        org.junit.Assert.assertNotNull(answerArray29);
        org.junit.Assert.assertArrayEquals(answerArray29, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(matchersBinder37);
        org.junit.Assert.assertNotNull(answerArray39);
        org.junit.Assert.assertArrayEquals(answerArray39, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(matchersBinder45);
        org.junit.Assert.assertNotNull(answerArray47);
        org.junit.Assert.assertArrayEquals(answerArray47, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(matchersBinder57);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.VoidMethodStubbable<java.lang.Comparable<java.lang.String>> strComparableVoidMethodStubbable2 = strComparableMockHandler0.voidMethodStubbable((java.lang.Comparable<java.lang.String>) "");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler3 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>((org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>>) strComparableMockHandler0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer4 = strComparableMockHandler3.getInvocationContainer();
        org.mockito.internal.progress.MockingProgress mockingProgress5 = strComparableMockHandler3.mockingProgress;
        org.junit.Assert.assertNotNull(strComparableVoidMethodStubbable2);
        org.junit.Assert.assertNotNull(invocationContainer4);
        org.junit.Assert.assertNotNull(mockingProgress5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer4 = strComparableMockHandler0.getInvocationContainer();
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(invocationContainer4);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = strComparableMockHandler0.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler4 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = strComparableMockHandler4.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl6 = strComparableMockHandler4.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress7 = strComparableMockHandler4.mockingProgress;
        strComparableMockHandler0.mockingProgress = mockingProgress7;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler9 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder10 = strComparableMockHandler9.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler11 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray12 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList13 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList13, answerArray12);
        strComparableMockHandler11.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler18 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder19 = strComparableMockHandler18.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl20 = strComparableMockHandler18.invocationContainerImpl;
        org.mockito.internal.invocation.MatchersBinder matchersBinder21 = strComparableMockHandler18.matchersBinder;
        org.mockito.internal.progress.MockingProgress mockingProgress22 = strComparableMockHandler18.mockingProgress;
        strComparableMockHandler0.mockingProgress = mockingProgress22;
        org.mockito.internal.progress.MockingProgress mockingProgress24 = strComparableMockHandler0.mockingProgress;
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(invocationContainerImpl6);
        org.junit.Assert.assertNotNull(mockingProgress7);
        org.junit.Assert.assertNotNull(matchersBinder10);
        org.junit.Assert.assertNotNull(answerArray12);
        org.junit.Assert.assertArrayEquals(answerArray12, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matchersBinder19);
        org.junit.Assert.assertNotNull(invocationContainerImpl20);
        org.junit.Assert.assertNotNull(matchersBinder21);
        org.junit.Assert.assertNotNull(mockingProgress22);
        org.junit.Assert.assertNotNull(mockingProgress24);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = strComparableMockHandler0.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler2 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>(mockSettingsImpl1);
        org.junit.Assert.assertNotNull(mockSettingsImpl1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress3 = strComparableMockHandler0.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = strComparableMockHandler0.getMockSettings();
        org.mockito.internal.MockHandler<org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>>> strComparableMockHandlerInterfaceMockHandler5 = new org.mockito.internal.MockHandler<org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>>>(mockSettingsImpl4);
        org.mockito.internal.MockHandler<java.lang.reflect.Type> typeMockHandler6 = new org.mockito.internal.MockHandler<java.lang.reflect.Type>(mockSettingsImpl4);
        java.lang.Class<?> wildcardClass7 = mockSettingsImpl4.getClass();
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(mockingProgress3);
        org.junit.Assert.assertNotNull(mockSettingsImpl4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress3 = strComparableMockHandler0.mockingProgress;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler4 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = strComparableMockHandler4.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler6 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray7 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList8 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList8, answerArray7);
        strComparableMockHandler6.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList8);
        strComparableMockHandler4.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList8);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler12 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder13 = strComparableMockHandler12.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler14 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray15 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList16 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList16, answerArray15);
        strComparableMockHandler14.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList16);
        strComparableMockHandler12.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList16);
        strComparableMockHandler4.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList16);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList16);
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(mockingProgress3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(answerArray7);
        org.junit.Assert.assertArrayEquals(answerArray7, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(matchersBinder13);
        org.junit.Assert.assertNotNull(answerArray15);
        org.junit.Assert.assertArrayEquals(answerArray15, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.invocation.MatchersBinder matchersBinder2 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = strComparableMockHandler0.getInvocationContainer();
        org.mockito.internal.invocation.Invocation invocation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = strComparableMockHandler0.handle(invocation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(matchersBinder2);
        org.junit.Assert.assertNotNull(invocationContainer3);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.mockito.internal.MockHandler<org.mockito.internal.stubbing.InvocationContainer> invocationContainerMockHandler0 = new org.mockito.internal.MockHandler<org.mockito.internal.stubbing.InvocationContainer>();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress3 = strComparableMockHandler0.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = strComparableMockHandler0.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler5 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray6 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList7 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList7, answerArray6);
        strComparableMockHandler5.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList7);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList7);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler11 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder12 = strComparableMockHandler11.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl13 = strComparableMockHandler11.invocationContainerImpl;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl13;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl15 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl16 = strComparableMockHandler0.getMockSettings();
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(mockingProgress3);
        org.junit.Assert.assertNotNull(mockSettingsImpl4);
        org.junit.Assert.assertNotNull(answerArray6);
        org.junit.Assert.assertArrayEquals(answerArray6, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(matchersBinder12);
        org.junit.Assert.assertNotNull(invocationContainerImpl13);
        org.junit.Assert.assertNotNull(invocationContainerImpl15);
        org.junit.Assert.assertNotNull(mockSettingsImpl16);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = strComparableMockHandler0.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler4 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = strComparableMockHandler4.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl6 = strComparableMockHandler4.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress7 = strComparableMockHandler4.mockingProgress;
        strComparableMockHandler0.mockingProgress = mockingProgress7;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler9 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder10 = strComparableMockHandler9.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler11 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray12 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList13 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList13, answerArray12);
        strComparableMockHandler11.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler18 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder19 = strComparableMockHandler18.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler20 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray21 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList22 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList22, answerArray21);
        strComparableMockHandler20.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList22);
        strComparableMockHandler18.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList22);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler26 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder27 = strComparableMockHandler26.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler28 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray29 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList30 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList30, answerArray29);
        strComparableMockHandler28.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList30);
        strComparableMockHandler26.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList30);
        strComparableMockHandler18.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList30);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList30);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler36 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder37 = strComparableMockHandler36.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler38 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray39 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList40 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList40, answerArray39);
        strComparableMockHandler38.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList40);
        strComparableMockHandler36.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList40);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler44 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder45 = strComparableMockHandler44.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler46 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray47 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList48 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList48, answerArray47);
        strComparableMockHandler46.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList48);
        strComparableMockHandler44.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList48);
        strComparableMockHandler36.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList48);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList48);
        org.mockito.internal.progress.MockingProgress mockingProgress54 = strComparableMockHandler0.mockingProgress;
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(invocationContainerImpl6);
        org.junit.Assert.assertNotNull(mockingProgress7);
        org.junit.Assert.assertNotNull(matchersBinder10);
        org.junit.Assert.assertNotNull(answerArray12);
        org.junit.Assert.assertArrayEquals(answerArray12, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matchersBinder19);
        org.junit.Assert.assertNotNull(answerArray21);
        org.junit.Assert.assertArrayEquals(answerArray21, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(matchersBinder27);
        org.junit.Assert.assertNotNull(answerArray29);
        org.junit.Assert.assertArrayEquals(answerArray29, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(matchersBinder37);
        org.junit.Assert.assertNotNull(answerArray39);
        org.junit.Assert.assertArrayEquals(answerArray39, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(matchersBinder45);
        org.junit.Assert.assertNotNull(answerArray47);
        org.junit.Assert.assertArrayEquals(answerArray47, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(mockingProgress54);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = strComparableMockHandler0.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler4 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = strComparableMockHandler4.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl6 = strComparableMockHandler4.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress7 = strComparableMockHandler4.mockingProgress;
        strComparableMockHandler0.mockingProgress = mockingProgress7;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler9 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder10 = strComparableMockHandler9.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler11 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray12 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList13 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList13, answerArray12);
        strComparableMockHandler11.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler18 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder19 = strComparableMockHandler18.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl20 = strComparableMockHandler18.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress21 = strComparableMockHandler18.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl22 = strComparableMockHandler18.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler23 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray24 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList25 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList25, answerArray24);
        strComparableMockHandler23.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList25);
        strComparableMockHandler18.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList25);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler29 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder30 = strComparableMockHandler29.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl31 = strComparableMockHandler29.invocationContainerImpl;
        strComparableMockHandler18.invocationContainerImpl = invocationContainerImpl31;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl31;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler34 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder35 = strComparableMockHandler34.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl36 = strComparableMockHandler34.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer37 = strComparableMockHandler34.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler38 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder39 = strComparableMockHandler38.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl40 = strComparableMockHandler38.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress41 = strComparableMockHandler38.mockingProgress;
        strComparableMockHandler34.mockingProgress = mockingProgress41;
        strComparableMockHandler0.mockingProgress = mockingProgress41;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl44 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress45 = strComparableMockHandler0.mockingProgress;
        org.mockito.internal.invocation.MatchersBinder matchersBinder46 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl47 = strComparableMockHandler0.getMockSettings();
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(invocationContainerImpl6);
        org.junit.Assert.assertNotNull(mockingProgress7);
        org.junit.Assert.assertNotNull(matchersBinder10);
        org.junit.Assert.assertNotNull(answerArray12);
        org.junit.Assert.assertArrayEquals(answerArray12, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matchersBinder19);
        org.junit.Assert.assertNotNull(invocationContainerImpl20);
        org.junit.Assert.assertNotNull(mockingProgress21);
        org.junit.Assert.assertNotNull(mockSettingsImpl22);
        org.junit.Assert.assertNotNull(answerArray24);
        org.junit.Assert.assertArrayEquals(answerArray24, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(matchersBinder30);
        org.junit.Assert.assertNotNull(invocationContainerImpl31);
        org.junit.Assert.assertNotNull(matchersBinder35);
        org.junit.Assert.assertNotNull(invocationContainerImpl36);
        org.junit.Assert.assertNotNull(invocationContainer37);
        org.junit.Assert.assertNotNull(matchersBinder39);
        org.junit.Assert.assertNotNull(invocationContainerImpl40);
        org.junit.Assert.assertNotNull(mockingProgress41);
        org.junit.Assert.assertNotNull(invocationContainerImpl44);
        org.junit.Assert.assertNotNull(mockingProgress45);
        org.junit.Assert.assertNotNull(matchersBinder46);
        org.junit.Assert.assertNotNull(mockSettingsImpl47);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress3 = strComparableMockHandler0.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = strComparableMockHandler0.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler5 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder6 = strComparableMockHandler5.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl7 = strComparableMockHandler5.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress8 = strComparableMockHandler5.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl9 = strComparableMockHandler5.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler10 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray11 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList12 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList12, answerArray11);
        strComparableMockHandler10.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList12);
        strComparableMockHandler5.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList12);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler16 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder17 = strComparableMockHandler16.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl18 = strComparableMockHandler16.invocationContainerImpl;
        strComparableMockHandler5.invocationContainerImpl = invocationContainerImpl18;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl18;
        org.mockito.stubbing.VoidMethodStubbable<java.lang.Comparable<java.lang.String>> strComparableVoidMethodStubbable22 = strComparableMockHandler0.voidMethodStubbable((java.lang.Comparable<java.lang.String>) "");
        org.mockito.internal.invocation.MatchersBinder matchersBinder23 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler24 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder25 = strComparableMockHandler24.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl26 = strComparableMockHandler24.invocationContainerImpl;
        org.mockito.internal.invocation.MatchersBinder matchersBinder27 = strComparableMockHandler24.matchersBinder;
        strComparableMockHandler0.matchersBinder = matchersBinder27;
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(mockingProgress3);
        org.junit.Assert.assertNotNull(mockSettingsImpl4);
        org.junit.Assert.assertNotNull(matchersBinder6);
        org.junit.Assert.assertNotNull(invocationContainerImpl7);
        org.junit.Assert.assertNotNull(mockingProgress8);
        org.junit.Assert.assertNotNull(mockSettingsImpl9);
        org.junit.Assert.assertNotNull(answerArray11);
        org.junit.Assert.assertArrayEquals(answerArray11, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(matchersBinder17);
        org.junit.Assert.assertNotNull(invocationContainerImpl18);
        org.junit.Assert.assertNotNull(strComparableVoidMethodStubbable22);
        org.junit.Assert.assertNotNull(matchersBinder23);
        org.junit.Assert.assertNotNull(matchersBinder25);
        org.junit.Assert.assertNotNull(invocationContainerImpl26);
        org.junit.Assert.assertNotNull(matchersBinder27);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = strComparableMockHandler0.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler4 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = strComparableMockHandler4.matchersBinder;
        org.mockito.internal.invocation.MatchersBinder matchersBinder6 = strComparableMockHandler4.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler7 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl8 = null;
        strComparableMockHandler7.invocationContainerImpl = invocationContainerImpl8;
        org.mockito.internal.invocation.MatchersBinder matchersBinder10 = strComparableMockHandler7.matchersBinder;
        strComparableMockHandler4.matchersBinder = matchersBinder10;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl12 = strComparableMockHandler4.invocationContainerImpl;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl12;
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(matchersBinder6);
        org.junit.Assert.assertNotNull(matchersBinder10);
        org.junit.Assert.assertNotNull(invocationContainerImpl12);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = strComparableMockHandler0.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler4 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = strComparableMockHandler4.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl6 = strComparableMockHandler4.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress7 = strComparableMockHandler4.mockingProgress;
        strComparableMockHandler0.mockingProgress = mockingProgress7;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler9 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder10 = strComparableMockHandler9.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler11 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray12 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList13 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList13, answerArray12);
        strComparableMockHandler11.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler18 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder19 = strComparableMockHandler18.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl20 = strComparableMockHandler18.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress21 = strComparableMockHandler18.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl22 = strComparableMockHandler18.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler23 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray24 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList25 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList25, answerArray24);
        strComparableMockHandler23.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList25);
        strComparableMockHandler18.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList25);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler29 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder30 = strComparableMockHandler29.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl31 = strComparableMockHandler29.invocationContainerImpl;
        strComparableMockHandler18.invocationContainerImpl = invocationContainerImpl31;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl31;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler34 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder35 = strComparableMockHandler34.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl36 = strComparableMockHandler34.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer37 = strComparableMockHandler34.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler38 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder39 = strComparableMockHandler38.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl40 = strComparableMockHandler38.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress41 = strComparableMockHandler38.mockingProgress;
        strComparableMockHandler34.mockingProgress = mockingProgress41;
        strComparableMockHandler0.mockingProgress = mockingProgress41;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl44 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler45 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder46 = strComparableMockHandler45.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl47 = strComparableMockHandler45.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress48 = strComparableMockHandler45.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl49 = strComparableMockHandler45.getMockSettings();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl50 = strComparableMockHandler45.invocationContainerImpl;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl50;
        org.mockito.internal.progress.MockingProgress mockingProgress52 = null;
        strComparableMockHandler0.mockingProgress = mockingProgress52;
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(invocationContainerImpl6);
        org.junit.Assert.assertNotNull(mockingProgress7);
        org.junit.Assert.assertNotNull(matchersBinder10);
        org.junit.Assert.assertNotNull(answerArray12);
        org.junit.Assert.assertArrayEquals(answerArray12, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matchersBinder19);
        org.junit.Assert.assertNotNull(invocationContainerImpl20);
        org.junit.Assert.assertNotNull(mockingProgress21);
        org.junit.Assert.assertNotNull(mockSettingsImpl22);
        org.junit.Assert.assertNotNull(answerArray24);
        org.junit.Assert.assertArrayEquals(answerArray24, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(matchersBinder30);
        org.junit.Assert.assertNotNull(invocationContainerImpl31);
        org.junit.Assert.assertNotNull(matchersBinder35);
        org.junit.Assert.assertNotNull(invocationContainerImpl36);
        org.junit.Assert.assertNotNull(invocationContainer37);
        org.junit.Assert.assertNotNull(matchersBinder39);
        org.junit.Assert.assertNotNull(invocationContainerImpl40);
        org.junit.Assert.assertNotNull(mockingProgress41);
        org.junit.Assert.assertNotNull(invocationContainerImpl44);
        org.junit.Assert.assertNotNull(matchersBinder46);
        org.junit.Assert.assertNotNull(invocationContainerImpl47);
        org.junit.Assert.assertNotNull(mockingProgress48);
        org.junit.Assert.assertNotNull(mockSettingsImpl49);
        org.junit.Assert.assertNotNull(invocationContainerImpl50);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.VoidMethodStubbable<java.lang.Comparable<java.lang.String>> strComparableVoidMethodStubbable2 = strComparableMockHandler0.voidMethodStubbable((java.lang.Comparable<java.lang.String>) "");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler3 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>((org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>>) strComparableMockHandler0);
        org.mockito.internal.invocation.MatchersBinder matchersBinder4 = strComparableMockHandler0.matchersBinder;
        org.junit.Assert.assertNotNull(strComparableVoidMethodStubbable2);
        org.junit.Assert.assertNotNull(matchersBinder4);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.VoidMethodStubbable<java.lang.Comparable<java.lang.String>> strComparableVoidMethodStubbable2 = strComparableMockHandler0.voidMethodStubbable((java.lang.Comparable<java.lang.String>) "");
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler4 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = strComparableMockHandler4.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl6 = strComparableMockHandler4.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress7 = strComparableMockHandler4.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl8 = strComparableMockHandler4.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler9 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray10 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList11 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList11, answerArray10);
        strComparableMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList11);
        strComparableMockHandler4.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList11);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler15 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder16 = strComparableMockHandler15.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl17 = strComparableMockHandler15.invocationContainerImpl;
        strComparableMockHandler4.invocationContainerImpl = invocationContainerImpl17;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl19 = strComparableMockHandler4.invocationContainerImpl;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl19;
        org.junit.Assert.assertNotNull(strComparableVoidMethodStubbable2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(invocationContainerImpl6);
        org.junit.Assert.assertNotNull(mockingProgress7);
        org.junit.Assert.assertNotNull(mockSettingsImpl8);
        org.junit.Assert.assertNotNull(answerArray10);
        org.junit.Assert.assertArrayEquals(answerArray10, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(matchersBinder16);
        org.junit.Assert.assertNotNull(invocationContainerImpl17);
        org.junit.Assert.assertNotNull(invocationContainerImpl19);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.mockito.internal.MockHandlerInterface<java.io.Serializable> serializableMockHandlerInterface0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandler<java.io.Serializable> serializableMockHandler1 = new org.mockito.internal.MockHandler<java.io.Serializable>(serializableMockHandlerInterface0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = strComparableMockHandler0.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler4 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = strComparableMockHandler4.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl6 = strComparableMockHandler4.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress7 = strComparableMockHandler4.mockingProgress;
        strComparableMockHandler0.mockingProgress = mockingProgress7;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler9 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder10 = strComparableMockHandler9.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler11 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray12 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList13 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList13, answerArray12);
        strComparableMockHandler11.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler18 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder19 = strComparableMockHandler18.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl20 = strComparableMockHandler18.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress21 = strComparableMockHandler18.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl22 = strComparableMockHandler18.getMockSettings();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler23 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray24 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList25 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList25, answerArray24);
        strComparableMockHandler23.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList25);
        strComparableMockHandler18.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList25);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler29 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder30 = strComparableMockHandler29.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl31 = strComparableMockHandler29.invocationContainerImpl;
        strComparableMockHandler18.invocationContainerImpl = invocationContainerImpl31;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl31;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler34 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder35 = strComparableMockHandler34.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl36 = strComparableMockHandler34.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer37 = strComparableMockHandler34.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler38 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder39 = strComparableMockHandler38.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl40 = strComparableMockHandler38.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress41 = strComparableMockHandler38.mockingProgress;
        strComparableMockHandler34.mockingProgress = mockingProgress41;
        strComparableMockHandler0.mockingProgress = mockingProgress41;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl44 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler45 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder46 = strComparableMockHandler45.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl47 = strComparableMockHandler45.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress48 = strComparableMockHandler45.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl49 = strComparableMockHandler45.getMockSettings();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl50 = strComparableMockHandler45.invocationContainerImpl;
        strComparableMockHandler0.invocationContainerImpl = invocationContainerImpl50;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler52 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder53 = strComparableMockHandler52.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl54 = strComparableMockHandler52.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer55 = strComparableMockHandler52.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler56 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder57 = strComparableMockHandler56.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl58 = strComparableMockHandler56.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress59 = strComparableMockHandler56.mockingProgress;
        strComparableMockHandler52.mockingProgress = mockingProgress59;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler61 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder62 = strComparableMockHandler61.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler63 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray64 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList65 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList65, answerArray64);
        strComparableMockHandler63.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList65);
        strComparableMockHandler61.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList65);
        strComparableMockHandler52.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList65);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList65);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer71 = strComparableMockHandler0.getInvocationContainer();
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(invocationContainerImpl6);
        org.junit.Assert.assertNotNull(mockingProgress7);
        org.junit.Assert.assertNotNull(matchersBinder10);
        org.junit.Assert.assertNotNull(answerArray12);
        org.junit.Assert.assertArrayEquals(answerArray12, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matchersBinder19);
        org.junit.Assert.assertNotNull(invocationContainerImpl20);
        org.junit.Assert.assertNotNull(mockingProgress21);
        org.junit.Assert.assertNotNull(mockSettingsImpl22);
        org.junit.Assert.assertNotNull(answerArray24);
        org.junit.Assert.assertArrayEquals(answerArray24, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(matchersBinder30);
        org.junit.Assert.assertNotNull(invocationContainerImpl31);
        org.junit.Assert.assertNotNull(matchersBinder35);
        org.junit.Assert.assertNotNull(invocationContainerImpl36);
        org.junit.Assert.assertNotNull(invocationContainer37);
        org.junit.Assert.assertNotNull(matchersBinder39);
        org.junit.Assert.assertNotNull(invocationContainerImpl40);
        org.junit.Assert.assertNotNull(mockingProgress41);
        org.junit.Assert.assertNotNull(invocationContainerImpl44);
        org.junit.Assert.assertNotNull(matchersBinder46);
        org.junit.Assert.assertNotNull(invocationContainerImpl47);
        org.junit.Assert.assertNotNull(mockingProgress48);
        org.junit.Assert.assertNotNull(mockSettingsImpl49);
        org.junit.Assert.assertNotNull(invocationContainerImpl50);
        org.junit.Assert.assertNotNull(matchersBinder53);
        org.junit.Assert.assertNotNull(invocationContainerImpl54);
        org.junit.Assert.assertNotNull(invocationContainer55);
        org.junit.Assert.assertNotNull(matchersBinder57);
        org.junit.Assert.assertNotNull(invocationContainerImpl58);
        org.junit.Assert.assertNotNull(mockingProgress59);
        org.junit.Assert.assertNotNull(matchersBinder62);
        org.junit.Assert.assertNotNull(answerArray64);
        org.junit.Assert.assertArrayEquals(answerArray64, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(invocationContainer71);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress3 = strComparableMockHandler0.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = strComparableMockHandler0.getMockSettings();
        org.mockito.internal.MockHandler<org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>>> strComparableMockHandlerInterfaceMockHandler5 = new org.mockito.internal.MockHandler<org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>>>(mockSettingsImpl4);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler6 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>(mockSettingsImpl4);
        org.mockito.internal.MockHandler<java.util.AbstractCollection<org.mockito.stubbing.Answer>> answerCollectionMockHandler7 = new org.mockito.internal.MockHandler<java.util.AbstractCollection<org.mockito.stubbing.Answer>>(mockSettingsImpl4);
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler8 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>(mockSettingsImpl4);
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(mockingProgress3);
        org.junit.Assert.assertNotNull(mockSettingsImpl4);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler0 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder1 = strComparableMockHandler0.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl2 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = strComparableMockHandler0.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler4 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = strComparableMockHandler4.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl6 = strComparableMockHandler4.invocationContainerImpl;
        org.mockito.internal.progress.MockingProgress mockingProgress7 = strComparableMockHandler4.mockingProgress;
        strComparableMockHandler0.mockingProgress = mockingProgress7;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler9 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.internal.invocation.MatchersBinder matchersBinder10 = strComparableMockHandler9.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>> strComparableMockHandler11 = new org.mockito.internal.MockHandler<java.lang.Comparable<java.lang.String>>();
        org.mockito.stubbing.Answer[] answerArray12 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList13 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList13, answerArray12);
        strComparableMockHandler11.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        strComparableMockHandler0.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList13);
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl18 = strComparableMockHandler0.invocationContainerImpl;
        org.mockito.internal.invocation.Invocation invocation19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = strComparableMockHandler0.handle(invocation19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matchersBinder1);
        org.junit.Assert.assertNotNull(invocationContainerImpl2);
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(invocationContainerImpl6);
        org.junit.Assert.assertNotNull(mockingProgress7);
        org.junit.Assert.assertNotNull(matchersBinder10);
        org.junit.Assert.assertNotNull(answerArray12);
        org.junit.Assert.assertArrayEquals(answerArray12, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(invocationContainerImpl18);
    }
}

