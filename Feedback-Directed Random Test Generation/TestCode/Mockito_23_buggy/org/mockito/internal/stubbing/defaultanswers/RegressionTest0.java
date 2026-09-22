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
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        org.mockito.invocation.InvocationOnMock invocationOnMock1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = returnsDeepStubs0.answer(invocationOnMock1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType(obj1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is null!");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Integer");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType(obj1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Object");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Short");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Character");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Boolean");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Float");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Character");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Double");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Double");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Short");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Character");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Byte");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Long");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Short");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        java.lang.Class<?> wildcardClass2 = returnsDeepStubs1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport3 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) returnsDeepStubs1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Integer");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Long");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Double");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Float");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Float");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Character");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Integer");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Long");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Long");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Byte");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport3 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Double");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Byte");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Long");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Short");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Integer");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport3 = returnsDeepStubs0.actualParameterizedType(obj1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Object");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Float");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Byte");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Boolean");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Double");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Integer");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Byte");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) returnsDeepStubs1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        java.lang.Class<?> wildcardClass2 = returnsDeepStubs1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport3 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Class");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Short");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = returnsDeepStubs0.actualParameterizedType((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Float");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }
}

