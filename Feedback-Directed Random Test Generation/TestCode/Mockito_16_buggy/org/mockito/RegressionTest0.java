package org.mockito;

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
        java.lang.String str1 = org.mockito.Matchers.matches("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Throwable throwable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doThrow(throwable0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str1 = org.mockito.Matchers.startsWith("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        float float0 = org.mockito.Matchers.anyFloat();
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.mockito.internal.verification.api.VerificationMode verificationMode0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(verificationMode0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doReturn((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int0 = org.mockito.Matchers.anyInt();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber0 = org.mockito.Mockito.doCallRealMethod();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str1 = org.mockito.Matchers.matches("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        double double1 = org.mockito.Matchers.eq(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object obj0 = org.mockito.Matchers.isNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        long long1 = org.mockito.Matchers.eq((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.validateMockitoUsage();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), (-1), 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder5 = org.mockito.Mockito.inOrder(objArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, -1, 0, 100]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str0 = org.mockito.Matchers.anyString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.hamcrest.Matcher<java.lang.Character> charMatcher0 = null;
        char char1 = org.mockito.Matchers.charThat(charMatcher0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_MOCKS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objAnswer0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        long long0 = org.mockito.Matchers.anyLong();
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.mockito.internal.verification.api.VerificationMode verificationMode0 = org.mockito.Mockito.only();
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable iterable1 = org.mockito.Mockito.verify((java.lang.Iterable) collection0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.hamcrest.Matcher<java.lang.Float> floatMatcher0 = null;
        float float1 = org.mockito.Matchers.floatThat(floatMatcher0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        byte byte1 = org.mockito.Matchers.eq((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.hamcrest.Matcher<java.lang.Boolean> booleanMatcher0 = null;
        boolean boolean1 = org.mockito.Matchers.booleanThat(booleanMatcher0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        boolean boolean1 = org.mockito.Matchers.eq(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        double double1 = org.mockito.Matchers.eq((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.hamcrest.Matcher<java.lang.Double> doubleMatcher0 = null;
        double double1 = org.mockito.Matchers.doubleThat(doubleMatcher0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<java.lang.Comparable<java.lang.String>> strComparableDeprecatedOngoingStubbing1 = org.mockito.Mockito.stub((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        char char1 = org.mockito.Matchers.eq('\000');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        boolean boolean0 = org.mockito.Matchers.anyBoolean();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String str1 = org.mockito.Matchers.contains("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        boolean boolean1 = org.mockito.Matchers.eq(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.hamcrest.Matcher<java.lang.Short> shortMatcher0 = null;
        short short1 = org.mockito.Matchers.shortThat(shortMatcher0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        byte byte1 = org.mockito.Matchers.eq((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        float float1 = org.mockito.Matchers.eq((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Object obj0 = org.mockito.Matchers.isNotNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (short) 10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(objAnswer0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.hamcrest.Matcher<java.lang.Long> longMatcher0 = null;
        long long1 = org.mockito.Matchers.longThat(longMatcher0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder2 = org.mockito.Mockito.inOrder(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[10]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            mockitoCore0.verifyNoMoreInteractions(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        long long1 = org.mockito.Matchers.eq((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        // The following exception was thrown during execution in test generation
        try {
            mockitoCore0.validateMockitoUsage();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        short short0 = org.mockito.Matchers.anyShort();
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber0 = org.mockito.Mockito.doNothing();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Set set0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(set0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str1 = org.mockito.Matchers.contains("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer((org.mockito.stubbing.Answer) objAnswer1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objAnswer1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        int int1 = org.mockito.Matchers.eq((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.VoidMethodStubbable<java.lang.Comparable<java.lang.String>> strComparableVoidMethodStubbable2 = mockitoCore0.stubVoid((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable1 = org.mockito.Mockito.spy((java.io.Serializable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.util.Collection collection1 = org.mockito.Matchers.same(collection0);
        org.mockito.internal.verification.api.VerificationMode verificationMode2 = org.mockito.Mockito.atLeastOnce();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable iterable3 = org.mockito.Mockito.verify((java.lang.Iterable) collection1, verificationMode2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?Also, if you use @Mock annotation don't miss initMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNotNull(verificationMode2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Mockito.spy(strComparable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.mockito.stubbing.Stubber stubber0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(stubber0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str1 = org.mockito.Matchers.eq("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.Mockito.RETURNS_MOCKS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer((org.mockito.stubbing.Answer) objAnswer1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objAnswer1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockitoCore mockitoCore3 = org.mockito.Mockito.spy(mockitoCore0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.Set[] setArray0 = new java.util.Set[] {};
        org.mockito.Mockito.reset(setArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder2 = org.mockito.Mockito.inOrder((java.lang.Object[]) setArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(setArray0);
        org.junit.Assert.assertArrayEquals(setArray0, new java.util.Set[] {});
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        char char1 = org.mockito.Matchers.eq('a');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.junit.Assert.assertNotNull(objAnswer0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        float float1 = org.mockito.Matchers.eq(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.mockito.MockitoDebugger mockitoDebugger0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(mockitoDebugger0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        double double1 = org.mockito.Matchers.eq(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.progress.IOngoingStubbing iOngoingStubbing1 = mockitoCore0.stub();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub final/private/equals() or hashCode() method.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.mockito.internal.verification.api.VerificationMode verificationMode0 = org.mockito.Mockito.never();
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) '4');
        java.lang.Class<?> wildcardClass2 = verificationMode1.getClass();
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.Matchers.refEq("", strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.mockito.Matchers.refEq("", strArray5);
        java.lang.String[] strArray7 = org.mockito.Matchers.refEq(strArray2, strArray5);
        org.mockito.internal.verification.api.VerificationMode verificationMode9 = org.mockito.Mockito.atMost((int) '4');
        java.lang.Class<?> wildcardClass10 = verificationMode9.getClass();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10L, strArray2, wildcardClass10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder12 = org.mockito.Mockito.inOrder((java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(verificationMode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, [], class org.mockito.internal.verification.AtMost]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        double double0 = org.mockito.Matchers.anyDouble();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.mockito.MockitoDebugger mockitoDebugger0 = org.mockito.Mockito.debug();
        org.mockito.MockitoDebugger mockitoDebugger1 = org.mockito.Matchers.same(mockitoDebugger0);
        org.junit.Assert.assertNotNull(mockitoDebugger0);
        org.junit.Assert.assertNull(mockitoDebugger1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        float float1 = org.mockito.Matchers.eq((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.Matchers.refEq("", strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.mockito.Matchers.refEq("", strArray5);
        java.lang.String[] strArray7 = org.mockito.Matchers.refEq(strArray2, strArray5);
        java.lang.Object[] objArray8 = new java.lang.Object[] { mockitoCore0, strArray7 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Collection collection0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(collection0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.util.Collection collection1 = org.mockito.Matchers.same(collection0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.eq((java.lang.Iterable) collection0);
        java.lang.String[] strArray3 = null;
        java.util.Collection collection4 = org.mockito.Matchers.refEq(collection0, strArray3);
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNull(collection4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.lang.Iterable iterable1 = org.mockito.Matchers.same((java.lang.Iterable) set0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.VoidMethodStubbable<java.util.Collection> collectionVoidMethodStubbable2 = org.mockito.Mockito.stubVoid((java.util.Collection) set0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.util.HashSet");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(iterable1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        long long1 = org.mockito.Matchers.eq((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String str1 = org.mockito.Matchers.startsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.Matchers.refEq("", strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.stubbing.Answer<java.lang.Object>> objAnswerOngoingStubbing2 = mockitoCore0.when(objAnswer1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objAnswer1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        org.mockito.internal.verification.api.VerificationMode verificationMode2 = org.mockito.Mockito.atMost(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.mockito.Mockito.verify((java.lang.Object) mockito0, verificationMode2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.Matchers.refEq("", strArray1);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.mockito.Matchers.refEq("", strArray4);
        java.lang.String[] strArray6 = org.mockito.Matchers.refEq(strArray1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        char char0 = org.mockito.Matchers.anyChar();
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\000' + "'", char0 == '\000');
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object obj0 = org.mockito.Matchers.notNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.mockito.internal.verification.api.VerificationMode verificationMode0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(verificationMode0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        byte byte0 = org.mockito.Matchers.anyByte();
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        double double1 = org.mockito.Matchers.eq((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.reflect.Type type0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        short short1 = org.mockito.Matchers.eq((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.Matchers.refEq("", strArray1);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.mockito.Matchers.refEq("", strArray4);
        java.lang.String[] strArray6 = org.mockito.Matchers.refEq(strArray1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder7 = org.mockito.Mockito.inOrder((java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        long long1 = org.mockito.Matchers.eq((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        short short1 = org.mockito.Matchers.eq((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast(0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.Mockito mockito1 = new org.mockito.Mockito();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<org.mockito.Mockito> mockitoDeprecatedOngoingStubbing2 = mockitoCore0.stub(mockito1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub final/private/equals() or hashCode() method.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.CharSequence> charSequenceOngoingStubbing1 = org.mockito.Mockito.when((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub final/private/equals() or hashCode() method.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.VoidMethodStubbable<java.lang.CharSequence> charSequenceVoidMethodStubbable2 = mockitoCore0.stubVoid((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.CharSequence charSequence0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast(0);
        java.lang.Object[] objArray3 = new java.lang.Object[] { verificationMode1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Examples of correct verifications:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[Wanted invocations count: at least 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[Wanted invocations count: at least 0, 1]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.verify(stubber1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        float float1 = org.mockito.Matchers.eq((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<java.lang.String> strDeprecatedOngoingStubbing2 = mockitoCore0.stub("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub final/private/equals() or hashCode() method.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.Object obj2 = org.mockito.Matchers.same((java.lang.Object) map1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.util.Map> mapOngoingStubbing3 = mockitoCore0.when(map1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) map0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doReturn(obj1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        long long1 = org.mockito.Matchers.eq((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        short short1 = org.mockito.Matchers.eq((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Mockito.verify((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (byte) 1);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.hamcrest.Matcher<java.lang.Byte> byteMatcher0 = null;
        byte byte1 = org.mockito.Matchers.byteThat(byteMatcher0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.CharSequence charSequence1 = org.mockito.Matchers.eq((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.Matchers.refEq("", strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.Matchers.refEq("", strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.mockito.Matchers.refEq("", strArray5);
        java.lang.String[] strArray7 = org.mockito.Matchers.refEq(strArray2, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            mockitoCore0.verifyNoMoreInteractions((java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<org.mockito.MockSettings> mockSettingsDeprecatedOngoingStubbing1 = org.mockito.Mockito.stub(mockSettings0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.GeneratedMethodAccessor1.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.Collection collection0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(collection0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) '\000');
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doReturn((java.lang.Object) verificationMode1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        org.mockito.internal.MockitoCore mockitoCore3 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.verification.api.VerificationMode verificationMode5 = org.mockito.Mockito.times(0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockitoCore mockitoCore6 = mockitoCore0.verify(mockitoCore3, verificationMode5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(verificationMode5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        java.util.Set[] setArray1 = new java.util.Set[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.VoidMethodStubbable<java.util.Set[]> setArrayVoidMethodStubbable2 = mockitoCore0.stubVoid(setArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class [Ljava.util.Set;");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(setArray1);
        org.junit.Assert.assertArrayEquals(setArray1, new java.util.Set[] {});
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.Matchers.refEq("", strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.mockito.Matchers.refEq("", strArray5);
        java.lang.String[] strArray7 = org.mockito.Matchers.refEq(strArray2, strArray5);
        org.mockito.MockSettings mockSettings8 = org.mockito.Matchers.refEq(mockSettings0, strArray2);
        org.junit.Assert.assertNotNull(mockSettings0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(mockSettings8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.MockSettings mockSettings1 = org.mockito.Mockito.spy(mockSettings0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        float float1 = org.mockito.Matchers.eq((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        long long1 = org.mockito.Matchers.eq((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Iterable iterable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable iterable1 = org.mockito.Matchers.same(iterable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.mockito.internal.verification.api.VerificationMode verificationMode0 = org.mockito.Mockito.atLeastOnce();
        java.lang.Class<?> wildcardClass1 = verificationMode0.getClass();
        org.junit.Assert.assertNotNull(verificationMode0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.Matchers> matchersOngoingStubbing1 = org.mockito.Mockito.when((org.mockito.Matchers) mockito0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.Matchers.refEq("", strArray1);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.mockito.Matchers.refEq("", strArray4);
        java.lang.String[] strArray6 = org.mockito.Matchers.refEq(strArray1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = strArray6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.reflect.Type type0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.internal.MockitoCore> mockitoCoreOngoingStubbing1 = org.mockito.Mockito.when(mockitoCore0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.hamcrest.Matcher<java.lang.Integer> intMatcher0 = null;
        int int1 = org.mockito.Matchers.intThat(intMatcher0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.List list0 = org.mockito.Matchers.anyList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable iterable1 = org.mockito.Mockito.spy((java.lang.Iterable) list0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        char char1 = org.mockito.Matchers.eq('#');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Map map0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(map0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objAnswer0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        java.util.Collection collection3 = org.mockito.Matchers.anyCollection();
        java.util.Collection collection4 = org.mockito.Matchers.same(collection3);
        java.lang.Iterable iterable5 = org.mockito.Matchers.eq((java.lang.Iterable) collection3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.Iterable> iterableOngoingStubbing6 = mockitoCore0.when(iterable5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.GeneratedMethodAccessor2.invoke(Unknown Source)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(collection4);
        org.junit.Assert.assertNull(iterable5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        double double1 = org.mockito.Matchers.eq((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        float float1 = org.mockito.Matchers.eq((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        double double1 = org.mockito.Matchers.eq((double) '\000');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.Iterable> iterableOngoingStubbing1 = org.mockito.Mockito.when((java.lang.Iterable) collection0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) list0);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(iterable2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.String str1 = org.mockito.Matchers.endsWith("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doReturn((java.lang.Object) verificationMode1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.Comparable<java.lang.String>> strComparableOngoingStubbing2 = mockitoCore0.when((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub final/private/equals() or hashCode() method.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.verification.api.VerificationMode verificationMode2 = org.mockito.Mockito.times(0);
        java.lang.Class<?> wildcardClass3 = verificationMode2.getClass();
        org.mockito.stubbing.Stubber stubber4 = org.mockito.Mockito.doReturn((java.lang.Object) wildcardClass3);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = org.mockito.Matchers.refEq("", strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.lang.String str10 = org.mockito.Matchers.refEq("", strArray9);
        java.lang.String[] strArray11 = org.mockito.Matchers.refEq(strArray6, strArray9);
        java.lang.reflect.AnnotatedElement annotatedElement12 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass3, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.Class<?>> wildcardClassOngoingStubbing13 = mockitoCore0.when(wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(stubber4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(annotatedElement12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        long long1 = org.mockito.Matchers.eq((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEFAULTS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objAnswer0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.Matchers.refEq("", strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber3 = org.mockito.Mockito.doReturn((java.lang.Object) str2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.GeneratedMethodAccessor1.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.MockSettings mockSettings1 = org.mockito.Mockito.verify(mockSettings0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (byte) 100);
        org.mockito.internal.verification.api.VerificationMode verificationMode2 = org.mockito.Matchers.same(verificationMode1);
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNull(verificationMode2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast(10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.mockito.MockitoDebugger mockitoDebugger0 = org.mockito.Mockito.debug();
        java.lang.Class<?> wildcardClass1 = mockitoDebugger0.getClass();
        org.junit.Assert.assertNotNull(mockitoDebugger0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.MockitoDebugger mockitoDebugger2 = org.mockito.Mockito.debug();
        org.mockito.MockitoDebugger mockitoDebugger3 = org.mockito.Matchers.same(mockitoDebugger2);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, mockitoDebugger3 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder5 = mockitoCore0.inOrder(objArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoDebugger2);
        org.junit.Assert.assertNull(mockitoDebugger3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, null]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<org.mockito.Mockito> mockitoDeprecatedOngoingStubbing1 = org.mockito.Mockito.stub(mockito0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.GeneratedMethodAccessor3.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        java.util.Set[] setArray1 = new java.util.Set[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<java.util.Set[]> setArrayDeprecatedOngoingStubbing2 = mockitoCore0.stub(setArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub final/private/equals() or hashCode() method.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(setArray1);
        org.junit.Assert.assertArrayEquals(setArray1, new java.util.Set[] {});
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(10);
        java.lang.Class<?> wildcardClass2 = verificationMode1.getClass();
        org.mockito.internal.verification.api.VerificationMode verificationMode4 = org.mockito.Mockito.atMost(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement5 = org.mockito.Mockito.verify((java.lang.reflect.AnnotatedElement) wildcardClass2, verificationMode4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(verificationMode4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        int int1 = org.mockito.Matchers.eq((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.Matchers.refEq("", strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.mockito.Matchers.refEq("", strArray5);
        java.lang.String[] strArray7 = org.mockito.Matchers.refEq(strArray2, strArray5);
        org.mockito.MockSettings mockSettings8 = org.mockito.Matchers.refEq(mockSettings0, strArray2);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.lang.String str11 = org.mockito.Matchers.refEq("", strArray10);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.lang.String str14 = org.mockito.Matchers.refEq("", strArray13);
        java.lang.String[] strArray15 = org.mockito.Matchers.refEq(strArray10, strArray13);
        org.mockito.MockSettings mockSettings18 = org.mockito.Mockito.withSettings();
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] { mockSettings8, strArray15, "hi!", (short) 1, mockSettings18, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset((java.io.Serializable[]) strArray15);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.GeneratedMethodAccessor1.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(mockSettings8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(mockSettings18);
        org.junit.Assert.assertNotNull(serializableArray20);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Set set1 = org.mockito.Matchers.anySet();
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) set1);
        java.util.Collection[] collectionArray3 = new java.util.Collection[] { list0, set1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(collectionArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.GeneratedMethodAccessor3.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(collectionArray3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        java.util.Collection collection3 = org.mockito.Matchers.anyCollection();
        java.util.Collection collection4 = org.mockito.Matchers.same(collection3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.VoidMethodStubbable<java.util.Collection> collectionVoidMethodStubbable5 = mockitoCore0.stubVoid(collection3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.util.LinkedList");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(collection4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.String str0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        org.mockito.internal.verification.api.VerificationMode verificationMode4 = org.mockito.Mockito.atMost(10);
        java.lang.Class<?> wildcardClass5 = verificationMode4.getClass();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = org.mockito.Matchers.refEq("", strArray7);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.lang.String str11 = org.mockito.Matchers.refEq("", strArray10);
        java.lang.String[] strArray12 = org.mockito.Matchers.refEq(strArray7, strArray10);
        java.lang.Class<?> wildcardClass13 = org.mockito.Matchers.refEq(wildcardClass5, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.VoidMethodStubbable<java.lang.String[]> strArrayVoidMethodStubbable14 = mockitoCore0.stubVoid(strArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class [Ljava.lang.String;");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(verificationMode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(wildcardClass13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        float float1 = org.mockito.Matchers.eq((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.VoidMethodStubbable<java.lang.String> strVoidMethodStubbable1 = org.mockito.Mockito.stubVoid("hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        java.lang.Class<?> wildcardClass1 = mockitoCore0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.Iterable iterable0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(iterable0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.Matchers.refEq("", strArray1);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.mockito.Matchers.refEq("", strArray4);
        java.lang.String[] strArray6 = org.mockito.Matchers.refEq(strArray1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber7 = org.mockito.Mockito.doReturn((java.lang.Object) strArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.GeneratedMethodAccessor2.invoke(Unknown Source)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.reflect.AnnotatedElement annotatedElement0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(annotatedElement0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<java.util.Map> mapDeprecatedOngoingStubbing1 = org.mockito.Mockito.stub(map0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) '#');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.mockito.internal.verification.api.VerificationMode verificationMode0 = org.mockito.Mockito.atLeastOnce();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<java.lang.Object> objDeprecatedOngoingStubbing1 = org.mockito.Mockito.stub((java.lang.Object) verificationMode0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub final/private/equals() or hashCode() method.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Object obj4 = org.mockito.Matchers.same((java.lang.Object) map3);
        java.util.Map map5 = org.mockito.Matchers.same(map3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.util.Map> mapOngoingStubbing6 = mockitoCore0.when(map5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.GeneratedMethodAccessor2.invoke(Unknown Source)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(map5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.Mockito.verify("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.times(0);
        java.lang.Class<?> wildcardClass2 = verificationMode1.getClass();
        org.mockito.stubbing.Stubber stubber3 = org.mockito.Mockito.doReturn((java.lang.Object) wildcardClass2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.mockito.Matchers.refEq("", strArray5);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String str9 = org.mockito.Matchers.refEq("", strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.refEq(strArray5, strArray8);
        java.lang.reflect.AnnotatedElement annotatedElement11 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(stubber3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(annotatedElement11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) '\000');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.Matchers.refEq("", strArray1);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.mockito.Matchers.refEq("", strArray4);
        java.lang.String[] strArray6 = org.mockito.Matchers.refEq(strArray1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.verification.api.VerificationMode verificationMode2 = org.mockito.Mockito.atMost(10);
        java.lang.Class<?> wildcardClass3 = verificationMode2.getClass();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.mockito.Matchers.refEq("", strArray5);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String str9 = org.mockito.Matchers.refEq("", strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.refEq(strArray5, strArray8);
        java.lang.Class<?> wildcardClass11 = org.mockito.Matchers.refEq(wildcardClass3, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder12 = mockitoCore0.inOrder((java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(wildcardClass11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        byte byte1 = org.mockito.Matchers.eq((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.VoidMethodStubbable<java.io.Serializable> serializableVoidMethodStubbable1 = org.mockito.Mockito.stubVoid((java.io.Serializable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Byte");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.Matchers.refEq("", strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.mockito.Matchers.refEq("", strArray5);
        java.lang.String[] strArray7 = org.mockito.Matchers.refEq(strArray2, strArray5);
        java.util.List list8 = org.mockito.Matchers.refEq(list0, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<java.util.Collection> collectionDeprecatedOngoingStubbing9 = org.mockito.Mockito.stub((java.util.Collection) list0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:?-> at sun.reflect.GeneratedMethodAccessor1.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode() methods.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.times(0);
        java.lang.Class<?> wildcardClass2 = verificationMode1.getClass();
        java.lang.reflect.Type type3 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass2);
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (short) 100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.eq((org.mockito.Matchers) mockito0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.VoidMethodStubbable<org.mockito.Mockito> mockitoVoidMethodStubbable2 = org.mockito.Mockito.stubVoid(mockito0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.Mockito");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(matchers1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int int1 = org.mockito.Matchers.eq(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (short) 100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        short short1 = org.mockito.Matchers.eq((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.MockitoCore mockitoCore1 = org.mockito.Matchers.eq(mockitoCore0);
        org.junit.Assert.assertNull(mockitoCore1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.mockito.internal.verification.api.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) '\000');
        org.mockito.internal.verification.api.VerificationMode verificationMode3 = org.mockito.Mockito.atLeast((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.verification.api.VerificationMode verificationMode4 = org.mockito.Mockito.verify(verificationMode1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(verificationMode3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String str1 = org.mockito.Matchers.endsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }
}

