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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Field field1 = null;
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.fieldInitialisationThrewException(field1, throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.DescribedInvocation describedInvocation1 = null;
        org.mockito.invocation.DescribedInvocation describedInvocation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wantedButNotInvokedInOrder(describedInvocation1, describedInvocation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.argumentsAreDifferent("hi!", "", location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.reportNoSubMatchersFound("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?No matchers found for additional matcher ?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.reporting.Discrepancy discrepancy1 = null;
        org.mockito.invocation.DescribedInvocation describedInvocation2 = null;
        org.mockito.invocation.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooLittleActualInvocations(discrepancy1, describedInvocation2, location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.missingMethodInvocation();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be 'a method call on a mock'.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because:?1. you stub either of: final/private/equals()/hashCode() methods.?   Those methods *cannot* be stubbed/verified.?   Mocking methods declared on non-public parent classes is not supported.?2. inside when() you don't call method on mock but on some other object.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotCallAbstractRealMethod();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot call abstract real method on java object!?Calling real methods is only possible when mocking non abstract method.?  //correct example:?  when(mockOfConcreteClass.nonAbstractMethod()).thenCallRealMethod();");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.spyAndDelegateAreMutuallyExclusive();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Settings should not define a spy instance and a delegated instance at the same time.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Field field1 = null;
        java.lang.Exception exception3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInjectDependency(field1, (java.lang.Object) "", exception3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = new org.mockito.exceptions.Reporter();
        java.lang.Class<?> wildcardClass2 = reporter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.mockedTypeIsInconsistentWithDelegatedInstanceType((java.lang.Class) wildcardClass2, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Mocked type must be the same as the type of your delegated instance.?Mocked type must be: Integer, but is: Reporter?  //correct delegate:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new ArrayList()<- );?  //incorrect - types don't match:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new HashSet()<- );");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.mocksHaveToBePassedToVerifyNoMoreInteractions();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = new org.mockito.exceptions.Reporter();
        java.lang.Class<?> wildcardClass2 = reporter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.mockedTypeIsInconsistentWithDelegatedInstanceType((java.lang.Class) wildcardClass2, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Mocked type must be the same as the type of your delegated instance.?Mocked type must be: Character, but is: Reporter?  //correct delegate:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new ArrayList()<- );?  //incorrect - types don't match:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new HashSet()<- );");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.Location location2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.smartNullPointerException("", location2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Method method1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.delegatedMethodDoesNotExistOnDelegate(method1, (java.lang.Object) false, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Boolean");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invocationListenersRequiresAtLeastOneListener();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: invocationListeners() requires at least one listener");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.nullPassedToVerify();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() should be a mock but is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?    not: verify(mock.someMethod());?Also, if you use @Mock annotation don't miss initMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.argumentsAreDifferent("", "", location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.matchers.LocalizedMatcher[] localizedMatcherArray3 = new org.mockito.internal.matchers.LocalizedMatcher[] {};
        java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher> localizedMatcherList4 = new java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList4, localizedMatcherArray3);
        // The following exception was thrown during execution in test generation
        try {
            reporter0.incorrectUseOfAdditionalMatchers("hi!", (int) 'a', (java.util.Collection<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers inside additional matcher hi! !?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??97 sub matchers expected, 0 recorded:???This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(AdditionalMatchers.and(isNotNull(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(AdditionalMatchers.and(isNotNull(), eq(\"raw String\"));??For more info see javadoc for Matchers and AdditionalMatchers classes.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localizedMatcherArray3);
        org.junit.Assert.assertArrayEquals(localizedMatcherArray3, new org.mockito.internal.matchers.LocalizedMatcher[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.Invocation invocation1 = null;
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = new org.mockito.exceptions.Reporter();
        java.lang.Class<?> wildcardClass2 = reporter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.mockedTypeIsInconsistentWithDelegatedInstanceType((java.lang.Class) wildcardClass2, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Mocked type must be the same as the type of your delegated instance.?Mocked type must be: Boolean, but is: Reporter?  //correct delegate:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new ArrayList()<- );?  //incorrect - types don't match:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new HashSet()<- );");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.reportNoSubMatchersFound("hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?No matchers found for additional matcher hi!?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = new org.mockito.exceptions.Reporter();
        java.lang.Class<?> wildcardClass2 = reporter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.mockedTypeIsInconsistentWithDelegatedInstanceType((java.lang.Class) wildcardClass2, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Mocked type must be the same as the type of your delegated instance.?Mocked type must be: Short, but is: Reporter?  //correct delegate:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new ArrayList()<- );?  //incorrect - types don't match:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new HashSet()<- );");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.delegatedMethodHasWrongReturnType(method1, method2, (java.lang.Object) 0.0d, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Double");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.atMostAndNeverShouldNotBeUsedWithTimeout();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.FriendlyReminderException; message: ??Don't panic! I'm just a friendly reminder!?timeout() should not be used with atMost() or never() because...?...it does not make much sense - the test would have passed immediately in concurency?We kept this method only to avoid compilation errors when upgrading Mockito.?In future release we will remove timeout(x).atMost(y) from the API.?If you want to find out more please refer to issue 235?");
        } catch (org.mockito.exceptions.misusing.FriendlyReminderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Field field1 = null;
        java.lang.Exception exception3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInjectDependency(field1, (java.lang.Object) (byte) 10, exception3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Byte");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedToVerifyNoMoreInteractions();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Examples of correct verifications:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.Location location1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unfinishedVerificationException(location1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.delegatedMethodHasWrongReturnType(method1, method2, (java.lang.Object) 0.0d, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Double");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.matchers.LocalizedMatcher[] localizedMatcherArray3 = new org.mockito.internal.matchers.LocalizedMatcher[] {};
        java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher> localizedMatcherList4 = new java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList4, localizedMatcherArray3);
        // The following exception was thrown during execution in test generation
        try {
            reporter0.incorrectUseOfAdditionalMatchers("hi!", (int) ' ', (java.util.Collection<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers inside additional matcher hi! !?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??32 sub matchers expected, 0 recorded:???This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(AdditionalMatchers.and(isNotNull(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(AdditionalMatchers.and(isNotNull(), eq(\"raw String\"));??For more info see javadoc for Matchers and AdditionalMatchers classes.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localizedMatcherArray3);
        org.junit.Assert.assertArrayEquals(localizedMatcherArray3, new org.mockito.internal.matchers.LocalizedMatcher[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.delegatedMethodHasWrongReturnType(method1, method2, (java.lang.Object) "", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Field field1 = null;
        java.lang.Exception exception3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInjectDependency(field1, (java.lang.Object) 100, exception3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Integer");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.defaultAnswerDoesNotAcceptNullParameter();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: defaultAnswer() does not accept null parameter");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.DescribedInvocation describedInvocation1 = null;
        org.mockito.invocation.Location location2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.neverWantedButInvoked(describedInvocation1, location2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.mock.SerializableMode serializableMode1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.usingConstructorWithFancySerializable(serializableMode1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Mocks instantiated with constructor cannot be combined with null serialization mode.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.Invocation invocation1 = null;
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = new org.mockito.exceptions.Reporter();
        java.lang.Class<?> wildcardClass2 = reporter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.mockedTypeIsInconsistentWithDelegatedInstanceType((java.lang.Class) wildcardClass2, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Mocked type must be the same as the type of your delegated instance.?Mocked type must be: Short, but is: Reporter?  //correct delegate:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new ArrayList()<- );?  //incorrect - types don't match:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new HashSet()<- );");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.DescribedInvocation describedInvocation3 = null;
        org.mockito.invocation.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(10, (int) 'a', describedInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = new org.mockito.exceptions.Reporter();
        java.lang.Class<?> wildcardClass2 = reporter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.serializableWontWorkForObjectsThatDontImplementSerializable((java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?You are using the setting 'withSettings().serializable()' however the type you are trying to mock 'Reporter'?do not implement Serializable AND do not have a no-arg constructor.?This combination is requested, otherwise you will get an 'java.io.InvalidClassException' when the mock will be serialized??Also note that as requested by the Java serialization specification, the whole hierarchy need to implements Serializable,?i.e. the top-most superclass has to implements Serializable.?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.Location location2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.smartNullPointerException("hi!", location2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.DescribedInvocation describedInvocation3 = null;
        org.mockito.invocation.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '#', (int) (byte) 10, describedInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotStubVoidMethodWithAReturnValue("hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue; message: ?'hi!' is a *void method* and it *cannot* be stubbed with a *return value*!?Voids are usually stubbed with Throwables:?    doThrow(exception).when(mock).someVoidMethod();?***?If you're unsure why you're getting above error read on.?Due to the nature of the syntax above problem might occur because:?1. The method you are trying to stub is *overloaded*. Make sure you are calling the right overloaded version.?2. Somewhere in your test you are stubbing *final methods*. Sorry, Mockito does not verify/stub final methods.?3. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies - ?   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.?4. Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.incorrectUseOfApi();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Incorrect use of API detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You probably stored a reference to OngoingStubbing returned by when() and called stubbing methods like thenReturn() on this reference more than once.?Examples of correct usage:?    when(mock.isOk()).thenReturn(true).thenReturn(false).thenThrow(exception);?    when(mock.isOk()).thenReturn(true, false).thenThrow(exception);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ?hi! cannot be returned by hi!()?hi!() should return ?***?If you're unsure why you're getting above error read on.?Due to the nature of the syntax above problem might occur because:?1. This exception *might* occur in wrongly written multi-threaded tests.?   Please refer to Mockito FAQ on limitations of concurrency testing.?2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies - ?   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.Invocation invocation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.noMoreInteractionsWantedInOrder(invocation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.matchers.LocalizedMatcher[] localizedMatcherArray2 = new org.mockito.internal.matchers.LocalizedMatcher[] {};
        java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher> localizedMatcherList3 = new java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList3, localizedMatcherArray2);
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 100, (java.util.List<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 0 recorded:??This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localizedMatcherArray2);
        org.junit.Assert.assertArrayEquals(localizedMatcherArray2, new org.mockito.internal.matchers.LocalizedMatcher[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.stubPassedToVerify();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock; message: ?Argument passed to verify() is a stubOnly() mock, not a full blown mock!?If you intend to verify invocations on a mock, don't use stubOnly() in its MockSettings.");
        } catch (org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Field field1 = null;
        java.lang.Exception exception3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInjectDependency(field1, (java.lang.Object) true, exception3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Boolean");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Field field1 = null;
        java.lang.Exception exception3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInjectDependency(field1, (java.lang.Object) (-1L), exception3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Long");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotStubVoidMethodWithAReturnValue("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue; message: ?'' is a *void method* and it *cannot* be stubbed with a *return value*!?Voids are usually stubbed with Throwables:?    doThrow(exception).when(mock).someVoidMethod();?***?If you're unsure why you're getting above error read on.?Due to the nature of the syntax above problem might occur because:?1. The method you are trying to stub is *overloaded*. Make sure you are calling the right overloaded version.?2. Somewhere in your test you are stubbing *final methods*. Sorry, Mockito does not verify/stub final methods.?3. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies - ?   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.?4. Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = new org.mockito.exceptions.Reporter();
        java.lang.Class<?> wildcardClass2 = reporter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.mockedTypeIsInconsistentWithDelegatedInstanceType((java.lang.Class) wildcardClass2, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Mocked type must be the same as the type of your delegated instance.?Mocked type must be: String, but is: Reporter?  //correct delegate:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new ArrayList()<- );?  //incorrect - types don't match:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new HashSet()<- );");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.delegatedMethodHasWrongReturnType(method1, method2, (java.lang.Object) 1, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Integer");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.matchers.LocalizedMatcher[] localizedMatcherArray2 = new org.mockito.internal.matchers.LocalizedMatcher[] {};
        java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher> localizedMatcherList3 = new java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList3, localizedMatcherArray2);
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 10, (java.util.List<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 0 recorded:??This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localizedMatcherArray2);
        org.junit.Assert.assertArrayEquals(localizedMatcherArray2, new org.mockito.internal.matchers.LocalizedMatcher[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.DescribedInvocation describedInvocation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wantedButNotInvoked(describedInvocation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.InvocationOnMock invocationOnMock1 = null;
        org.mockito.exceptions.Reporter reporter3 = new org.mockito.exceptions.Reporter();
        java.lang.Class<?> wildcardClass4 = reporter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfArgumentToReturn(invocationOnMock1, "", (java.lang.Class) wildcardClass4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.listeners.InvocationListener invocationListener1 = null;
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invocationListenerThrewException(invocationListener1, throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidArgumentRangeAtIdentityAnswerCreationTime();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Invalid argument index.?The index need to be a positive number that indicates the position of the argument to return.?However it is possible to use the -1 value to indicates that the last argument should be?returned.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Field field1 = null;
        java.lang.Exception exception3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInjectDependency(field1, (java.lang.Object) 10L, exception3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Long");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invocationListenerDoesNotAcceptNullParameters();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: invocationListeners() does not accept null parameters");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.InvocationOnMock invocationOnMock1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = reporter0.invalidArgumentPositionRangeAtInvocationTime(invocationOnMock1, false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.delegatedMethodHasWrongReturnType(method1, method2, (java.lang.Object) '4', obj4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Character");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = new org.mockito.exceptions.Reporter();
        java.lang.Class<?> wildcardClass2 = reporter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.mockedTypeIsInconsistentWithDelegatedInstanceType((java.lang.Class) wildcardClass2, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Mocked type must be the same as the type of your delegated instance.?Mocked type must be: Long, but is: Reporter?  //correct delegate:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new ArrayList()<- );?  //incorrect - types don't match:?  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new HashSet()<- );");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.delegatedMethodHasWrongReturnType(method1, method2, (java.lang.Object) (-1.0f), (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Float");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.matchers.LocalizedMatcher[] localizedMatcherArray1 = new org.mockito.internal.matchers.LocalizedMatcher[] {};
        java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher> localizedMatcherList2 = new java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList2, localizedMatcherArray1);
        // The following exception was thrown during execution in test generation
        try {
            reporter0.misplacedArgumentMatcher((java.util.List<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced argument matcher detected here:???You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localizedMatcherArray1);
        org.junit.Assert.assertArrayEquals(localizedMatcherArray1, new org.mockito.internal.matchers.LocalizedMatcher[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.DescribedInvocation describedInvocation3 = null;
        org.mockito.invocation.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 100, 100, describedInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.InvocationOnMock invocationOnMock1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = reporter0.invalidArgumentPositionRangeAtInvocationTime(invocationOnMock1, true, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.DescribedInvocation describedInvocation3 = null;
        org.mockito.invocation.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 0, (int) (short) 100, describedInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.Location location1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unfinishedStubbing(location1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.DescribedInvocation describedInvocation3 = null;
        org.mockito.invocation.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(10, (int) ' ', describedInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Field field1 = null;
        java.lang.Object obj2 = null;
        java.lang.Exception exception3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInjectDependency(field1, obj2, exception3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is null!");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.matchers.LocalizedMatcher[] localizedMatcherArray2 = new org.mockito.internal.matchers.LocalizedMatcher[] {};
        java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher> localizedMatcherList3 = new java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList3, localizedMatcherArray2);
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) -1, (java.util.List<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 0 recorded:??This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localizedMatcherArray2);
        org.junit.Assert.assertArrayEquals(localizedMatcherArray2, new org.mockito.internal.matchers.LocalizedMatcher[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Field field1 = null;
        java.lang.Exception exception3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInjectDependency(field1, (java.lang.Object) 0, exception3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Integer");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.DescribedInvocation describedInvocation3 = null;
        org.mockito.invocation.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 100, (int) 'a', describedInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.DescribedInvocation describedInvocation3 = null;
        org.mockito.invocation.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) -1, (int) (short) 10, describedInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.delegatedMethodHasWrongReturnType(method1, method2, (java.lang.Object) 0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Integer");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.InvocationOnMock invocationOnMock1 = null;
        org.mockito.exceptions.Reporter reporter3 = new org.mockito.exceptions.Reporter();
        java.lang.Class<?> wildcardClass4 = reporter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfArgumentToReturn(invocationOnMock1, "hi!", (java.lang.Class) wildcardClass4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Field field1 = null;
        java.lang.Exception exception3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInjectDependency(field1, (java.lang.Object) (-1.0f), exception3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Float");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.InvocationOnMock invocationOnMock1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfArgumentToReturn(invocationOnMock1, "", (java.lang.Class) wildcardClass4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Field field1 = null;
        java.lang.Exception exception3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInjectDependency(field1, (java.lang.Object) ' ', exception3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Character");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.delegatedMethodHasWrongReturnType(method1, method2, (java.lang.Object) 1, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Integer");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.matchers.LocalizedMatcher[] localizedMatcherArray2 = new org.mockito.internal.matchers.LocalizedMatcher[] {};
        java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher> localizedMatcherList3 = new java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList3, localizedMatcherArray2);
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '4', (java.util.List<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?52 matchers expected, 0 recorded:??This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localizedMatcherArray2);
        org.junit.Assert.assertArrayEquals(localizedMatcherArray2, new org.mockito.internal.matchers.LocalizedMatcher[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.matchers.LocalizedMatcher[] localizedMatcherArray2 = new org.mockito.internal.matchers.LocalizedMatcher[] {};
        java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher> localizedMatcherList3 = new java.util.ArrayList<org.mockito.internal.matchers.LocalizedMatcher>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList3, localizedMatcherArray2);
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(10, (java.util.List<org.mockito.internal.matchers.LocalizedMatcher>) localizedMatcherList3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 0 recorded:??This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localizedMatcherArray2);
        org.junit.Assert.assertArrayEquals(localizedMatcherArray2, new org.mockito.internal.matchers.LocalizedMatcher[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.InvocationOnMock invocationOnMock1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = reporter0.invalidArgumentPositionRangeAtInvocationTime(invocationOnMock1, true, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.invocation.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.argumentsAreDifferent("", "hi!", location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Field field1 = null;
        java.lang.Exception exception3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInjectDependency(field1, (java.lang.Object) (-1.0d), exception3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Double");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.reflect.Method method1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.delegatedMethodDoesNotExistOnDelegate(method1, (java.lang.Object) (-1.0d), (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Double");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.reporting.Discrepancy discrepancy1 = null;
        org.mockito.invocation.DescribedInvocation describedInvocation2 = null;
        org.mockito.invocation.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooLittleActualInvocationsInOrder(discrepancy1, describedInvocation2, location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ? cannot be returned by hi!()?hi!() should return ?***?If you're unsure why you're getting above error read on.?Due to the nature of the syntax above problem might occur because:?1. This exception *might* occur in wrongly written multi-threaded tests.?   Please refer to Mockito FAQ on limitations of concurrency testing.?2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies - ?   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }
}

