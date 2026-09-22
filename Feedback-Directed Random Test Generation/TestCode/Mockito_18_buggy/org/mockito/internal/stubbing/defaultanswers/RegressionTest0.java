package org.mockito.internal.stubbing.defaultanswers;

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
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil2 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil3 = returnsEmptyValues0.mockUtil;
        java.lang.Class<?> wildcardClass4 = mockUtil3.getClass();
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(mockUtil2);
        org.junit.Assert.assertNotNull(mockUtil3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil2 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil3 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru4 = returnsEmptyValues0.methodsGuru;
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(mockUtil2);
        org.junit.Assert.assertNotNull(mockUtil3);
        org.junit.Assert.assertNotNull(objectMethodsGuru4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil2 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil3 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil4 = returnsEmptyValues0.mockUtil;
        java.lang.Class<?> wildcardClass5 = mockUtil4.getClass();
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(mockUtil2);
        org.junit.Assert.assertNotNull(mockUtil3);
        org.junit.Assert.assertNotNull(mockUtil4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil2 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil3 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil4 = returnsEmptyValues0.mockUtil;
        java.lang.Class<?> wildcardClass5 = returnsEmptyValues0.getClass();
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(mockUtil2);
        org.junit.Assert.assertNotNull(mockUtil3);
        org.junit.Assert.assertNotNull(mockUtil4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues2 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil3 = returnsEmptyValues2.mockUtil;
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru4 = returnsEmptyValues2.methodsGuru;
        returnsEmptyValues0.methodsGuru = objectMethodsGuru4;
        java.lang.Class<?> wildcardClass6 = objectMethodsGuru4.getClass();
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(mockUtil3);
        org.junit.Assert.assertNotNull(objectMethodsGuru4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil2 = returnsEmptyValues0.mockUtil;
        java.lang.Class<?> wildcardClass3 = mockUtil2.getClass();
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(mockUtil2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil2 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil3 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil4 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues5 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil6 = returnsEmptyValues5.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil7 = returnsEmptyValues5.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil8 = returnsEmptyValues5.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil9 = returnsEmptyValues5.mockUtil;
        returnsEmptyValues0.mockUtil = mockUtil9;
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(mockUtil2);
        org.junit.Assert.assertNotNull(mockUtil3);
        org.junit.Assert.assertNotNull(mockUtil4);
        org.junit.Assert.assertNotNull(mockUtil6);
        org.junit.Assert.assertNotNull(mockUtil7);
        org.junit.Assert.assertNotNull(mockUtil8);
        org.junit.Assert.assertNotNull(mockUtil9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil2 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil3 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil4 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil5 = returnsEmptyValues0.mockUtil;
        org.mockito.invocation.InvocationOnMock invocationOnMock6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = returnsEmptyValues0.answer(invocationOnMock6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(mockUtil2);
        org.junit.Assert.assertNotNull(mockUtil3);
        org.junit.Assert.assertNotNull(mockUtil4);
        org.junit.Assert.assertNotNull(mockUtil5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues2 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil3 = returnsEmptyValues2.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil4 = returnsEmptyValues2.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil5 = returnsEmptyValues2.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil6 = returnsEmptyValues2.mockUtil;
        returnsEmptyValues0.mockUtil = mockUtil6;
        java.lang.Class<?> wildcardClass8 = returnsEmptyValues0.getClass();
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(mockUtil3);
        org.junit.Assert.assertNotNull(mockUtil4);
        org.junit.Assert.assertNotNull(mockUtil5);
        org.junit.Assert.assertNotNull(mockUtil6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru1 = null;
        returnsEmptyValues0.methodsGuru = objectMethodsGuru1;
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues3 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil4 = returnsEmptyValues3.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil5 = returnsEmptyValues3.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil6 = returnsEmptyValues3.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil7 = returnsEmptyValues3.mockUtil;
        returnsEmptyValues0.mockUtil = mockUtil7;
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues9 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil10 = returnsEmptyValues9.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil11 = returnsEmptyValues9.mockUtil;
        returnsEmptyValues0.mockUtil = mockUtil11;
        org.junit.Assert.assertNotNull(mockUtil4);
        org.junit.Assert.assertNotNull(mockUtil5);
        org.junit.Assert.assertNotNull(mockUtil6);
        org.junit.Assert.assertNotNull(mockUtil7);
        org.junit.Assert.assertNotNull(mockUtil10);
        org.junit.Assert.assertNotNull(mockUtil11);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru2 = returnsEmptyValues0.methodsGuru;
        org.mockito.internal.util.MockUtil mockUtil3 = returnsEmptyValues0.mockUtil;
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(objectMethodsGuru2);
        org.junit.Assert.assertNotNull(mockUtil3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru1 = null;
        returnsEmptyValues0.methodsGuru = objectMethodsGuru1;
        org.mockito.invocation.InvocationOnMock invocationOnMock3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = returnsEmptyValues0.answer(invocationOnMock3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil2 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil3 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil4 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru5 = returnsEmptyValues0.methodsGuru;
        org.mockito.internal.util.MockUtil mockUtil6 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues7 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil8 = returnsEmptyValues7.mockUtil;
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues9 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil10 = returnsEmptyValues9.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil11 = returnsEmptyValues9.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil12 = returnsEmptyValues9.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil13 = returnsEmptyValues9.mockUtil;
        returnsEmptyValues7.mockUtil = mockUtil13;
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues15 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil16 = returnsEmptyValues15.mockUtil;
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues17 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil18 = returnsEmptyValues17.mockUtil;
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru19 = returnsEmptyValues17.methodsGuru;
        returnsEmptyValues15.methodsGuru = objectMethodsGuru19;
        returnsEmptyValues7.methodsGuru = objectMethodsGuru19;
        returnsEmptyValues0.methodsGuru = objectMethodsGuru19;
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(mockUtil2);
        org.junit.Assert.assertNotNull(mockUtil3);
        org.junit.Assert.assertNotNull(mockUtil4);
        org.junit.Assert.assertNotNull(objectMethodsGuru5);
        org.junit.Assert.assertNotNull(mockUtil6);
        org.junit.Assert.assertNotNull(mockUtil8);
        org.junit.Assert.assertNotNull(mockUtil10);
        org.junit.Assert.assertNotNull(mockUtil11);
        org.junit.Assert.assertNotNull(mockUtil12);
        org.junit.Assert.assertNotNull(mockUtil13);
        org.junit.Assert.assertNotNull(mockUtil16);
        org.junit.Assert.assertNotNull(mockUtil18);
        org.junit.Assert.assertNotNull(objectMethodsGuru19);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues2 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil3 = returnsEmptyValues2.mockUtil;
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru4 = returnsEmptyValues2.methodsGuru;
        returnsEmptyValues0.methodsGuru = objectMethodsGuru4;
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues6 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil7 = returnsEmptyValues6.mockUtil;
        returnsEmptyValues0.mockUtil = mockUtil7;
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(mockUtil3);
        org.junit.Assert.assertNotNull(objectMethodsGuru4);
        org.junit.Assert.assertNotNull(mockUtil7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil2 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil3 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil4 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru5 = returnsEmptyValues0.methodsGuru;
        org.mockito.internal.util.MockUtil mockUtil6 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil7 = returnsEmptyValues0.mockUtil;
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(mockUtil2);
        org.junit.Assert.assertNotNull(mockUtil3);
        org.junit.Assert.assertNotNull(mockUtil4);
        org.junit.Assert.assertNotNull(objectMethodsGuru5);
        org.junit.Assert.assertNotNull(mockUtil6);
        org.junit.Assert.assertNotNull(mockUtil7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = returnsEmptyValues0.mockUtil;
        org.mockito.internal.util.MockUtil mockUtil2 = returnsEmptyValues0.mockUtil;
        org.mockito.invocation.InvocationOnMock invocationOnMock3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = returnsEmptyValues0.answer(invocationOnMock3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockUtil1);
        org.junit.Assert.assertNotNull(mockUtil2);
    }
}

