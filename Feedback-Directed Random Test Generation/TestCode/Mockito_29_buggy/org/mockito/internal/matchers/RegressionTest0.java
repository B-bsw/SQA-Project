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
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.Object obj3 = null;
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch(obj3, description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        org.hamcrest.Description description3 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) 0L, description3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        org.hamcrest.Description description2 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        java.lang.Object obj7 = null;
        org.hamcrest.Description description8 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch(obj7, description8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description5 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        org.hamcrest.Description description3 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.hamcrest.Description description2 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str6 = same5.toString();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean9 = same5.matches((java.lang.Object) (-1L));
        org.hamcrest.Description description10 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) boolean9, description10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(-1)" + "'", str6, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean6 = same4.matches((java.lang.Object) 1.0f);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass8 = same4.getClass();
        org.hamcrest.Description description9 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) wildcardClass8, description9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        org.hamcrest.Description description2 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        org.hamcrest.Description description7 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) '4', description7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str8 = same1.toString();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass11 = same10.getClass();
        org.hamcrest.Description description12 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same10, description12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str5 = same4.toString();
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj7 = null;
        boolean boolean8 = same4.matches(obj7);
        org.hamcrest.Description description9 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same4, description9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(-1)" + "'", str5, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description9 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) 10L, description9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) (-1L), description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeTo(description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        java.lang.Class<?> wildcardClass13 = same5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        org.hamcrest.Description description2 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        org.hamcrest.Description description2 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass6 = same5.getClass();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass6);
        org.hamcrest.Description description8 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeMismatch((java.lang.Object) same7, description8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        org.hamcrest.Description description3 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) 10, description3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.hamcrest.Description description7 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description8 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeTo(description8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean16 = same14.matches((java.lang.Object) 1.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same14.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        boolean boolean22 = same20.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same20);
        org.hamcrest.Description description24 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same20, description24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description10 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeMismatch((java.lang.Object) true, description10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description9 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) (short) 1, description9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Object obj8 = new java.lang.Object();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same(obj8);
        boolean boolean10 = same7.matches(obj8);
        org.hamcrest.Description description11 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeTo(description11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str5 = same1.toString();
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj4 = null;
        boolean boolean5 = same1.matches(obj4);
        java.lang.Class<?> wildcardClass6 = same1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str8 = same1.toString();
        boolean boolean10 = same1.matches((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        java.lang.Object obj2 = null;
        org.hamcrest.Description description3 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch(obj2, description3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str9 = same7.toString();
        org.hamcrest.Description description11 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeMismatch((java.lang.Object) '#', description11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(same(0))" + "'", str9, "same(same(0))");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description14 = null;
        // The following exception was thrown during execution in test generation
        try {
            same5.describeMismatch((java.lang.Object) same7, description14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same1.matches((java.lang.Object) (-1L));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.hamcrest.Description description8 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same7, description8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same2);
        java.lang.Class<?> wildcardClass4 = same3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        java.lang.String str9 = same6.toString();
        java.lang.String str10 = same6.toString();
        java.lang.String str11 = same6.toString();
        org.hamcrest.Description description12 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same6, description12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(0)" + "'", str9, "same(0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        boolean boolean14 = same1.matches((java.lang.Object) same13);
        org.hamcrest.Description description16 = null;
        // The following exception was thrown during execution in test generation
        try {
            same13.describeMismatch((java.lang.Object) 10, description16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 100);
        org.hamcrest.Description description3 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) (byte) 10, description3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Object obj8 = new java.lang.Object();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same(obj8);
        boolean boolean10 = same7.matches(obj8);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass13 = same12.getClass();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass13);
        org.hamcrest.Description description15 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeMismatch((java.lang.Object) wildcardClass13, description15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        java.lang.Class<?> wildcardClass5 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean5 = same3.matches((java.lang.Object) 1.0f);
        java.lang.String str6 = same3.toString();
        java.lang.String str7 = same3.toString();
        java.lang.String str8 = same3.toString();
        org.hamcrest.Description description9 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) str8, description9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        org.hamcrest.Description description5 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass4 = same1.getClass();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean10 = same8.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean14 = same12.matches((java.lang.Object) 1.0f);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same12.matches((java.lang.Object) "same(-1)");
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same8.matches((java.lang.Object) same12);
        boolean boolean20 = same1.matches((java.lang.Object) boolean19);
        java.lang.String str21 = same1.toString();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean25 = same23.matches((java.lang.Object) 1.0f);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean28 = same23.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str31 = same29.toString();
        boolean boolean32 = same1.matches((java.lang.Object) same29);
        org.hamcrest.Description description33 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(0)" + "'", str21, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(same(0))" + "'", str31, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeTo(description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean10 = same8.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean14 = same12.matches((java.lang.Object) 1.0f);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same12.matches((java.lang.Object) "same(-1)");
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same8.matches((java.lang.Object) same12);
        boolean boolean20 = same1.matches((java.lang.Object) boolean19);
        java.lang.Class<?> wildcardClass21 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        org.hamcrest.Description description2 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same1.matches((java.lang.Object) same12);
        java.lang.Class<?> wildcardClass15 = same1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(-1)" + "'", str4, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description8 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass4 = same3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        java.lang.String str4 = same3.toString();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean8 = same6.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean12 = same10.matches((java.lang.Object) 1.0f);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same10.matches((java.lang.Object) "same(-1)");
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same6.matches((java.lang.Object) same10);
        boolean boolean19 = same6.matches((java.lang.Object) 'a');
        org.hamcrest.Description description20 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeMismatch((java.lang.Object) 'a', description20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str4, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        java.lang.String str10 = same7.toString();
        java.lang.String str11 = same7.toString();
        boolean boolean12 = same5.matches((java.lang.Object) str11);
        java.lang.Class<?> wildcardClass13 = same5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same1.matches((java.lang.Object) (-1L));
        org.hamcrest.Description description7 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) (short) 10, description7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str6 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass8 = same5.getClass();
        org.hamcrest.Description description9 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeMismatch((java.lang.Object) wildcardClass8, description9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(-1)" + "'", str6, "same(-1)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean5 = same3.matches((java.lang.Object) 1.0f);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean8 = same3.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        java.lang.String str10 = same3.toString();
        boolean boolean11 = same1.matches((java.lang.Object) str10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        java.lang.String str4 = same3.toString();
        java.lang.Class<?> wildcardClass5 = same3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str4, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean7 = same5.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same9.matches((java.lang.Object) 1.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same9.matches((java.lang.Object) "same(-1)");
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same5.matches((java.lang.Object) same9);
        boolean boolean18 = same5.matches((java.lang.Object) 'a');
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description20 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same5, description20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        boolean boolean14 = same5.matches((java.lang.Object) 10);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean18 = same16.matches((java.lang.Object) 1.0f);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean21 = same16.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        boolean boolean24 = same22.matches((java.lang.Object) true);
        java.lang.String str25 = same22.toString();
        org.hamcrest.Description description26 = null;
        // The following exception was thrown during execution in test generation
        try {
            same5.describeMismatch((java.lang.Object) str25, description26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(same(0))" + "'", str25, "same(same(0))");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description12 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same6, description12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        boolean boolean14 = same1.matches((java.lang.Object) same13);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        boolean boolean14 = same1.matches((java.lang.Object) 'a');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description16 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass9 = same7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean23 = same21.matches((java.lang.Object) 1.0f);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same21.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        boolean boolean28 = same1.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str31 = same30.toString();
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description33 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same30, description33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(0)" + "'", str31, "same(0)");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean23 = same21.matches((java.lang.Object) 1.0f);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same21.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        boolean boolean28 = same1.matches((java.lang.Object) same27);
        org.hamcrest.Description description30 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) ' ', description30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        boolean boolean11 = same9.matches((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        boolean boolean3 = same1.matches((java.lang.Object) "hi!");
        java.lang.String str4 = same1.toString();
        java.lang.Class<?> wildcardClass5 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(\"\")" + "'", str4, "same(\"\")");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str8 = same1.toString();
        org.hamcrest.Description description10 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) "", description10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass19 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str13 = same11.toString();
        java.lang.String str14 = same11.toString();
        boolean boolean15 = same2.matches((java.lang.Object) same11);
        java.lang.Class<?> wildcardClass16 = same11.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(same(0))" + "'", str13, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(same(0))" + "'", str14, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str10 = same9.toString();
        java.lang.String str11 = same9.toString();
        boolean boolean12 = same1.matches((java.lang.Object) str11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(-1)" + "'", str10, "same(-1)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(-1)" + "'", str11, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass4 = same1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str6 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean6 = same4.matches((java.lang.Object) 1.0f);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean9 = same4.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same4);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str12 = same10.toString();
        org.hamcrest.Description description13 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same10, description13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(same(0))" + "'", str12, "same(same(0))");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        boolean boolean14 = same1.matches((java.lang.Object) 'a');
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        org.hamcrest.Description description18 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same17, description18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass6 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean23 = same21.matches((java.lang.Object) 1.0f);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same21.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        same27._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same27);
        org.hamcrest.Description description30 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same29, description30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        java.lang.Class<?> wildcardClass10 = same9.getClass();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass10);
        boolean boolean12 = same3.matches((java.lang.Object) same11);
        org.hamcrest.Description description13 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeTo(description13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        org.hamcrest.Description description12 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeMismatch((java.lang.Object) same9, description12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        boolean boolean3 = same1.matches((java.lang.Object) "hi!");
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str11 = same7.toString();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description13 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same7, description13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(\"\")" + "'", str4, "same(\"\")");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(\"\")" + "'", str5, "same(\"\")");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        org.hamcrest.Description description3 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same1.matches((java.lang.Object) same12);
        org.hamcrest.Description description15 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(-1)" + "'", str4, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str8 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean4 = same1.matches((java.lang.Object) '#');
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        boolean boolean13 = same1.matches((java.lang.Object) same12);
        java.lang.String str14 = same12.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(same(0))" + "'", str14, "same(same(0))");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean7 = same5.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same9.matches((java.lang.Object) 1.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same9.matches((java.lang.Object) "same(-1)");
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same5.matches((java.lang.Object) same9);
        boolean boolean18 = same5.matches((java.lang.Object) 'a');
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean24 = same22.matches((java.lang.Object) 1.0f);
        same22._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean27 = same22.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        boolean boolean31 = same1.matches((java.lang.Object) same28);
        org.hamcrest.Description description33 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) (-1.0f), description33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str6 = same5.toString();
        org.hamcrest.Description description8 = null;
        // The following exception was thrown during execution in test generation
        try {
            same5.describeMismatch((java.lang.Object) 10, description8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(same(-1))" + "'", str6, "same(same(-1))");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        java.lang.String str4 = same3.toString();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.hamcrest.Description description12 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeMismatch((java.lang.Object) "same(-1)", description12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str4, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean16 = same14.matches((java.lang.Object) 1.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        boolean boolean20 = same14.matches((java.lang.Object) same19);
        boolean boolean21 = same1.matches((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str24 = same23.toString();
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass26 = same23.getClass();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        org.hamcrest.Description description28 = null;
        // The following exception was thrown during execution in test generation
        try {
            same19.describeMismatch((java.lang.Object) same27, description28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(-1)" + "'", str24, "same(-1)");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.hamcrest.Description description12 = null;
        // The following exception was thrown during execution in test generation
        try {
            same10.describeMismatch((java.lang.Object) 1.0d, description12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        java.lang.String str4 = same3.toString();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj6 = new java.lang.Object();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same(obj6);
        java.lang.Object obj8 = new java.lang.Object();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same(obj8);
        boolean boolean10 = same7.matches(obj8);
        boolean boolean11 = same3.matches((java.lang.Object) same7);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str4, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        java.lang.String str10 = same7.toString();
        java.lang.Object obj11 = new java.lang.Object();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same(obj11);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same(obj11);
        java.lang.String str14 = same13.toString();
        boolean boolean15 = same7.matches((java.lang.Object) same13);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str12 = same11.toString();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same11.matches((java.lang.Object) 100L);
        boolean boolean16 = same7.matches((java.lang.Object) boolean15);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean22 = same20.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean26 = same24.matches((java.lang.Object) 1.0f);
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean29 = same24.matches((java.lang.Object) "same(-1)");
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean31 = same20.matches((java.lang.Object) same24);
        boolean boolean33 = same24.matches((java.lang.Object) 10);
        boolean boolean34 = same18.matches((java.lang.Object) same24);
        boolean boolean35 = same7.matches((java.lang.Object) same24);
        java.lang.Class<?> wildcardClass36 = same24.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(0)" + "'", str12, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str6 = same1.toString();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str9 = same8.toString();
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass11 = same8.getClass();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        boolean boolean13 = same1.matches((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        boolean boolean17 = same15.matches((java.lang.Object) "hi!");
        org.hamcrest.Description description18 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same15, description18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(-1)" + "'", str9, "same(-1)");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        boolean boolean3 = same1.matches((java.lang.Object) "hi!");
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass6 = same5.getClass();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass6);
        java.lang.String str8 = same7.toString();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj10 = new java.lang.Object();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same(obj10);
        java.lang.Object obj12 = new java.lang.Object();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same(obj12);
        boolean boolean14 = same11.matches(obj12);
        boolean boolean15 = same7.matches((java.lang.Object) same11);
        org.hamcrest.Description description16 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same11, description16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str8, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str5 = same4.toString();
        java.lang.String str6 = same4.toString();
        java.lang.String str7 = same4.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same9.matches((java.lang.Object) 1.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same9.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same4.matches((java.lang.Object) same15);
        org.hamcrest.Description description18 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) boolean17, description18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(-1)" + "'", str5, "same(-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(-1)" + "'", str6, "same(-1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(-1)" + "'", str7, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj4 = null;
        boolean boolean5 = same1.matches(obj4);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass8 = same7.getClass();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass8);
        java.lang.String str10 = same9.toString();
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same9);
        java.lang.String str13 = same9.toString();
        boolean boolean15 = same9.matches((java.lang.Object) 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str10, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str13, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str5 = same4.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean8 = same4.matches((java.lang.Object) (-1L));
        java.lang.String str9 = same4.toString();
        org.hamcrest.Description description10 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) str9, description10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(-1)" + "'", str5, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(-1)" + "'", str9, "same(-1)");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        java.lang.String str10 = same7.toString();
        java.lang.Object obj11 = new java.lang.Object();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same(obj11);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same(obj11);
        java.lang.String str14 = same13.toString();
        boolean boolean15 = same7.matches((java.lang.Object) same13);
        org.hamcrest.Description description16 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeTo(description16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str13 = same11.toString();
        java.lang.String str14 = same11.toString();
        boolean boolean15 = same2.matches((java.lang.Object) same11);
        java.lang.Object obj16 = new java.lang.Object();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same(obj16);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same(obj16);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean23 = same21.matches((java.lang.Object) 1.0f);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same21.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        same27._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str29 = same27.toString();
        java.lang.String str30 = same27.toString();
        boolean boolean31 = same18.matches((java.lang.Object) same27);
        boolean boolean32 = same2.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        org.hamcrest.Description description35 = null;
        // The following exception was thrown during execution in test generation
        try {
            same27.describeMismatch((java.lang.Object) same34, description35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(same(0))" + "'", str13, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(same(0))" + "'", str14, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(same(0))" + "'", str29, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "same(same(0))" + "'", str30, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean16 = same14.matches((java.lang.Object) 1.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        boolean boolean20 = same14.matches((java.lang.Object) same19);
        boolean boolean21 = same1.matches((java.lang.Object) same19);
        java.lang.Class<?> wildcardClass22 = same19.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.hamcrest.Description description11 = null;
        // The following exception was thrown during execution in test generation
        try {
            same10.describeTo(description11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass19 = same18.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) "same(same(same(0)))", description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        java.lang.String str10 = same7.toString();
        java.lang.String str11 = same7.toString();
        boolean boolean12 = same5.matches((java.lang.Object) str11);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 100);
        org.hamcrest.Description description15 = null;
        // The following exception was thrown during execution in test generation
        try {
            same5.describeMismatch((java.lang.Object) (short) 100, description15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        java.lang.Class<?> wildcardClass10 = same9.getClass();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass10);
        boolean boolean12 = same3.matches((java.lang.Object) same11);
        java.lang.Class<?> wildcardClass13 = same11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        boolean boolean13 = same10.matches((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean17 = same15.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean21 = same19.matches((java.lang.Object) 1.0f);
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean24 = same19.matches((java.lang.Object) "same(-1)");
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same15.matches((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean30 = same28.matches((java.lang.Object) 1.0f);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        boolean boolean34 = same28.matches((java.lang.Object) same33);
        boolean boolean35 = same15.matches((java.lang.Object) same33);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean39 = same37.matches((java.lang.Object) 1.0f);
        same37._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean42 = same37.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) same37);
        same43._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) same43);
        boolean boolean46 = same33.matches((java.lang.Object) same45);
        boolean boolean47 = same10.matches((java.lang.Object) boolean46);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description19 = null;
        // The following exception was thrown during execution in test generation
        try {
            same18.describeTo(description19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean4 = same1.matches((java.lang.Object) '#');
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        boolean boolean13 = same1.matches((java.lang.Object) same12);
        java.lang.Class<?> wildcardClass14 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean5 = same1.matches((java.lang.Object) 100L);
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        java.lang.String str6 = same1.toString();
        org.hamcrest.Description description7 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean13 = same11.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean17 = same15.matches((java.lang.Object) 1.0f);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same15.matches((java.lang.Object) "same(-1)");
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean22 = same11.matches((java.lang.Object) same15);
        boolean boolean24 = same15.matches((java.lang.Object) 10);
        boolean boolean25 = same9.matches((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        boolean boolean27 = same1.matches((java.lang.Object) same9);
        org.hamcrest.Description description28 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean7 = same5.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same9.matches((java.lang.Object) 1.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same9.matches((java.lang.Object) "same(-1)");
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same5.matches((java.lang.Object) same9);
        boolean boolean18 = same5.matches((java.lang.Object) 'a');
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean24 = same22.matches((java.lang.Object) 1.0f);
        same22._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean27 = same22.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        boolean boolean31 = same1.matches((java.lang.Object) same28);
        org.hamcrest.Description description32 = null;
        // The following exception was thrown during execution in test generation
        try {
            same28.describeTo(description32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean7 = same5.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same9.matches((java.lang.Object) 1.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same9.matches((java.lang.Object) "same(-1)");
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same5.matches((java.lang.Object) same9);
        boolean boolean18 = same5.matches((java.lang.Object) 'a');
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean24 = same22.matches((java.lang.Object) 1.0f);
        same22._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean27 = same22.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        boolean boolean31 = same1.matches((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description5 = null;
        // The following exception was thrown during execution in test generation
        try {
            same4.describeTo(description5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass14 = same12.getClass();
        boolean boolean15 = same7.matches((java.lang.Object) same12);
        boolean boolean17 = same12.matches((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        java.lang.String str4 = same3.toString();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str4, "same(class org.mockito.internal.matchers.Same)");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str9 = same7.toString();
        java.lang.String str10 = same7.toString();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass12 = same7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(same(0))" + "'", str9, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean13 = same11.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean17 = same15.matches((java.lang.Object) 1.0f);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same15.matches((java.lang.Object) "same(-1)");
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean22 = same11.matches((java.lang.Object) same15);
        boolean boolean24 = same15.matches((java.lang.Object) 10);
        boolean boolean25 = same9.matches((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean31 = same29.matches((java.lang.Object) 1.0f);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean34 = same29.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        boolean boolean36 = same9.matches((java.lang.Object) same35);
        org.hamcrest.Description description37 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same9, description37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass21 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean12 = same7.matches((java.lang.Object) (-1L));
        org.hamcrest.Description description13 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeTo(description13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        boolean boolean13 = same10.matches((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean17 = same15.matches((java.lang.Object) 1.0f);
        java.lang.String str18 = same15.toString();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean23 = same21.matches((java.lang.Object) 1.0f);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same21.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        boolean boolean28 = same15.matches((java.lang.Object) same27);
        boolean boolean29 = same12.matches((java.lang.Object) same27);
        java.lang.Class<?> wildcardClass30 = same12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(0)" + "'", str18, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        java.lang.Class<?> wildcardClass18 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str6 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same9.matches((java.lang.Object) 1.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str13 = same9.toString();
        boolean boolean14 = same5.matches((java.lang.Object) same9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(same(-1))" + "'", str6, "same(same(-1))");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(0)" + "'", str13, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean4 = same1.matches((java.lang.Object) '#');
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        boolean boolean13 = same1.matches((java.lang.Object) same12);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) "hi!");
        boolean boolean17 = same12.matches((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass18 = same12.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean4 = same1.matches((java.lang.Object) '#');
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        boolean boolean13 = same1.matches((java.lang.Object) same12);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description15 = null;
        // The following exception was thrown during execution in test generation
        try {
            same12.describeTo(description15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass4 = same1.getClass();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        boolean boolean14 = same12.matches((java.lang.Object) true);
        java.lang.String str15 = same12.toString();
        boolean boolean16 = same1.matches((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str19 = same18.toString();
        java.lang.String str20 = same18.toString();
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean25 = same23.matches((java.lang.Object) 1.0f);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean28 = same23.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        boolean boolean31 = same29.matches((java.lang.Object) true);
        java.lang.String str32 = same29.toString();
        boolean boolean33 = same18.matches((java.lang.Object) same29);
        org.hamcrest.Description description34 = null;
        // The following exception was thrown during execution in test generation
        try {
            same12.describeMismatch((java.lang.Object) same29, description34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(same(0))" + "'", str15, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(-1)" + "'", str19, "same(-1)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(-1)" + "'", str20, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(same(0))" + "'", str32, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same(obj2);
        boolean boolean4 = same1.matches(obj2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same5.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str10 = same9.toString();
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description13 = null;
        // The following exception was thrown during execution in test generation
        try {
            same5.describeMismatch((java.lang.Object) same9, description13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(-1)" + "'", str10, "same(-1)");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str9 = same7.toString();
        java.lang.String str10 = same7.toString();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str13 = same7.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(same(0))" + "'", str9, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(same(0))" + "'", str13, "same(same(0))");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description19 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str9 = same7.toString();
        java.lang.String str10 = same7.toString();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass13 = same7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(same(0))" + "'", str9, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        java.lang.String str4 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(-1)" + "'", str4, "same(-1)");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str5 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description8 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        boolean boolean7 = same1.matches((java.lang.Object) same6);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        java.lang.String str10 = same7.toString();
        java.lang.String str11 = same7.toString();
        boolean boolean12 = same5.matches((java.lang.Object) str11);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0f);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj23 = new java.lang.Object();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same(obj23);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same(obj23);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean30 = same28.matches((java.lang.Object) 1.0f);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean33 = same28.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str36 = same34.toString();
        java.lang.String str37 = same34.toString();
        boolean boolean38 = same25.matches((java.lang.Object) same34);
        boolean boolean39 = same1.matches((java.lang.Object) same34);
        org.hamcrest.Description description40 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(same(0))" + "'", str36, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "same(same(0))" + "'", str37, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        boolean boolean3 = same1.matches((java.lang.Object) "hi!");
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(\"\")" + "'", str4, "same(\"\")");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(\"\")" + "'", str5, "same(\"\")");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str22 = same21.toString();
        java.lang.String str23 = same21.toString();
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean27 = same25.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean31 = same29.matches((java.lang.Object) 1.0f);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean34 = same29.matches((java.lang.Object) "same(-1)");
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean36 = same25.matches((java.lang.Object) same29);
        boolean boolean38 = same25.matches((java.lang.Object) 'a');
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean40 = same21.matches((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass43 = same42.getClass();
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass43);
        same44._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass46 = same44.getClass();
        boolean boolean47 = same21.matches((java.lang.Object) wildcardClass46);
        org.hamcrest.Description description48 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) boolean47, description48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(-1)" + "'", str22, "same(-1)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(-1)" + "'", str23, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        java.lang.Class<?> wildcardClass10 = same7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj4 = null;
        boolean boolean5 = same1.matches(obj4);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass8 = same7.getClass();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass8);
        java.lang.String str10 = same9.toString();
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same9);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str10, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        java.lang.String str10 = same7.toString();
        java.lang.String str11 = same7.toString();
        java.lang.Object obj12 = null;
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same(obj12);
        boolean boolean14 = same7.matches((java.lang.Object) same13);
        org.hamcrest.Description description15 = null;
        // The following exception was thrown during execution in test generation
        try {
            same13.describeTo(description15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(same(0))" + "'", str11, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        boolean boolean7 = same1.matches((java.lang.Object) same6);
        java.lang.String str8 = same1.toString();
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj4 = null;
        org.hamcrest.Description description5 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch(obj4, description5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean7 = same5.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same9.matches((java.lang.Object) 1.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same9.matches((java.lang.Object) "same(-1)");
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same5.matches((java.lang.Object) same9);
        boolean boolean18 = same5.matches((java.lang.Object) 'a');
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same5);
        java.lang.Class<?> wildcardClass21 = same1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj9 = new java.lang.Object();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same(obj9);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same(obj9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean16 = same14.matches((java.lang.Object) 1.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same14.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str22 = same20.toString();
        java.lang.String str23 = same20.toString();
        boolean boolean24 = same11.matches((java.lang.Object) same20);
        boolean boolean25 = same7.matches((java.lang.Object) same20);
        java.lang.String str26 = same20.toString();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 100);
        org.hamcrest.Description description29 = null;
        // The following exception was thrown during execution in test generation
        try {
            same20.describeMismatch((java.lang.Object) (short) 100, description29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(same(0))" + "'", str22, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(same(0))" + "'", str23, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(same(0))" + "'", str26, "same(same(0))");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean16 = same14.matches((java.lang.Object) 1.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        boolean boolean20 = same14.matches((java.lang.Object) same19);
        boolean boolean21 = same1.matches((java.lang.Object) same19);
        java.lang.String str22 = same1.toString();
        java.lang.Class<?> wildcardClass23 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(-1)" + "'", str22, "same(-1)");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean12 = same10.matches((java.lang.Object) 1.0f);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same10.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj18 = new java.lang.Object();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same(obj18);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same(obj18);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same20);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean25 = same23.matches((java.lang.Object) 1.0f);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean28 = same23.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str31 = same29.toString();
        java.lang.String str32 = same29.toString();
        boolean boolean33 = same20.matches((java.lang.Object) same29);
        boolean boolean34 = same16.matches((java.lang.Object) same29);
        java.lang.String str35 = same29.toString();
        org.hamcrest.Description description36 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeMismatch((java.lang.Object) same29, description36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(same(0))" + "'", str31, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(same(0))" + "'", str32, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(same(0))" + "'", str35, "same(same(0))");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str4 = same1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(-1.0)" + "'", str4, "same(-1.0)");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        java.lang.String str10 = same7.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Object obj8 = new java.lang.Object();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same(obj8);
        boolean boolean10 = same7.matches(obj8);
        java.lang.Class<?> wildcardClass11 = same7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        boolean boolean14 = same1.matches((java.lang.Object) same13);
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeTo(description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str5 = same1.toString();
        boolean boolean7 = same1.matches((java.lang.Object) "same(same(0))");
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        boolean boolean5 = same2.matches((java.lang.Object) same4);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        boolean boolean8 = same4.matches((java.lang.Object) "");
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.Object obj2 = null;
        org.hamcrest.Description description3 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch(obj2, description3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        java.lang.String str11 = same10.toString();
        java.lang.Class<?> wildcardClass12 = same10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(same(same(0)))" + "'", str11, "same(same(same(0)))");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        boolean boolean5 = same2.matches((java.lang.Object) same4);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        boolean boolean8 = same4.matches((java.lang.Object) "");
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass3 = same1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str5 = same1.toString();
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(-1)" + "'", str5, "same(-1)");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean10 = same8.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean14 = same12.matches((java.lang.Object) 1.0f);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same12.matches((java.lang.Object) "same(-1)");
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same8.matches((java.lang.Object) same12);
        boolean boolean20 = same1.matches((java.lang.Object) boolean19);
        java.lang.String str21 = same1.toString();
        java.lang.String str22 = same1.toString();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description27 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same24, description27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(0)" + "'", str21, "same(0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(0)" + "'", str22, "same(0)");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean15 = same13.matches((java.lang.Object) (-1.0f));
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same11.matches((java.lang.Object) same13);
        org.hamcrest.Description description18 = null;
        // The following exception was thrown during execution in test generation
        try {
            same13.describeTo(description18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str8 = same1.toString();
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = same10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean4 = same1.matches((java.lang.Object) '#');
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        boolean boolean13 = same1.matches((java.lang.Object) same12);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) "hi!");
        boolean boolean17 = same12.matches((java.lang.Object) "hi!");
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean21 = same19.matches((java.lang.Object) 1.0f);
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean24 = same19.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) same19);
        boolean boolean27 = same25.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean33 = same31.matches((java.lang.Object) (-1.0f));
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean35 = same29.matches((java.lang.Object) same31);
        boolean boolean36 = same12.matches((java.lang.Object) boolean35);
        java.lang.Class<?> wildcardClass37 = same12.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj4 = null;
        boolean boolean5 = same1.matches(obj4);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass8 = same7.getClass();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass8);
        java.lang.String str10 = same9.toString();
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same9);
        org.hamcrest.Description description13 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str10, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.hamcrest.Description description12 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeTo(description12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same(obj2);
        boolean boolean4 = same1.matches(obj2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same5.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean16 = same14.matches((java.lang.Object) 1.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        boolean boolean20 = same14.matches((java.lang.Object) same19);
        boolean boolean21 = same1.matches((java.lang.Object) same19);
        java.lang.String str22 = same1.toString();
        java.lang.String str23 = same1.toString();
        org.hamcrest.Description description24 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(-1)" + "'", str22, "same(-1)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(-1)" + "'", str23, "same(-1)");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        boolean boolean5 = same2.matches((java.lang.Object) same4);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        boolean boolean13 = same10.matches((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        java.lang.String str10 = same7.toString();
        java.lang.String str11 = same7.toString();
        java.lang.Object obj12 = null;
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same(obj12);
        boolean boolean14 = same7.matches((java.lang.Object) same13);
        java.lang.String str15 = same7.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(same(0))" + "'", str11, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(same(0))" + "'", str15, "same(same(0))");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean10 = same8.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean14 = same12.matches((java.lang.Object) 1.0f);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same12.matches((java.lang.Object) "same(-1)");
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same8.matches((java.lang.Object) same12);
        boolean boolean20 = same1.matches((java.lang.Object) boolean19);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean7 = same5.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same9.matches((java.lang.Object) 1.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same9.matches((java.lang.Object) "same(-1)");
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same5.matches((java.lang.Object) same9);
        boolean boolean18 = same5.matches((java.lang.Object) 'a');
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same5);
        org.hamcrest.Description description21 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj20 = null;
        boolean boolean21 = same1.matches(obj20);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        boolean boolean3 = same1.matches((java.lang.Object) "hi!");
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        java.lang.Class<?> wildcardClass6 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(\"\")" + "'", str4, "same(\"\")");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(\"\")" + "'", str5, "same(\"\")");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean22 = same20.matches((java.lang.Object) 1.0f);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean25 = same20.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same20);
        boolean boolean28 = same26.matches((java.lang.Object) true);
        java.lang.String str29 = same26.toString();
        java.lang.Object obj30 = new java.lang.Object();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same(obj30);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same(obj30);
        java.lang.String str33 = same32.toString();
        boolean boolean34 = same26.matches((java.lang.Object) same32);
        org.hamcrest.Description description35 = null;
        // The following exception was thrown during execution in test generation
        try {
            same18.describeMismatch((java.lang.Object) same32, description35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(same(0))" + "'", str29, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.hamcrest.Description description2 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str8 = same1.toString();
        java.lang.String str9 = same1.toString();
        java.lang.Class<?> wildcardClass10 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(0)" + "'", str9, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same(obj2);
        boolean boolean4 = same1.matches(obj2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.hamcrest.Description description10 = null;
        // The following exception was thrown during execution in test generation
        try {
            same5.describeMismatch((java.lang.Object) same9, description10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass22 = same21.getClass();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str5 = same1.toString();
        java.lang.Class<?> wildcardClass6 = same1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass4 = same1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str6 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        boolean boolean9 = same1.matches((java.lang.Object) same5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        java.lang.String str4 = same3.toString();
        java.lang.Object obj5 = new java.lang.Object();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same(obj5);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same(obj5);
        boolean boolean8 = same3.matches((java.lang.Object) same7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str4, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        java.lang.String str10 = same7.toString();
        java.lang.String str11 = same7.toString();
        org.hamcrest.Description description12 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeTo(description12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(same(0))" + "'", str11, "same(same(0))");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same(obj2);
        boolean boolean4 = same1.matches(obj2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean10 = same8.matches((java.lang.Object) 1.0f);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean13 = same8.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean17 = same15.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean21 = same19.matches((java.lang.Object) 1.0f);
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean24 = same19.matches((java.lang.Object) "same(-1)");
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same15.matches((java.lang.Object) same19);
        boolean boolean27 = same8.matches((java.lang.Object) boolean26);
        java.lang.String str28 = same8.toString();
        java.lang.String str29 = same8.toString();
        org.hamcrest.Description description30 = null;
        // The following exception was thrown during execution in test generation
        try {
            same5.describeMismatch((java.lang.Object) str29, description30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(0)" + "'", str28, "same(0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(0)" + "'", str29, "same(0)");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        java.lang.String str10 = same7.toString();
        java.lang.String str11 = same7.toString();
        boolean boolean12 = same5.matches((java.lang.Object) str11);
        java.lang.String str13 = same5.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(same(0))" + "'", str13, "same(same(0))");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean7 = same5.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same9.matches((java.lang.Object) 1.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same9.matches((java.lang.Object) "same(-1)");
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same5.matches((java.lang.Object) same9);
        boolean boolean18 = same5.matches((java.lang.Object) 'a');
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean24 = same22.matches((java.lang.Object) 1.0f);
        same22._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean27 = same22.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        boolean boolean31 = same1.matches((java.lang.Object) same28);
        java.lang.String str32 = same28.toString();
        java.lang.Class<?> wildcardClass33 = same28.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(same(0))" + "'", str32, "same(same(0))");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        java.lang.Class<?> wildcardClass13 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean23 = same21.matches((java.lang.Object) 1.0f);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same21.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        boolean boolean28 = same1.matches((java.lang.Object) same27);
        java.lang.Object obj29 = null;
        org.hamcrest.Description description30 = null;
        // The following exception was thrown during execution in test generation
        try {
            same27.describeMismatch(obj29, description30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 100);
        java.lang.Object obj2 = null;
        org.hamcrest.Description description3 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch(obj2, description3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean8 = same6.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean12 = same10.matches((java.lang.Object) 1.0f);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same10.matches((java.lang.Object) "same(-1)");
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same6.matches((java.lang.Object) same10);
        boolean boolean19 = same10.matches((java.lang.Object) 10);
        boolean boolean20 = same4.matches((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same4);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same4);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean26 = same24.matches((java.lang.Object) 1.0f);
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean29 = same24.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same24);
        boolean boolean31 = same4.matches((java.lang.Object) same30);
        org.hamcrest.Description description32 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) boolean31, description32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        java.lang.String str4 = same3.toString();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj6 = new java.lang.Object();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same(obj6);
        java.lang.Object obj8 = new java.lang.Object();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same(obj8);
        boolean boolean10 = same7.matches(obj8);
        boolean boolean11 = same3.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean15 = same13.matches((java.lang.Object) 1.0f);
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean18 = same13.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same13);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean25 = same23.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean29 = same27.matches((java.lang.Object) 1.0f);
        same27._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean32 = same27.matches((java.lang.Object) "same(-1)");
        same27._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean34 = same23.matches((java.lang.Object) same27);
        boolean boolean36 = same27.matches((java.lang.Object) 10);
        boolean boolean37 = same21.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        boolean boolean39 = same13.matches((java.lang.Object) same21);
        org.hamcrest.Description description40 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeMismatch((java.lang.Object) boolean39, description40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str4, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass14 = same12.getClass();
        boolean boolean15 = same7.matches((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        java.lang.String str6 = same1.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) str6);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        java.lang.Class<?> wildcardClass10 = same9.getClass();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass10);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        boolean boolean13 = same7.matches((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean17 = same15.matches((java.lang.Object) 1.0f);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str19 = same15.toString();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean23 = same15.matches((java.lang.Object) same21);
        org.hamcrest.Description description24 = null;
        // The following exception was thrown during execution in test generation
        try {
            same11.describeMismatch((java.lang.Object) same21, description24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(0)" + "'", str19, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean12 = same7.matches((java.lang.Object) (-1L));
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass15 = same14.getClass();
        boolean boolean16 = same7.matches((java.lang.Object) same14);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj9 = new java.lang.Object();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same(obj9);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same(obj9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean16 = same14.matches((java.lang.Object) 1.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same14.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str22 = same20.toString();
        java.lang.String str23 = same20.toString();
        boolean boolean24 = same11.matches((java.lang.Object) same20);
        boolean boolean25 = same7.matches((java.lang.Object) same20);
        java.lang.String str26 = same20.toString();
        org.hamcrest.Description description27 = null;
        // The following exception was thrown during execution in test generation
        try {
            same20.describeTo(description27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(same(0))" + "'", str22, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(same(0))" + "'", str23, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(same(0))" + "'", str26, "same(same(0))");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean12 = same7.matches((java.lang.Object) (-1L));
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass15 = same14.getClass();
        boolean boolean16 = same7.matches((java.lang.Object) same14);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str4 = same3.toString();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        java.lang.String str8 = same3.toString();
        org.hamcrest.Description description9 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) str8, description9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(-1)" + "'", str4, "same(-1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(-1)" + "'", str8, "same(-1)");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description23 = null;
        // The following exception was thrown during execution in test generation
        try {
            same21.describeMismatch((java.lang.Object) "", description23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same(obj2);
        boolean boolean4 = same1.matches(obj2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str6 = same5.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        boolean boolean7 = same1.matches((java.lang.Object) same6);
        java.lang.String str8 = same1.toString();
        java.lang.String str9 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(0)" + "'", str9, "same(0)");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str9 = same7.toString();
        java.lang.String str10 = same7.toString();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean14 = same12.matches((java.lang.Object) 1.0f);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same12.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean21 = same19.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean25 = same23.matches((java.lang.Object) 1.0f);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean28 = same23.matches((java.lang.Object) "same(-1)");
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean30 = same19.matches((java.lang.Object) same23);
        boolean boolean31 = same12.matches((java.lang.Object) boolean30);
        java.lang.String str32 = same12.toString();
        boolean boolean33 = same7.matches((java.lang.Object) same12);
        org.hamcrest.Description description34 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeTo(description34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(same(0))" + "'", str9, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(0)" + "'", str32, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass5 = same1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        java.lang.Class<?> wildcardClass11 = same7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same(obj2);
        boolean boolean4 = same1.matches(obj2);
        org.hamcrest.Description description5 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same(obj2);
        boolean boolean4 = same1.matches(obj2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) str4);
        java.lang.Class<?> wildcardClass6 = same5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean4 = same1.matches((java.lang.Object) '#');
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        boolean boolean13 = same1.matches((java.lang.Object) same12);
        org.hamcrest.Description description14 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass8 = same5.getClass();
        org.hamcrest.Description description9 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) wildcardClass8, description9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean7 = same1.matches((java.lang.Object) 1.0d);
        java.lang.String str8 = same1.toString();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str11 = same10.toString();
        java.lang.Class<?> wildcardClass12 = same10.getClass();
        org.hamcrest.Description description13 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same10, description13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean15 = same13.matches((java.lang.Object) (-1.0f));
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same11.matches((java.lang.Object) same13);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean10 = same8.matches((java.lang.Object) 1.0f);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean13 = same8.matches((java.lang.Object) "same(-1)");
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str15 = same8.toString();
        boolean boolean16 = same6.matches((java.lang.Object) same8);
        java.lang.Class<?> wildcardClass17 = same6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(0)" + "'", str15, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        boolean boolean6 = same1.matches((java.lang.Object) '4');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description8 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same(obj2);
        boolean boolean4 = same1.matches(obj2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str3 = same1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(0)" + "'", str3, "same(0)");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean22 = same20.matches((java.lang.Object) 1.0f);
        boolean boolean23 = same1.matches((java.lang.Object) boolean22);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean22);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        boolean boolean14 = same12.matches((java.lang.Object) true);
        java.lang.String str15 = same12.toString();
        boolean boolean16 = same1.matches((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean21 = same18.matches((java.lang.Object) '#');
        boolean boolean22 = same12.matches((java.lang.Object) boolean21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(same(0))" + "'", str15, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        java.lang.String str10 = same7.toString();
        java.lang.String str11 = same7.toString();
        java.lang.Object obj12 = null;
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same(obj12);
        boolean boolean14 = same7.matches((java.lang.Object) same13);
        java.lang.Class<?> wildcardClass15 = same7.getClass();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(same(0))" + "'", str11, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        boolean boolean14 = same1.matches((java.lang.Object) 'a');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str16 = same1.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean20 = same18.matches((java.lang.Object) 1.0f);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean23 = same18.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same24);
        boolean boolean27 = same1.matches((java.lang.Object) same26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(-1)" + "'", str16, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same(obj0);
        java.lang.String str3 = same2.toString();
        boolean boolean5 = same2.matches((java.lang.Object) "same(same(0))");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        org.hamcrest.Description description8 = null;
        // The following exception was thrown during execution in test generation
        try {
            same2.describeMismatch((java.lang.Object) same7, description8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        boolean boolean14 = same1.matches((java.lang.Object) 'a');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean19 = same17.matches((java.lang.Object) 1.0f);
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean22 = same17.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        boolean boolean25 = same23.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        boolean boolean29 = same26.matches((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean33 = same31.matches((java.lang.Object) 1.0f);
        java.lang.String str34 = same31.toString();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean39 = same37.matches((java.lang.Object) 1.0f);
        same37._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean42 = same37.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) same37);
        boolean boolean44 = same31.matches((java.lang.Object) same43);
        boolean boolean45 = same28.matches((java.lang.Object) same43);
        boolean boolean46 = same1.matches((java.lang.Object) same28);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "same(0)" + "'", str34, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean15 = same13.matches((java.lang.Object) (-1.0f));
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same11.matches((java.lang.Object) same13);
        java.lang.String str18 = same13.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(-1)" + "'", str18, "same(-1)");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj4 = null;
        boolean boolean5 = same1.matches(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean22 = same20.matches((java.lang.Object) 1.0f);
        boolean boolean23 = same1.matches((java.lang.Object) boolean22);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean22);
        org.hamcrest.Description description25 = null;
        // The following exception was thrown during execution in test generation
        try {
            same24.describeTo(description25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        boolean boolean14 = same1.matches((java.lang.Object) same13);
        java.lang.String str15 = same1.toString();
        java.lang.Class<?> wildcardClass16 = same1.getClass();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(0)" + "'", str15, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str4 = same3.toString();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean7 = same3.matches((java.lang.Object) (-1L));
        java.lang.String str8 = same3.toString();
        org.hamcrest.Description description9 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) str8, description9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(-1)" + "'", str4, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(-1)" + "'", str8, "same(-1)");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str9 = same7.toString();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean16 = same14.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean20 = same18.matches((java.lang.Object) 1.0f);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean23 = same18.matches((java.lang.Object) "same(-1)");
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean25 = same14.matches((java.lang.Object) same18);
        boolean boolean27 = same18.matches((java.lang.Object) 10);
        boolean boolean28 = same12.matches((java.lang.Object) same18);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        java.lang.Object obj31 = null;
        boolean boolean32 = same30.matches(obj31);
        boolean boolean33 = same7.matches(obj31);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(same(0))" + "'", str9, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same1.matches((java.lang.Object) same12);
        java.lang.Class<?> wildcardClass15 = same12.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(-1)" + "'", str4, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str13 = same11.toString();
        java.lang.String str14 = same11.toString();
        boolean boolean15 = same2.matches((java.lang.Object) same11);
        java.lang.Object obj16 = new java.lang.Object();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same(obj16);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same(obj16);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean23 = same21.matches((java.lang.Object) 1.0f);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same21.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        same27._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str29 = same27.toString();
        java.lang.String str30 = same27.toString();
        boolean boolean31 = same18.matches((java.lang.Object) same27);
        boolean boolean32 = same2.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass35 = same34.getClass();
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass35);
        java.lang.String str37 = same36.toString();
        same36._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj39 = new java.lang.Object();
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same(obj39);
        java.lang.Object obj41 = new java.lang.Object();
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same(obj41);
        boolean boolean43 = same40.matches(obj41);
        boolean boolean44 = same36.matches((java.lang.Object) same40);
        java.lang.Class<?> wildcardClass45 = same40.getClass();
        boolean boolean46 = same27.matches((java.lang.Object) wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(same(0))" + "'", str13, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(same(0))" + "'", str14, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(same(0))" + "'", str29, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "same(same(0))" + "'", str30, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str37, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str6 = same4.toString();
        java.lang.Class<?> wildcardClass7 = same4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str6, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        boolean boolean14 = same1.matches((java.lang.Object) same13);
        java.lang.Class<?> wildcardClass15 = same13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean23 = same21.matches((java.lang.Object) 1.0f);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same21.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        boolean boolean28 = same1.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        boolean boolean31 = same1.matches((java.lang.Object) false);
        org.hamcrest.Description description33 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) '#', description33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "hi!");
        org.hamcrest.Description description2 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        java.lang.String str10 = same7.toString();
        java.lang.Object obj11 = new java.lang.Object();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same(obj11);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same(obj11);
        java.lang.String str14 = same13.toString();
        boolean boolean15 = same7.matches((java.lang.Object) same13);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean20 = same18.matches((java.lang.Object) 1.0f);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        java.lang.Class<?> wildcardClass23 = same22.getClass();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass23);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass23);
        org.hamcrest.Description description26 = null;
        // The following exception was thrown during execution in test generation
        try {
            same16.describeMismatch((java.lang.Object) same25, description26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same1.matches((java.lang.Object) (-1L));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass8 = same7.getClass();
        boolean boolean9 = same1.matches((java.lang.Object) same7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        java.lang.String str7 = same6.toString();
        java.lang.Class<?> wildcardClass8 = same6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(same(same(0)))" + "'", str7, "same(same(same(0)))");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass14 = same12.getClass();
        boolean boolean15 = same7.matches((java.lang.Object) same12);
        java.lang.String str16 = same12.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(\"\")" + "'", str16, "same(\"\")");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str8 = same7.toString();
        boolean boolean9 = same4.matches((java.lang.Object) str8);
        java.lang.Class<?> wildcardClass10 = same4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(-1)" + "'", str8, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        java.lang.String str10 = same7.toString();
        java.lang.String str11 = same7.toString();
        java.lang.Object obj12 = null;
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same(obj12);
        boolean boolean14 = same7.matches((java.lang.Object) same13);
        java.lang.Class<?> wildcardClass15 = same13.getClass();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass15);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(same(0))" + "'", str11, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        java.lang.String str11 = same7.toString();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass14 = same13.getClass();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass14);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean18 = same7.matches((java.lang.Object) same15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(same(0))" + "'", str11, "same(same(0))");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str5 = same1.toString();
        boolean boolean7 = same1.matches((java.lang.Object) "same(same(0))");
        org.hamcrest.Description description8 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description3 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean4 = same1.matches((java.lang.Object) '#');
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        boolean boolean13 = same1.matches((java.lang.Object) same12);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description16 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) true, description16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same1.matches((java.lang.Object) (-1L));
        java.lang.String str6 = same1.toString();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean10 = same8.matches((java.lang.Object) 1.0f);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean13 = same8.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        boolean boolean15 = same1.matches((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str18 = same17.toString();
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean26 = same24.matches((java.lang.Object) 1.0f);
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean29 = same24.matches((java.lang.Object) "same(-1)");
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str31 = same24.toString();
        boolean boolean32 = same22.matches((java.lang.Object) same24);
        org.hamcrest.Description description33 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) boolean32, description33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(-1)" + "'", str6, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(0)" + "'", str18, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(0)" + "'", str31, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        java.lang.String str6 = same1.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) str6);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        boolean boolean14 = same1.matches((java.lang.Object) 'a');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str16 = same1.toString();
        org.hamcrest.Description description17 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(-1)" + "'", str16, "same(-1)");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean7 = same5.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same9.matches((java.lang.Object) 1.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same9.matches((java.lang.Object) "same(-1)");
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same5.matches((java.lang.Object) same9);
        boolean boolean18 = same5.matches((java.lang.Object) 'a');
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean24 = same22.matches((java.lang.Object) 1.0f);
        same22._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean27 = same22.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        boolean boolean31 = same1.matches((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean35 = same33.matches((java.lang.Object) 1.0f);
        same33._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean38 = same33.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        boolean boolean41 = same39.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) same39);
        java.lang.Class<?> wildcardClass43 = same42.getClass();
        boolean boolean44 = same28.matches((java.lang.Object) wildcardClass43);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj9 = new java.lang.Object();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same(obj9);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same(obj9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean16 = same14.matches((java.lang.Object) 1.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same14.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str22 = same20.toString();
        java.lang.String str23 = same20.toString();
        boolean boolean24 = same11.matches((java.lang.Object) same20);
        boolean boolean25 = same7.matches((java.lang.Object) same20);
        java.lang.Class<?> wildcardClass26 = same20.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(same(0))" + "'", str22, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(same(0))" + "'", str23, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str11 = same7.toString();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same7.matches((java.lang.Object) same13);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean19 = same17.matches((java.lang.Object) 1.0f);
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean22 = same17.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        java.lang.Object obj24 = new java.lang.Object();
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same(obj24);
        boolean boolean26 = same23.matches(obj24);
        java.lang.String str27 = same23.toString();
        boolean boolean28 = same13.matches((java.lang.Object) str27);
        boolean boolean29 = same1.matches((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(same(0))" + "'", str27, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same4);
        java.lang.String str7 = same4.toString();
        java.lang.Class<?> wildcardClass8 = same4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str7, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        boolean boolean14 = same5.matches((java.lang.Object) 10);
        org.hamcrest.Description description15 = null;
        // The following exception was thrown during execution in test generation
        try {
            same5.describeTo(description15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean4 = same1.matches((java.lang.Object) '#');
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        boolean boolean13 = same1.matches((java.lang.Object) same12);
        java.lang.Object obj14 = new java.lang.Object();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same(obj14);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same(obj14);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean21 = same19.matches((java.lang.Object) 1.0f);
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean24 = same19.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) same19);
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str27 = same25.toString();
        java.lang.String str28 = same25.toString();
        boolean boolean29 = same16.matches((java.lang.Object) same25);
        java.lang.Object obj30 = new java.lang.Object();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same(obj30);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same(obj30);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same32);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean37 = same35.matches((java.lang.Object) 1.0f);
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean40 = same35.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) same35);
        same41._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str43 = same41.toString();
        java.lang.String str44 = same41.toString();
        boolean boolean45 = same32.matches((java.lang.Object) same41);
        boolean boolean46 = same16.matches((java.lang.Object) same41);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description48 = null;
        // The following exception was thrown during execution in test generation
        try {
            same12.describeMismatch((java.lang.Object) same16, description48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(same(0))" + "'", str27, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(same(0))" + "'", str28, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "same(same(0))" + "'", str43, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "same(same(0))" + "'", str44, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str9 = same7.toString();
        java.lang.String str10 = same7.toString();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean14 = same12.matches((java.lang.Object) 1.0f);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same12.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean21 = same19.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean25 = same23.matches((java.lang.Object) 1.0f);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean28 = same23.matches((java.lang.Object) "same(-1)");
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean30 = same19.matches((java.lang.Object) same23);
        boolean boolean31 = same12.matches((java.lang.Object) boolean30);
        java.lang.String str32 = same12.toString();
        boolean boolean33 = same7.matches((java.lang.Object) same12);
        java.lang.Object obj34 = new java.lang.Object();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same(obj34);
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same(obj34);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) same36);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean41 = same39.matches((java.lang.Object) 1.0f);
        same39._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean44 = same39.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) same39);
        same45._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str47 = same45.toString();
        java.lang.String str48 = same45.toString();
        boolean boolean49 = same36.matches((java.lang.Object) same45);
        java.lang.Object obj50 = new java.lang.Object();
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same(obj50);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same(obj50);
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same52);
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean57 = same55.matches((java.lang.Object) 1.0f);
        same55._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean60 = same55.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same61 = new org.mockito.internal.matchers.Same((java.lang.Object) same55);
        same61._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str63 = same61.toString();
        java.lang.String str64 = same61.toString();
        boolean boolean65 = same52.matches((java.lang.Object) same61);
        boolean boolean66 = same36.matches((java.lang.Object) same61);
        same36._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description68 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeMismatch((java.lang.Object) same36, description68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(same(0))" + "'", str9, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(0)" + "'", str32, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "same(same(0))" + "'", str47, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "same(same(0))" + "'", str48, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "same(same(0))" + "'", str63, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "same(same(0))" + "'", str64, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same1.matches((java.lang.Object) (-1L));
        java.lang.String str6 = same1.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) str6);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(-1)" + "'", str6, "same(-1)");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean5 = same3.matches((java.lang.Object) 1.0f);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean8 = same3.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        boolean boolean11 = same9.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean17 = same15.matches((java.lang.Object) (-1.0f));
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same13.matches((java.lang.Object) same15);
        boolean boolean20 = same1.matches((java.lang.Object) same13);
        org.hamcrest.Description description21 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass5 = same1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "same(same(same(0)))");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj9 = new java.lang.Object();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same(obj9);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same(obj9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean16 = same14.matches((java.lang.Object) 1.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same14.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str22 = same20.toString();
        java.lang.String str23 = same20.toString();
        boolean boolean24 = same11.matches((java.lang.Object) same20);
        boolean boolean25 = same7.matches((java.lang.Object) same20);
        java.lang.String str26 = same20.toString();
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(same(0))" + "'", str22, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(same(0))" + "'", str23, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(same(0))" + "'", str26, "same(same(0))");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        boolean boolean13 = same10.matches((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean19 = same17.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean23 = same21.matches((java.lang.Object) 1.0f);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same21.matches((java.lang.Object) "same(-1)");
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean28 = same17.matches((java.lang.Object) same21);
        boolean boolean30 = same21.matches((java.lang.Object) 10);
        boolean boolean31 = same15.matches((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        java.lang.Object obj34 = null;
        boolean boolean35 = same33.matches(obj34);
        boolean boolean36 = same10.matches((java.lang.Object) boolean35);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        java.lang.String str10 = same7.toString();
        java.lang.String str11 = same7.toString();
        java.lang.Object obj12 = null;
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same(obj12);
        boolean boolean14 = same7.matches((java.lang.Object) same13);
        boolean boolean16 = same13.matches((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(same(0))" + "'", str11, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean7 = same5.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same9.matches((java.lang.Object) 1.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same9.matches((java.lang.Object) "same(-1)");
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same5.matches((java.lang.Object) same9);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description18 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeMismatch((java.lang.Object) same9, description18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        java.lang.String str11 = same7.toString();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str14 = same13.toString();
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass16 = same13.getClass();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass16);
        org.hamcrest.Description description18 = null;
        // The following exception was thrown during execution in test generation
        try {
            same7.describeMismatch((java.lang.Object) wildcardClass16, description18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(same(0))" + "'", str11, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(-1)" + "'", str14, "same(-1)");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str9 = same7.toString();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass11 = same7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(same(0))" + "'", str9, "same(same(0))");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str8 = same1.toString();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean12 = same10.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean16 = same14.matches((java.lang.Object) 1.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same14.matches((java.lang.Object) "same(-1)");
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean21 = same10.matches((java.lang.Object) same14);
        boolean boolean23 = same14.matches((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass24 = same14.getClass();
        org.hamcrest.Description description25 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) wildcardClass24, description25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str5 = same1.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean9 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj5 = null;
        boolean boolean6 = same1.matches(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str9 = same7.toString();
        java.lang.String str10 = same7.toString();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj14 = null;
        boolean boolean15 = same7.matches(obj14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(same(0))" + "'", str9, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean22 = same20.matches((java.lang.Object) 1.0f);
        boolean boolean23 = same1.matches((java.lang.Object) boolean22);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean22);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean28 = same26.matches((java.lang.Object) 1.0f);
        same26._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean31 = same26.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same26);
        boolean boolean34 = same32.matches((java.lang.Object) true);
        java.lang.String str35 = same32.toString();
        java.lang.String str36 = same32.toString();
        java.lang.String str37 = same32.toString();
        boolean boolean38 = same24.matches((java.lang.Object) same32);
        java.lang.String str39 = same24.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(same(0))" + "'", str35, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(same(0))" + "'", str36, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "same(same(0))" + "'", str37, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "same(false)" + "'", str39, "same(false)");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str4 = same1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass5 = same1.getClass();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        java.lang.String str10 = same7.toString();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(0))" + "'", str10, "same(same(0))");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same2);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        java.lang.String str5 = same3.toString();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean10 = same8.matches((java.lang.Object) 1.0f);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean13 = same8.matches((java.lang.Object) "same(-1)");
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str15 = same8.toString();
        boolean boolean16 = same6.matches((java.lang.Object) same8);
        java.lang.String str17 = same8.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(0)" + "'", str15, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "same(0)" + "'", str17, "same(0)");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str5 = same1.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass9 = same7.getClass();
        org.hamcrest.Description description10 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) wildcardClass9, description10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean4 = same1.matches((java.lang.Object) '#');
        java.lang.String str5 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description7 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str6 = same5.toString();
        java.lang.String str7 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean9 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean14 = same12.matches((java.lang.Object) 1.0f);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same12.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        boolean boolean20 = same18.matches((java.lang.Object) true);
        java.lang.String str21 = same18.toString();
        java.lang.String str22 = same18.toString();
        java.lang.Object obj23 = null;
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same(obj23);
        boolean boolean25 = same18.matches((java.lang.Object) same24);
        java.lang.Class<?> wildcardClass26 = same24.getClass();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass26);
        boolean boolean28 = same10.matches((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(-1)" + "'", str6, "same(-1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(-1)" + "'", str7, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(same(0))" + "'", str21, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(same(0))" + "'", str22, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean7 = same5.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same9.matches((java.lang.Object) 1.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same9.matches((java.lang.Object) "same(-1)");
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same5.matches((java.lang.Object) same9);
        boolean boolean18 = same5.matches((java.lang.Object) 'a');
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean24 = same22.matches((java.lang.Object) 1.0f);
        same22._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean27 = same22.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        boolean boolean31 = same1.matches((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean35 = same33.matches((java.lang.Object) 1.0f);
        same33._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean38 = same33.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        boolean boolean41 = same39.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) same39);
        java.lang.Class<?> wildcardClass43 = same42.getClass();
        boolean boolean44 = same28.matches((java.lang.Object) wildcardClass43);
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean48 = same46.matches((java.lang.Object) 1.0f);
        java.lang.String str49 = same46.toString();
        boolean boolean51 = same46.matches((java.lang.Object) '4');
        org.hamcrest.Description description52 = null;
        // The following exception was thrown during execution in test generation
        try {
            same28.describeMismatch((java.lang.Object) '4', description52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "same(0)" + "'", str49, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean5 = same3.matches((java.lang.Object) 1.0f);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description8 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same3, description8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        java.lang.String str11 = same7.toString();
        java.lang.String str12 = same7.toString();
        boolean boolean14 = same7.matches((java.lang.Object) "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(same(0))" + "'", str11, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(same(0))" + "'", str12, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean4 = same1.matches((java.lang.Object) '#');
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        boolean boolean13 = same1.matches((java.lang.Object) same12);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) "hi!");
        boolean boolean17 = same12.matches((java.lang.Object) "hi!");
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean21 = same19.matches((java.lang.Object) 1.0f);
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean24 = same19.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) same19);
        boolean boolean27 = same25.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean33 = same31.matches((java.lang.Object) (-1.0f));
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean35 = same29.matches((java.lang.Object) same31);
        boolean boolean36 = same12.matches((java.lang.Object) boolean35);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean7 = same5.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same9.matches((java.lang.Object) 1.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same9.matches((java.lang.Object) "same(-1)");
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same5.matches((java.lang.Object) same9);
        boolean boolean18 = same5.matches((java.lang.Object) 'a');
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean24 = same22.matches((java.lang.Object) 1.0f);
        same22._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean27 = same22.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        boolean boolean31 = same1.matches((java.lang.Object) same28);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str6 = same5.toString();
        java.lang.Class<?> wildcardClass7 = same5.getClass();
        boolean boolean8 = same1.matches((java.lang.Object) same5);
        java.lang.Object obj9 = null;
        boolean boolean10 = same1.matches(obj9);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean14 = same12.matches((java.lang.Object) 1.0f);
        java.lang.String str15 = same12.toString();
        java.lang.String str16 = same12.toString();
        boolean boolean17 = same10.matches((java.lang.Object) str16);
        org.hamcrest.Description description18 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) boolean17, description18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(0)" + "'", str15, "same(0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(0)" + "'", str16, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) str4);
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same5.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass4 = same1.getClass();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        java.lang.String str7 = same5.toString();
        java.lang.Class<?> wildcardClass8 = same5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(same(-1))" + "'", str7, "same(same(-1))");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass5 = same4.getClass();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass5);
        java.lang.String str7 = same6.toString();
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj9 = new java.lang.Object();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same(obj9);
        java.lang.Object obj11 = new java.lang.Object();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same(obj11);
        boolean boolean13 = same10.matches(obj11);
        boolean boolean14 = same6.matches((java.lang.Object) same10);
        boolean boolean15 = same2.matches((java.lang.Object) same10);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str7, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        boolean boolean14 = same1.matches((java.lang.Object) 'a');
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str17 = same16.toString();
        java.lang.Class<?> wildcardClass18 = same16.getClass();
        boolean boolean19 = same1.matches((java.lang.Object) wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "same(0)" + "'", str17, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str8 = same7.toString();
        boolean boolean9 = same4.matches((java.lang.Object) str8);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean13 = same11.matches((java.lang.Object) 1.0f);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same11.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        boolean boolean19 = same17.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean25 = same23.matches((java.lang.Object) (-1.0f));
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean27 = same21.matches((java.lang.Object) same23);
        boolean boolean28 = same4.matches((java.lang.Object) boolean27);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(-1)" + "'", str8, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        boolean boolean9 = same7.matches((java.lang.Object) true);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        java.lang.String str11 = same10.toString();
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(same(same(0)))" + "'", str11, "same(same(same(0)))");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass4 = same3.getClass();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass4);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        java.lang.Class<?> wildcardClass12 = same11.getClass();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass12);
        boolean boolean14 = same5.matches((java.lang.Object) same13);
        java.lang.String str15 = same13.toString();
        boolean boolean16 = same1.matches((java.lang.Object) str15);
        java.lang.Class<?> wildcardClass17 = same1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str15, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        java.lang.String str6 = same1.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) str6);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        java.lang.Class<?> wildcardClass10 = same9.getClass();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass10);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        boolean boolean13 = same7.matches((java.lang.Object) same11);
        java.lang.Class<?> wildcardClass14 = same11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean7 = same1.matches((java.lang.Object) same5);
        java.lang.String str8 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        boolean boolean13 = same11.matches((java.lang.Object) true);
        java.lang.String str14 = same11.toString();
        java.lang.Object obj15 = new java.lang.Object();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same(obj15);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same(obj15);
        java.lang.String str18 = same17.toString();
        boolean boolean19 = same11.matches((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        boolean boolean21 = same1.matches((java.lang.Object) same11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(same(0))" + "'", str14, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        java.lang.String str8 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description10 = null;
        // The following exception was thrown during execution in test generation
        try {
            same2.describeMismatch((java.lang.Object) same5, description10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same2);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        java.lang.Class<?> wildcardClass10 = same9.getClass();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = same11.getClass();
        org.hamcrest.Description description13 = null;
        // The following exception was thrown during execution in test generation
        try {
            same2.describeMismatch((java.lang.Object) same11, description13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj20 = null;
        boolean boolean21 = same1.matches(obj20);
        java.lang.String str22 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description24 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(0)" + "'", str22, "same(0)");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean8 = same6.matches((java.lang.Object) 1.0f);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean11 = same6.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str14 = same12.toString();
        java.lang.String str15 = same12.toString();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean19 = same17.matches((java.lang.Object) 1.0f);
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean22 = same17.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean26 = same24.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean30 = same28.matches((java.lang.Object) 1.0f);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean33 = same28.matches((java.lang.Object) "same(-1)");
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean35 = same24.matches((java.lang.Object) same28);
        boolean boolean36 = same17.matches((java.lang.Object) boolean35);
        java.lang.String str37 = same17.toString();
        boolean boolean38 = same12.matches((java.lang.Object) same17);
        org.hamcrest.Description description39 = null;
        // The following exception was thrown during execution in test generation
        try {
            same4.describeMismatch((java.lang.Object) same17, description39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(same(0))" + "'", str14, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(same(0))" + "'", str15, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "same(0)" + "'", str37, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean23 = same21.matches((java.lang.Object) 1.0f);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same21.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        boolean boolean28 = same1.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        boolean boolean31 = same1.matches((java.lang.Object) false);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean36 = same34.matches((java.lang.Object) 1.0f);
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean38 = same1.matches((java.lang.Object) same34);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str20 = same1.toString();
        org.hamcrest.Description description21 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(0)" + "'", str20, "same(0)");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        boolean boolean12 = same7.matches((java.lang.Object) same11);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description14 = null;
        // The following exception was thrown during execution in test generation
        try {
            same11.describeTo(description14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean16 = same14.matches((java.lang.Object) 1.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        boolean boolean20 = same14.matches((java.lang.Object) same19);
        boolean boolean21 = same1.matches((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean25 = same23.matches((java.lang.Object) 1.0f);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean28 = same23.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        boolean boolean32 = same19.matches((java.lang.Object) same31);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean36 = same34.matches((java.lang.Object) 1.0f);
        java.lang.String str37 = same34.toString();
        java.lang.String str38 = same34.toString();
        java.lang.String str39 = same34.toString();
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) str39);
        boolean boolean41 = same31.matches((java.lang.Object) same40);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "same(0)" + "'", str37, "same(0)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "same(0)" + "'", str38, "same(0)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "same(0)" + "'", str39, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same7.matches((java.lang.Object) "same(-1)");
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean14 = same3.matches((java.lang.Object) same7);
        boolean boolean16 = same7.matches((java.lang.Object) 10);
        boolean boolean17 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean23 = same21.matches((java.lang.Object) 1.0f);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same21.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        boolean boolean28 = same1.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str7 = same6.toString();
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj9 = null;
        boolean boolean10 = same6.matches(obj9);
        boolean boolean11 = same3.matches((java.lang.Object) same6);
        java.lang.Class<?> wildcardClass12 = same3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(-1)" + "'", str7, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean16 = same14.matches((java.lang.Object) 1.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        boolean boolean20 = same14.matches((java.lang.Object) same19);
        boolean boolean21 = same1.matches((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean25 = same23.matches((java.lang.Object) 1.0f);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean28 = same23.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        boolean boolean32 = same19.matches((java.lang.Object) same31);
        java.lang.Object obj33 = new java.lang.Object();
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same(obj33);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same(obj33);
        java.lang.String str36 = same35.toString();
        org.hamcrest.Description description37 = null;
        // The following exception was thrown during execution in test generation
        try {
            same19.describeMismatch((java.lang.Object) str36, description37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str9 = same7.toString();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        java.lang.String str12 = same7.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(same(0))" + "'", str9, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(same(0))" + "'", str12, "same(same(0))");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "hi!");
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str4 = same3.toString();
        java.lang.String str5 = same3.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean9 = same7.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean13 = same11.matches((java.lang.Object) 1.0f);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same11.matches((java.lang.Object) "same(-1)");
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean18 = same7.matches((java.lang.Object) same11);
        boolean boolean20 = same7.matches((java.lang.Object) 'a');
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean22 = same3.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass25 = same24.getClass();
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass25);
        same26._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass28 = same26.getClass();
        boolean boolean29 = same3.matches((java.lang.Object) wildcardClass28);
        boolean boolean30 = same1.matches((java.lang.Object) boolean29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(-1)" + "'", str4, "same(-1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(-1)" + "'", str5, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }
}

