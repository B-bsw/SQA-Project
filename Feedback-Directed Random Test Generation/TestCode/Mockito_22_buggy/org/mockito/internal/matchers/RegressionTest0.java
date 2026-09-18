package org.mockito.internal.matchers;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) ' ', (java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 10, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0d, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0.0f, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 10, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100.0f, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0d, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) true, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) ' ', (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) '#', (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) false, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0d, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 'a', (java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10L, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100L, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) ' ', (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100L, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0f, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '#', (java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) false, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0.0d, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) boolean2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 10, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0f, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0f, (java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 100, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1.0f, (java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0f, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100.0d, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1.0d, (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0L, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0f, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 1, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean2, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) '4', (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1.0f), (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) '4', (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        java.lang.Class<?> wildcardClass4 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) ' ', (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1L, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0d, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean2, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass3 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) true, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 'a', (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0.0d, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0.0f, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) equality0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1L), (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0.0d, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 100, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 1, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) false, (java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean1, (java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) -1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0L, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 100, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1L), (java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100, (java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0d, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 10, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) -1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 100, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10.0f, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) false, (java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) ' ', (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) -1, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0.0d, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100.0f, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', (java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0d, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        java.lang.Object obj4 = null;
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, obj4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) equality7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 0, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        java.lang.Class<?> wildcardClass5 = equality3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 100, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '#', (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 1, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 'a', (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100L, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 100, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) -1, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0.0f, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1), (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0L, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass3 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0d, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean3, (java.lang.Object) equality4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) "hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1L, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10.0d, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (short) -1);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1L, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 10, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10L, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean3, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1.0d), (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '#', (java.lang.Object) boolean5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0.0f, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) -1, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean3, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, (java.lang.Object) boolean4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        java.lang.Class<?> wildcardClass5 = equality3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) -1, (java.lang.Object) equality3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0.0d, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) ' ', (java.lang.Object) boolean3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) boolean9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0d, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, (java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 10, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '#', (java.lang.Object) boolean4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', (java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0d, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1.0d), (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) equality0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 'a', (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean5, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) ' ', (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) false, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass3 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1L, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0.0f, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) false, (java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) "", (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 100, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10L, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) ' ', (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100.0f, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality7);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality7, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass11 = equality7.getClass();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1.0d), (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) -1);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 100, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality6);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality6, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass10 = equality6.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality6);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass15 = equality14.getClass();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality6, (java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1.0f, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0f, (java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality2, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1L, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean11, (java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass14 = equality13.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) wildcardClass14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass12);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean5, (java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 100, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean7, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 10, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) equality7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100L, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) "", (java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1, (java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj6 = null;
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality5, obj6);
        java.lang.Class<?> wildcardClass8 = equality5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality2, (java.lang.Object) equality5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1.0d, (java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100.0d, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean5, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray(obj0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass2 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass2, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean2, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 'a', (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) boolean5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1), (java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass7);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 'a', (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10.0d, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1.0f), (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 'a');
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 100, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean12, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) "", (java.lang.Object) equality1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj2, (java.lang.Object) wildcardClass4);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) boolean11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj1);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0.0f, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0f, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1.0d), (java.lang.Object) boolean3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        java.lang.Class<?> wildcardClass5 = equality3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10.0f, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}

