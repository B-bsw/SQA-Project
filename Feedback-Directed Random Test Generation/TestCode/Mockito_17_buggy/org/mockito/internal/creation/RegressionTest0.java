package org.mockito.internal.creation;

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
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock(strComparable1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is null!");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class class1 = null;
        // The following exception was thrown during execution in test generation
        try {
            mockSettingsImpl0.initiateMockName(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.Class<?>> wildcardClassMockHandlerInterface3 = mockUtil0.getMockHandler(wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName2 = mockSettingsImpl0.getMockName();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        mockSettingsImpl0.initiateMockName((java.lang.Class) wildcardClass4);
        java.lang.Class<?>[] wildcardClassArray6 = mockSettingsImpl0.getExtraInterfaces();
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(mockName2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardClassArray6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName3 = mockUtil1.getMockName((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Long");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName2 = mockUtil0.getMockName((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Character");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.util.CreationValidator creationValidator4 = null;
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil(creationValidator4);
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl8 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) mockSettingsImpl8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName10 = mockUtil1.getMockName((java.lang.Object) mockSettingsImpl8);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.creation.MockSettingsImpl");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName2 = mockSettingsImpl0.getMockName();
        org.mockito.internal.util.MockName mockName3 = mockSettingsImpl0.getMockName();
        org.mockito.MockSettings mockSettings4 = mockSettingsImpl0.serializable();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl5 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings6 = mockSettingsImpl5.serializable();
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl5.serializable();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer8 = mockSettingsImpl5.getDefaultAnswer();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        mockSettingsImpl5.initiateMockName((java.lang.Class) wildcardClass10);
        java.lang.Class[] classArray13 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        wildcardClassArray14[0] = wildcardClass10;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.MockSettings mockSettings17 = mockSettingsImpl0.extraInterfaces(wildcardClassArray14);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?extraInterfaces() accepts only interfaces.?You passed following type: Object which is not an interface.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(mockName2);
        org.junit.Assert.assertNull(mockName3);
        org.junit.Assert.assertNotNull(mockSettings4);
        org.junit.Assert.assertNotNull(mockSettings6);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(objAnswer8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] { java.lang.Object.class });
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] { java.lang.Object.class });
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray4 = mockSettingsImpl3.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName5 = mockSettingsImpl3.getMockName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<org.mockito.internal.creation.MockSettingsImpl> mockSettingsImplMockHandlerInterface6 = mockUtil0.getMockHandler(mockSettingsImpl3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.creation.MockSettingsImpl");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardClassArray4);
        org.junit.Assert.assertNull(mockName5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement> annotatedElementMockHandlerInterface4 = mockUtil1.getMockHandler((java.lang.reflect.AnnotatedElement) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings1 = mockSettingsImpl0.serializable();
        org.mockito.MockSettings mockSettings2 = mockSettingsImpl0.serializable();
        org.mockito.MockSettings mockSettings4 = mockSettingsImpl0.name("hi!");
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(mockSettings2);
        org.junit.Assert.assertNotNull(mockSettings4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings1 = mockSettingsImpl0.serializable();
        org.mockito.MockSettings mockSettings2 = mockSettingsImpl0.serializable();
        org.mockito.internal.util.MockName mockName3 = mockSettingsImpl0.getMockName();
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(mockSettings2);
        org.junit.Assert.assertNull(mockName3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl4.name("hi!");
        org.mockito.MockSettings mockSettings8 = mockSettingsImpl4.serializable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNotNull(mockSettings8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        org.mockito.MockSettings mockSettings2 = mockSettingsImpl0.serializable();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray4 = mockSettingsImpl3.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName5 = mockSettingsImpl3.getMockName();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        mockSettingsImpl3.initiateMockName((java.lang.Class) wildcardClass7);
        mockSettingsImpl0.initiateMockName((java.lang.Class) wildcardClass7);
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNotNull(mockSettings2);
        org.junit.Assert.assertNull(wildcardClassArray4);
        org.junit.Assert.assertNull(mockName5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName2 = mockSettingsImpl0.getMockName();
        org.mockito.internal.util.MockName mockName3 = mockSettingsImpl0.getMockName();
        java.lang.Class<?>[] wildcardClassArray4 = mockSettingsImpl0.getExtraInterfaces();
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(mockName2);
        org.junit.Assert.assertNull(mockName3);
        org.junit.Assert.assertNull(wildcardClassArray4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray4 = mockSettingsImpl3.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName5 = mockSettingsImpl3.getMockName();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        mockSettingsImpl3.initiateMockName((java.lang.Class) wildcardClass7);
        org.mockito.MockSettings mockSettings10 = mockSettingsImpl3.name("");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<org.mockito.internal.creation.MockSettingsImpl> mockSettingsImplMockHandlerInterface11 = mockUtil0.getMockHandler(mockSettingsImpl3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.creation.MockSettingsImpl");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardClassArray4);
        org.junit.Assert.assertNull(mockName5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mockSettings10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName5 = mockUtil1.getMockName((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Character");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings1 = mockSettingsImpl0.serializable();
        org.mockito.MockSettings mockSettings2 = mockSettingsImpl0.serializable();
        org.mockito.MockSettings mockSettings4 = mockSettingsImpl0.spiedInstance((java.lang.Object) "hi!");
        java.lang.Object obj5 = mockSettingsImpl0.getSpiedInstance();
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(mockSettings2);
        org.junit.Assert.assertNotNull(mockSettings4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl6 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        mockSettingsImpl6.initiateMockName((java.lang.Class) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName10 = mockUtil1.getMockName((java.lang.Object) mockSettingsImpl6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.creation.MockSettingsImpl");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        java.lang.Object obj2 = mockSettingsImpl0.getSpiedInstance();
        org.mockito.MockSettings mockSettings3 = mockSettingsImpl0.serializable();
        org.mockito.internal.util.MockName mockName4 = mockSettingsImpl0.getMockName();
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNull(mockName4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName5 = mockUtil1.getMockName((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Integer");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl4.name("hi!");
        java.lang.Class<?>[] wildcardClassArray8 = mockSettingsImpl4.getExtraInterfaces();
        java.lang.Class<?>[] wildcardClassArray9 = mockSettingsImpl4.getExtraInterfaces();
        org.mockito.stubbing.Answer answer10 = null;
        org.mockito.MockSettings mockSettings11 = mockSettingsImpl4.defaultAnswer(answer10);
        org.mockito.MockSettings mockSettings13 = mockSettingsImpl4.name("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(wildcardClassArray8);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(mockSettings11);
        org.junit.Assert.assertNotNull(mockSettings13);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray4 = mockSettingsImpl3.getExtraInterfaces();
        java.lang.Object obj5 = mockSettingsImpl3.getSpiedInstance();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl6 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray7 = mockSettingsImpl6.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName8 = mockSettingsImpl6.getMockName();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        mockSettingsImpl6.initiateMockName((java.lang.Class) wildcardClass10);
        mockSettingsImpl3.initiateMockName((java.lang.Class) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement> annotatedElementMockHandlerInterface13 = mockUtil0.getMockHandler((java.lang.reflect.AnnotatedElement) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardClassArray4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(wildcardClassArray7);
        org.junit.Assert.assertNull(mockName8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        java.lang.Object obj2 = mockSettingsImpl0.getSpiedInstance();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray4 = mockSettingsImpl3.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName5 = mockSettingsImpl3.getMockName();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        mockSettingsImpl3.initiateMockName((java.lang.Class) wildcardClass7);
        mockSettingsImpl0.initiateMockName((java.lang.Class) wildcardClass7);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer10 = mockSettingsImpl0.getDefaultAnswer();
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(wildcardClassArray4);
        org.junit.Assert.assertNull(mockName5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objAnswer10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        java.lang.Object obj2 = mockSettingsImpl0.getSpiedInstance();
        java.lang.Object obj3 = mockSettingsImpl0.getSpiedInstance();
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings4 = mockSettingsImpl3.serializable();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl5 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray6 = mockSettingsImpl5.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName7 = mockSettingsImpl5.getMockName();
        org.mockito.internal.util.MockName mockName8 = mockSettingsImpl5.getMockName();
        java.lang.Class<?> wildcardClass9 = mockSettingsImpl5.getClass();
        mockSettingsImpl3.initiateMockName((java.lang.Class) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((java.lang.reflect.Type) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mockSettings4);
        org.junit.Assert.assertNull(wildcardClassArray6);
        org.junit.Assert.assertNull(mockName7);
        org.junit.Assert.assertNull(mockName8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        java.lang.Object obj2 = mockSettingsImpl0.getSpiedInstance();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray4 = mockSettingsImpl3.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName5 = mockSettingsImpl3.getMockName();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        mockSettingsImpl3.initiateMockName((java.lang.Class) wildcardClass7);
        mockSettingsImpl0.initiateMockName((java.lang.Class) wildcardClass7);
        org.mockito.MockSettings mockSettings11 = mockSettingsImpl0.name("");
        boolean boolean12 = mockSettingsImpl0.isSerializable();
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(wildcardClassArray4);
        org.junit.Assert.assertNull(mockName5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mockSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings2 = mockSettingsImpl1.serializable();
        org.mockito.MockSettings mockSettings3 = mockSettingsImpl1.serializable();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer4 = mockSettingsImpl1.getDefaultAnswer();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        mockSettingsImpl1.initiateMockName((java.lang.Class) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock(wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNull(objAnswer4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray4 = mockSettingsImpl3.getExtraInterfaces();
        java.lang.Object obj5 = mockSettingsImpl3.getSpiedInstance();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl6 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray7 = mockSettingsImpl6.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName8 = mockSettingsImpl6.getMockName();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        mockSettingsImpl6.initiateMockName((java.lang.Class) wildcardClass10);
        mockSettingsImpl3.initiateMockName((java.lang.Class) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock(wildcardClass10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardClassArray4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(wildcardClassArray7);
        org.junit.Assert.assertNull(mockName8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl4.name("hi!");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer8 = mockSettingsImpl4.getDefaultAnswer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(objAnswer8);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName2 = mockSettingsImpl0.getMockName();
        org.mockito.internal.util.MockName mockName3 = mockSettingsImpl0.getMockName();
        java.lang.Object obj4 = mockSettingsImpl0.getSpiedInstance();
        org.mockito.MockSettings mockSettings6 = mockSettingsImpl0.name("hi!");
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(mockName2);
        org.junit.Assert.assertNull(mockName3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(mockSettings6);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        org.mockito.internal.util.CreationValidator creationValidator1 = null;
        org.mockito.internal.util.MockUtil mockUtil2 = new org.mockito.internal.util.MockUtil(creationValidator1);
        boolean boolean4 = mockUtil2.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl5 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean6 = mockUtil2.isMock((java.lang.Object) mockSettingsImpl5);
        org.mockito.MockSettings mockSettings8 = mockSettingsImpl5.spiedInstance((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock(mockSettings8);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.creation.MockSettingsImpl");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(mockSettings8);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl2 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings3 = mockSettingsImpl2.serializable();
        org.mockito.MockSettings mockSettings4 = mockSettingsImpl2.serializable();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer5 = mockSettingsImpl2.getDefaultAnswer();
        boolean boolean6 = mockUtil1.isMock((java.lang.Object) objAnswer5);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(mockSettings4);
        org.junit.Assert.assertNull(objAnswer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray2 = mockSettingsImpl1.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName3 = mockSettingsImpl1.getMockName();
        org.mockito.internal.util.MockName mockName4 = mockSettingsImpl1.getMockName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName5 = mockUtil0.getMockName((java.lang.Object) mockName4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is null!");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClassArray2);
        org.junit.Assert.assertNull(mockName3);
        org.junit.Assert.assertNull(mockName4);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName2 = mockSettingsImpl0.getMockName();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        mockSettingsImpl0.initiateMockName((java.lang.Class) wildcardClass4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl0.name("");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer8 = mockSettingsImpl0.getDefaultAnswer();
        org.mockito.MockSettings mockSettings10 = mockSettingsImpl0.name("");
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(mockName2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(objAnswer8);
        org.junit.Assert.assertNotNull(mockSettings10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        java.lang.Class<?> wildcardClass6 = mockSettingsImpl4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl4.spiedInstance((java.lang.Object) 10L);
        java.lang.Class<?>[] wildcardClassArray8 = mockSettingsImpl4.getExtraInterfaces();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(wildcardClassArray8);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl4.name("hi!");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl8 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray9 = mockSettingsImpl8.getExtraInterfaces();
        java.lang.Object obj10 = mockSettingsImpl8.getSpiedInstance();
        org.mockito.MockSettings mockSettings11 = mockSettingsImpl8.serializable();
        org.mockito.MockSettings mockSettings12 = mockSettingsImpl4.spiedInstance((java.lang.Object) mockSettingsImpl8);
        org.mockito.internal.util.CreationValidator creationValidator13 = null;
        org.mockito.internal.util.MockUtil mockUtil14 = new org.mockito.internal.util.MockUtil(creationValidator13);
        boolean boolean16 = mockUtil14.isMock((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass17 = mockUtil14.getClass();
        mockSettingsImpl4.initiateMockName((java.lang.Class) wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(mockSettings11);
        org.junit.Assert.assertNotNull(mockSettings12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        org.mockito.internal.util.CreationValidator creationValidator2 = null;
        org.mockito.internal.util.MockUtil mockUtil3 = new org.mockito.internal.util.MockUtil(creationValidator2);
        boolean boolean5 = mockUtil3.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl6 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean7 = mockUtil3.isMock((java.lang.Object) mockSettingsImpl6);
        org.mockito.MockSettings mockSettings9 = mockSettingsImpl6.name("hi!");
        java.lang.Class<?>[] wildcardClassArray10 = mockSettingsImpl6.getExtraInterfaces();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl11 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray12 = mockSettingsImpl11.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName13 = mockSettingsImpl11.getMockName();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        mockSettingsImpl11.initiateMockName((java.lang.Class) wildcardClass15);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl17 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings18 = mockSettingsImpl17.serializable();
        org.mockito.MockSettings mockSettings19 = mockSettingsImpl17.serializable();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer20 = mockSettingsImpl17.getDefaultAnswer();
        java.lang.Class<?>[] wildcardClassArray21 = mockSettingsImpl17.getExtraInterfaces();
        org.mockito.MockSettings mockSettings22 = mockSettingsImpl11.extraInterfaces(wildcardClassArray21);
        org.mockito.MockSettings mockSettings23 = mockSettingsImpl6.spiedInstance((java.lang.Object) mockSettings22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<org.mockito.internal.creation.MockSettingsImpl> mockSettingsImplMockHandlerInterface24 = mockUtil1.getMockHandler(mockSettingsImpl6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.creation.MockSettingsImpl");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mockSettings9);
        org.junit.Assert.assertNull(wildcardClassArray10);
        org.junit.Assert.assertNull(wildcardClassArray12);
        org.junit.Assert.assertNull(mockName13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(mockSettings18);
        org.junit.Assert.assertNotNull(mockSettings19);
        org.junit.Assert.assertNull(objAnswer20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { java.io.Serializable.class });
        org.junit.Assert.assertNotNull(mockSettings22);
        org.junit.Assert.assertNotNull(mockSettings23);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray5 = mockSettingsImpl4.getExtraInterfaces();
        org.mockito.MockSettings mockSettings6 = mockSettingsImpl4.serializable();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl7 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings8 = mockSettingsImpl7.serializable();
        java.lang.Class<?>[] wildcardClassArray9 = mockSettingsImpl7.getExtraInterfaces();
        org.mockito.MockSettings mockSettings10 = mockSettingsImpl4.extraInterfaces(wildcardClassArray9);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil1.resetMock(wildcardClassArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class [Ljava.lang.Class;");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(mockSettings6);
        org.junit.Assert.assertNotNull(mockSettings8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] { java.io.Serializable.class });
        org.junit.Assert.assertNotNull(mockSettings10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl4.name("hi!");
        java.lang.Class<?>[] wildcardClassArray8 = mockSettingsImpl4.getExtraInterfaces();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl9 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray10 = mockSettingsImpl9.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName11 = mockSettingsImpl9.getMockName();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        mockSettingsImpl9.initiateMockName((java.lang.Class) wildcardClass13);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl15 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings16 = mockSettingsImpl15.serializable();
        org.mockito.MockSettings mockSettings17 = mockSettingsImpl15.serializable();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer18 = mockSettingsImpl15.getDefaultAnswer();
        java.lang.Class<?>[] wildcardClassArray19 = mockSettingsImpl15.getExtraInterfaces();
        org.mockito.MockSettings mockSettings20 = mockSettingsImpl9.extraInterfaces(wildcardClassArray19);
        org.mockito.MockSettings mockSettings21 = mockSettingsImpl4.spiedInstance((java.lang.Object) mockSettings20);
        org.mockito.MockSettings mockSettings23 = mockSettingsImpl4.name("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(wildcardClassArray8);
        org.junit.Assert.assertNull(wildcardClassArray10);
        org.junit.Assert.assertNull(mockName11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(mockSettings16);
        org.junit.Assert.assertNotNull(mockSettings17);
        org.junit.Assert.assertNull(objAnswer18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] { java.io.Serializable.class });
        org.junit.Assert.assertNotNull(mockSettings20);
        org.junit.Assert.assertNotNull(mockSettings21);
        org.junit.Assert.assertNotNull(mockSettings23);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) (byte) 1);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings5 = mockSettingsImpl4.serializable();
        java.lang.Class<?>[] wildcardClassArray6 = mockSettingsImpl4.getExtraInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName7 = mockUtil1.getMockName((java.lang.Object) mockSettingsImpl4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.creation.MockSettingsImpl");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { java.io.Serializable.class });
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        mockSettingsImpl0.initiateMockName((java.lang.Class) wildcardClass2);
        org.mockito.stubbing.Answer answer4 = null;
        org.mockito.MockSettings mockSettings5 = mockSettingsImpl0.defaultAnswer(answer4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl0.spiedInstance((java.lang.Object) (byte) 10);
        org.mockito.stubbing.Answer answer8 = null;
        org.mockito.MockSettings mockSettings9 = mockSettingsImpl0.defaultAnswer(answer8);
        java.lang.Object obj10 = mockSettingsImpl0.getSpiedInstance();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNotNull(mockSettings9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        mockSettingsImpl0.initiateMockName((java.lang.Class) wildcardClass2);
        org.mockito.stubbing.Answer answer4 = null;
        org.mockito.MockSettings mockSettings5 = mockSettingsImpl0.defaultAnswer(answer4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl0.spiedInstance((java.lang.Object) (byte) 10);
        org.mockito.stubbing.Answer answer8 = null;
        org.mockito.MockSettings mockSettings9 = mockSettingsImpl0.defaultAnswer(answer8);
        org.mockito.internal.util.MockName mockName10 = mockSettingsImpl0.getMockName();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNotNull(mockSettings9);
        org.junit.Assert.assertNotNull(mockName10);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl4.name("hi!");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl8 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray9 = mockSettingsImpl8.getExtraInterfaces();
        java.lang.Object obj10 = mockSettingsImpl8.getSpiedInstance();
        org.mockito.MockSettings mockSettings11 = mockSettingsImpl8.serializable();
        org.mockito.MockSettings mockSettings12 = mockSettingsImpl4.spiedInstance((java.lang.Object) mockSettingsImpl8);
        org.mockito.stubbing.Answer answer13 = null;
        org.mockito.MockSettings mockSettings14 = mockSettingsImpl8.defaultAnswer(answer13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(mockSettings11);
        org.junit.Assert.assertNotNull(mockSettings12);
        org.junit.Assert.assertNotNull(mockSettings14);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        java.lang.Class<?>[] wildcardClassArray2 = mockSettingsImpl0.getExtraInterfaces();
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(wildcardClassArray2);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl4.spiedInstance((java.lang.Object) 10L);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer8 = mockSettingsImpl4.getDefaultAnswer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(objAnswer8);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        java.lang.Object obj6 = null;
        boolean boolean7 = mockUtil1.isMock(obj6);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl8 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray9 = mockSettingsImpl8.getExtraInterfaces();
        org.mockito.MockSettings mockSettings10 = mockSettingsImpl8.serializable();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl11 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings12 = mockSettingsImpl11.serializable();
        java.lang.Class<?>[] wildcardClassArray13 = mockSettingsImpl11.getExtraInterfaces();
        org.mockito.MockSettings mockSettings14 = mockSettingsImpl8.extraInterfaces(wildcardClassArray13);
        boolean boolean15 = mockUtil1.isMock((java.lang.Object) mockSettings14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(mockSettings10);
        org.junit.Assert.assertNotNull(mockSettings12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { java.io.Serializable.class });
        org.junit.Assert.assertNotNull(mockSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        org.mockito.internal.util.CreationValidator creationValidator1 = null;
        org.mockito.internal.util.MockUtil mockUtil2 = new org.mockito.internal.util.MockUtil(creationValidator1);
        boolean boolean4 = mockUtil2.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl5 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean6 = mockUtil2.isMock((java.lang.Object) mockSettingsImpl5);
        org.mockito.MockSettings mockSettings8 = mockSettingsImpl5.name("hi!");
        java.lang.Class<?>[] wildcardClassArray9 = mockSettingsImpl5.getExtraInterfaces();
        java.lang.Class<?>[] wildcardClassArray10 = mockSettingsImpl5.getExtraInterfaces();
        org.mockito.stubbing.Answer answer11 = null;
        org.mockito.MockSettings mockSettings12 = mockSettingsImpl5.defaultAnswer(answer11);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((org.mockito.MockSettings) mockSettingsImpl5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.creation.MockSettingsImpl");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(mockSettings8);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(mockSettings12);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings1 = mockSettingsImpl0.serializable();
        java.lang.Class<?>[] wildcardClassArray2 = mockSettingsImpl0.getExtraInterfaces();
        org.mockito.MockSettings mockSettings4 = mockSettingsImpl0.name("");
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[] { java.io.Serializable.class });
        org.junit.Assert.assertNotNull(mockSettings4);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.internal.util.CreationValidator creationValidator6 = null;
        org.mockito.internal.util.MockUtil mockUtil7 = new org.mockito.internal.util.MockUtil(creationValidator6);
        boolean boolean9 = mockUtil7.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl10 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean11 = mockUtil7.isMock((java.lang.Object) mockSettingsImpl10);
        org.mockito.MockSettings mockSettings13 = mockSettingsImpl10.name("hi!");
        java.lang.Class<?>[] wildcardClassArray14 = mockSettingsImpl10.getExtraInterfaces();
        java.lang.Class<?>[] wildcardClassArray15 = mockSettingsImpl10.getExtraInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName16 = mockUtil1.getMockName((java.lang.Object) wildcardClassArray15);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is null!");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mockSettings13);
        org.junit.Assert.assertNull(wildcardClassArray14);
        org.junit.Assert.assertNull(wildcardClassArray15);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName2 = mockSettingsImpl0.getMockName();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        mockSettingsImpl0.initiateMockName((java.lang.Class) wildcardClass4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl0.name("");
        org.mockito.MockSettings mockSettings9 = mockSettingsImpl0.name("hi!");
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(mockName2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNotNull(mockSettings9);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName2 = mockSettingsImpl0.getMockName();
        org.mockito.internal.util.MockName mockName3 = mockSettingsImpl0.getMockName();
        java.lang.Object obj4 = mockSettingsImpl0.getSpiedInstance();
        org.mockito.internal.util.MockName mockName5 = mockSettingsImpl0.getMockName();
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(mockName2);
        org.junit.Assert.assertNull(mockName3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(mockName5);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl4.name("hi!");
        java.lang.Class<?>[] wildcardClassArray8 = mockSettingsImpl4.getExtraInterfaces();
        java.lang.Class<?>[] wildcardClassArray9 = mockSettingsImpl4.getExtraInterfaces();
        org.mockito.stubbing.Answer answer10 = null;
        org.mockito.MockSettings mockSettings11 = mockSettingsImpl4.defaultAnswer(answer10);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer12 = mockSettingsImpl4.getDefaultAnswer();
        org.mockito.MockSettings mockSettings13 = mockSettingsImpl4.serializable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(wildcardClassArray8);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(mockSettings11);
        org.junit.Assert.assertNull(objAnswer12);
        org.junit.Assert.assertNotNull(mockSettings13);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl4.name("hi!");
        java.lang.Class<?>[] wildcardClassArray8 = mockSettingsImpl4.getExtraInterfaces();
        java.lang.Class<?>[] wildcardClassArray9 = mockSettingsImpl4.getExtraInterfaces();
        org.mockito.stubbing.Answer answer10 = null;
        org.mockito.MockSettings mockSettings11 = mockSettingsImpl4.defaultAnswer(answer10);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl12 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray13 = mockSettingsImpl12.getExtraInterfaces();
        java.lang.Object obj14 = mockSettingsImpl12.getSpiedInstance();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl15 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray16 = mockSettingsImpl15.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName17 = mockSettingsImpl15.getMockName();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        mockSettingsImpl15.initiateMockName((java.lang.Class) wildcardClass19);
        mockSettingsImpl12.initiateMockName((java.lang.Class) wildcardClass19);
        mockSettingsImpl4.initiateMockName((java.lang.Class) wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(wildcardClassArray8);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(mockSettings11);
        org.junit.Assert.assertNull(wildcardClassArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(wildcardClassArray16);
        org.junit.Assert.assertNull(mockName17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl4.name("hi!");
        java.lang.Class<?>[] wildcardClassArray8 = mockSettingsImpl4.getExtraInterfaces();
        java.lang.Class<?>[] wildcardClassArray9 = mockSettingsImpl4.getExtraInterfaces();
        org.mockito.stubbing.Answer answer10 = null;
        org.mockito.MockSettings mockSettings11 = mockSettingsImpl4.defaultAnswer(answer10);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl12 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray13 = mockSettingsImpl12.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName14 = mockSettingsImpl12.getMockName();
        java.lang.Class<?>[] wildcardClassArray15 = mockSettingsImpl12.getExtraInterfaces();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl16 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings17 = mockSettingsImpl16.serializable();
        org.mockito.MockSettings mockSettings18 = mockSettingsImpl16.serializable();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer19 = mockSettingsImpl16.getDefaultAnswer();
        java.lang.Class<?>[] wildcardClassArray20 = mockSettingsImpl16.getExtraInterfaces();
        org.mockito.MockSettings mockSettings21 = mockSettingsImpl12.extraInterfaces(wildcardClassArray20);
        org.mockito.MockSettings mockSettings22 = mockSettingsImpl4.extraInterfaces(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(wildcardClassArray8);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(mockSettings11);
        org.junit.Assert.assertNull(wildcardClassArray13);
        org.junit.Assert.assertNull(mockName14);
        org.junit.Assert.assertNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(mockSettings17);
        org.junit.Assert.assertNotNull(mockSettings18);
        org.junit.Assert.assertNull(objAnswer19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { java.io.Serializable.class });
        org.junit.Assert.assertNotNull(mockSettings21);
        org.junit.Assert.assertNotNull(mockSettings22);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl4.name("hi!");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl8 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray9 = mockSettingsImpl8.getExtraInterfaces();
        java.lang.Object obj10 = mockSettingsImpl8.getSpiedInstance();
        org.mockito.MockSettings mockSettings11 = mockSettingsImpl8.serializable();
        org.mockito.MockSettings mockSettings12 = mockSettingsImpl4.spiedInstance((java.lang.Object) mockSettingsImpl8);
        org.mockito.internal.util.MockName mockName13 = mockSettingsImpl8.getMockName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(mockSettings11);
        org.junit.Assert.assertNotNull(mockSettings12);
        org.junit.Assert.assertNull(mockName13);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName2 = mockSettingsImpl0.getMockName();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        mockSettingsImpl0.initiateMockName((java.lang.Class) wildcardClass4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl0.name("");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer8 = mockSettingsImpl0.getDefaultAnswer();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer9 = mockSettingsImpl0.getDefaultAnswer();
        java.lang.Class<?>[] wildcardClassArray10 = mockSettingsImpl0.getExtraInterfaces();
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(mockName2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(objAnswer8);
        org.junit.Assert.assertNull(objAnswer9);
        org.junit.Assert.assertNull(wildcardClassArray10);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        org.mockito.MockSettings mockSettings2 = mockSettingsImpl0.serializable();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer3 = mockSettingsImpl0.getDefaultAnswer();
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNotNull(mockSettings2);
        org.junit.Assert.assertNull(objAnswer3);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) true);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement> annotatedElementMockHandlerInterface5 = mockUtil0.getMockHandler((java.lang.reflect.AnnotatedElement) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.mockito.internal.util.CreationValidator creationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(creationValidator0);
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean5 = mockUtil1.isMock((java.lang.Object) mockSettingsImpl4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl4.name("hi!");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl8 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray9 = mockSettingsImpl8.getExtraInterfaces();
        java.lang.Object obj10 = mockSettingsImpl8.getSpiedInstance();
        org.mockito.MockSettings mockSettings11 = mockSettingsImpl8.serializable();
        org.mockito.MockSettings mockSettings12 = mockSettingsImpl4.spiedInstance((java.lang.Object) mockSettingsImpl8);
        java.lang.Class<?>[] wildcardClassArray13 = mockSettingsImpl8.getExtraInterfaces();
        org.mockito.stubbing.Answer answer14 = null;
        org.mockito.MockSettings mockSettings15 = mockSettingsImpl8.defaultAnswer(answer14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(mockSettings11);
        org.junit.Assert.assertNotNull(mockSettings12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { java.io.Serializable.class });
        org.junit.Assert.assertNotNull(mockSettings15);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        org.mockito.MockSettings mockSettings1 = mockSettingsImpl0.serializable();
        org.mockito.MockSettings mockSettings2 = mockSettingsImpl0.serializable();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer3 = mockSettingsImpl0.getDefaultAnswer();
        org.mockito.MockSettings mockSettings4 = mockSettingsImpl0.serializable();
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(mockSettings2);
        org.junit.Assert.assertNull(objAnswer3);
        org.junit.Assert.assertNotNull(mockSettings4);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) true);
        org.mockito.internal.util.MockUtil mockUtil3 = new org.mockito.internal.util.MockUtil();
        boolean boolean5 = mockUtil3.isMock((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock(mockUtil3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.util.MockUtil");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName2 = mockSettingsImpl0.getMockName();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        mockSettingsImpl0.initiateMockName((java.lang.Class) wildcardClass4);
        org.mockito.MockSettings mockSettings7 = mockSettingsImpl0.name("");
        org.mockito.internal.util.CreationValidator creationValidator8 = null;
        org.mockito.internal.util.MockUtil mockUtil9 = new org.mockito.internal.util.MockUtil(creationValidator8);
        boolean boolean11 = mockUtil9.isMock((java.lang.Object) 1L);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl12 = new org.mockito.internal.creation.MockSettingsImpl();
        boolean boolean13 = mockUtil9.isMock((java.lang.Object) mockSettingsImpl12);
        org.mockito.MockSettings mockSettings15 = mockSettingsImpl12.name("hi!");
        java.lang.Class<?>[] wildcardClassArray16 = mockSettingsImpl12.getExtraInterfaces();
        org.mockito.MockSettings mockSettings17 = mockSettingsImpl0.spiedInstance((java.lang.Object) mockSettingsImpl12);
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(mockName2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(mockSettings15);
        org.junit.Assert.assertNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(mockSettings17);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray1 = mockSettingsImpl0.getExtraInterfaces();
        java.lang.Object obj2 = mockSettingsImpl0.getSpiedInstance();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl();
        java.lang.Class<?>[] wildcardClassArray4 = mockSettingsImpl3.getExtraInterfaces();
        org.mockito.internal.util.MockName mockName5 = mockSettingsImpl3.getMockName();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        mockSettingsImpl3.initiateMockName((java.lang.Class) wildcardClass7);
        mockSettingsImpl0.initiateMockName((java.lang.Class) wildcardClass7);
        org.mockito.MockSettings mockSettings11 = mockSettingsImpl0.name("");
        org.mockito.MockSettings mockSettings12 = mockSettingsImpl0.serializable();
        org.mockito.MockSettings mockSettings14 = mockSettingsImpl0.name("hi!");
        org.junit.Assert.assertNull(wildcardClassArray1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(wildcardClassArray4);
        org.junit.Assert.assertNull(mockName5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mockSettings11);
        org.junit.Assert.assertNotNull(mockSettings12);
        org.junit.Assert.assertNotNull(mockSettings14);
    }
}

