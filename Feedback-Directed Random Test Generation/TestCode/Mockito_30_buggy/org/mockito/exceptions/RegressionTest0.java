package org.mockito.exceptions;

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
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotStubWithNullThrowable();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot stub with null throwable!");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Discrepancy discrepancy1 = null;
        org.mockito.exceptions.PrintableInvocation printableInvocation2 = null;
        org.mockito.internal.debugging.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooLittleActualInvocations(discrepancy1, printableInvocation2, location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.mocksHaveToBePassedToVerifyNoMoreInteractions();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotCallRealMethodOnInterface();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot call real method on java interface. Interface does not have any implementation!?Calling real methods is only possible when mocking concrete classes.?  //correct example:?  when(mockOfConcreteClass.doStuff()).thenCallRealMethod();");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.smartNullPointerException(location1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedToWhenMethod();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to when() is not a mock!?Example of correct stubbing:?    doThrow(new RuntimeException()).when(mock).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Discrepancy discrepancy1 = null;
        org.mockito.exceptions.PrintableInvocation printableInvocation2 = null;
        org.mockito.internal.debugging.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooLittleActualInvocationsInOrder(discrepancy1, printableInvocation2, location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.invocation.Invocation invocation1 = null;
        org.mockito.internal.exceptions.VerificationAwareInvocation[] verificationAwareInvocationArray2 = new org.mockito.internal.exceptions.VerificationAwareInvocation[] {};
        java.util.ArrayList<org.mockito.internal.exceptions.VerificationAwareInvocation> verificationAwareInvocationList3 = new java.util.ArrayList<org.mockito.internal.exceptions.VerificationAwareInvocation>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.exceptions.VerificationAwareInvocation>) verificationAwareInvocationList3, verificationAwareInvocationArray2);
        // The following exception was thrown during execution in test generation
        try {
            reporter0.noMoreInteractionsWanted(invocation1, (java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) verificationAwareInvocationList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAwareInvocationArray2);
        org.junit.Assert.assertArrayEquals(verificationAwareInvocationArray2, new org.mockito.internal.exceptions.VerificationAwareInvocation[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.extraInterfacesRequiresAtLeastOneInterface();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?extraInterfaces() requires at least one interface.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.nullPassedWhenCreatingInOrder();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument(s) passed is null!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Exception exception2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInitializeForInjectMocksAnnotation("", exception2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation1 = null;
        org.mockito.exceptions.PrintableInvocation printableInvocation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wantedButNotInvokedInOrder(printableInvocation1, printableInvocation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.nullPassedToWhenMethod();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to when() is null!?Example of correct stubbing:?    doThrow(new RuntimeException()).when(mock).someMethod();?Also, if you use @Mock annotation don't miss initMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unsupportedCombinationOfAnnotations("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: This combination of annotations is not permitted on a single field:?@ and @hi!");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation1 = null;
        org.mockito.internal.debugging.Location location2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.neverWantedButInvoked(printableInvocation1, location2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.inOrderRequiresFamiliarMock();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?InOrder can only verify mocks that were passed in during creation of InOrder.?For example:?    InOrder inOrder = inOrder(mockOne);?    inOrder.verify(mockOne).doStuff();");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.misplacedArgumentMatcher(location1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.extraInterfacesDoesNotAcceptNullParameters();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?extraInterfaces() does not accept null parameters.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotVerifyToString();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Mockito cannot verify toString()?toString() is too often used behind of scenes  (i.e. during String concatenation, in IDE debugging views). Verifying it may give inconsistent or hard to understand results. Not to mention that verifying toString() most likely hints awkward design (hard to explain in a short exception message. Trust me...)?However, it is possible to stub toString(). Stubbing toString() smells a bit funny but there are rare, legitimate use cases.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Exception exception2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInitializeForSpyAnnotation("", exception2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = new org.mockito.exceptions.Reporter();
        java.lang.Class<?> wildcardClass2 = reporter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedToVerify((java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Reporter and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedWhenCreatingInOrder();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls returnsSmartNulls0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls();
        org.mockito.invocation.InvocationOnMock invocationOnMock1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = returnsSmartNulls0.answer(invocationOnMock1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unfinishedVerificationException(location1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.argumentsAreDifferent("hi!", "hi!", location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.argumentsAreDifferent("hi!", "", location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wantedButNotInvoked(printableInvocation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?35 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.nullPassedToVerifyNoMoreInteractions();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument(s) passed is null!?Examples of correct verifications:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Throwable throwable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.checkedExceptionInvalid(throwable1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Checked exception is invalid for this method!?Invalid: null");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ? cannot be returned by hi!()?hi!() should return ?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.missingMethodInvocation();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be 'a method call on a mock'.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because:?1. you stub either of: final/private/equals()/hashCode() methods.?   Those methods *cannot* be stubbed/verified.?2. inside when() you don't call method on mock but on some other object.");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.noArgumentValueWasCaptured();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?No argument value was captured!?You might have forgotten to use argument.capture() in verify()...?...or you used capture() in stubbing but stubbed method was not called.?Be aware that it is recommended to use capture() only with verify()??Examples of correct argument capturing:?    ArgumentCaptor<Person> argument = ArgumentCaptor.forClass(Person.class);?    verify(mock).doSomething(argument.capture());?    assertEquals(\"John\", argument.getValue().getName());?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unfinishedStubbing(location1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unsupportedCombinationOfAnnotations("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: This combination of annotations is not permitted on a single field:?@hi! and @");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ?hi! cannot be returned by ()?() should return hi!?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Exception exception2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInitializeForInjectMocksAnnotation("hi!", exception2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls returnsSmartNulls1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls();
        java.lang.Class<?> wildcardClass2 = returnsSmartNulls1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedToVerify((java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type ReturnsSmartNulls and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.moreThanOneAnnotationNotAllowed("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: You cannot have more than one Mockito annotation on a field!?The field '' has multiple Mockito annotations.?For info how to use annotations see examples in javadoc for MockitoAnnotations class.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.invocation.Invocation invocation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.noMoreInteractionsWantedInOrder(invocation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) ' ', (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.mocksHaveToBePassedWhenCreatingInOrder();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 10, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) ' ', (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 10, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedToVerify((java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Object and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedToVerifyNoMoreInteractions();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Examples of correct verifications:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.onlyVoidMethodsCanBeSetToDoNothing();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Only void methods can doNothing()!?Example of correct use of doNothing():?    doNothing().?    doThrow(new RuntimeException())?    .when(mock).someVoidMethod();?Above means:?someVoidMethod() does nothing the 1st time but throws an exception the 2nd time is called");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ?hi! cannot be returned by hi!()?hi!() should return hi!?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(100, (int) 'a', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotStubVoidMethodWithAReturnValue("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?'' is a *void method* and it *cannot* be stubbed with a *return value*!?Voids are usually stubbed with Throwables:?    doThrow(exception).when(mock).someVoidMethod();?If the method you are trying to stub is *overloaded* then make sure you are calling the right overloaded version.?This exception might also occur when somewhere in your test you are stubbing *final methods*.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.argumentsAreDifferent("", "hi!", location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(100, 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Exception exception2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInitializeForSpyAnnotation("hi!", exception2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.argumentsAreDifferent("", "", location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ? cannot be returned by ()?() should return ?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ?hi! cannot be returned by hi!()?hi!() should return ?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(10, 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '4', (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.moreThanOneAnnotationNotAllowed("hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: You cannot have more than one Mockito annotation on a field!?The field 'hi!' has multiple Mockito annotations.?For info how to use annotations see examples in javadoc for MockitoAnnotations class.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unsupportedCombinationOfAnnotations("", "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: This combination of annotations is not permitted on a single field:?@ and @");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ? cannot be returned by hi!()?hi!() should return hi!?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) 'a', 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) -1, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '#', (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.nullPassedToVerify();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() should be a mock but is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?Also, if you use @Mock annotation don't miss initMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ? cannot be returned by ()?() should return hi!?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotStubVoidMethodWithAReturnValue("hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?'hi!' is a *void method* and it *cannot* be stubbed with a *return value*!?Voids are usually stubbed with Throwables:?    doThrow(exception).when(mock).someVoidMethod();?If the method you are trying to stub is *overloaded* then make sure you are calling the right overloaded version.?This exception might also occur when somewhere in your test you are stubbing *final methods*.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 100, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.invocation.Invocation invocation1 = null;
        java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation> verificationAwareInvocationList2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.noMoreInteractionsWanted(invocation1, verificationAwareInvocationList2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unsupportedCombinationOfAnnotations("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: This combination of annotations is not permitted on a single field:?@hi! and @hi!");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(0, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 10, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ?hi! cannot be returned by ()?() should return ?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?52 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Class class1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedToVerify(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 1, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 1, (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) -1, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(0, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) -1, (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test98");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) 'a', (int) 'a', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

