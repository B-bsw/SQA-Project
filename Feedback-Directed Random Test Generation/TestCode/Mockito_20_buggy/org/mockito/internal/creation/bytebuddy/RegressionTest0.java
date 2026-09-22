package org.mockito.internal.creation.bytebuddy;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Class<?> wildcardClass1 = byteBuddyMockMaker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.invocation.MockHandler mockHandler2 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker0.resetMock((java.lang.Object) 0L, mockHandler2, mockCreationSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker0.resetMock(obj1, mockHandler2, mockCreationSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = mockHandler2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        java.lang.Object obj3 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler4 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker0.resetMock(obj3, mockHandler4, mockCreationSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.invocation.MockHandler mockHandler6 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker1.resetMock((java.lang.Object) 100L, mockHandler6, mockCreationSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass7 = byteBuddyMockMaker0.getClass();
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker5 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj6 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler7 = byteBuddyMockMaker5.getHandler(obj6);
        org.mockito.invocation.MockHandler mockHandler8 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker0.resetMock((java.lang.Object) byteBuddyMockMaker5, mockHandler8, mockCreationSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker0.resetMock((java.lang.Object) 'a', mockHandler4, mockCreationSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler8 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker0.resetMock((java.lang.Object) (short) 10, mockHandler8, mockCreationSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = mockHandler6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker5 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker6 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj7 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler8 = byteBuddyMockMaker6.getHandler(obj7);
        org.mockito.invocation.MockHandler mockHandler9 = byteBuddyMockMaker5.getHandler((java.lang.Object) byteBuddyMockMaker6);
        java.lang.Class<?> wildcardClass10 = byteBuddyMockMaker6.getClass();
        org.mockito.invocation.MockHandler mockHandler11 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker1.resetMock((java.lang.Object) byteBuddyMockMaker6, mockHandler11, mockCreationSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler8);
        org.junit.Assert.assertNull(mockHandler9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler8 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker0.resetMock((java.lang.Object) "", mockHandler8, mockCreationSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker1.getHandler((java.lang.Object) (byte) 0);
        org.mockito.invocation.MockHandler mockHandler8 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker1.resetMock((java.lang.Object) (byte) 100, mockHandler8, mockCreationSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = mockHandler6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) 10);
        org.mockito.invocation.MockHandler mockHandler8 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker0.resetMock((java.lang.Object) '4', mockHandler8, mockCreationSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = mockHandler4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = mockHandler4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = mockHandler4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) (-1.0f));
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = mockHandler6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) false);
        org.mockito.invocation.MockHandler mockHandler8 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass9 = byteBuddyMockMaker0.getClass();
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNull(mockHandler8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker5 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = mockHandler6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker1.getHandler((java.lang.Object) (byte) 0);
        org.mockito.invocation.MockHandler mockHandler8 = byteBuddyMockMaker1.getHandler((java.lang.Object) 1);
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNull(mockHandler8);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker1.getHandler((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass7 = byteBuddyMockMaker1.getClass();
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) (-1.0f));
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) (-1));
        org.mockito.invocation.MockHandler mockHandler8 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker0.resetMock((java.lang.Object) 100, mockHandler8, mockCreationSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker5 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker5);
        java.lang.Class<?> wildcardClass7 = byteBuddyMockMaker0.getClass();
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        java.lang.Class<?> wildcardClass5 = byteBuddyMockMaker0.getClass();
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker5 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj6 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler7 = byteBuddyMockMaker5.getHandler(obj6);
        org.mockito.invocation.MockHandler mockHandler9 = byteBuddyMockMaker5.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler11 = byteBuddyMockMaker5.getHandler((java.lang.Object) false);
        org.mockito.invocation.MockHandler mockHandler12 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker5);
        org.mockito.invocation.MockHandler mockHandler14 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker5.resetMock((java.lang.Object) (byte) 0, mockHandler14, mockCreationSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler7);
        org.junit.Assert.assertNull(mockHandler9);
        org.junit.Assert.assertNull(mockHandler11);
        org.junit.Assert.assertNull(mockHandler12);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker5 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj6 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler7 = byteBuddyMockMaker5.getHandler(obj6);
        org.mockito.invocation.MockHandler mockHandler9 = byteBuddyMockMaker5.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler11 = byteBuddyMockMaker5.getHandler((java.lang.Object) false);
        org.mockito.invocation.MockHandler mockHandler12 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker5);
        java.lang.Class<?> wildcardClass13 = byteBuddyMockMaker5.getClass();
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler7);
        org.junit.Assert.assertNull(mockHandler9);
        org.junit.Assert.assertNull(mockHandler11);
        org.junit.Assert.assertNull(mockHandler12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) false);
        org.mockito.invocation.MockHandler mockHandler8 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0d);
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker9 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj10 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler11 = byteBuddyMockMaker9.getHandler(obj10);
        org.mockito.invocation.MockHandler mockHandler13 = byteBuddyMockMaker9.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler15 = byteBuddyMockMaker9.getHandler((java.lang.Object) false);
        org.mockito.invocation.MockHandler mockHandler17 = byteBuddyMockMaker9.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler18 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker0.resetMock((java.lang.Object) mockHandler17, mockHandler18, mockCreationSettings19);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?At the moment you cannot provide own implementations of MockHandler.?Please see the javadocs for the MockMaker interface.?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNull(mockHandler8);
        org.junit.Assert.assertNull(mockHandler11);
        org.junit.Assert.assertNull(mockHandler13);
        org.junit.Assert.assertNull(mockHandler15);
        org.junit.Assert.assertNull(mockHandler17);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) (-1.0f));
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) (-1));
        org.mockito.invocation.MockHandler mockHandler8 = byteBuddyMockMaker0.getHandler((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = mockHandler8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNull(mockHandler8);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker7 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj8 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler9 = byteBuddyMockMaker7.getHandler(obj8);
        org.mockito.invocation.MockHandler mockHandler11 = byteBuddyMockMaker7.getHandler((java.lang.Object) (-1.0f));
        org.mockito.invocation.MockHandler mockHandler13 = byteBuddyMockMaker7.getHandler((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass14 = byteBuddyMockMaker7.getClass();
        org.mockito.invocation.MockHandler mockHandler15 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker0.resetMock((java.lang.Object) wildcardClass14, mockHandler15, mockCreationSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNull(mockHandler9);
        org.junit.Assert.assertNull(mockHandler11);
        org.junit.Assert.assertNull(mockHandler13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) 100.0f);
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker5 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.invocation.MockHandler mockHandler7 = byteBuddyMockMaker5.getHandler((java.lang.Object) (byte) 10);
        org.mockito.invocation.MockHandler mockHandler8 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker1.resetMock((java.lang.Object) mockHandler7, mockHandler8, mockCreationSettings9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?At the moment you cannot provide own implementations of MockHandler.?Please see the javadocs for the MockMaker interface.?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler7);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) false);
        java.lang.Class<?> wildcardClass7 = byteBuddyMockMaker0.getClass();
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass3 = byteBuddyMockMaker0.getClass();
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) (byte) 10);
        org.mockito.invocation.MockHandler mockHandler8 = byteBuddyMockMaker0.getHandler((java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNull(mockHandler8);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) false);
        org.mockito.invocation.MockHandler mockHandler8 = byteBuddyMockMaker0.getHandler((java.lang.Object) (short) 10);
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNull(mockHandler8);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = mockHandler2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockHandler2);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) false);
        org.mockito.invocation.MockHandler mockHandler8 = byteBuddyMockMaker0.getHandler((java.lang.Object) (short) 0);
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNull(mockHandler8);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.invocation.MockHandler mockHandler2 = null;
        org.mockito.mock.MockCreationSettings mockCreationSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            byteBuddyMockMaker0.resetMock((java.lang.Object) 100L, mockHandler2, mockCreationSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass7 = byteBuddyMockMaker0.getClass();
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler3 = byteBuddyMockMaker1.getHandler(obj2);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker1);
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker5 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker5);
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker7 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj8 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler9 = byteBuddyMockMaker7.getHandler(obj8);
        org.mockito.invocation.MockHandler mockHandler11 = byteBuddyMockMaker7.getHandler((java.lang.Object) 0.0f);
        org.mockito.invocation.MockHandler mockHandler13 = byteBuddyMockMaker7.getHandler((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass14 = byteBuddyMockMaker7.getClass();
        org.mockito.invocation.MockHandler mockHandler15 = byteBuddyMockMaker0.getHandler((java.lang.Object) byteBuddyMockMaker7);
        org.junit.Assert.assertNull(mockHandler3);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNull(mockHandler9);
        org.junit.Assert.assertNull(mockHandler11);
        org.junit.Assert.assertNull(mockHandler13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(mockHandler15);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        java.lang.Class<?> wildcardClass3 = byteBuddyMockMaker0.getClass();
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.invocation.MockHandler mockHandler2 = byteBuddyMockMaker0.getHandler(obj1);
        org.mockito.invocation.MockHandler mockHandler4 = byteBuddyMockMaker0.getHandler((java.lang.Object) (-1.0f));
        org.mockito.invocation.MockHandler mockHandler6 = byteBuddyMockMaker0.getHandler((java.lang.Object) (-1));
        org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker byteBuddyMockMaker7 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
        org.mockito.invocation.MockHandler mockHandler9 = byteBuddyMockMaker7.getHandler((java.lang.Object) (short) -1);
        org.mockito.invocation.MockHandler mockHandler10 = byteBuddyMockMaker0.getHandler((java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(mockHandler2);
        org.junit.Assert.assertNull(mockHandler4);
        org.junit.Assert.assertNull(mockHandler6);
        org.junit.Assert.assertNull(mockHandler9);
        org.junit.Assert.assertNull(mockHandler10);
    }
}

