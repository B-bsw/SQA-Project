package org.mockito.internal.util;

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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName2 = mockUtil0.getMockName((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Byte");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.String> strMockHandlerInterface4 = mockUtil0.getMockHandler("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        java.lang.reflect.AnnotatedElement annotatedElement3 = null;
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock(annotatedElement3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is null!");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName4 = mockUtil0.getMockName((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Long");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        org.mockito.internal.util.MockUtil mockUtil3 = new org.mockito.internal.util.MockUtil();
        boolean boolean5 = mockUtil3.isMock((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass6 = mockUtil3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((java.lang.reflect.Type) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 100.0d);
        org.mockito.internal.util.MockCreationValidator mockCreationValidator5 = null;
        org.mockito.internal.util.MockUtil mockUtil6 = new org.mockito.internal.util.MockUtil(mockCreationValidator5);
        java.lang.Class<?> wildcardClass7 = mockUtil6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.reflect.Type> typeMockHandlerInterface8 = mockUtil0.getMockHandler((java.lang.reflect.Type) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName2 = mockUtil0.getMockName((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        org.mockito.internal.util.MockUtil mockUtil3 = new org.mockito.internal.util.MockUtil();
        boolean boolean5 = mockUtil3.isMock((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass6 = mockUtil3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((java.lang.reflect.GenericDeclaration) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.internal.util.MockCreationValidator mockCreationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(mockCreationValidator0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.String> strMockHandlerInterface3 = mockUtil1.getMockHandler("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        org.mockito.internal.util.MockCreationValidator mockCreationValidator3 = null;
        org.mockito.internal.util.MockUtil mockUtil4 = new org.mockito.internal.util.MockUtil(mockCreationValidator3);
        java.lang.Class<?> wildcardClass5 = mockUtil4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((java.lang.reflect.GenericDeclaration) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName6 = mockUtil0.getMockName((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName6 = mockUtil0.getMockName((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Byte");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.mockito.internal.util.MockCreationValidator mockCreationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(mockCreationValidator0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.Object> objMockHandlerInterface3 = mockUtil1.getMockHandler((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Character");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName2 = mockUtil0.getMockName((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Character");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 100.0d);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) (-1.0d));
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName10 = mockUtil0.getMockName((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Double");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((java.io.Serializable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Double");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        org.mockito.internal.util.MockUtil mockUtil3 = new org.mockito.internal.util.MockUtil();
        boolean boolean5 = mockUtil3.isMock((java.lang.Object) (-1.0d));
        boolean boolean7 = mockUtil3.isMock((java.lang.Object) (-1.0d));
        boolean boolean9 = mockUtil3.isMock((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName10 = mockUtil0.getMockName((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Boolean");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.CharSequence> charSequenceMockHandlerInterface4 = mockUtil0.getMockHandler((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.mockito.internal.util.MockCreationValidator mockCreationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(mockCreationValidator0);
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName3 = mockUtil1.getMockName(obj2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is null!");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) 10.0d);
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) (-1.0d));
        boolean boolean10 = mockUtil0.isMock((java.lang.Object) boolean9);
        org.mockito.internal.util.MockCreationValidator mockCreationValidator11 = null;
        org.mockito.internal.util.MockUtil mockUtil12 = new org.mockito.internal.util.MockUtil(mockCreationValidator11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName13 = mockUtil0.getMockName((java.lang.Object) mockUtil12);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.util.MockUtil");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>> strComparableMockHandlerInterface6 = mockUtil0.getMockHandler((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        org.mockito.internal.util.MockUtil mockUtil7 = new org.mockito.internal.util.MockUtil();
        boolean boolean9 = mockUtil7.isMock((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass10 = mockUtil7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName11 = mockUtil0.getMockName((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName4 = mockUtil0.getMockName((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Byte");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) 10.0d);
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) (-1.0d));
        boolean boolean10 = mockUtil0.isMock((java.lang.Object) boolean9);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.Class<?>> wildcardClassMockHandlerInterface13 = mockUtil0.getMockHandler(wildcardClass12);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName2 = mockUtil0.getMockName((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Integer");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock("hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) 0);
        org.mockito.internal.util.MockUtil mockUtil7 = new org.mockito.internal.util.MockUtil();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName8 = mockUtil0.getMockName((java.lang.Object) mockUtil7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.util.MockUtil");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) 0);
        org.mockito.internal.util.MockUtil mockUtil7 = new org.mockito.internal.util.MockUtil();
        boolean boolean9 = mockUtil7.isMock((java.lang.Object) (-1.0d));
        boolean boolean11 = mockUtil7.isMock((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock(mockUtil7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.util.MockUtil");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock("hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock(wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName2 = mockUtil0.getMockName((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Double");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.CharSequence> charSequenceMockHandlerInterface6 = mockUtil0.getMockHandler((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName4 = mockUtil0.getMockName((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Integer");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.io.Serializable> serializableMockHandlerInterface9 = mockUtil0.getMockHandler((java.io.Serializable) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement> annotatedElementMockHandlerInterface7 = mockUtil0.getMockHandler((java.lang.reflect.AnnotatedElement) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.mockito.internal.util.MockCreationValidator mockCreationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(mockCreationValidator0);
        org.mockito.internal.util.MockUtil mockUtil2 = new org.mockito.internal.util.MockUtil();
        boolean boolean4 = mockUtil2.isMock((java.lang.Object) 10.0d);
        boolean boolean6 = mockUtil2.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil7 = new org.mockito.internal.util.MockUtil();
        boolean boolean8 = mockUtil2.isMock((java.lang.Object) mockUtil7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName9 = mockUtil1.getMockName((java.lang.Object) mockUtil2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.util.MockUtil");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        org.mockito.internal.util.MockUtil mockUtil3 = new org.mockito.internal.util.MockUtil();
        boolean boolean5 = mockUtil3.isMock((java.lang.Object) 10.0d);
        boolean boolean7 = mockUtil3.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil8 = new org.mockito.internal.util.MockUtil();
        boolean boolean9 = mockUtil3.isMock((java.lang.Object) mockUtil8);
        java.lang.Class<?> wildcardClass10 = mockUtil8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((java.lang.reflect.AnnotatedElement) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) wildcardClass8);
        org.mockito.internal.util.MockCreationValidator mockCreationValidator10 = null;
        org.mockito.internal.util.MockUtil mockUtil11 = new org.mockito.internal.util.MockUtil(mockCreationValidator10);
        java.lang.Class<?> wildcardClass12 = mockUtil11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil5.resetMock(wildcardClass12);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName8 = mockUtil0.getMockName((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Short");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 100.0d);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        java.lang.Class<?> wildcardClass6 = mockUtil5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName7 = mockUtil0.getMockName((java.lang.Object) mockUtil5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.util.MockUtil");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.mockito.internal.util.MockCreationValidator mockCreationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(mockCreationValidator0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>> strComparableMockHandlerInterface3 = mockUtil1.getMockHandler((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName4 = mockUtil0.getMockName((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Long");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) wildcardClass8);
        org.mockito.internal.util.MockUtil mockUtil10 = new org.mockito.internal.util.MockUtil();
        boolean boolean12 = mockUtil10.isMock((java.lang.Object) 10.0d);
        boolean boolean14 = mockUtil10.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil15 = new org.mockito.internal.util.MockUtil();
        boolean boolean16 = mockUtil10.isMock((java.lang.Object) mockUtil15);
        boolean boolean17 = mockUtil5.isMock((java.lang.Object) boolean16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.CharSequence> charSequenceMockHandlerInterface19 = mockUtil5.getMockHandler((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName12 = mockUtil5.getMockName((java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) wildcardClass8);
        org.mockito.internal.util.MockUtil mockUtil10 = new org.mockito.internal.util.MockUtil();
        boolean boolean12 = mockUtil10.isMock((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass13 = mockUtil10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil5.resetMock((java.lang.reflect.Type) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>> strComparableMockHandlerInterface6 = mockUtil0.getMockHandler((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.mockito.internal.util.MockCreationValidator mockCreationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(mockCreationValidator0);
        org.mockito.internal.util.MockUtil mockUtil2 = new org.mockito.internal.util.MockUtil();
        boolean boolean4 = mockUtil2.isMock((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass5 = mockUtil2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil1.resetMock((java.lang.reflect.AnnotatedElement) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        boolean boolean8 = mockUtil5.isMock((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) (-1.0d));
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) (byte) 1);
        boolean boolean10 = mockUtil0.isMock((java.lang.Object) boolean9);
        org.mockito.internal.util.MockUtil mockUtil11 = new org.mockito.internal.util.MockUtil();
        boolean boolean13 = mockUtil11.isMock((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass14 = mockUtil11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.reflect.GenericDeclaration> genericDeclarationMockHandlerInterface15 = mockUtil0.getMockHandler((java.lang.reflect.GenericDeclaration) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil();
        boolean boolean3 = mockUtil1.isMock((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass4 = mockUtil1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock(wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName8 = mockUtil0.getMockName((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Boolean");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 100.0d);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        java.lang.Class<?> wildcardClass6 = mockUtil5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.Class<?>> wildcardClassMockHandlerInterface7 = mockUtil0.getMockHandler(wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) 10.0d);
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) (-1.0d));
        boolean boolean10 = mockUtil0.isMock((java.lang.Object) boolean9);
        java.lang.Class<?> wildcardClass11 = mockUtil0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) 10.0d);
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil10 = new org.mockito.internal.util.MockUtil();
        boolean boolean11 = mockUtil5.isMock((java.lang.Object) mockUtil10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName12 = mockUtil0.getMockName((java.lang.Object) mockUtil10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.util.MockUtil");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        org.mockito.internal.util.MockCreationValidator mockCreationValidator3 = null;
        org.mockito.internal.util.MockUtil mockUtil4 = new org.mockito.internal.util.MockUtil(mockCreationValidator3);
        java.lang.Class<?> wildcardClass5 = mockUtil4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName6 = mockUtil0.getMockName((java.lang.Object) mockUtil4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.util.MockUtil");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) (-1.0d));
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) (byte) 1);
        boolean boolean10 = mockUtil0.isMock((java.lang.Object) boolean9);
        org.mockito.internal.util.MockUtil mockUtil11 = new org.mockito.internal.util.MockUtil();
        boolean boolean13 = mockUtil11.isMock((java.lang.Object) 10.0d);
        boolean boolean15 = mockUtil11.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil16 = new org.mockito.internal.util.MockUtil();
        boolean boolean17 = mockUtil11.isMock((java.lang.Object) mockUtil16);
        java.lang.Class<?> wildcardClass18 = mockUtil11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName19 = mockUtil0.getMockName((java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass5 = mockUtil0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) wildcardClass8);
        org.mockito.internal.util.MockUtil mockUtil10 = new org.mockito.internal.util.MockUtil();
        boolean boolean12 = mockUtil10.isMock((java.lang.Object) 10.0d);
        boolean boolean14 = mockUtil10.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil15 = new org.mockito.internal.util.MockUtil();
        boolean boolean16 = mockUtil10.isMock((java.lang.Object) mockUtil15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = mockUtil15.isMock((java.lang.Object) wildcardClass18);
        org.mockito.internal.util.MockUtil mockUtil20 = new org.mockito.internal.util.MockUtil();
        boolean boolean22 = mockUtil20.isMock((java.lang.Object) 10.0d);
        boolean boolean24 = mockUtil20.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil25 = new org.mockito.internal.util.MockUtil();
        boolean boolean26 = mockUtil20.isMock((java.lang.Object) mockUtil25);
        boolean boolean27 = mockUtil15.isMock((java.lang.Object) boolean26);
        java.lang.Class<?> wildcardClass28 = mockUtil15.getClass();
        boolean boolean29 = mockUtil5.isMock((java.lang.Object) wildcardClass28);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil5.resetMock("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName6 = mockUtil0.getMockName(obj5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is null!");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.mockito.internal.util.MockCreationValidator mockCreationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(mockCreationValidator0);
        org.mockito.internal.util.MockUtil mockUtil2 = new org.mockito.internal.util.MockUtil();
        boolean boolean4 = mockUtil2.isMock((java.lang.Object) (-1.0d));
        boolean boolean6 = mockUtil2.isMock((java.lang.Object) (-1.0d));
        boolean boolean7 = mockUtil1.isMock((java.lang.Object) boolean6);
        org.mockito.internal.util.MockUtil mockUtil8 = new org.mockito.internal.util.MockUtil();
        boolean boolean10 = mockUtil8.isMock((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass11 = mockUtil8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil1.resetMock((java.lang.reflect.GenericDeclaration) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.Object> objMockHandlerInterface8 = mockUtil0.getMockHandler((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Byte");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName8 = mockUtil0.getMockName((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Long");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        org.mockito.internal.util.MockCreationValidator mockCreationValidator1 = null;
        org.mockito.internal.util.MockUtil mockUtil2 = new org.mockito.internal.util.MockUtil(mockCreationValidator1);
        java.lang.Class<?> wildcardClass3 = mockUtil2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((java.lang.reflect.AnnotatedElement) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) 10.0d);
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) (-1.0d));
        boolean boolean10 = mockUtil0.isMock((java.lang.Object) boolean9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.Comparable<java.lang.String>> strComparableMockHandlerInterface12 = mockUtil0.getMockHandler((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass7 = mockUtil0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        org.mockito.internal.util.MockUtil mockUtil7 = new org.mockito.internal.util.MockUtil();
        org.mockito.internal.util.MockUtil mockUtil8 = new org.mockito.internal.util.MockUtil();
        boolean boolean10 = mockUtil8.isMock((java.lang.Object) 10.0d);
        boolean boolean12 = mockUtil8.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil13 = new org.mockito.internal.util.MockUtil();
        boolean boolean14 = mockUtil8.isMock((java.lang.Object) mockUtil13);
        java.lang.Class<?> wildcardClass15 = mockUtil13.getClass();
        boolean boolean16 = mockUtil7.isMock((java.lang.Object) mockUtil13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName17 = mockUtil0.getMockName((java.lang.Object) mockUtil13);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.util.MockUtil");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) 10.0d);
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) (-1.0d));
        boolean boolean10 = mockUtil0.isMock((java.lang.Object) boolean9);
        org.mockito.internal.util.MockUtil mockUtil11 = new org.mockito.internal.util.MockUtil();
        boolean boolean13 = mockUtil11.isMock((java.lang.Object) 10.0d);
        boolean boolean15 = mockUtil11.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil16 = new org.mockito.internal.util.MockUtil();
        boolean boolean17 = mockUtil11.isMock((java.lang.Object) mockUtil16);
        java.lang.Class<?> wildcardClass18 = mockUtil16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.Class<?>> wildcardClassMockHandlerInterface19 = mockUtil0.getMockHandler(wildcardClass18);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) 10.0d);
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil10 = new org.mockito.internal.util.MockUtil();
        boolean boolean11 = mockUtil5.isMock((java.lang.Object) mockUtil10);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        boolean boolean14 = mockUtil10.isMock((java.lang.Object) wildcardClass13);
        org.mockito.internal.util.MockUtil mockUtil15 = new org.mockito.internal.util.MockUtil();
        boolean boolean17 = mockUtil15.isMock((java.lang.Object) 10.0d);
        boolean boolean19 = mockUtil15.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil20 = new org.mockito.internal.util.MockUtil();
        boolean boolean21 = mockUtil15.isMock((java.lang.Object) mockUtil20);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        boolean boolean24 = mockUtil20.isMock((java.lang.Object) wildcardClass23);
        org.mockito.internal.util.MockUtil mockUtil25 = new org.mockito.internal.util.MockUtil();
        boolean boolean27 = mockUtil25.isMock((java.lang.Object) 10.0d);
        boolean boolean29 = mockUtil25.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil30 = new org.mockito.internal.util.MockUtil();
        boolean boolean31 = mockUtil25.isMock((java.lang.Object) mockUtil30);
        boolean boolean32 = mockUtil20.isMock((java.lang.Object) boolean31);
        java.lang.Class<?> wildcardClass33 = mockUtil20.getClass();
        boolean boolean34 = mockUtil10.isMock((java.lang.Object) wildcardClass33);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.reflect.Type> typeMockHandlerInterface35 = mockUtil0.getMockHandler((java.lang.reflect.Type) wildcardClass33);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) wildcardClass8);
        boolean boolean11 = mockUtil5.isMock((java.lang.Object) 'a');
        boolean boolean13 = mockUtil5.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil14 = new org.mockito.internal.util.MockUtil();
        boolean boolean16 = mockUtil14.isMock((java.lang.Object) 10.0d);
        boolean boolean18 = mockUtil14.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil19 = new org.mockito.internal.util.MockUtil();
        boolean boolean20 = mockUtil14.isMock((java.lang.Object) mockUtil19);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        boolean boolean23 = mockUtil19.isMock((java.lang.Object) wildcardClass22);
        org.mockito.internal.util.MockUtil mockUtil24 = new org.mockito.internal.util.MockUtil();
        boolean boolean26 = mockUtil24.isMock((java.lang.Object) 10.0d);
        boolean boolean28 = mockUtil24.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil29 = new org.mockito.internal.util.MockUtil();
        boolean boolean30 = mockUtil24.isMock((java.lang.Object) mockUtil29);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        boolean boolean33 = mockUtil29.isMock((java.lang.Object) wildcardClass32);
        org.mockito.internal.util.MockUtil mockUtil34 = new org.mockito.internal.util.MockUtil();
        boolean boolean36 = mockUtil34.isMock((java.lang.Object) 10.0d);
        boolean boolean38 = mockUtil34.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil39 = new org.mockito.internal.util.MockUtil();
        boolean boolean40 = mockUtil34.isMock((java.lang.Object) mockUtil39);
        boolean boolean41 = mockUtil29.isMock((java.lang.Object) boolean40);
        java.lang.Class<?> wildcardClass42 = mockUtil29.getClass();
        boolean boolean43 = mockUtil19.isMock((java.lang.Object) wildcardClass42);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName44 = mockUtil5.getMockName((java.lang.Object) wildcardClass42);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        boolean boolean8 = mockUtil0.isMock((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass9 = mockUtil0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        org.mockito.internal.util.MockCreationValidator mockCreationValidator0 = null;
        org.mockito.internal.util.MockUtil mockUtil1 = new org.mockito.internal.util.MockUtil(mockCreationValidator0);
        org.mockito.internal.util.MockUtil mockUtil2 = new org.mockito.internal.util.MockUtil();
        boolean boolean4 = mockUtil2.isMock((java.lang.Object) (-1.0d));
        boolean boolean6 = mockUtil2.isMock((java.lang.Object) (-1.0d));
        boolean boolean7 = mockUtil1.isMock((java.lang.Object) boolean6);
        org.mockito.internal.util.MockCreationValidator mockCreationValidator8 = null;
        org.mockito.internal.util.MockUtil mockUtil9 = new org.mockito.internal.util.MockUtil(mockCreationValidator8);
        java.lang.Class<?> wildcardClass10 = mockUtil9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil1.resetMock((java.lang.reflect.AnnotatedElement) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) 10L);
        org.mockito.internal.util.MockUtil mockUtil7 = new org.mockito.internal.util.MockUtil();
        boolean boolean9 = mockUtil7.isMock((java.lang.Object) 10.0d);
        boolean boolean11 = mockUtil7.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil12 = new org.mockito.internal.util.MockUtil();
        boolean boolean13 = mockUtil7.isMock((java.lang.Object) mockUtil12);
        java.lang.Class<?> wildcardClass14 = mockUtil12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock((java.lang.reflect.AnnotatedElement) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) wildcardClass8);
        boolean boolean11 = mockUtil5.isMock((java.lang.Object) 'a');
        org.mockito.internal.util.MockUtil mockUtil12 = new org.mockito.internal.util.MockUtil();
        boolean boolean14 = mockUtil12.isMock((java.lang.Object) 10.0d);
        boolean boolean16 = mockUtil12.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil17 = new org.mockito.internal.util.MockUtil();
        boolean boolean18 = mockUtil12.isMock((java.lang.Object) mockUtil17);
        java.lang.Class<?> wildcardClass19 = mockUtil12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil5.resetMock((java.io.Serializable) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass5 = mockUtil0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) (-1.0d));
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) (byte) 1);
        boolean boolean10 = mockUtil0.isMock((java.lang.Object) boolean9);
        boolean boolean12 = mockUtil0.isMock((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandlerInterface<java.lang.String> strMockHandlerInterface6 = mockUtil0.getMockHandler("hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) (-1.0d));
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) 10.0d);
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) (-1.0d));
        boolean boolean10 = mockUtil0.isMock((java.lang.Object) boolean9);
        // The following exception was thrown during execution in test generation
        try {
            mockUtil0.resetMock("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass7 = mockUtil0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean6 = mockUtil0.isMock((java.lang.Object) mockUtil5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) wildcardClass8);
        org.mockito.internal.util.MockUtil mockUtil10 = new org.mockito.internal.util.MockUtil();
        boolean boolean12 = mockUtil10.isMock((java.lang.Object) 10.0d);
        boolean boolean14 = mockUtil10.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil15 = new org.mockito.internal.util.MockUtil();
        boolean boolean16 = mockUtil10.isMock((java.lang.Object) mockUtil15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = mockUtil15.isMock((java.lang.Object) wildcardClass18);
        org.mockito.internal.util.MockUtil mockUtil20 = new org.mockito.internal.util.MockUtil();
        boolean boolean22 = mockUtil20.isMock((java.lang.Object) 10.0d);
        boolean boolean24 = mockUtil20.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil25 = new org.mockito.internal.util.MockUtil();
        boolean boolean26 = mockUtil20.isMock((java.lang.Object) mockUtil25);
        boolean boolean27 = mockUtil15.isMock((java.lang.Object) boolean26);
        java.lang.Class<?> wildcardClass28 = mockUtil15.getClass();
        boolean boolean29 = mockUtil5.isMock((java.lang.Object) wildcardClass28);
        org.mockito.internal.util.MockUtil mockUtil30 = new org.mockito.internal.util.MockUtil();
        boolean boolean32 = mockUtil30.isMock((java.lang.Object) (-1.0d));
        boolean boolean34 = mockUtil30.isMock((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass35 = mockUtil30.getClass();
        // The following exception was thrown during execution in test generation
        try {
            mockUtil5.resetMock((java.lang.reflect.AnnotatedElement) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isMock((java.lang.Object) 10.0d);
        boolean boolean4 = mockUtil0.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) 10.0d);
        boolean boolean9 = mockUtil5.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil10 = new org.mockito.internal.util.MockUtil();
        boolean boolean11 = mockUtil5.isMock((java.lang.Object) mockUtil10);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        boolean boolean14 = mockUtil10.isMock((java.lang.Object) wildcardClass13);
        org.mockito.internal.util.MockUtil mockUtil15 = new org.mockito.internal.util.MockUtil();
        boolean boolean17 = mockUtil15.isMock((java.lang.Object) 10.0d);
        boolean boolean19 = mockUtil15.isMock((java.lang.Object) 0.0f);
        org.mockito.internal.util.MockUtil mockUtil20 = new org.mockito.internal.util.MockUtil();
        boolean boolean21 = mockUtil15.isMock((java.lang.Object) mockUtil20);
        boolean boolean22 = mockUtil10.isMock((java.lang.Object) boolean21);
        java.lang.Class<?> wildcardClass23 = mockUtil10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.MockName mockName24 = mockUtil0.getMockName((java.lang.Object) mockUtil10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.util.MockUtil");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }
}

